package com.p118pd.sdk;

import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegProcessingException;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

/* renamed from: com.pd.sdk.oOOOo0o0  reason: case insensitive filesystem */
public class C8145oOOOo0o0 {
    public static void OooO00o(String[] strArr) throws IOException, JpegProcessingException {
        if (strArr.length == 0) {
            System.err.println("Expects one or more URLs as arguments.");
            System.exit(1);
        }
        for (String str : strArr) {
            OooO00o(new URL(str));
        }
        System.out.println("Completed.");
    }

    public static void OooO00o(URL url) throws IOException {
        try {
            C7925oO0o0OO0 OooO00o = oO0O0O.OooO00o(url.openConnection().getInputStream());
            if (OooO00o.m19663OooO00o()) {
                System.err.println(url);
                for (AbstractC7922oO0o0O0O oo0o0o0o : OooO00o.m19661OooO00o()) {
                    if (oo0o0o0o.m19649OooO00o()) {
                        Iterator<String> it = oo0o0o0o.m19640OooO00o().iterator();
                        while (it.hasNext()) {
                            System.err.printf("\t[%s] %s%n", oo0o0o0o.m19643OooO00o(), it.next());
                        }
                    }
                }
            }
            for (AbstractC7922oO0o0O0O oo0o0o0o2 : OooO00o.m19661OooO00o()) {
                for (C7928oO0o0Oo oo0o0oo : oo0o0o0o2.m19645OooO00o()) {
                    String OooO0OO = oo0o0oo.OooO0OO();
                    String OooO00o2 = oo0o0o0o2.m19643OooO00o();
                    String OooO00o3 = oo0o0oo.m19666OooO00o();
                    if (OooO00o3 != null && OooO00o3.length() > 1024) {
                        OooO00o3 = OooO00o3.substring(0, 1024) + "...";
                    }
                    System.out.printf("[%s] %s = %s%n", OooO00o2, OooO0OO, OooO00o3);
                }
            }
        } catch (ImageProcessingException e) {
            System.err.printf("%s: %s [Error Extracting Metadata]%n\t%s%n", e.getClass().getName(), url, e.getMessage());
        } catch (Throwable th) {
            System.err.printf("%s: %s [Error Extracting Metadata]%n", th.getClass().getName(), url);
            th.printStackTrace(System.err);
        }
    }
}
