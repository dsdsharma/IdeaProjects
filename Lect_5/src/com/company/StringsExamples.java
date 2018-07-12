package com.company;

public class StringsExamples {
    public static void main(String[] args) {
        String greet = "aabbaa";

//        greet.concat("World");

//        greet = greet.concat("Wrold");
//        System.out.println(greet);
//
//        greet.concat(Integer.toString(1));
//        System.out.println(greet);
//
//        System.out.println(greet.indexOf('o',5));
//
//        System.out.println(greet.startsWith("W"));
//
//        System.out.println(greet.startsWith("W", 5));
        printpallin(greet);
    }
    public static boolean isPallin(String line){
        int start = 0;
        int end  = line.length()-1;
        while(start<end){
            if(line.charAt(start)!=line.charAt(end)){
                return false;
            }
            start++;
            end --;
        }

        return true;
    }

    public static void printpallin(String line){
        for (int i = 0; i <line.length() ; i++) {
            for (int j = i+1; j <= line.length(); j++) {

                if(isPallin(line.substring(i,j))){
                    System.out.println(line.substring(i,j));
                }

            }

        }

    }
}
