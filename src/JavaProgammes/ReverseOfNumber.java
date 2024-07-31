package JavaProgammes;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int dig=0;
        int rev;
        for(rev=0;n>0;n=n/10){
            dig=n%10;
            rev=rev*10+dig;
        }

        System.out.println("Reverse of a number = " + rev);


    }
}
