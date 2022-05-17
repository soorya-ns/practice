package com.sun.test;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class TestCode {
    public static void main(String[] args){
       test();
    }

    public static void test(){

        double baseAmt = 1200000.00;
        int totalNumbersOfYears = 3;
        double interestRate = 5.0;
        double totalInterestAmt = 0.0;

        double taxDeductionRate = 30.0;
        double taxDeductionAmt = 0.0;
        double totalTaxDeductionAmt = 0.0;

        double currentYearInetrest = 0.0;
        double nextYearBaseAmt = 0.0;

        for (int i=0; i <totalNumbersOfYears; i++){

            if(i==0){
                nextYearBaseAmt = baseAmt;
            }
            currentYearInetrest = (interestRate/100.00)*nextYearBaseAmt;
            taxDeductionAmt = (taxDeductionRate/100.00)*currentYearInetrest;
            totalTaxDeductionAmt = totalTaxDeductionAmt+taxDeductionAmt;
            totalInterestAmt = totalInterestAmt+currentYearInetrest;
            System.out.println(i+1+" : Year Interest is: "+printResult(String.valueOf(currentYearInetrest)));
            nextYearBaseAmt = currentYearInetrest+nextYearBaseAmt;
            System.out.println(i+2+" : Year Base  Amt: "+printResult(String.valueOf(nextYearBaseAmt)));

        }
        System.out.println(totalNumbersOfYears+" : You will get "+ printResult(String.valueOf((totalTaxDeductionAmt))) +" Amt: as total Tax DeductionAmt");
        System.out.println(totalNumbersOfYears+" : You will get "+ printResult(String.valueOf((nextYearBaseAmt-totalTaxDeductionAmt))) +" Amt: as final return");






    }
    public static String printResult(String inVal){
Double inputData = Double.parseDouble(inVal);
        return  NumberFormat.getCurrencyInstance(new Locale("en", "IN"))
                .format(inputData);
    }

    public static void test1(){
        // Take a date
        LocalDate date = LocalDate.parse("2018-08-07");
        // Displaying date
        System.out.println("Date : "+date);
        // Add 2 months to the date
        LocalDate newDate = date.plusMonths(68);
        System.out.println("New Date : "+newDate);
    }

}
