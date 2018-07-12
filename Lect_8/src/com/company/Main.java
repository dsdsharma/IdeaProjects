package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        System.out.println(maze(3,3));
        System.out.println(diagolist("",3,3));
    }

    public static int maze(int row, int col){

        if(row==1&&col==1){
            return 1;
        }

        int count =0;

        if(row>1){
            count +=maze(row-1,col);
        }
        if(col>1){
            count+= maze(row,col-1);
        }
        return count;
    }
    public static int mazesimple(int row, int col){

        if(row==1||col==1){
            return 1;
        }

        return mazesimple(row-1,col)+mazesimple(row,col-1);
    }

    public static void mazepath(String path,int row, int col){

        if(row==1&&col==1){
            System.out.println(path);
        }



        if(row>1){

           mazepath(path+"v",row-1,col);

        }
        if(col>1){

             mazepath(path+"h",row,col-1);

        }

    }
    public static void diagopath(String path, int row, int col ){
        if(row==1&&col==1){
            System.out.println(path);
        }


        if(row>1){
            diagopath(path+"v",row-1,col);
        }
        if(col>1){
            diagopath(path+"h",row,col-1);
        }
        if(col>1&&row>1){
            diagopath(path+"d",row-1,col-1);
        }}

        public static ArrayList diagolist(String path, int row, int col){
            if(row==1&&col==1){
                ArrayList list = new ArrayList();
                list.add(path);
                return list;
            }

            ArrayList list = new ArrayList();

            if(row>1){
                ArrayList temp = diagolist(path+"V",row-1,col);
                list.addAll(temp);
            }
            if(col>1){

                ArrayList temp = diagolist(path+"H",row,col-1);
                list.addAll(temp);
            }
            if(col>1&&row>1){
                ArrayList temp=diagolist(path+"D",row-1,col-1);
                list.addAll(temp);
            }
            return list;
    }

}