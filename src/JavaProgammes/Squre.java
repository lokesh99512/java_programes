package JavaProgammes;

import java.util.Scanner;

public class Squre {

    public static void main(String[] args) {

        // (a+b)2  == a*a + b*b + 2 * a * b;

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(a*a + b*b + 2 *a *b);


    }
}
