/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise5;

/**
 *
 * @author ARUMUGASAMY
 */
public class money {

    public static void main(String[] args) {
        bankA obj = new bankA();
        System.out.println(obj.getbalance());
        bankB obj1 = new bankB();
        System.out.println(obj1.getbalance());
        bankC obj2 = new bankC();
        System.out.println(obj2.getbalance());
    }
}

class bank {

    int getbalance() {
        return 0;
    }
}

class bankA extends bank {

    int getbalance() {
        return 1000;
    }
}

class bankB extends bank {

    int getbalance() {
        return 1500;
    }
}

class bankC extends bank {

    int getbalance() {
        return 2000;
    }
}
