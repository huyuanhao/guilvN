package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.i18n.MissingEntryException;

/* renamed from: com.pd.sdk.LlIL丨  reason: invalid class name and case insensitive filesystem */
public class C5775LlIL extends C6082iIILLl {
    public static final String OooO0o = "title";

    public C5775LlIL(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public C5775LlIL(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public C5775LlIL(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public C5775LlIL(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }

    public String OooO0O0(Locale locale) throws MissingEntryException {
        return OooO00o("title", locale, TimeZone.getDefault());
    }

    public String OooO0O0(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return OooO00o("title", locale, timeZone);
    }
}
