package com.facebook.debug.holder;

public class PrinterHolder {
    public static Printer sPrinter = NoopPrinter.INSTANCE;

    public static Printer getPrinter() {
        return sPrinter;
    }

    public static void setPrinter(Printer printer) {
        if (printer == null) {
            sPrinter = NoopPrinter.INSTANCE;
        } else {
            sPrinter = printer;
        }
    }
}
