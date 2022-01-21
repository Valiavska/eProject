package com.company;

import com.company.enums.PlaneTypes;

public class PlaneAddTypes {

        private int id;
        private int capacity;
        private int wings;
        private String name;
        private String engine;
        private PlaneTypes type;

        public PlaneAddTypes(int id, int capacity, int wings, String name, String engine, PlaneTypes type) {
            this.id = id;
            this.capacity = capacity;
            this.wings = wings;
            this.name = name;
            this.engine = engine;
            this.type = type;
        }

        @Override
        public String toString() {
            return "PlaneAddTypes{" +
                    "id=" + id +
                    ", capacity=" + capacity +
                    ", wings=" + wings +
                    ", name='" + name + '\'' +
                    ", engine='" + engine + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

}
