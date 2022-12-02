package com.atmmachine;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 1234;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome To ATM Machine!!!");
        System.out.print("Enter ATM Number : ");
        int atmNumber = in.nextInt();
        System.out.print("Enter Pin : ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            System.out.println("Validation Done");
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View The Mini-Statement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter Amount To Withdraw ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAMOUNT(withdrawAmount);

                } else if (ch == 3) {
                    System.out.println("Enter Amount To Deposit :");
                    double depositAmount = in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                } else if (ch == 4) {
                    op.viewminiStatement();

                } else if (ch == 5) {
                    System.out.println("Collect Your ATM Card\n Thank You For Using ATM Machine!!");
                    System.exit(0);
                } else {
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else {
                    System.out.println("Incorrect ATM Number or Pin");
                    System.exit(0);
           }


        }
    }
