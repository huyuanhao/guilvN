package com.p118pd.sdk;

import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import p283fi.iki.elonen.NanoHTTPD;

/* renamed from: com.pd.sdk.oooO0Oo  reason: case insensitive filesystem */
public class C9133oooO0Oo {
    public static final Logger OooO00o = Logger.getLogger(C9133oooO0Oo.class.getName());

    public static void OooO00o(NanoHTTPD nanoHTTPD) {
        try {
            nanoHTTPD.start(5000, false);
        } catch (IOException e) {
            PrintStream printStream = System.err;
            printStream.println("Couldn't start server:\n" + e);
            System.exit(-1);
        }
        System.out.println("Server started, Hit Enter to stop.\n");
        try {
            System.in.read();
        } catch (Throwable unused) {
        }
        nanoHTTPD.stop();
        System.out.println("Server stopped.\n");
    }

    public static <T extends NanoHTTPD> void OooO00o(Class<T> cls) {
        try {
            OooO00o(cls.newInstance());
        } catch (Exception e) {
            OooO00o.log(Level.SEVERE, "Cound nor create server", (Throwable) e);
        }
    }
}
