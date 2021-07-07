package com.p118pd.sdk;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.android.agoo.message.MessageService;

/* renamed from: com.pd.sdk.oo0oOOo0  reason: case insensitive filesystem */
public class C8738oo0oOOo0 {
    public static String OooO00o = "0,000.0#";
    public static String OooO0O0 = "#,###,###,###,###,###,###,##0.00";
    public static String OooO0OO = "#,###,###,###,###,###,###,##0.0";
    public static String OooO0Oo = "#,###,###,###,###,###,###,##0.##";
    public static String OooO0o0 = "#,###,###,###,###,###,###,##0.#";

    public static String OooO(double d) {
        double floor = Math.floor(C8735oo0oOOO0.OooO0OO(BigDecimal.valueOf(d), new BigDecimal(MessageService.MSG_DB_COMPLETE)).doubleValue() + 0.5d);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.0#");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(floor / 100.0d);
    }

    public static String OooO00o(double d, int i, boolean z) {
        String str = "#,###,###,###,###,###,###,##0";
        if (i > 0) {
            str = str + C9058ooOoOoOO.OooOO0;
            String str2 = z ? "0" : "#";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + str2;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern(str);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(d);
    }

    public static String OooO0O0(double d, int i, boolean z) {
        String str = "#####################0";
        if (i > 0) {
            str = str + C9058ooOoOoOO.OooOO0;
            String str2 = z ? "0" : "#";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + str2;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern(str);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(d);
    }

    public static String OooO0OO(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(d);
        return format.substring(0, format.length() - 1);
    }

    public static String OooO0Oo(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.000");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(d);
        return format.substring(0, format.length() - 1);
    }

    public static String OooO0o(double d) {
        BigDecimal bigDecimal = new BigDecimal(d);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("0.000");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(bigDecimal);
        return format.substring(0, format.length() - 1);
    }

    public static String OooO0o0(double d) {
        String valueOf = String.valueOf(d);
        if (valueOf.length() >= valueOf.indexOf(C9058ooOoOoOO.OooOO0) + 3) {
            valueOf = valueOf.substring(0, valueOf.indexOf(C9058ooOoOoOO.OooOO0) + 3);
        }
        BigDecimal OooO00o2 = C8735oo0oOOO0.OooO00o(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.000");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(OooO00o2);
        return format.substring(0, format.length() - 1);
    }

    public static String OooO0oO(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.0");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(d);
    }

    public static String OooO0oo(double d) {
        double floor = Math.floor((d * 100.0d) + 0.5d);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(floor / 100.0d);
    }

    public static String OooOO0(double d) {
        if (AbstractC8352oOoOOoO0.OooO0O0 == d) {
            return "0.00";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#######0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(d);
    }

    public static String OooOO0O(double d) {
        return AbstractC8352oOoOOoO0.OooO0O0 != d ? new DecimalFormat("########").format(d) : "0";
    }

    public static String OooOO0o(double d) {
        if (d >= 10000.0d) {
            return OooO00o(d / 10000.0d) + "万元";
        }
        return OooO0Oo(d) + "元";
    }

    public static String OooOOO(double d) {
        double floor = Math.floor((d * 100.0d) + 0.5d);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#####################0");
        return decimalFormat.format(floor / 100.0d);
    }

    public static String OooOOO0(double d) {
        if (d < 10000.0d) {
            return OooO00o(String.valueOf(d));
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(d / 10000.0d);
        String[] split = format.split("\\.");
        if ("00".equals(split[1])) {
            return split[0] + "万";
        } else if ('0' == split[1].charAt(1)) {
            return split[0] + C9058ooOoOoOO.OooOO0 + split[1].charAt(0) + "万";
        } else {
            return format + "万";
        }
    }

    public static String OooOOOO(double d) {
        double doubleValue = C8735oo0oOOO0.OooO0O0(BigDecimal.valueOf(d), new BigDecimal("10000")).doubleValue();
        return OooO(doubleValue) + "万元";
    }

    public static String OooOOOo(double d) {
        double doubleValue = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP).doubleValue();
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(doubleValue);
    }

    public static String OooO00o(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###,###,###,###,###,###,##0.0");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(d);
        return format.substring(0, format.length() - 2);
    }

    public static String OooO0O0(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(d);
        return format.substring(0, format.length() - 1);
    }

    public static String OooO00o(String str) {
        return str.indexOf(C9058ooOoOoOO.OooOO0) > 0 ? str.replaceAll("0+?$", "").replaceAll("[.]$", "") : str;
    }

    public static String OooO0O0(String str) {
        String OooO00o2 = OooO00o(str);
        if (OooO00o2.indexOf(C9058ooOoOoOO.OooOO0) != -1) {
            return OooO00o2;
        }
        return OooO00o2 + ".0";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20355OooO00o(String str) {
        try {
            Double.valueOf(str).doubleValue();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
