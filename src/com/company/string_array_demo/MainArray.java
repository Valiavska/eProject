package com.company.string_array_demo;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {

        //  create integer array (length = 10)
        int [] myList = new int[10];
        System.out.println(Arrays.toString(myList));
        //   fill an array of data, i - local veriable, итеррируемся по элементам с помощью цикла
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i + 1;
        }
        System.out.println(Arrays.toString(myList));


        //  create new array (с заполненными элементами) with integers, where  "Integer" - it is object
        Integer [] myList4 = {88, 18, 8};
        Integer [] myList5 = {88, 18, 8};
        //   sort  array
        Arrays.sort(myList4);
        System.out.println(Arrays.toString(myList4));
        //   show length of array
        System.out.println(myList4.length);
        //  stream - позволяет работать с потоками
        //  count() - выполняет то же что и метод "length"
        long count = Arrays.stream(myList4).count();
        System.out.println(count);
        boolean equals = Arrays.equals(myList4, myList5);
        System.out.println(equals);

        //  create string array (length = 10)
        String [] myList2 = new String[10];
        System.out.println(Arrays.toString(myList2));

        //  двумерный массив
        int [][] myList3 = {{2, 3, 4}, {5, 6, 7}};
        //   myList3[1][2] - значит [1] - из этого {5, 6, 7} массива, вытащи  [2] - второй индекс элемента
        System.out.println(myList3[1][2]);

        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};
        //   хочу скопировать arraySource массив с 1вой позиции элемента
        //   в  arrayDestination во вторую позицию, где количество копирующихся элементов равно 3
        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after arraySource: " + Arrays.toString(arrayDestination));

        // кастинг (int) l -  приводим один тип к другому типу данных
        long l = 0L;
        int k = (int) l;
        System.out.println(k);

        int [] myList1 = new int[10];
         //   "i <= myList1." - мы зашли в массив больше, чем позволяет его длинна, поэтому будет исключение "ArrayIndexOutOfBoundsException"
        for (int i = 0; i <= myList1.length; i++) {
            myList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(myList1));

    }
}
