package com.example.therapy;

public class Doctor {
    private String name;
    private String desc;
    private String price;
    private String avail;
    private String rating;
    private String langauge;

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }



    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }



    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Doctor(String name, String desc, String price, String rating, String avail, String language) {
        this.name = name;
        this.desc=desc;
        this.price = price;
        this.rating=rating;
        this.avail= avail;
        this.langauge=language;
    }
}
