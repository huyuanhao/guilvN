package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: com.pd.sdk.o0OOo0o  reason: case insensitive filesystem */
public final class C7423o0OOo0o {
    public static AbstractC7412o0OOOoo0 OooO00o(String str) throws XMPException {
        return OooO00o(str, new C7427o0OOoO());
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0220 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.AbstractC7412o0OOOoo0 OooO00o(java.lang.String r12, com.p118pd.sdk.AbstractC7412o0OOOoo0 r13) throws com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7423o0OOo0o.OooO00o(java.lang.String, com.pd.sdk.o0OOOoo0):com.pd.sdk.o0OOOoo0");
    }

    public static String OooO00o(AbstractC7412o0OOOoo0 o0ooooo0) {
        StringBuffer stringBuffer = new StringBuffer();
        if (o0ooooo0.m18950OooO00o()) {
            DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
            stringBuffer.append(decimalFormat.format((long) o0ooooo0.getYear()));
            if (o0ooooo0.getMonth() == 0) {
                return stringBuffer.toString();
            }
            decimalFormat.applyPattern("'-'00");
            stringBuffer.append(decimalFormat.format((long) o0ooooo0.getMonth()));
            if (o0ooooo0.getDay() == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(decimalFormat.format((long) o0ooooo0.getDay()));
            if (o0ooooo0.m18951OooO0O0()) {
                stringBuffer.append('T');
                decimalFormat.applyPattern("00");
                stringBuffer.append(decimalFormat.format((long) o0ooooo0.getHour()));
                stringBuffer.append(':');
                stringBuffer.append(decimalFormat.format((long) o0ooooo0.getMinute()));
                if (!(o0ooooo0.getSecond() == 0 && o0ooooo0.OooO0O0() == 0)) {
                    double second = (double) o0ooooo0.getSecond();
                    double OooO0O0 = (double) o0ooooo0.OooO0O0();
                    Double.isNaN(OooO0O0);
                    Double.isNaN(second);
                    decimalFormat.applyPattern(":00.#########");
                    stringBuffer.append(decimalFormat.format(second + (OooO0O0 / 1.0E9d)));
                }
                if (o0ooooo0.OooO0Oo()) {
                    int offset = o0ooooo0.getTimeZone().getOffset(o0ooooo0.OooO00o().getTimeInMillis());
                    if (offset == 0) {
                        stringBuffer.append(AbstractC6339ill.OooO00o);
                    } else {
                        int i = offset / 3600000;
                        int abs = Math.abs((offset % 3600000) / 60000);
                        decimalFormat.applyPattern("+00;-00");
                        stringBuffer.append(decimalFormat.format((long) i));
                        decimalFormat.applyPattern(":00");
                        stringBuffer.append(decimalFormat.format((long) abs));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
