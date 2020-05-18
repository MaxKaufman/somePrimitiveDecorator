package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PrinterDecorator printerDecorator =
                new PrinterDecorator(new Printer(args));
        printerDecorator.showAll();
    }
}
