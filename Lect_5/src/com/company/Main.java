package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s= "Hello Java";
        String data = "Hello Java";
            if(s==data)
                System.out.println("1");

        System.out.println(s.equals(data));

//        System.out.println(data.charAt(0));
//         data.length() is an object;
//            array pe variable
//        for (int i = 0; i <data.length() ; i++) {
//            System.out.println(data.charAt(i));
//
//        }
//
//        for (int i = data.length()-1; i >= 0 ; i--) {
//            System.out.println(data.charAt(i));
//
//        }
//        System.out.println(data.charAt(9));
        System.out.println(data.substring(5));
        System.out.println("-----------------");

        for (int i = 0; i <=data.length() ; i++) {
            for (int j = i+1; j <=data.length() ; j++) {
                System.out.println(data.substring(i,j));
//                System.out.println("--");

            }
            System.out.println("--");
        }
    }

}
