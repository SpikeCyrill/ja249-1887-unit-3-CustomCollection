package com.brunoyam.collection;

public class Application {

    public static void main(String[] args) {

        /*SmartArray smartArray = new SmartArray();

        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);

        Integer fourstInt = (Integer) smartArray.get(3);

        System.out.println("size " + smartArray.size());
        System.out.println("is empty " + smartArray.isEmpty());
        System.out.println("3 " + smartArray.get(3));

        SmartArray smartArrayOfStrings = new SmartArray();

        smartArrayOfStrings.add("one");
        smartArrayOfStrings.add("two");
        smartArrayOfStrings.add(3);
        smartArrayOfStrings.add("four");

        Integer fourstString = (Integer) smartArrayOfStrings.get(3);

        System.out.println("size " + smartArrayOfStrings.size());
        System.out.println("is empty " + smartArrayOfStrings.isEmpty());
        System.out.println("3 " + smartArrayOfStrings.get(3));*/

        SmartArray<String> strings = new SmartArray();

        strings.add("one");
        strings.add("two");

        SmartArray<Integer> integers = new SmartArray();
        integers.add(1);
        integers.add(2);

        Integer myInt = genericMethod(10);

        Long myLong = genericMethod(10L);

        Double myDouble = genericMethod(10.10);


    }

    public static <T extends Number> T genericMethod(T value) {
        return value;
    }

}
