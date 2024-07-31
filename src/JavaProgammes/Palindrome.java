package JavaProgammes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int dig=0;
        int rev;
       for(rev=0;n>0;n=n/10){
           dig=n%10;
           rev=rev*10+dig;
       }

       if(m==rev){
           System.out.println("is palindrome: "+  m +" :  " + rev);
       }else {
           System.out.println("is not palindrome: "+  m +" :  " + rev);
       }

    }
}
