package com.p118pd.sdk;

import com.drew.imaging.png.PngProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* renamed from: com.pd.sdk.oO0O  reason: case insensitive filesystem */
public class C7841oO0O {
    public static Charset OooO00o = C7895oO0OoO00.OooO0OO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set<C7858oO0O0ooo> f20889OooO00o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(C7858oO0O0ooo.OooO00o);
        hashSet.add(C7858oO0O0ooo.OooO0O0);
        hashSet.add(C7858oO0O0ooo.OooOO0o);
        hashSet.add(C7858oO0O0ooo.OooO0o0);
        hashSet.add(C7858oO0O0ooo.OooO);
        hashSet.add(C7858oO0O0ooo.OooO0o);
        hashSet.add(C7858oO0O0ooo.OooO0oO);
        hashSet.add(C7858oO0O0ooo.OooOO0);
        hashSet.add(C7858oO0O0ooo.OooOOo0);
        hashSet.add(C7858oO0O0ooo.OooOOo);
        hashSet.add(C7858oO0O0ooo.OooOOOo);
        hashSet.add(C7858oO0O0ooo.OooOOOO);
        hashSet.add(C7858oO0O0ooo.OooOOO0);
        hashSet.add(C7858oO0O0ooo.OooO0oo);
        f20889OooO00o = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws PngProcessingException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C7925oO0o0OO0 OooO00o2 = OooO00o(fileInputStream);
            fileInputStream.close();
            new oOO00O0O().OooO00o(file, OooO00o2);
            return OooO00o2;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws PngProcessingException, IOException {
        Iterable<C8926ooOOO00O> OooO00o2 = new C7857oO0O0ooO().OooO00o(new C8986ooOOoOoo(inputStream), f20889OooO00o);
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        for (C8926ooOOO00O ooooo00o : OooO00o2) {
            try {
                OooO00o(oo0o0oo0, ooooo00o);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return oo0o0oo0;
    }

    public static void OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull C8926ooOOO00O ooooo00o) throws PngProcessingException, IOException {
        byte[] bArr;
        byte[] bArr2;
        C7858oO0O0ooo OooO00o2 = ooooo00o.OooO00o();
        byte[] OooO00o3 = ooooo00o.m20590OooO00o();
        if (OooO00o2.equals(C7858oO0O0ooo.OooO00o)) {
            C9101ooo0o ooo0o = new C9101ooo0o(OooO00o3);
            oOOOOoO0 ooooooo0 = new oOOOOoO0(C7858oO0O0ooo.OooO00o);
            ooooooo0.OooO00o(1, ooo0o.m20770OooO0O0());
            ooooooo0.OooO00o(2, ooo0o.m20768OooO00o());
            ooooooo0.OooO00o(3, (int) ooo0o.OooO00o());
            ooooooo0.OooO00o(4, ooo0o.m20769OooO00o().getNumericValue());
            ooooooo0.OooO00o(5, ooo0o.OooO0O0() & 255);
            ooooooo0.OooO00o(6, (int) ooo0o.OooO0OO());
            ooooooo0.OooO00o(7, (int) ooo0o.OooO0Oo());
            oo0o0oo0.OooO00o(ooooooo0);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO0O0)) {
            oOOOOoO0 ooooooo02 = new oOOOOoO0(C7858oO0O0ooo.OooO0O0);
            ooooooo02.OooO00o(8, OooO00o3.length / 3);
            oo0o0oo0.OooO00o(ooooooo02);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOO0o)) {
            oOOOOoO0 ooooooo03 = new oOOOOoO0(C7858oO0O0ooo.OooOO0o);
            ooooooo03.OooO00o(9, 1);
            oo0o0oo0.OooO00o(ooooooo03);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO)) {
            byte b = OooO00o3[0];
            oOOOOoO0 ooooooo04 = new oOOOOoO0(C7858oO0O0ooo.OooO);
            ooooooo04.OooO00o(10, (int) b);
            oo0o0oo0.OooO00o(ooooooo04);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO0o0)) {
            C8290oOo00OOO ooo00ooo = new C8290oOo00OOO(OooO00o3);
            C8126oOOOOo0o oooooo0o = new C8126oOOOOo0o();
            oooooo0o.OooO00o(1, ooo00ooo.OooO0oO());
            oooooo0o.OooO00o(2, ooo00ooo.OooO0oo());
            oooooo0o.OooO00o(3, ooo00ooo.OooO0o0());
            oooooo0o.OooO00o(4, ooo00ooo.OooO0o());
            oooooo0o.OooO00o(5, ooo00ooo.OooO0OO());
            oooooo0o.OooO00o(6, ooo00ooo.OooO0Oo());
            oooooo0o.OooO00o(7, ooo00ooo.OooO00o());
            oooooo0o.OooO00o(8, ooo00ooo.OooO0O0());
            oo0o0oo0.OooO00o(oooooo0o);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO0o)) {
            int OooO00o4 = C7887oO0Oo0O.OooO00o(OooO00o3);
            new C7916oO0o000(OooO00o3).m19622OooO0O0();
            oOOOOoO0 ooooooo05 = new oOOOOoO0(C7858oO0O0ooo.OooO0o);
            double d = (double) OooO00o4;
            Double.isNaN(d);
            ooooooo05.OooO00o(11, d / 100000.0d);
            oo0o0oo0.OooO00o(ooooooo05);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO0oO)) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(OooO00o3);
            byte[] OooO0O0 = oo0o000.OooO0O0(80);
            oOOOOoO0 ooooooo06 = new oOOOOoO0(C7858oO0O0ooo.OooO0oO);
            ooooooo06.OooO00o(12, new C7927oO0o0OOo(OooO0O0, OooO00o));
            if (oo0o000.OooO0O0() == 0) {
                try {
                    InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(oo0o000.OooO00o(OooO00o3.length - ((OooO0O0.length + 1) + 1))));
                    new C8023oOO00o0o().OooO00o(new oO0o0000(inflaterInputStream), oo0o0oo0, ooooooo06);
                    inflaterInputStream.close();
                } catch (ZipException e) {
                    ooooooo06.OooO00o(String.format("Exception decompressing PNG iCCP chunk : %s", e.getMessage()));
                    oo0o0oo0.OooO00o(ooooooo06);
                }
            } else {
                ooooooo06.OooO00o("Invalid compression method value");
            }
            oo0o0oo0.OooO00o(ooooooo06);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOO0)) {
            oOOOOoO0 ooooooo07 = new oOOOOoO0(C7858oO0O0ooo.OooOO0);
            ooooooo07.OooO00o(15, OooO00o3);
            oo0o0oo0.OooO00o(ooooooo07);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOOo0)) {
            C7916oO0o000 oo0o0002 = new C7916oO0o000(OooO00o3);
            C7927oO0o0OOo OooO00o5 = oo0o0002.OooO00o(80, OooO00o);
            String oo0o0ooo = OooO00o5.toString();
            C7927oO0o0OOo OooO00o6 = oo0o0002.OooO00o(OooO00o3.length - (OooO00o5.m19665OooO00o().length + 1), OooO00o);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C7904oO0Ooo0(oo0o0ooo, OooO00o6));
            oOOOOoO0 ooooooo08 = new oOOOOoO0(C7858oO0O0ooo.OooOOo0);
            ooooooo08.OooO00o(13, arrayList);
            oo0o0oo0.OooO00o(ooooooo08);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOOo)) {
            C7916oO0o000 oo0o0003 = new C7916oO0o000(OooO00o3);
            C7927oO0o0OOo OooO00o7 = oo0o0003.OooO00o(80, OooO00o);
            String oo0o0ooo2 = OooO00o7.toString();
            byte OooO0O02 = oo0o0003.OooO0O0();
            int length = OooO00o3.length - ((OooO00o7.m19665OooO00o().length + 1) + 1);
            if (OooO0O02 == 0) {
                try {
                    bArr2 = C7918oO0o000o.OooO00o(new InflaterInputStream(new ByteArrayInputStream(OooO00o3, OooO00o3.length - length, length)));
                } catch (ZipException e2) {
                    oOOOOoO0 ooooooo09 = new oOOOOoO0(C7858oO0O0ooo.OooOOo);
                    ooooooo09.OooO00o(String.format("Exception decompressing PNG zTXt chunk with keyword \"%s\": %s", oo0o0ooo2, e2.getMessage()));
                    oo0o0oo0.OooO00o(ooooooo09);
                }
            } else {
                oOOOOoO0 ooooooo010 = new oOOOOoO0(C7858oO0O0ooo.OooOOo);
                ooooooo010.OooO00o("Invalid compression method value");
                oo0o0oo0.OooO00o(ooooooo010);
                bArr2 = null;
            }
            if (bArr2 == null) {
                return;
            }
            if (oo0o0ooo2.equals("XML:com.adobe.xmp")) {
                new C8138oOOOo00o().OooO00o(bArr2, oo0o0oo0);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C7904oO0Ooo0(oo0o0ooo2, new C7927oO0o0OOo(bArr2, OooO00o)));
            oOOOOoO0 ooooooo011 = new oOOOOoO0(C7858oO0O0ooo.OooOOo);
            ooooooo011.OooO00o(13, arrayList2);
            oo0o0oo0.OooO00o(ooooooo011);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOOOo)) {
            C7916oO0o000 oo0o0004 = new C7916oO0o000(OooO00o3);
            C7927oO0o0OOo OooO00o8 = oo0o0004.OooO00o(80, OooO00o);
            String oo0o0ooo3 = OooO00o8.toString();
            byte OooO0O03 = oo0o0004.OooO0O0();
            byte OooO0O04 = oo0o0004.OooO0O0();
            int length2 = OooO00o3.length - (((((((OooO00o8.m19665OooO00o().length + 1) + 1) + 1) + oo0o0004.OooO0O0(OooO00o3.length).length) + 1) + oo0o0004.OooO0O0(OooO00o3.length).length) + 1);
            if (OooO0O03 == 0) {
                bArr = oo0o0004.OooO0O0(length2);
            } else {
                if (OooO0O03 != 1) {
                    oOOOOoO0 ooooooo012 = new oOOOOoO0(C7858oO0O0ooo.OooOOOo);
                    ooooooo012.OooO00o("Invalid compression flag value");
                    oo0o0oo0.OooO00o(ooooooo012);
                } else if (OooO0O04 == 0) {
                    try {
                        bArr = C7918oO0o000o.OooO00o(new InflaterInputStream(new ByteArrayInputStream(OooO00o3, OooO00o3.length - length2, length2)));
                    } catch (ZipException e3) {
                        oOOOOoO0 ooooooo013 = new oOOOOoO0(C7858oO0O0ooo.OooOOOo);
                        ooooooo013.OooO00o(String.format("Exception decompressing PNG iTXt chunk with keyword \"%s\": %s", oo0o0ooo3, e3.getMessage()));
                        oo0o0oo0.OooO00o(ooooooo013);
                    }
                } else {
                    oOOOOoO0 ooooooo014 = new oOOOOoO0(C7858oO0O0ooo.OooOOOo);
                    ooooooo014.OooO00o("Invalid compression method value");
                    oo0o0oo0.OooO00o(ooooooo014);
                }
                bArr = null;
            }
            if (bArr == null) {
                return;
            }
            if (oo0o0ooo3.equals("XML:com.adobe.xmp")) {
                new C8138oOOOo00o().OooO00o(bArr, oo0o0oo0);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new C7904oO0Ooo0(oo0o0ooo3, new C7927oO0o0OOo(bArr, OooO00o)));
            oOOOOoO0 ooooooo015 = new oOOOOoO0(C7858oO0O0ooo.OooOOOo);
            ooooooo015.OooO00o(13, arrayList3);
            oo0o0oo0.OooO00o(ooooooo015);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOOOO)) {
            C7916oO0o000 oo0o0005 = new C7916oO0o000(OooO00o3);
            int OooO0OO = oo0o0005.OooO0OO();
            short OooO0O05 = oo0o0005.m19625OooO0O0();
            short OooO0O06 = oo0o0005.m19625OooO0O0();
            short OooO0O07 = oo0o0005.m19625OooO0O0();
            short OooO0O08 = oo0o0005.m19625OooO0O0();
            short OooO0O09 = oo0o0005.m19625OooO0O0();
            oOOOOoO0 ooooooo016 = new oOOOOoO0(C7858oO0O0ooo.OooOOOO);
            if (!C7894oO0OoO0.OooO00o(OooO0OO, OooO0O05 - 1, OooO0O06) || !C7894oO0OoO0.OooO0O0(OooO0O07, OooO0O08, OooO0O09)) {
                ooooooo016.OooO00o(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0O05), Integer.valueOf(OooO0O06), Integer.valueOf(OooO0O07), Integer.valueOf(OooO0O08), Integer.valueOf(OooO0O09)));
            } else {
                ooooooo016.m19648OooO00o(14, String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0O05), Integer.valueOf(OooO0O06), Integer.valueOf(OooO0O07), Integer.valueOf(OooO0O08), Integer.valueOf(OooO0O09)));
            }
            oo0o0oo0.OooO00o(ooooooo016);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooOOO0)) {
            C7916oO0o000 oo0o0006 = new C7916oO0o000(OooO00o3);
            int OooO0O010 = oo0o0006.m19622OooO0O0();
            int OooO0O011 = oo0o0006.m19622OooO0O0();
            byte OooO0O012 = oo0o0006.OooO0O0();
            oOOOOoO0 ooooooo017 = new oOOOOoO0(C7858oO0O0ooo.OooOOO0);
            ooooooo017.OooO00o(16, OooO0O010);
            ooooooo017.OooO00o(17, OooO0O011);
            ooooooo017.OooO00o(18, (int) OooO0O012);
            oo0o0oo0.OooO00o(ooooooo017);
        } else if (OooO00o2.equals(C7858oO0O0ooo.OooO0oo)) {
            oOOOOoO0 ooooooo018 = new oOOOOoO0(C7858oO0O0ooo.OooO0oo);
            ooooooo018.OooO00o(19, OooO00o3);
            oo0o0oo0.OooO00o(ooooooo018);
        }
    }
}
