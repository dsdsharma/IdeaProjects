package com.company;

public class Main {

    public static void main(String[] args) {
	
        int n = 4;
        
        boolean[][] table = new boolean[n][n];


    }

    public static void maze(String path, boolean[][] table, int row, int col){

        if(row==table.length-1&&col==table[0].length-1){
            System.out.println(path);
            return;
        }

    }
}
