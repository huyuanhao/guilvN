package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.i18n.MissingEntryException;

/* renamed from: com.pd.sdk.lLL1Il */
public class lLL1Il extends C5775LlIL {
    public static final String OooO0oO = "summary";
    public static final String OooO0oo = "details";

    public lLL1Il(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public lLL1Il(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public lLL1Il(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public lLL1Il(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }

    public String OooO0OO(Locale locale) throws MissingEntryException {
        return OooO00o(OooO0oo, locale, TimeZone.getDefault());
    }

    public String OooO0OO(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return OooO00o(OooO0oo, locale, timeZone);
    }

    public String OooO0Oo(Locale locale) throws MissingEntryException {
        return OooO00o("summary", locale, TimeZone.getDefault());
    }

    public String OooO0Oo(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return OooO00o("summary", locale, timeZone);
    }
}
