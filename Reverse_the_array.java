import java.util.*;

public class Reverse_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        int m=sc.nextInt();
        int l=m+1;
        int r=n-1;
        for(;l<r;){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
