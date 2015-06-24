package com.videohub.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final String MEDIA_TYPE_NAME = "json";
    private static final MediaType MEDIA_TYPE = MediaType.APPLICATION_JSON;
    private static final MediaType DEFAULT_CONTENT_TYPE = MediaType.APPLICATION_JSON;

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(DEFAULT_CONTENT_TYPE)
                .mediaType(MEDIA_TYPE_NAME, MEDIA_TYPE)
                .favorPathExtension(false);
    }
}
