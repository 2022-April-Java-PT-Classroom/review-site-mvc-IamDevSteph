package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String urlImage;
    private String category;
    private String content;
    private String date;
    private String description;
    private Collection<Genre> genreCollection;


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Genre> getGenreCollection(){
        return genreCollection;
    }

    public Review(Long id, String title, String urlImage, String category, String content, String date, String description, Genre...genreCollection) {
        this.id = id;
        this.title = title;
        this.urlImage = urlImage;
        this.category = category;
        this.content = content;
        this.date = date;
        this.description = description;
        this.genreCollection = List.of(genreCollection);
    }
}
