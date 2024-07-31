package JavaProgammes;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

//        for(int i=0;i<=n;i++){
//            System.out.print(i + "\t");
//        }
//        System.out.println("");
//
//        for(int i=n;i>=0;i--){
//            System.out.println(i);
//        }

//        for(int i=1;i<=n;i++){
//            System.out.print(i + "+");
//        }

        int sum=0;

        for(int i=0;i<=n;i++){
            sum = sum+i;
        }

        System.out.println("sum of natural numbers :== " + sum);

    }
}
