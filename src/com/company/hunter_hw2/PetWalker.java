package com.company.hunter_hw2;

import java.util.List;

public class PetWalker {
   //  class PetWalker хранит в себе ссылку на обьект, тк нам нужно гулять с животными
    public Animal animal;

    // наш метод  "walk" будет принимать любое животное "Animal animal"
    public void walk(Animal animal) {
        System.out.println("I am walking with: " + animal);
    }
    //  метод "walk" может теперь не только гулять, а и принимать список животных
    //  "? extends Animal" - применяем метод wildcard ? - значит, возьми любой тип который наследуется от Animal
    public static void checkAnimals(List<? extends Animal> animalss) {

        for (int i = 0; i < animalss.size(); i++) {
            System.out.println("checking: " + animalss.get(i));
        }
    }

}
