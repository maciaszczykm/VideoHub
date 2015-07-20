/*
 * Copyright 2015 Sebastian Florek and Marcin Maciaszczyk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.videohub.model;

import java.util.Date;

public class Rate {

    private Long id = null;
    private Boolean rate = null;
    private User author = null;
    private Multimedia multimedia = null;
    private Date publicationDate = null;

    public Rate(Long id, Boolean rate, User author, Multimedia multimedia, Date publicationDate) {
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

    public Boolean getRate() {
        return rate;
    }

    public void setRate(Boolean rate) {
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

        Rate rate1 = (Rate) o;

        if (id != null ? !id.equals(rate1.id) : rate1.id != null) return false;
        if (rate != null ? !rate.equals(rate1.rate) : rate1.rate != null) return false;
        if (author != null ? !author.equals(rate1.author) : rate1.author != null) return false;
        if (multimedia != null ? !multimedia.equals(rate1.multimedia) : rate1.multimedia != null) return false;
        return !(publicationDate != null ? !publicationDate.equals(rate1.publicationDate) : rate1.publicationDate != null);

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
        return "Rate{" +
                "id=" + id +
                ", rate=" + rate +
                ", author=" + author +
                ", multimedia=" + multimedia +
                ", publicationDate=" + publicationDate +
                '}';
    }

}
