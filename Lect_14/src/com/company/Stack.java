package com.company;

import java.util.ArrayList;

public class Stack {

    public static final int DEFAULT_SIZE=10;

    int[] data;
    int top;

    public Stack(){
        this.data=new int[DEFAULT_SIZE];
        this.top =-1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.top == this.data.length-1;
    }
    public int pop() throws Exception{
        if(!this.isEmpty()){
            return this.data[this.top--];
        }else{
            throw new Exception("Bhaiya jaan lelo");
        }
    }

    public void push(int data){
        if(!this.isFull()){
            this.top++;
            this.data[this.top] = data;
        }
    }






}
