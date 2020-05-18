package com.company;

public class Printer implements PrinterInterface {
    private final String[] args;

    Printer(String[] args) {
        this.args = args;
    }

    public void showAll()
    {
        for (String arg : this.args) {
            System.out.print("cli argument: " + arg + "\n");
        }
    }
}
