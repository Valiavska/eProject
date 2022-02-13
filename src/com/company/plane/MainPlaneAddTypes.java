package com.company.plane;

import com.company.enums.PlaneTypes;

// мы создали класс enum и перечислили там все виды type, а тут вывели нужные нам типы "PlaneTypes.BOING_747"
public class MainPlaneAddTypes {

        public static void main(String[] args) {
            PlaneAddTypes plane = new PlaneAddTypes(
                    9,
                    87,
                    8,
                    "plane",
                    "engine1",
                    PlaneTypes.BOING_747);
            System.out.println(plane);
        }
}

