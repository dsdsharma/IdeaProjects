package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Linklist list = new Linklist();


        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();



    }
}
