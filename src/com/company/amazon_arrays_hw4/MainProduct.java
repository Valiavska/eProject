package com.company.amazon_arrays_hw4;

import java.util.Arrays;

public class MainProduct {

    public static void main(String[] args) {

        Product product1 = new Product(
                ProductCategory.Books,
                "the Maid",
                "NEW YORK TIMES BESTSELLER",
                "English",
                2022,
                14);
        Product product2 = new Product(
                ProductCategory.CellPhones,
                "iPhone XR",
                "64GB, Black",
                "English",
                2018,
                330);
        Product product3 = new Product(
                ProductCategory.CellPhones,
                "iPhone 8 the",
                "64GB, Space Gray",
                "English",
                2018,
                219);
        Product product4 = new Product(
                ProductCategory.CameraPhoto,
                "Panasonic LUMIX the GH5M2",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);

//        Сложить в массив
        Product [] products = {product1, product2, product3, product4};
        System.out.println(Arrays.toString(products));
        System.out.println("____________________________________________");

//        Разложить в три новых массива по категориям
         //   создаем новый массив и инициализируем по длинне существующего массива,
        //   говорим, что у нового массива "cellPhones" длинна будет не больше существующего массива "products"
        Product [] cellPhones = new Product[products.length];
        Product [] books = new Product[products.length];
        Product [] cameraPhoto = new Product[products.length];
        //    итерируемся по массиву "products",
        //    в цикле for (переменная равна индексу 0 "i = 0", итерируемся по длинне масива "i < products.length", счетчик увеличивается на 1цу "i++")
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals(ProductCategory.CellPhones)) {
                cellPhones[i] = products[i];
            }
            if (products[i].getCategory().equals(ProductCategory.Books)) {
                books[i] = products[i];
            }
            if (products[i].getCategory().equals(ProductCategory.CameraPhoto)) {
                cameraPhoto[i] = products[i];
            }
        }
        System.out.println("CellPhones: " + Arrays.toString(cellPhones));
        System.out.println("Books: " + Arrays.toString(books));
        System.out.println("CameraPhoto: " + Arrays.toString(cameraPhoto));
        System.out.println("____________________________________________");

//        Посчитать количество продуктов с ценой ниже 100
        int lessThan100Count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() < 100) {
                lessThan100Count += 1;
            }
        }
        System.out.println("Price less then 100: " + lessThan100Count);
        System.out.println("____________________________________________");

//        Посчитать количество объектов которые имеют "the" в названии (или что-то другое)
        int withTheNameCount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().matches("(.*)the(.*)")) {
                withTheNameCount += 1;
            }
        }
        System.out.println("count objects that has 'the' word in name: " + withTheNameCount);

    }
}
