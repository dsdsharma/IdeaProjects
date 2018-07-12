package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] data = {1,2,3,4};

        Arrays.sort(data);

        tree.populate(data);
        tree.display();





        //        for (int i = 0; i < 20; i++) {
//            int r = (int)(50*Math.random());
//            System.out.println("Inserting"+r);
//            list.add(r);
//
//        }
    }

}
