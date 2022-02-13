package com.company.amazon_collection_hw5;

import java.util.*;

public class MainProduct {

    public static void main(String[] args) {

        Product product1 = new Product(
                ProductCategory.Books,
                "e_Maid",
                "NEW YORK TIMES BESTSELLER",
                "English",
                2022,
                14);
        Product product2 = new Product(
                ProductCategory.CellPhones,
                "c_iPhoneXR",
                "64GB, Black",
                "English",
                2018,
                330);
        Product product3 = new Product(
                ProductCategory.CellPhones,
                "b_iPhone8",
                "64GB, Space Gray",
                "English",
                2018,
                219);
        Product product4 = new Product(
                ProductCategory.CameraPhoto,
                "d_Panasonic",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);
        Product product5 = new Product(
                ProductCategory.CameraPhoto,
                "a_Panasonicccc",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);
        Product duplicateProduct5 = new Product(
                ProductCategory.CameraPhoto,
                "a_Panasonic",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1482);
        Product product6 = new Product(
                ProductCategory.CameraPhoto,
                "a_Panasonic",
                "Mirrorless Camera with wireless live streaming - Black",
                "English",
                2021,
                1);


        //        Сложить в коллекцию
        Collection<Product> productList = new LinkedList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(duplicateProduct5);
        System.out.println("List products: " + productList);
        System.out.println("____________________________________________");

        System.out.println("they equals? " + product5.equals(duplicateProduct5));

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


        //   сортировать по цене, keys_1
        PriceComparatorKeys1 priceComparatorKeys1 = new PriceComparatorKeys1();
        TreeSet<Product> productSet = new TreeSet<>(priceComparatorKeys1);
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);
        System.out.println("Set products, priceComparator: \n" + productSet);
        System.out.println("___________________*******___________________");


        //   сортировать по цене, keys_2
        List<Product> productSett = new ArrayList<>();
        productSett.add(product1);
        productSett.add(product2);
        productSett.add(product3);
        productSett.add(product4);
        productSett.add(product5);
        productSett.sort(new PriceComparatorKeys2());
        System.out.println("Set products, priceComparator: \n" + productSett);
        System.out.println("___________________*******___________________");


        //   сортировать по названию товара без дубликатов, keys_1
        Comparator<Product> nameComparator = Comparator.comparing(Product::getName);
        TreeSet<Product> productSet1 = new TreeSet<>(nameComparator);
        productSet1.add(product1);
        productSet1.add(product2);
        productSet1.add(product3);
        productSet1.add(product4);
        productSet1.add(product5);

        System.out.println("Set products, nameComparator: \n" + productSet1);
        System.out.println("____________________________________________");


        //   сортировать по длинне слова в названии товара с дубликатами, keys_2
        List<Product> productSet2 = new ArrayList<>();
        productSet2.add(product1);
        productSet2.add(product2);
        productSet2.add(product3);
        productSet2.add(product4);
        productSet2.add(product5);
        productSet2.sort(new NameComparator());
        System.out.println("Set products, nameComparator: \n" + productSet2);
        System.out.println("____________________________________________");


        //   применить несколько сортировок сразу, например по имени и по цене,
        //   значит, что сначала будет сортировать по имени, а потом по цене
        List<Product> productSet3 = new ArrayList<>();
        productSet3.add(product1);
        productSet3.add(product2);
        productSet3.add(product3);
        productSet3.add(product4);
        productSet3.add(product5);
        productSet3.add(product6);
        productSet3.sort(new NameComparator().thenComparing(new PriceComparatorKeys2()));
        System.out.println("Set products, nameComparator: \n" + productSet3);
        System.out.println("__________________&&&&&__________________");
    }
}
