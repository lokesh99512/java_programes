package JavaProgammes;

import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.println("Squares of a number : " + i *i );
        }

    }
}
