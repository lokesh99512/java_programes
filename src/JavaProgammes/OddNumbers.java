package JavaProgammes;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

//        for(int i=1;i<=n;i=i+2){
//            System.out.println(i);
//
//        }
//        for(int i=1;i<=n;i++){
//            if(i%2!=0) {
//                System.out.println(i);
//            }
//        }
//
        for(int i=0;i<=n;i++){
            if(i%2!=0) {
                System.out.print(i +" + ");
            }
        }

        System.out.println();

        int sum=0;

        for(int i=0;i<=n;i++){
            if(i%2!=0) {
               sum=sum+i;
            }
        }

        System.out.println(sum);
    }
}
