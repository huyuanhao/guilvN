package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.AbstractC6339ill;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzhk implements Serializable {
    public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final Pattern zzzm = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    public final long value;
    public final boolean zzzn;
    public final int zzzo;

    public zzhk(long j) {
        this(false, 0, null);
    }

    public static void zza(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public static zzhk zzap(String str) throws NumberFormatException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Matcher matcher = zzzm.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z2 = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z3 = group != null;
        Integer num = null;
        if (!z3 || z2) {
            if (z2) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    double parseInt7 = (double) ((float) Integer.parseInt(matcher.group(8).substring(1)));
                    z = z2;
                    double pow = Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3));
                    Double.isNaN(parseInt7);
                    i4 = (int) (parseInt7 / pow);
                    i2 = parseInt5;
                    i = parseInt6;
                } else {
                    z = z2;
                    i2 = parseInt5;
                    i = parseInt6;
                    i4 = 0;
                }
                i3 = parseInt4;
            } else {
                z = z2;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i3, i2, i);
            gregorianCalendar.set(14, i4);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z && z3) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i5 = 0;
                } else {
                    int parseInt8 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    i5 = matcher.group(10).charAt(0) == '-' ? -parseInt8 : parseInt8;
                    timeInMillis -= ((long) i5) * 60000;
                }
                num = Integer.valueOf(i5);
            }
            return new zzhk(!z, timeInMillis, num);
        }
        String valueOf2 = String.valueOf(str);
        throw new NumberFormatException(valueOf2.length() != 0 ? "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(valueOf2) : new String("Invalid date/time format, cannot specify time zone shift without specifying time: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhk)) {
            return false;
        }
        zzhk zzhk = (zzhk) obj;
        return this.zzzn == zzhk.zzzn && this.value == zzhk.value && this.zzzo == zzhk.zzzo;
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.value;
        jArr[1] = this.zzzn ? 1 : 0;
        jArr[2] = (long) this.zzzo;
        return Arrays.hashCode(jArr);
    }

    public final String toString() {
        return zzhe();
    }

    public final String zzhe() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.zzzo) * 60000));
        zza(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        zza(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        zza(sb, gregorianCalendar.get(5), 2);
        if (!this.zzzn) {
            sb.append('T');
            zza(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            zza(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                zza(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.zzzo;
            if (i == 0) {
                sb.append(AbstractC6339ill.OooO00o);
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                zza(sb, i / 60, 2);
                sb.append(':');
                zza(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public zzhk(boolean z, long j, Integer num) {
        int i;
        this.zzzn = z;
        this.value = j;
        if (z) {
            i = 0;
        } else {
            i = num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        }
        this.zzzo = i;
    }
}
