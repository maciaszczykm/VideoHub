package com.videohub.model;

import java.util.Date;

public class Comment {

    private Long id = null;
    private String content = null;
    private User author = null;
    private Date publicationDate = null;
    private Multimedia multimedia = null;

    public Comment(Long id, String content, User author, Date publicationDate, Multimedia multimedia) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.publicationDate = publicationDate;
        this.multimedia = multimedia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != null ? !id.equals(comment.id) : comment.id != null) return false;
        if (content != null ? !content.equals(comment.content) : comment.content != null) return false;
        if (author != null ? !author.equals(comment.author) : comment.author != null) return false;
        if (publicationDate != null ? !publicationDate.equals(comment.publicationDate) : comment.publicationDate != null)
            return false;
        return !(multimedia != null ? !multimedia.equals(comment.multimedia) : comment.multimedia != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        result = 31 * result + (multimedia != null ? multimedia.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", publicationDate=" + publicationDate +
                ", multimedia=" + multimedia +
                '}';
    }

}
