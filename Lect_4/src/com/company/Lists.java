package com.company;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList l =new ArrayList();   /*arrayList is different from array
                                          arrayList allocated a pre space but never display as it size
                                           when element is entered it uses space and can display its size*/

        l.add(1);       // like there are 3 elements given its size is 3 but has pre allocated memory
        l.add(5);
        l.add(4);
        l.set(0,55);    // it will update previous element but can add new element in array

        int a =0;
        for (int i = 0; i < l.size(); i++) {
//            a =a + l.get(i); ignore this line it is my thought
            System.out.println(l.get(i));       // it will print each elements of arrayList

        }
    }
}
