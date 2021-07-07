package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.i18n.MissingEntryException;

/* renamed from: com.pd.sdk.iIILLl  reason: case insensitive filesystem */
public class C6082iIILLl extends I1L1 {
    public static final String OooO0o0 = "text";

    public C6082iIILLl(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public C6082iIILLl(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public C6082iIILLl(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public C6082iIILLl(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }

    public String OooO00o(Locale locale) throws MissingEntryException {
        return OooO00o("text", locale, TimeZone.getDefault());
    }

    public String OooO00o(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return OooO00o("text", locale, timeZone);
    }
}
