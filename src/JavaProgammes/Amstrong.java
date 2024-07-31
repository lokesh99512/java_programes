package JavaProgammes;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int dig=0;
        int sum;
       for(sum=0;n>0;n=n/10){
           dig=n%10;
           sum=sum+dig * dig * dig;
       }
       if(m==sum){
           System.out.println("is Armstrong: "+  m +" :  " + sum);
       }else {
           System.out.println("is not Armstrong: "+  m +" :  " + sum);
       }

    }
}
