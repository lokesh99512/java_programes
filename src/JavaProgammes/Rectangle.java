package JavaProgammes;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // l * b

        int l=sc.nextInt();
        int b=sc.nextInt();

        int output;
        output=l*b;
        System.out.println("area of a rectangle= "+ output); // area of a rectangle

        System.out.println("perimeter  of a rectangle =" + 2*output);// perimeter  of a rectangle


    }
}
