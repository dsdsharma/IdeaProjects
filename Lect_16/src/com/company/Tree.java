package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

    private Node root;

    public Tree() {
        //kuch nhi hai
    }

    public void populate(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int value = s.nextInt();

        root = new Node(value);
        populate(root,s);
    }
    public void populate(Node node, Scanner scanner){
        System.out.println("How many children for "+node.value);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter %d th child of %d : ",i,node.value);
            int value = scanner.nextInt();

            Node child = new Node(value);
            node.children.add(child);
            child.parent=node;
            populate(child,scanner);


        }

    }
    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        System.out.println(indent+node.value);

        for (int i = 0; i <node.children.size() ; i++) {
            display(node.children.get(i),indent+"\t");

        }
    }

    public int count(){
        return count(root);
    }
    private int count(Node node) {
        if(node.children.size()==0){
            return 1;
        }
        int sum = 1 ;

        for (int i = 0; i <node.children.size() ; i++) {
            sum+=count(node.children.get(i));

        }
        return sum;
    }

    public int max(){
        return max(root);
    }

    private int max(Node node) {
        if(node.children.size()==0){
            return node.value;
        }
        int m = node.value;

        for (int i = 0; i <node.children.size() ; i++) {
            m=Math.max(max(node.children.get(i)),m);

        }
        return m;
    }

    private class Node {

        private int value;
        private ArrayList<Node> children;
        private Node parent;
        public Node(int value){
            this.value = value;
            this.children = new ArrayList<>();

        }
    }
}
