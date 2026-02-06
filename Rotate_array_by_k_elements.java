package Practice_26;

import java.util.Scanner;

public class Rotate_array_by_k_elements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

    private static void reverse(int[] arr, int i, int i1) {
        while(i<i1){
            int temp=arr[i];
            arr[i]=arr[i1];
            arr[i1]=temp;
            i++;
            i1--;
        }
    }
}
