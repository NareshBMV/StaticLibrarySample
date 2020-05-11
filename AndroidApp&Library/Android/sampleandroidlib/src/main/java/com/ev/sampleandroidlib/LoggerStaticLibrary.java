package com.ev.sampleandroidlib;

public class LoggerStaticLibrary {

    public static String greetUser(String name) {
        return "Hi " + name + " Welcome to EdgeVerve !";
    }

    public  static  void logInLibrary(){
        System.out.println("You are inside Library!!! Method");
    }

    public  static  int addTwoNumbers(int num1, int num2) {
        return  num1 + num2;
    }
}

