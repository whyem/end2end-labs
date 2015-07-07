package cl.whyem.app.backend.model;

import cl.whyem.app.backend.base.AutoIncrementEntityBase;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Book extends AutoIncrementEntityBase {

    @Column(name = "title")
    private String title;

    @Column(name = "available")
    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}