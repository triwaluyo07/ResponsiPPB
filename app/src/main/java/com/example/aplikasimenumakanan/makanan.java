package com.example.aplikasimenumakanan;

public class makanan {
    private int id;
    private String title;
    private String price;
    private String image;
    private String desk;

    public makanan(int id, String title, String price, String image, String desk) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.image = image;
        this.desk = desk;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getPrice()
    {
        return price;
    }

    public String getImage()
    {
        return image;
    }

    public String getDesk()
    {
        return desk;
    }
}
