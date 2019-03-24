package com.test.MyTest;

public class MyFirstTestClass {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Stanislav");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b= 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

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

  public static double area(double len){
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }

  public static String s1(String h, String w){
    return h + w;
  }
  public static String s2(String h, String w, String e){
    return (h + w + e);

  }
 }