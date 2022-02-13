package com.company.annotations;

import java.util.List;

public class MainBoxAnimal {

    public static void main(String[] args) {

        Animal cat = new Cat("Cat - Vasya", 4, "pet");
        Animal horse = new Horse("Horse - Lola", 450, "wild");
        Animal tiger = new Tiger("Tiger - Tosha", 90, "wild");
        Animal smallCat = new SmallCat("SmallCat - inherited-Kysya", 4, "pet");

        // получим "Access denied!" потому что животные не имею доступа к коробке RestrictedBox
        Box restrictedBox = new RestrictedBox();
        restrictedBox.addToBox(horse);
        restrictedBox.addToBox(tiger);
        List<Object> objectListRestricted = restrictedBox.values;
        System.out.println("objectListRestricted, restrictedBox: " + objectListRestricted);
        System.out.println("________________RestrictedBox__________________");

        // все животные добавятся в коробку "Box", потому что коробка принимает всех животных
        Box notRestrictedBox = new Box() {
            @Override
            protected void addToBox(Object value) {
                super.addToBox(value);
            }
        };
        notRestrictedBox.addToBox(horse);
        notRestrictedBox.addToBox(tiger);
        List<Object> objectListBox = notRestrictedBox.values;
        System.out.println("objectListBox, notRestrictedBox: " + objectListBox);
        System.out.println("________________notRestrictedBox__________________");


        // получим "Access denied!" для обьекта tiger - он не добавится в коробку RestrictedBox, потому что он не имеет аннотацию "@",
        // а обьект "cat" добавится в коробку RestrictedBox, потому что имеет аннотацию "@" в своем классе
        Box restrictedBoxTiger = new RestrictedBox();
        restrictedBoxTiger.addToBox(cat);
        restrictedBoxTiger.addToBox(tiger);
        List<Object> objectList = restrictedBoxTiger.values;
        System.out.println("objectList, restrictedBoxTiger: " + objectList);
        System.out.println("________________restrictedBoxTiger__________________");


        // inherited - аннотация позволяет добавить всех животных которые расширяются от класса Cat,
        // при этом класс smallCat не имеет аннотаций внутри своего класса
        Box restrictedBoxInherited = new RestrictedBox();
        restrictedBoxInherited.addToBox(cat);
        restrictedBoxInherited.addToBox(smallCat);
        List<Object> objectListInherited = restrictedBoxInherited.values;
        System.out.println("objectListInherited, restrictedBoxInherited: " + objectListInherited);
        System.out.println("________________restrictedBoxInherited__________________");
    }
}
