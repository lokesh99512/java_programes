package JavaProgammes;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
//        int c=0;
//        c=a;
//        a=b;
//        b=c;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println( a +" ==" + b);


    }
}
