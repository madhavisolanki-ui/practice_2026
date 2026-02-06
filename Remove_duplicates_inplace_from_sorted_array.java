// Given an integer array sorted in non-decreasing order, remove the duplicates in place
// such that each unique element appears only once. The relative order of the elements should
// be kept the same.

package Practice_26;

import java.util.Scanner;

public class Remove_duplicates_inplace_from_sorted_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
