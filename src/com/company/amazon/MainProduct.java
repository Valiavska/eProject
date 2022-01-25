package com.company.amazon;

import java.util.Arrays;

public class MainProduct {

    public static void main(String[] args) {

        Product product1 = new Product(
                ProductCategory.Books,
                "The Maid",
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
                "iPhone 8",
                "64GB, Space Gray",
                "English",
                2018,
                219);
        Product product4 = new Product(
                ProductCategory.CameraPhoto,
                "Panasonic LUMIX GH5M2",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);

//        Сложить в массив                                ??????????????  это то что вы просили? ??????????????
        Product [] products = {product1, product2, product3, product4};
        System.out.println(Arrays.toString(products));
        System.out.println("____________________________________________");

//        Разложить в три новых массива по категориям       ??????????????  не поняла вопрос, думаю сделала не то, что вы просили ??????????????
        Product [] cellPhones = {product2, product3};
        Product [] books = {product1};
        Product [] cameraPhoto = {product4};
        System.out.println(Arrays.toString(cameraPhoto));
        System.out.println("____________________________________________");
        System.out.println(Arrays.toString(books));
        System.out.println("____________________________________________");
        System.out.println(Arrays.toString(cellPhones));

//        Посчитать количество продуктов с ценой ниже 100. ?????????????? как применить метод length к "i"  ??????????????
        int [] price = {14, 330, 219, 1482};
        for (int i: price) {
            if (i < 100) {
                System.out.println(i);
            }
        }

//        Посчитать количество объектов которые имеют "great" в названии (или что-то другое)        ????????

    }
}
