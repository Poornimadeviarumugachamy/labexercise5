/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise5;

import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
public class stu {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            sports obj3 = new sports();
            System.out.println(obj3);
        }

    }

}

class student {

    int rollno;
    String name;

    student() {
        Scanner obj = new Scanner(System.in);
        rollno = obj.nextInt();
        name = obj.next();
    }
}

class result extends student {

    int m1, m2, m3;

    result() {
        super();
        Scanner obj = new Scanner(System.in);
        m1 = obj.nextInt();
        m2 = obj.nextInt();
        m3 = obj.nextInt();
    }

}

class sports extends result {

    int sp;
    int t;

    sports() {
        super();
        Scanner obj = new Scanner(System.in);
        sp = obj.nextInt();
        t = m1 + m2 + m3;

        if (t > 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    @Override
    public String toString() {
        return "name" + name + "rollno" + rollno + "mark1" + m1 + "mark2" + m2 + "mark" + m3 + "sportspoint" + sp + "total" + t;

    }
}
