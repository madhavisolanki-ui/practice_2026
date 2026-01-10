import java.util.*;

public class find_similarities_between_two_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int common=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    common++;
                    break;
                }
            }
        }
        int unique=n+m-common;
        System.out.println(common+" "+unique);
    }
}
