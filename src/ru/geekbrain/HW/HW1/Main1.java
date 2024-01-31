package ru.geekbrain.HW.HW1;

public class Main1 {

    private static int b = 9;
    private static String str;
    private static char chr;

    public static void main(String[] args) {
        int a = 5;
//        String str1;

        System.out.println(chr);
        int c = 5;
        int d = 5;
        System.out.println("c == d: " + (c == d));

        Person p1 = new Person("Petr", 42);
        Person p2 = new Person("Petr", 42);

        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + (p1.equals(p2)));

        String str1 = "qwerty";
//        String str2 = new String("qwerty");
        String str2 = "qwerty";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2));

        System.out.println("-----------");
//        int t = 7;
        System.out.println(b);
        testInt(b);
        System.out.println(b);
        System.out.println("-----------");

        Person p3 = new Person("Ivan", 25);
        System.out.println(p3);
        testPerson(p3);
        System.out.println(p3);
    }

    private static void testPerson(Person p3) {
        System.out.println(p3);
//        p3 = new Person("Sergey", 28);
        p3.setName("Sergey");
        p3.setAge(28);
        System.out.println(p3);
    }

    private static void testInt(int t) {
        System.out.println(t);
        t = 777;
        System.out.println(t);
    }

}
