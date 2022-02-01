package com.company.amazon_collection_hw5;

import com.sun.source.tree.Tree;

import java.util.*;

public class MainProduct {

    public static void main(String[] args) {

        Product product1 = new Product(
                ProductCategory.Books,
                "e, the Maid",
                "NEW YORK TIMES BESTSELLER",
                "English",
                2022,
                14);
        Product product2 = new Product(
                ProductCategory.CellPhones,
                "c, iPhone XR",
                "64GB, Black",
                "English",
                2018,
                330);
        Product product3 = new Product(
                ProductCategory.CellPhones,
                "b, iPhone 8 the",
                "64GB, Space Gray",
                "English",
                2018,
                219);
        Product product4 = new Product(
                ProductCategory.CameraPhoto,
                "d, Panasonic LUMIX the GH5M2",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);
        Product product5 = new Product(
                ProductCategory.CameraPhoto,
                "a, Panasonic LUMIX the GH5M2",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);


        //        Сложить в коллекцию
        Collection<Product> productList = new LinkedList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        System.out.println("List products: " + productList);
        System.out.println("____________________________________________");


        //        Разложить в три новые коллекции по категориям
        Collection<Product> cameraPhotoList = new LinkedList<>();
        Collection<Product> cellPhonesList = new LinkedList<>();
        Collection<Product> booksList = new LinkedList<>();
        for (Product productItem: productList) {
            if (productItem.getCategory().equals(ProductCategory.CameraPhoto)) {
                cameraPhotoList.add(productItem);
            }
            if (productItem.getCategory().equals(ProductCategory.CellPhones)) {
                cellPhonesList.add(productItem);
            }
            if (productItem.getCategory().equals(ProductCategory.Books)) {
                booksList.add(productItem);
            }
        }
        System.out.println("Category ~ cameraPhotoList: " + cameraPhotoList);
        System.out.println("Category ~ cellPhonesList: " + cellPhonesList);
        System.out.println("Category ~ booksList: " + booksList);
        System.out.println("____________________________________________");


        //  Посчитать количество продуктов с ценой ниже 100
        Collection<Product> priceLessThen100 = new ArrayList<>();  /* можно использовать и LinkedList  место  ArrayList  */
        for (Product productItem: productList) {
            if (productItem.getPrice() < 100) {
                priceLessThen100.add(productItem);
            }
        }
        System.out.println("Number of products with a price less then 100: " + priceLessThen100);
        System.out.println("____________________________________________");


        //   Посчитать количество объектов которые имеют "the" в названии (или что-то другое)
        Collection<Product> withTheNameCount = new LinkedList<>();
        for (Product productItem: productList) {
            if (productItem.getName().matches("(.*)the(.*)")) {
                withTheNameCount.add(productItem);
            }
        }
        System.out.println("count objects that has 'the' word in name: " + withTheNameCount);
        System.out.println("____________________________________________");


        //   сортировать по цене
        PriceComparator priceComparator = new PriceComparator();
        TreeSet<Product> productSet = new TreeSet<>(priceComparator);
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);

        System.out.println("Set products, priceComparator: \n" + productSet);
        System.out.println("____________________________________________");


        //   сортировать по названию товара
        Comparator<Product> nameComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Product> productSet1 = new TreeSet<>(nameComparator);
        productSet1.add(product1);
        productSet1.add(product2);
        productSet1.add(product3);
        productSet1.add(product4);
        productSet1.add(product5);

        System.out.println("Set products, nameComparator: \n" + productSet1);
        System.out.println("____________________________________________");

    }
}
