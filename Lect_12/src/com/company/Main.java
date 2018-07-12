package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(pallcount("aabbaa"));
    }
    public static int pallcount(String line){
        int pall=0;

        for (int i = 0; i <line.length() ; i++) {
            //odd values
            int left = i;
            int right = i;
            while((left >=0) && (right < line.length())){
                if(line.charAt(left)==line.charAt(right)){
                    pall++;
                }
                else{
                    break;
                }
                left--;
                right++;
            }
            //even values
            left=i;
            right=i+1;
            while(left>=0 && right < line.length()){
                if(line.charAt(left)==line.charAt(right)){
                    pall++;
                }else{
                    break;
                }
                left--;
                right++;
            }


        }
        return pall;
    }
}
