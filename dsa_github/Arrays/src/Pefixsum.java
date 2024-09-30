import java.util.*;
public class Pefixsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pre));

    }
}
