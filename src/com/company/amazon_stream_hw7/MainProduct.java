package com.company.amazon_stream_hw7;

import java.util.*;
import java.util.stream.Collectors;

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
                "c_iPhoneXR the",
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
                "a_Panasoniccthe",
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


        //        Разложить в три новые коллекции по категориям
        Map<ProductCategory, List<Product>> productCategoryListMap = productList
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("product Category List Map: " + productCategoryListMap);

        System.out.println("____________________________________________");


        //  Посчитать количество продуктов с ценой ниже 100
        long priceLessThen100 = productList
                .stream()
                .filter(a -> a.getPrice() < 100)
                .count();

        System.out.println("Number of products with a price less then 100: " + priceLessThen100);
        System.out.println("____________________________________________");


        //   Посчитать количество объектов которые имеют "the" в названии (или что-то другое)
        long withTheNameCount = productList
                .stream()
                .filter(a -> a.getName()
                           .contains("the"))
                .count();
        System.out.println("count objects that has 'the' word in name: " + withTheNameCount);
        System.out.println("____________________________________________");


        //   сортировать по цене
        List<Integer> productSet = productList
                .stream()
                .map(a -> a.getPrice())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Set products, priceComparator: \n" + productSet);
        System.out.println("___________________*******___________________");


        //   сортировать по названию товара
        List<String> productSet1 = productList
                .stream()
                .map(a -> a.getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Set products, nameComparator: \n" + productSet1);
        System.out.println("____________________________________________");


        //   сортировать по длинне слова в названии товара
        List<Product> productSet2 = productList
                .stream()
                .sorted((a, b) -> a.getName().length() - b.getName().length())
                .collect(Collectors.toList());
        System.out.println("Set products, nameComparator: \n" + productSet2);
        System.out.println("____________________________________________");


        //   применить несколько сортировок сразу, например по имени и по цене,
        //   значит, что сначала будет сортировать по имени, а потом по цене
//        System.out.println("Set products, nameComparator: \n" + productSet3);
        System.out.println("__________________&&&&&__________________");
    }
}
