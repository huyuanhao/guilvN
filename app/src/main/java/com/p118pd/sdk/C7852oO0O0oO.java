package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.pd.sdk.oO0O0oO  reason: case insensitive filesystem */
public class C7852oO0O0oO {
    @NotNull
    public final HashMap<Byte, List<byte[]>> OooO00o = new HashMap<>(10);

    @Nullable
    private List<byte[]> OooO0O0(byte b) {
        return this.OooO00o.get(Byte.valueOf(b));
    }

    public void OooO00o(byte b, @NotNull byte[] bArr) {
        OooO00o(b).add(bArr);
    }

    public Iterable<JpegSegmentType> OooO00o() {
        HashSet hashSet = new HashSet();
        for (Byte b : this.OooO00o.keySet()) {
            JpegSegmentType fromByte = JpegSegmentType.fromByte(b.byteValue());
            if (fromByte != null) {
                hashSet.add(fromByte);
            } else {
                throw new IllegalStateException("Should not have a segmentTypeByte that is not in the enum: " + Integer.toHexString(b.byteValue()));
            }
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19539OooO00o(byte b) {
        return m19540OooO00o(b, 0);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19541OooO00o(@NotNull JpegSegmentType jpegSegmentType) {
        return m19540OooO00o(jpegSegmentType.byteValue, 0);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19542OooO00o(@NotNull JpegSegmentType jpegSegmentType, int i) {
        return m19540OooO00o(jpegSegmentType.byteValue, i);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19540OooO00o(byte b, int i) {
        List<byte[]> OooO0O0 = OooO0O0(b);
        if (OooO0O0 == null || OooO0O0.size() <= i) {
            return null;
        }
        return OooO0O0.get(i);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterable<byte[]> m19534OooO00o(@NotNull JpegSegmentType jpegSegmentType) {
        return m19533OooO00o(jpegSegmentType.byteValue);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterable<byte[]> m19533OooO00o(byte b) {
        List<byte[]> OooO0O0 = OooO0O0(b);
        return OooO0O0 == null ? new ArrayList() : OooO0O0;
    }

    @NotNull
    private List<byte[]> OooO00o(byte b) {
        if (this.OooO00o.containsKey(Byte.valueOf(b))) {
            return this.OooO00o.get(Byte.valueOf(b));
        }
        ArrayList arrayList = new ArrayList();
        this.OooO00o.put(Byte.valueOf(b), arrayList);
        return arrayList;
    }

    public int OooO00o(@NotNull JpegSegmentType jpegSegmentType) {
        return m19532OooO00o(jpegSegmentType.byteValue);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19532OooO00o(byte b) {
        List<byte[]> OooO0O0 = OooO0O0(b);
        if (OooO0O0 == null) {
            return 0;
        }
        return OooO0O0.size();
    }

    public void OooO00o(@NotNull JpegSegmentType jpegSegmentType, int i) {
        OooO00o(jpegSegmentType.byteValue, i);
    }

    public void OooO00o(byte b, int i) {
        this.OooO00o.get(Byte.valueOf(b)).remove(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19536OooO00o(@NotNull JpegSegmentType jpegSegmentType) {
        m19535OooO00o(jpegSegmentType.byteValue);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19535OooO00o(byte b) {
        this.OooO00o.remove(Byte.valueOf(b));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19538OooO00o(@NotNull JpegSegmentType jpegSegmentType) {
        return m19537OooO00o(jpegSegmentType.byteValue);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19537OooO00o(byte b) {
        return this.OooO00o.containsKey(Byte.valueOf(b));
    }
}
