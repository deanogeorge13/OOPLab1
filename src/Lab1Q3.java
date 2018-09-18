import java.util.Scanner;

public class Lab1Q3 {
    public static void main(String[] args) {
        String name;
        double taxRate, taxableIncome, taxDue, gross, afterTax;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your taxable income: ");
        taxableIncome = input.nextInt();

        if(taxableIncome<20000){
            taxDue = 0;
            gross = taxableIncome;
            taxRate = 0;
            afterTax = taxableIncome;
        }

        else if(taxableIncome < 36000 && taxableIncome > 20000){
            gross = taxableIncome;
            taxRate = 0.2;
            taxDue = taxableIncome*taxRate;
            afterTax = taxableIncome - (taxDue);
        }

        else{
            gross = taxableIncome;
            taxRate = 0.41;
            taxDue = taxableIncome*taxRate;
            afterTax = taxableIncome - (taxDue);
        }

        System.out.print("\n\n\nName: " + name + "\nGross Income: " + gross + "\nTax: " +
                "Rate: " + taxRate + "%" + "\nTax: " + taxDue + "\nIncome After Tax: " + afterTax);
    }
}
