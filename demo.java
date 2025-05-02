package Malay;

import java.util.Scanner;

public class demo {
   Scanner obj = new Scanner(System.in);
   String name;
   int age;

   public void mymethod() {
      set_name();
      set_age();
      get_name();
      get_age();
   }

   public void set_name() {
      System.out.print("Enter your name: ");
      name = obj.nextLine();
   }

   public void get_name() {
      System.out.println("Your name is: " + name);
   }

   public void set_age() {
      System.out.print("Enter age: ");
      age = obj.nextInt();
   }

   public void get_age() {
      System.out.println("Your age is: " + age);
   }

   public static void main(String[] args) {
      demo d = new demo();
      d.mymethod();

   }
}