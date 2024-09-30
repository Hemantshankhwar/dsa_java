import java.util.Scanner;

public class CountOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        //can we use prefixsum here??->yes prelow stores count of odd from 0 to low-1. same for high
        int prelow;
        int prehigh;
        if((low-1)%2==0){prelow=(low-1)/2;}
        else{prelow=(low-1)/2+1;}
        if(high%2==0){prehigh=high/2;}
        else{prehigh=high/2+1;}
        if(low==0){
            System.out.println(prehigh);
        }
        else{
            System.out.println(prehigh-prelow);
        }
    }
}
