package com.company;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.populate("5 true 10 true 15 false false false true 20 false false ");
        System.out.println("Diameter lelo frands: "+tree.diameter());
	    }
}
