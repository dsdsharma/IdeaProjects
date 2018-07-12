package com.company;

public class Builder {
    public static void main(String[] args) {
        String line = "Hello";
        StringBuilder builder = new StringBuilder(line);
        builder.append(" World");
//        builder.setCharAt();
//        builder.reverse();
        System.out.println(builder.toString());
        System.out.println(incDec(builder.toString()));


    }
    public static String toggle(String line){
        StringBuilder builder = new StringBuilder(line);
        for (int i = 0; i <builder.length() ; i++) {
            char ch = builder.charAt(i);

            if(ch>='A'&&ch<='Z'){
                builder.setCharAt(i,(char)(ch -'A'+'a'));
            }
            else if(ch>='a'&&ch<='z'){
                builder.setCharAt(i,(char)(ch-'a'+'A'));
            }

        }

        return builder.toString();

    }
    public static String incDec(String line){
        StringBuilder builder = new StringBuilder(line);
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            if(i%2==0){//even
                builder.setCharAt(i,(char)(ch -1));
            }
            else if(i%2!=0){//odd
                builder.setCharAt(i,(char)(ch+1));
            }
        }}
        return builder.toString();
    }

}
