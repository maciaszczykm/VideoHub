package com.videohub.model;

public class Metadata {

    private Long id = null;
    private Long duration = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Metadata metadata = (Metadata) o;

        if (id != null ? !id.equals(metadata.id) : metadata.id != null) return false;
        return !(duration != null ? !duration.equals(metadata.duration) : metadata.duration != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "id=" + id +
                ", duration=" + duration +
                '}';
    }

}
