package test;

import test.fu.Func;
import test.fu.Bla;
import java.util.Scanner;
import java.io.*;
public class Main{  
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Scanner s = new Scanner(System.in);
    int value = s.nextInt();
    
    throw new NullPointerException();
    
    Func f = new Func();
    System.out.println(f.add(value, 2));
    f.sayHI();
    
    System.out.println("Hello");
    Bla.ausgeben("Test");

  }
}
