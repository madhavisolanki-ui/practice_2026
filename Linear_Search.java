package Practice_26;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                index=i;
                break;
            }
            else{
                index=-1;
            }
        }
        System.out.println(index);
    }
}
