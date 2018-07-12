package com.company;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(5);
        stack.push(0);


        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }




}
