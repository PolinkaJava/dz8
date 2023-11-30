package task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Red");
        System.out.println("Original color: " + apple.getColor());

        try {
            Field field = Apple.class.getDeclaredField("color");
            ((Field) field).setAccessible(true);
            field.set(apple, "Green");
            System.out.println("Changed color: " + apple.getColor());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}