package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.o0OOOoo  reason: case insensitive filesystem */
public final class C7411o0OOOoo {
    public static final TimeZone OooO00o = TimeZone.getTimeZone(ISO8601Utils.UTC_ID);

    public static AbstractC7412o0OOOoo0 OooO00o() {
        return new C7427o0OOoO();
    }

    public static AbstractC7412o0OOOoo0 OooO00o(int i, int i2, int i3) {
        C7427o0OOoO o0oooo = new C7427o0OOoO();
        o0oooo.setYear(i);
        o0oooo.setMonth(i2);
        o0oooo.OooO0Oo(i3);
        return o0oooo;
    }

    public static AbstractC7412o0OOOoo0 OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C7427o0OOoO o0oooo = new C7427o0OOoO();
        o0oooo.setYear(i);
        o0oooo.setMonth(i2);
        o0oooo.OooO0Oo(i3);
        o0oooo.OooO0o0(i4);
        o0oooo.OooO00o(i5);
        o0oooo.OooO0O0(i6);
        o0oooo.OooO0OO(i7);
        return o0oooo;
    }

    public static AbstractC7412o0OOOoo0 OooO00o(AbstractC7412o0OOOoo0 o0ooooo0) {
        long timeInMillis = o0ooooo0.OooO00o().getTimeInMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(timeInMillis);
        return new C7427o0OOoO(gregorianCalendar);
    }

    public static AbstractC7412o0OOOoo0 OooO00o(String str) throws XMPException {
        return new C7427o0OOoO(str);
    }

    public static AbstractC7412o0OOOoo0 OooO00o(Calendar calendar) {
        return new C7427o0OOoO(calendar);
    }

    public static AbstractC7412o0OOOoo0 OooO0O0() {
        return new C7427o0OOoO(new GregorianCalendar());
    }

    public static AbstractC7412o0OOOoo0 OooO0O0(AbstractC7412o0OOOoo0 o0ooooo0) {
        long timeInMillis = o0ooooo0.OooO00o().getTimeInMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(OooO00o);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeInMillis(timeInMillis);
        return new C7427o0OOoO(gregorianCalendar);
    }

    public static AbstractC7412o0OOOoo0 OooO0OO(AbstractC7412o0OOOoo0 o0ooooo0) {
        Calendar OooO00o2 = o0ooooo0.OooO00o();
        OooO00o2.setTimeZone(TimeZone.getDefault());
        return new C7427o0OOoO(OooO00o2);
    }
}
