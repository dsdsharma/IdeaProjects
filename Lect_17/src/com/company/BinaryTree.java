package com.company;

import java.util.Scanner;

public class BinaryTree {
    private Node root; // null till no node added.
    public void populate(String line){
        Scanner scanner = new Scanner(line);
        System.out.println("Enter the root value: ");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(root,scanner);

    }

    private void populate(Node node, Scanner scanner) {
        System.out.println(node.value+" ki left value dalni hai kya?");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left value of "+node.value);
            int value = scanner.nextInt();
            node.left =new Node(value);
            node.left.parent = node;
            populate(node.left,scanner);
        }

        System.out.println(node.value+" ki right value dalni hai kya?");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value of "+node.value);
            int value = scanner.nextInt();
            node.right =new Node(value);
            node.right.parent = node;
            populate(node.right,scanner);
        }

    }
    public int diameter(){
        return height(root.left)+height(root.right)+1;
    }
    public void display(Node node){
        if(node==null){
            return;
        }
        System.out.println(indent+ node.value);

        display(node.left,indent+"\t");


    }

    public int height(Node node){
        if(node==null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;

    }


    private class Node{
        private int value;
        private Node left;  //left and right are null by default.
        private Node right;

        private Node parent;

        public Node(int value) {
            //It will create node every time.
            this.value = value;
        }
    }
}
