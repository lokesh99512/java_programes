package JavaProgammes;

import java.util.Scanner;

public class SwitchStatement {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        switch (a){
            case 10:
                System.out.println("case 10");
                break;
            case 20:
                    System.out.println("case 20");
            default:
                System.out.println("finally");
        }


    }
}
