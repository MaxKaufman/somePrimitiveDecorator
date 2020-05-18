package com.company;

public class PrinterDecorator implements PrinterInterface {
    private final PrinterInterface printer;

    PrinterDecorator(PrinterInterface printerInterface) {
        this.printer = printerInterface;
    }

    public void showAll() throws InterruptedException {
        System.out.print("let's get some metric \n");
        long startTime = System.currentTimeMillis();
        this.printer.showAll();
        Thread.sleep(5000);
        long operationTime = System.currentTimeMillis() - startTime;
        System.out.print(System.out.printf("\nOperation took %d millis \n", operationTime));
        // Some extra logic
    }
}
