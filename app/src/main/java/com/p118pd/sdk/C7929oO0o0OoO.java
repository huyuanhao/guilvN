package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.proguard.C3848l;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.pd.sdk.oO0o0OoO  reason: case insensitive filesystem */
public class C7929oO0o0OoO<T extends AbstractC7922oO0o0O0O> {
    public static final /* synthetic */ boolean OooO00o = false;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f20998OooO00o;

    public C7929oO0o0OoO(@NotNull T t) {
        this.f20998OooO00o = t;
    }

    @Nullable
    public static String OooO00o(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < 4 && i2 < iArr.length) {
            if (i2 == i) {
                sb.append('.');
            }
            char c = (char) iArr[i2];
            if (c < '0') {
                c = (char) (c + '0');
            }
            if (i2 != 0 || c != '0') {
                sb.append(c);
            }
            i2++;
        }
        return sb.toString();
    }

    @Nullable
    public String OooO(int i) {
        Rational OooO00o2 = this.f20998OooO00o.m19633OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.toSimpleString(true);
    }

    @Nullable
    public String OooO0O0(int i, int i2) {
        int[] OooO00o2 = this.f20998OooO00o.m19652OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(OooO00o2, i2);
    }

    @Nullable
    public String OooO0OO(int i) {
        int length;
        Object OooO00o2 = this.f20998OooO00o.m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.getClass().isArray() && (length = Array.getLength(OooO00o2)) > 16) {
            return String.format("[%d values]", Integer.valueOf(length));
        }
        if (OooO00o2 instanceof Date) {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").format((Date) OooO00o2).replaceAll("([0-9]{2} [^ ]+)$", ":$1");
        }
        return this.f20998OooO00o.OooO0O0(i);
    }

    @Nullable
    public String OooO0Oo(int i) {
        Long OooO00o2 = this.f20998OooO00o.m19641OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return new Date(OooO00o2.longValue()).toString();
    }

    @Nullable
    public String OooO0o(int i) {
        return OooO00o(i, 1, "Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)");
    }

    @Nullable
    public String OooO0o0(int i) {
        Rational[] OooO00o2 = this.f20998OooO00o.m19653OooO00o(i);
        if (OooO00o2 == null || OooO00o2.length != 4) {
            return null;
        }
        if (OooO00o2[0].isZero() && OooO00o2[2].isZero()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (OooO00o2[0].equals(OooO00o2[1])) {
            sb.append(OooO00o2[0].toSimpleString(true));
            sb.append("mm");
        } else {
            sb.append(OooO00o2[0].toSimpleString(true));
            sb.append('-');
            sb.append(OooO00o2[1].toSimpleString(true));
            sb.append("mm");
        }
        if (!OooO00o2[2].isZero()) {
            sb.append(' ');
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (OooO00o2[2].equals(OooO00o2[3])) {
                sb.append(OooO00o(OooO00o2[2].doubleValue()));
            } else {
                sb.append("f/");
                sb.append(decimalFormat.format(OooO00o2[2].doubleValue()));
                sb.append('-');
                sb.append(decimalFormat.format(OooO00o2[3].doubleValue()));
            }
        }
        return sb.toString();
    }

    @Nullable
    public String OooO0oO(int i) {
        Rational OooO00o2 = this.f20998OooO00o.m19633OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.toSimpleString(true);
        }
        Double OooO00o3 = this.f20998OooO00o.m19637OooO00o(i);
        if (OooO00o3 != null) {
            return new DecimalFormat(AbstractC7922oO0o0O0O.OooO00o).format(OooO00o3);
        }
        return null;
    }

    @Nullable
    public String OooO0oo(int i) {
        Float OooO00o2 = this.f20998OooO00o.m19638OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.floatValue() <= 1.0f) {
            double floatValue = (double) OooO00o2.floatValue();
            double log = Math.log(2.0d);
            Double.isNaN(floatValue);
            double exp = (double) ((float) (1.0d / Math.exp(floatValue * log)));
            Double.isNaN(exp);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat.format((double) (((float) Math.round(exp * 10.0d)) / 10.0f)) + " sec";
        }
        double floatValue2 = (double) OooO00o2.floatValue();
        double log2 = Math.log(2.0d);
        Double.isNaN(floatValue2);
        int exp2 = (int) Math.exp(floatValue2 * log2);
        return "1/" + exp2 + " sec";
    }

    @Nullable
    public String OooO0O0(int i) {
        byte[] OooO00o2 = this.f20998OooO00o.m19651OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(OooO00o2.length);
        objArr[1] = OooO00o2.length == 1 ? "" : C3617o.f9366at;
        return String.format("(%d byte%s)", objArr);
    }

    @Nullable
    public String OooO0O0(int i, @NotNull String str) {
        Integer OooO00o2 = this.f20998OooO00o.m19639OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format(str, OooO00o2);
    }

    @Nullable
    public static String OooO0O0(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d) + " mm";
    }

    @Nullable
    public String OooO00o(int i, @NotNull String... strArr) {
        return OooO00o(i, 0, strArr);
    }

    @Nullable
    public String OooO00o(int i, int i2, @NotNull String... strArr) {
        String str;
        Long OooO00o2 = this.f20998OooO00o.m19641OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        long longValue = OooO00o2.longValue() - ((long) i2);
        if (longValue >= 0 && longValue < ((long) strArr.length) && (str = strArr[(int) longValue]) != null) {
            return str;
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String OooO0OO(int i, @NotNull String str) {
        String OooO0O0 = this.f20998OooO00o.OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        return String.format(str, OooO0O0);
    }

    @Nullable
    public String OooO00o(int i, int i2) {
        Rational OooO00o2 = this.f20998OooO00o.m19633OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format("%." + i2 + "f", Double.valueOf(OooO00o2.doubleValue()));
    }

    @Nullable
    public String OooO00o(int i, @NotNull String str) {
        Float OooO00o2 = this.f20998OooO00o.m19638OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        return String.format(str, OooO00o2);
    }

    @Nullable
    public String OooO00o(int i, @NotNull Object... objArr) {
        Integer OooO00o2 = this.f20998OooO00o.m19639OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; objArr.length > i2; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                char c = (OooO00o2.intValue() & 1) == 1 ? (char) 1 : 0;
                if (obj instanceof String[]) {
                    arrayList.add(((String[]) obj)[c]);
                } else if (c != 0 && (obj instanceof String)) {
                    arrayList.add((String) obj);
                }
            }
            OooO00o2 = Integer.valueOf(OooO00o2.intValue() >> 1);
        }
        return C7921oO0o0O00.OooO00o(arrayList, ", ");
    }

    @Nullable
    public String OooO00o(int i) {
        byte[] OooO00o2 = this.f20998OooO00o.m19651OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        int length = OooO00o2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= OooO00o2.length) {
                break;
            }
            int i3 = OooO00o2[i2] & 255;
            if (i3 == 0 || i3 > 127) {
                length = i2;
            } else {
                i2++;
            }
        }
        return new String(OooO00o2, 0, length);
    }

    @Nullable
    public String OooO00o(int i, Charset charset) {
        byte[] OooO00o2 = this.f20998OooO00o.m19651OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return new String(OooO00o2, charset.name()).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    public static String OooO00o(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return "f/" + decimalFormat.format(d);
    }

    @Nullable
    public String OooO00o(short s) {
        if (s == 0) {
            return "Unknown";
        }
        if (s == 1) {
            return "Daylight";
        }
        if (s == 2) {
            return "Fluorescent";
        }
        if (s == 3) {
            return "Tungsten (Incandescent)";
        }
        if (s == 4) {
            return ExifInterface.f14327oo000o;
        }
        if (s == 255) {
            return "Other";
        }
        switch (s) {
            case 9:
                return "Fine Weather";
            case 10:
                return "Cloudy";
            case 11:
                return "Shade";
            case 12:
                return "Daylight Fluorescent";
            case 13:
                return "Day White Fluorescent";
            case 14:
                return "Cool White Fluorescent";
            case 15:
                return "White Fluorescent";
            case 16:
                return "Warm White Fluorescent";
            case 17:
                return "Standard Light A";
            case 18:
                return "Standard Light B";
            case 19:
                return "Standard Light C";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "ISO Studio Tungsten";
            default:
                return OooO0OO(s);
        }
    }
}
