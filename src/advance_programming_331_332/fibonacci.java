/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_programming_331_332;

/**
 *
 * @author user
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0, c = 1, i = 1,sum=0;
        int[] arr=new int[100];
        do {
            sum+=b;
            System.out.print(b + " ");
            int s = b + c;
            b = c;
            c = s;
            i++;
        } while (i <= a);
        System.out.print("\n"+sum);
    }
}
