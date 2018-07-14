package com.company;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        File file = new File("dict.txt");
//        Scanner scanner = new Scanner(file);
//
        Map<String,String> map = new HashMap<>();
        map.put("Apple","A sweet red fruit");
        map.put("Jaat","A class of human");
        map.put("Java","A programming language");
        map.put("Human","An animal");
        String res = map.get("Apple");
        System.out.println(res);
    }
}
