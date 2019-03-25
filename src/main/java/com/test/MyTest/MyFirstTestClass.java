package com.test.MyTest;

public class MyFirstTestClass {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Stanislav");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4.0, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

    String h = "Hello, ";
    String w = "world!";
    System.out.println(s1(h, w));

    String h1 = "Hello";
    String w1 = ", ";
    String e = "world!";
    System.out.println(s2(h1, w1, e));
  }
  public static void hello(String somebody){
     System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Square s){
    return s.l * s.l;
  }

  public static double area(Rectangle r){
    return r.a * r.b;
  }

  public static String s1(String h, String w){
    return h + w;
  }
  public static String s2(String h, String w, String e){
    return (h + w + e);

  }
 }