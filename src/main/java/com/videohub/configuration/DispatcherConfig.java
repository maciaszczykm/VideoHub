package com.videohub.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by: GiBSoN.
 * Created on: 2015-06-05.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.videohub")
public class DispatcherConfig extends WebMvcConfigurerAdapter {
}
