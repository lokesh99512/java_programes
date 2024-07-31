package JavaProgammes;

import java.util.Scanner;

public class NestedIfPrograme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 10) {
            System.out.println("10 =" +x);
        } else if (x == 12) {
            System.out.println(x);
        } else if (x == 13) {
            System.out.println(x);
        } else System.out.println("no it is not working");
    }
}
