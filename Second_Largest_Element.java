package Practice_26;

import java.util.Scanner;

public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            if(smax<arr[i] && arr[i]!=max){
                smax=arr[i];
            }
        }
        if(smax==Integer.MIN_VALUE){
            System.out.print(-1);
        }
        else {
            System.out.print(smax);
        }
    }
}
