package com.videohub.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    private static final Logger LOGGER = Logger.getLogger(ResourceController.class);

    @RequestMapping(value = "greeting", method = RequestMethod.GET)
    public Greeting welcome() {
        LOGGER.debug("greeting()");
        return new Greeting("AngularJS", "Greetings from spring rest client.");
    }

    class Greeting {
        private String name;
        private String message;

        public Greeting(String id, String message) {
            this.name = id;
            this.message = message;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
