import java.util.Scanner;
//input
/*6
3 0 0 2 0 4*/
//output
//10
public class RainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]= sc.nextInt();
        }
        int[] premax=new int[n];
        int[] suffmax=new int[n];
        premax[0]=height[0];
        suffmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            premax[i]=Math.max(premax[i-1],height[i]);
            suffmax[n-i-1]=Math.max(suffmax[n-i],height[n-i-1]);
        }
        int c=0;
        for(int i=1;i<n-1;i++){
            int left=premax[i-1];
            int right=suffmax[i+1];
            int block=Math.min(left,right);
            if(block-height[i]>0){
                c+=block-height[i];
            }
        }
        System.out.println(c);
    }
}
