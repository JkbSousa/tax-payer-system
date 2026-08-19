package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;

public class Program {
    void main(){

        List<TaxPayer> list = new ArrayList<>();

        IO.print("Enter the number of tax payers: ");
        int n = Integer.parseInt(IO.readln());
        for (int i = 0; i<n; i++){
            IO.print("Tax payer #" + (i + 1) + " data:");
            IO.print("Individual or company (i/c)? ");
            char ch = IO.readln().charAt(0);
            IO.print("Name: ");
            String name = IO.readln();
            IO.print("Anual income: ");
            Double income = Double.parseDouble(IO.readln());
            if (ch == 'i'){
                IO.print("Health expenditures: ");
                Double health = Double.parseDouble(IO.readln());
                list.add(new Individual(income, name, health));
            }
            else if (ch == 'c'){
                IO.print("Number of employees: ");
                Integer employees = Integer.parseInt(IO.readln());
                list.add(new Company(income, name, employees));
            }
            else {
                IO.println("Incorrect value");
            }
        }
        double sum = 0.0;
        IO.println();
        IO.println("TAXES PAID: ");
        for (TaxPayer taxesPaid: list){

            double tax = taxesPaid.tax();
            IO.println(taxesPaid.getName() + ": $" + String.format("%.2f", tax));

            sum += tax;
        }

        IO.println();
        IO.println("TOTAL TAXES: " + " $" + String.format("%.2f", sum));



    }
}
