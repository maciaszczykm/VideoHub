package com.videohub.model;

import java.util.Date;

public class Video implements Multimedia {

    private Long id = null;
    private String title = null;
    private String description = null;
    private Content content = null;
    private Date publicationDate = null;
    private Category category = null;
    private User author = null;

}
