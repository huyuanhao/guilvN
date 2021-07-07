package com.huawei.updatesdk.support.p082b;

import android.content.Context;
import com.huawei.updatesdk.support.p085e.C1380d;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* renamed from: com.huawei.updatesdk.support.b.d */
public class C1370d {
    /* renamed from: a */
    public static String m2044a(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format((double) (((float) i) / 100.0f));
    }

    /* renamed from: a */
    public static String m2045a(Context context, long j) {
        if (j == 0) {
            return context.getString(C1380d.m2081b(context, "upsdk_storage_utils"), "0");
        }
        DecimalFormat decimalFormat = null;
        if (j > 104857) {
            decimalFormat = new DecimalFormat("###.#");
        } else if (j > 10485) {
            decimalFormat = new DecimalFormat("###.##");
        }
        if (decimalFormat != null) {
            double d = (double) j;
            Double.isNaN(d);
            return context.getString(C1380d.m2081b(context, "upsdk_storage_utils"), decimalFormat.format((d / 1024.0d) / 1024.0d));
        }
        return context.getString(C1380d.m2081b(context, "upsdk_storage_utils"), "0.01");
    }

    /* renamed from: a */
    public static byte[] m2046a(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = (byte) digit;
        }
        return bArr;
    }
}
