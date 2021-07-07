package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.oo00OoOo  reason: case insensitive filesystem */
public class C8552oo00OoOo extends C8541oo00OOOo {

    /* renamed from: com.pd.sdk.oo00OoOo$OooO00o */
    public static class OooO00o {
        public static final String OooO00o = (File.separator + "hianalytics" + File.separator + "applog");
        public static final String OooO0O0;
        public static final String OooO0OO = (OooO00o + File.separator + "logzips");
        public static final String OooO0Oo = (OooO00o + File.separator + "bigzip");

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o);
            sb.append(File.separator);
            sb.append("logs");
            OooO0O0 = sb.toString();
        }
    }
}
