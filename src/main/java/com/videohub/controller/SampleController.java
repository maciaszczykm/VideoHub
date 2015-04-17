package com.videohub.controller;

import com.videohub.model.Content;
import com.videohub.model.Video;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/sample")
    @ResponseBody
    String home() {
        Video video = new Video();
        video.setId((long) 1);
        video.setPublicationDate(new Date());
        video.setTitle("Hello World!");
        video.setDescription("My first  video here!");
        video.setContent(new Content());
        return video.toString();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
