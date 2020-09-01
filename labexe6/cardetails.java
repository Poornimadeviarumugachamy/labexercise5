/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise6;

import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
public class cardetails {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = obj.nextInt();
        {
            switch (a) {
                case 1: {
                    System.out.println("enter the value of n");
                    int n = obj.nextInt();
                    for (int i = 0; i < n; i++) {
                        transportVehicles t = new transportVehicles();
                        System.out.println(t);
                    }
                    break;
                }
                case 2: {
                    System.out.println("enter the value of n");
                    int n = obj.nextInt();
                    for (int i = 0; i < n; i++) {
                        privateVehicle p = new privateVehicle();
                        System.out.println(p);
                    }
                    break;

                }
                default: {
                    System.out.println("enter numbers between 1 and 2");
                    break;
                }
            }
        }

    }

}

abstract class car {

    String regno;
    String model;
    String regdate;

    car() {
        Scanner obj = new Scanner(System.in);
        regno = obj.next();
        model = obj.next();
        regdate = obj.next();
    }
}

class transportVehicles extends car {

    String validityno;
    String startdate;
    String period;

    transportVehicles() {
        super();
        Scanner obj = new Scanner(System.in);
        validityno = obj.next();
        startdate = obj.next();
        period = obj.next();
    }

    @Override
    public String toString() {
        return "regno" + regno + "\nmodel" + model + "\nregdate" + regdate + "\nvalidityno" + validityno + "\nstartdate" + startdate + "\nperiod" + period;
    }
}

class privateVehicle extends car {

    String ownername;
    String owneraddress;

    privateVehicle() {
        super();
        Scanner obj = new Scanner(System.in);
        ownername = obj.next();
        owneraddress = obj.next();

    }

    @Override
    public String toString() {
        return "regno" + regno + "\nmodel" + model + "\nregdate" + regdate + "\nownername" + ownername + "\nowneraddress" + owneraddress;
    }

}
