package com.atmmachine;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());

    }

    @Override
    public void withdrawAMOUNT(double withdrawAmount) {
        if (withdrawAmount % 500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, "Amount Withdrawn");
                System.out.println("Amount Withdrawn Successfully\nCollect The Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else{
            System.out.println("Please Enter The Amount In Multiple of 500 only!! ");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewminiStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
