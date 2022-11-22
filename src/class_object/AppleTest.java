package class_object;

public class AppleTest {
    public static void main(String[] args){
        Apple apple1 = new Apple();
        Apple apple2 = new Apple ();

        System.out.println(apple1); // we will get location
        System.out.println(apple2);
        System.out.println(apple1.color);
    }
}
