package com.company.amazon_hw4;

public class Product {

    public ProductCategory category;
    public String name;
    public String description;
    public String language;
    public int release;
    public int price;

    public Product(ProductCategory category, String name, String description, String language, int release, int price) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.language = language;
        this.release = release;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category" + category + '\'' +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", release=" + release +
                ", price=" + price +
                '}';
    }


    public ProductCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public int getRelease() {
        return release;
    }

    public int getPrice() {
        return price;
    }
}
