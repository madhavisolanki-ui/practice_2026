package Practice_26;

import java.util.Scanner;

public class Check_is_an_array_sorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sorted=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=0;
                break;
            }
        }
        if(sorted==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
