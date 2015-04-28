package com.videohub.model;

import java.io.File;

public class Content {

    private Long id = null;
    private File file = null;
    private String path = null;
    private Metadata metadata = null;

    public Content(Long id, File file, String path, Metadata metadata) {
        this.id = id;
        this.file = file;
        this.path = path;
        this.metadata = metadata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Content content = (Content) o;

        if (id != null ? !id.equals(content.id) : content.id != null) return false;
        if (file != null ? !file.equals(content.file) : content.file != null) return false;
        if (path != null ? !path.equals(content.path) : content.path != null) return false;
        return !(metadata != null ? !metadata.equals(content.metadata) : content.metadata != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", file=" + file +
                ", path='" + path + '\'' +
                ", metadata=" + metadata +
                '}';
    }

}
