package org.wecancoeit.reviews;


public class Review {

    private Long id;
    private String name;
    private String urlImage;
    private String category;
    private String content;
    private String date;
    private String description;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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


    public Review(Long id, String name, String urlImage, String category, String content, String date, String description) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
        this.category = category;
        this.content = content;
        this.date = date;
        this.description = description;
    }
}
