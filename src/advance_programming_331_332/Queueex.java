/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_programming_331_332;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author asus
 */
public class Queueex {
    public static void main(String[] args){
        Queue<String> qs = new LinkedList<>();
        qs.add("All");
        qs.add("Moon");
        qs.add("Tasir");
        qs.add("256");
        qs.add("CSE");
        qs.add("BUBT");

        System.out.println("Queue list = " + qs);
        System.out.println("");
        String delstr = qs.remove();
        System.out.println("Deleting = " + delstr);
        System.out.println("Complete now list is = " + qs);
    }
}
