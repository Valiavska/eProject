package com.company.amazon_collection_hw5;

import java.util.Comparator;

public class Product{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (release != product.release) return false;
        if (price != product.price) return false;
        if (category != product.category) return false;
        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        return language.equals(product.language);
    }

    @Override
    public int hashCode() {
        int result = category.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + release;
        result = 31 * result + price;
        return result;
    }


}
