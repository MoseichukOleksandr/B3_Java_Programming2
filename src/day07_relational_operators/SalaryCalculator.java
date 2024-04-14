package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {


        /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample date:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */

        double salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax;
        salary = 100000;
        stateTaxRate = 0.08;
        federalTaxRate = 0.21;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;

        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);

        String taxReport = "Tax Rate Info: \n\tState tax rate: " + stateTaxRate + "\n\tFederal tax rate: " + federalTaxRate + "\n\tSalary before tax: " + salary + "\nTax amount $" + stateTax + " is for state tax and tax amount $" + federalTax + " is for federal tax.\nAfter all these taxes, your total tax is $" + totalTax + " and your after tax salary is $" + salaryAfterTax;


        System.out.println(taxReport);

    }
    }
