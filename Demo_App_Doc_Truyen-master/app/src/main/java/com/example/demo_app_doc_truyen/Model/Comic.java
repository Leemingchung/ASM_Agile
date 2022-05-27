package com.example.demo_app_doc_truyen.Model;

public class Comic {
    public String name;
    public String logo;
    public String author;
    public String decription;

    public Comic() {
    }

    public Comic(String name, String logo, String author, String decription) {
        this.name = name;
        this.logo = logo;
        this.author = author;
        this.decription = decription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
