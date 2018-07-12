package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.populate();
        //5 2 1 0 9 0 depth of a node heigth of a tree degree of node
        tree.display();

        System.out.println("Total nodes are "+tree.count());
        System.out.println(tree.max());


    }
}
