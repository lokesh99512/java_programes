package JavaProgammes;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        int b=sc.nextInt();
        int h=sc.nextInt();

        System.out.println("area of a triangle = " + 0.5 * b *h); // 1/2 * b *h

        // 3.14 r * r;

        int r = sc.nextInt();

        System.out.println("area of a circle = " + 3.14 * r *r);  // 3.14 r * r;




    }
}
