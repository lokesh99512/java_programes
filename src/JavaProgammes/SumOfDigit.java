package JavaProgammes;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int dig=0;
        int sum;
        for(sum=0;n>0;n=n/10){
            dig=n%10;
            sum=sum+dig;
        }

        System.out.println("Sum of each digit = " + sum);


    }
}
