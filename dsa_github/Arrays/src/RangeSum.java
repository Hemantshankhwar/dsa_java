import java.util.*;
//Sample input
/*6 3
-2 0 3 -5 2 -1
0 2
2 5
0 5*/
//sample output
//1 -1 -3

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[n];
        int[][] queries=new int[m][2];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        for(int i=0;i<m;i++){
            queries[i][0]= sc.nextInt();
            queries[i][1]= sc.nextInt();
        }
        RangeQueries o1=new RangeQueries(nums);
        for(int i=0;i<m;i++){
            System.out.print(o1.getsum(queries[i][0],queries[i][1])+" ");
        }


    }



}
class RangeQueries{
    int[] pre;
    RangeQueries(int[] nums){
        pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
    }
    int getsum(int s,int e){
        if(s==0){return pre[e];}
        int i = pre[e] - pre[s - 1];
        return i;
    }

}
