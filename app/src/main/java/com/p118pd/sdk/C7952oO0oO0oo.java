package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.pd.sdk.oO0oO0oo  reason: case insensitive filesystem */
public class C7952oO0oO0oo extends oO0oO000 {
    @NotNull
    public static final HashMap<Integer, String> OooO00o;
    public static final int o00 = 17;
    public static final int o000o0o = 1;
    public static final int o000o0o0 = 0;
    public static final int o000o0oO = 2;
    public static final int o000o0oo = 3;
    public static final int o000oOoo = 4;
    public static final int o000oo = 9;
    public static final int o000oo0 = 6;
    public static final int o000oo00 = 5;
    public static final int o000oo0O = 7;
    public static final int o000oo0o = 8;
    public static final int o000ooO = 11;
    public static final int o000ooO0 = 10;
    public static final int o000ooOO = 12;
    public static final int o000ooo = 14;
    public static final int o000ooo0 = 13;
    public static final int o000oooO = 15;
    public static final int o000oooo = 16;
    public static final int o00O00 = 23;
    public static final int o00O000 = 21;
    public static final int o00O0000 = 18;
    public static final int o00O000o = 22;
    public static final int o00O00O = 24;
    public static final int o00O00OO = 26;
    public static final int o00O00Oo = 27;
    public static final int o00O00o = 29;
    public static final int o00O00o0 = 28;
    public static final int o00O00oO = 30;
    public static final int o00oOoo = 20;
    public static final int o0O0ooO = 19;
    public static final int oOO00O = 25;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO00o = hashMap;
        oO0oO000.OooO00o(hashMap);
        OooO00o.put(0, "GPS Version ID");
        OooO00o.put(1, "GPS Latitude Ref");
        OooO00o.put(2, "GPS Latitude");
        OooO00o.put(3, "GPS Longitude Ref");
        OooO00o.put(4, "GPS Longitude");
        OooO00o.put(5, "GPS Altitude Ref");
        OooO00o.put(6, "GPS Altitude");
        OooO00o.put(7, "GPS Time-Stamp");
        OooO00o.put(8, "GPS Satellites");
        OooO00o.put(9, "GPS Status");
        OooO00o.put(10, "GPS Measure Mode");
        OooO00o.put(11, "GPS DOP");
        OooO00o.put(12, "GPS Speed Ref");
        OooO00o.put(13, "GPS Speed");
        OooO00o.put(14, "GPS Track Ref");
        OooO00o.put(15, "GPS Track");
        OooO00o.put(16, "GPS Img Direction Ref");
        OooO00o.put(17, "GPS Img Direction");
        OooO00o.put(18, "GPS Map Datum");
        OooO00o.put(19, "GPS Dest Latitude Ref");
        OooO00o.put(20, "GPS Dest Latitude");
        OooO00o.put(21, "GPS Dest Longitude Ref");
        OooO00o.put(22, "GPS Dest Longitude");
        OooO00o.put(23, "GPS Dest Bearing Ref");
        OooO00o.put(24, "GPS Dest Bearing");
        OooO00o.put(25, "GPS Dest Distance Ref");
        OooO00o.put(26, "GPS Dest Distance");
        OooO00o.put(27, "GPS Processing Method");
        OooO00o.put(28, "GPS Area Information");
        OooO00o.put(29, "GPS Date Stamp");
        OooO00o.put(30, "GPS Differential");
    }

    public C7952oO0oO0oo() {
        OooO00o(new C7951oO0oO0oO(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19676OooO00o() {
        return "GPS";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19678OooO00o() {
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    public C7893oO0OoO OooO00o() {
        Rational[] OooO00o2 = m19653OooO00o(2);
        Rational[] OooO00o3 = m19653OooO00o(4);
        String OooO0O0 = OooO0O0(1);
        String OooO0O02 = OooO0O0(3);
        if (!(OooO00o2 == null || OooO00o2.length != 3 || OooO00o3 == null || OooO00o3.length != 3 || OooO0O0 == null || OooO0O02 == null)) {
            Double OooO00o4 = C7893oO0OoO.OooO00o(OooO00o2[0], OooO00o2[1], OooO00o2[2], OooO0O0.equalsIgnoreCase(ExifInterface.o000oOoo));
            Double OooO00o5 = C7893oO0OoO.OooO00o(OooO00o3[0], OooO00o3[1], OooO00o3[2], OooO0O02.equalsIgnoreCase(ExifInterface.o000oo0));
            if (!(OooO00o4 == null || OooO00o5 == null)) {
                return new C7893oO0OoO(OooO00o4.doubleValue(), OooO00o5.doubleValue());
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m19677OooO00o() {
        String OooO0O0 = OooO0O0(29);
        Rational[] OooO00o2 = m19653OooO00o(7);
        if (!(OooO0O0 == null || OooO00o2 == null || OooO00o2.length != 3)) {
            try {
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss.S z").parse(String.format(Locale.US, "%s %02d:%02d:%02.3f UTC", OooO0O0, Integer.valueOf(OooO00o2[0].intValue()), Integer.valueOf(OooO00o2[1].intValue()), Double.valueOf(OooO00o2[2].doubleValue())));
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
