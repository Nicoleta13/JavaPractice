package com.nicole;

public class Printer {

    //Encapsulation is achieved using access modifiers: private, public, protected

    //ENCAPSULATION
    //by making the fields private we are making sure
    //that our class is not accessible,
    //or the fields within a class are not accessible
    //to any classes that are outside

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonnerAmount){
        if(tonnerAmount > 0 && tonnerAmount <= 100) {
            if(this.tonerLevel + tonnerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonnerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
