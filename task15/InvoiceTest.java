package task15;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Invoice Items: ");
        String n = input.nextLine();
        double[] ans = new double[n];

        for(int i=0; i<n; i++){
            int k = i+1;
            System.out.println(k+". Item:");

            System.out.print("Enter part number: ");
            String partNum = input.nextLine();

            System.out.print("Enter part description: ");
            String partDesc = input.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            System.out.print("Enter price per item: ");
            double price = input.nextDouble();

            Invoice invoice = new Invoice(partNum, partDesc, quantity, price);
            ans[i] = invoice.getInvoiceAmount();
        }
        
        for(i=0; i<n; i++){
            k = i+1;
            System.out.println("Invoice Amount of " + k ". Item: " + ans[i]);
        }
        
        input.close();
    }
}