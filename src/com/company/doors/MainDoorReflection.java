package com.company.doors;

import java.lang.reflect.*;
import java.util.Arrays;

public class MainDoorReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        PushDoor pushDoor = new PushDoor("shape", "c", "d");
        //  ".getClass().getName()" - рефлексия, получение данных о самой программе на готовом обьекте "pushDoor"
        String nameOfPushDoor = pushDoor.getClass().getName();
        System.out.println("Name of PushDoor from Object: " + nameOfPushDoor);

        String nameOfPushDoor1 = pushDoor.getClass().getSimpleName();
        System.out.println(nameOfPushDoor1);

        String nameOfPushDoor2 = pushDoor.getClass().getSuperclass().getName();
        System.out.println(nameOfPushDoor2);
        System.out.println("____________________Reflection____________________");

        //    если нет обьекта, то можно обратиться к классу и получить информацию о нем - 2 способ
        String simpleName = PushDoor.class.getSimpleName();
        System.out.println("Name of PushDoor from Class: " + simpleName);
        System.out.println("____________________2____________________");

        //   если нет обьекта, то можно обратиться к классу и получить информацию о нем - 3 способ
        String name = Class.forName("com.company.doors.PushDoor").getName();
        System.out.println("Name of PushDoor from Class: " + name);
        System.out.println("____________________3____________________");


        //   modifiers, тоесть получить уровни доступа
        int modifiers = pushDoor.getClass().getModifiers();
         //   "isPublic" - метод класса Modifiers
        System.out.println("Is Public? " + Modifier.isPublic(modifiers));
        System.out.println("Is Private? " + Modifier.isPrivate(modifiers));
        System.out.println("Is Protected? " + Modifier.isProtected(modifiers));
        System.out.println("____________________modifiers____________________");

        //    get interface
        SlidingDoorInterface slidingDoorInterface = new SlidingDoorInterface();
        Class<?>[] interfaces = slidingDoorInterface.getClass().getInterfaces();
        System.out.println(Arrays.asList(interfaces));
        System.out.println("____________________interface____________________");

        //    get constructor
        Class<?> superClass = pushDoor.getClass().getSuperclass();
        Constructor<?>[] constructors = pushDoor.getClass().getConstructors();
        System.out.println(Arrays.asList(constructors));
        System.out.println("____________________constructor____________________");

        //    get fields
        //   declaredFields - возвращает приватные поля, а Fields - нет
        Field [] declaredFields = PushDoor.class.getDeclaredFields();
        Field [] Fields = PushDoor.class.getFields();
        System.out.println("declaredFields: " + Arrays.asList(declaredFields) + "\n" + "Fields: " + Arrays.asList(Fields));
        System.out.println("____________________fields____________________");



        //   получить доступ к одному полю, которое точно знаем, подефолту доступ к приватному полю = false
        //   создаем класс pushDoorClass через метод forName
        Class<?> pushDoorClass = Class.forName("com.company.doors.PushDoor");
        //  проинициализировали (тоесть создали) обьект "o" с тремя полями
        //   получаем конструктор класса pushDoorClass
        //   (PushDoor) - так как возвращается класс, нам нужно скастить к тому что мы хотим
        PushDoor o = (PushDoor) pushDoorClass.getConstructor(String.class, String.class, String.class).newInstance("a", "b", "c");
        System.out.println("Before: " + o);

        Field declaredField = pushDoorClass.getDeclaredField("size");
        //  метод setAccessible - позволяет гарантированно получить доступ к приватному полю
        declaredField.setAccessible(true);

         //  мы хотим обьекту "o", заменить set значение "d" в declaredField которое равно "c"
        declaredField.set(o, "d");
        //  выводим созданное новое поле "d", способ 1
        declaredField.get(o);
        System.out.println("After: " + o);

        //  выводим созданное новое поле "d", способ 2, через рефлексию
        Object o1 = declaredField.get(o);
        System.out.println("Field: " + o1.toString());
        System.out.println("____________________change field with 2 keys____________________");


        //  Method [] declaredMethods  - получим массив всех методов
        Method [] declaredMethods = pushDoorClass.getDeclaredMethods();
        System.out.println("declaredMethods: " + Arrays.asList(declaredMethods));
        //  Method openDoor - получаем только один метод
        Method openDoor = pushDoorClass.getDeclaredMethod("openDoor");
        //  invoke - позволяет получить метод "openDoor" у обьекта "o"
        openDoor.invoke(o);
        System.out.println("____________________get declared Methods____________________");

    }

}
