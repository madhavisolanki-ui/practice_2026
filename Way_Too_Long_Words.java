package Practice_26;

import java.util.Scanner;

import java.util.*;

public class Way_Too_Long_Words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }

        for(int i=0;i<n;i++){
            String w=words[i];
            int len=w.length();

            if(len>10){
                System.out.println(w.charAt(0)+""+(len-2)+w.charAt(len-1));
            }
            else{
                System.out.println(w);
            }
        }
    }
}

