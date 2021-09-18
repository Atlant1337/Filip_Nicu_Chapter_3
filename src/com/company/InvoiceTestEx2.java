//ex2
package com.company;

public class InvoiceTestEx2 {
    public static void main(String[] args) {
        InvoiceEx2 inv1 = new InvoiceEx2("3351", "i7-8700K", 1, 350);
        InvoiceEx2 inv2 = new InvoiceEx2("3352", "RTX 3090", 4, 1500);
        InvoiceEx2 inv3 = new InvoiceEx2("3353", "SSD 1TB", 0, 200);
        InvoiceEx2 inv4 = new InvoiceEx2("3354", "PSU 1000W", 2, -190);

        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv1.getNumber(), inv1.getDescription(), inv1.getQuantity(), inv1.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv2.getNumber(), inv2.getDescription(), inv2.getQuantity(), inv2.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv3.getNumber(), inv3.getDescription(), inv3.getQuantity(), inv3.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv4.getNumber(), inv4.getDescription(), inv4.getQuantity(), inv4.getPrice());

        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv1.getNumber(), inv1.getInvoiceAmount(inv1.getQuantity(), inv1.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv2.getNumber(), inv2.getInvoiceAmount(inv2.getQuantity(), inv2.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv3.getNumber(), inv3.getInvoiceAmount(inv3.getQuantity(), inv3.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv4.getNumber(), inv4.getInvoiceAmount(inv4.getQuantity(), inv4.getPrice()));


    }
}