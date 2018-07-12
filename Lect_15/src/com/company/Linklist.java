package com.company;

import java.util.ArrayList;

public class Linklist {

    private Node head;
    private Node tail;
    private int size;

    public Linklist() {
        head = null;
        tail = null;
        size =0;
    }

    public void insertFirst(int value){
        Node node = new Node(value,head);
        head = node;
        if(tail==null){
            tail=node;
        }
        size++;

    }

    public void insertLast(int value){

        if(tail==null){
            insertFirst(value);
            return;
        }
        else{
            Node node= new Node(value);
            tail.next= node;
            tail=node;
        }
    }

    public int deleteFirst() throws Exception{

        if(size==0){
            throw new Exception("Khali hu");
        }

        int temp = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return temp;
    }

    public int deleteLast() throws Exception{
        if(size <= 1){
            return deleteFirst();
        }

        Node node = head;
        while(node.next!=tail){
            node = node.next;
        }
        int temp = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return temp;
    }

    public ArrayList find(int value){
        Node node = head;

        ArrayList list = new ArrayList();

        int index =0;
        while(node!=null){
            if(node.value==value){
                list.add(index);
            }
            node = node.next;
            index++;
        }
        return list;
    }

    public void reverseitr(){
        if(size<=1){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        tail = present;
        while (present.next!=null){
            present.next= prev;
            prev = present;
            present= next;
            next= next.next;
        }
        head = prev;

    }

    public void display(){
        Node node = head;

        while(node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }

}
