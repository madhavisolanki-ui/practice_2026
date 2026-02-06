package Practice_26;

import java.util.Scanner;
import java.util.Arrays;

public class Union_of_sorted_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();

        int[] arr1=new int[m];
        int[] arr2=new int[n];

        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        // ensure arrays are sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arr3=new int[m+n];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                if(k==0 || arr3[k-1]!=arr1[i])
                    arr3[k++]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(k==0 || arr3[k-1]!=arr2[j])
                    arr3[k++]=arr2[j];
                j++;
            }
            else{
                if(k==0 || arr3[k-1]!=arr1[i])
                    arr3[k++]=arr1[i];
                i++;
                j++;
            }
        }

        while(i<m){
            if(k==0 || arr3[k-1]!=arr1[i])
                arr3[k++]=arr1[i];
            i++;
        }

        while(j<n){
            if(k==0 || arr3[k-1]!=arr2[j])
                arr3[k++]=arr2[j];
            j++;
        }

        for(int x=0;x<k;x++){
            System.out.print(arr3[x]+" ");
        }
    }
}
