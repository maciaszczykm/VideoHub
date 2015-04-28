package com.videohub.model;

import java.util.Date;

public class TwoStateRate implements Rate {

    private Long id = null;
    private Short rate = null;
    private User author = null;
    private Multimedia multimedia = null;
    private Date publicationDate = null;

    public TwoStateRate(Long id, Short rate, User author, Multimedia multimedia, Date publicationDate) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.multimedia = multimedia;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getRate() {
        return rate;
    }

    public void setRate(Short rate) {
        this.rate = rate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TwoStateRate that = (TwoStateRate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (multimedia != null ? !multimedia.equals(that.multimedia) : that.multimedia != null) return false;
        return !(publicationDate != null ? !publicationDate.equals(that.publicationDate) : that.publicationDate != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (multimedia != null ? multimedia.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TwoStateRate{" +
                "id=" + id +
                ", rate=" + rate +
                ", author=" + author +
                ", multimedia=" + multimedia +
                ", publicationDate=" + publicationDate +
                '}';
    }

}
