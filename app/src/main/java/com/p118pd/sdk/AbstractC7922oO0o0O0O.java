package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.lang.annotations.SuppressWarnings;
import com.drew.metadata.MetadataException;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.oO0o0O0O  reason: case insensitive filesystem */
public abstract class AbstractC7922oO0o0O0O {
    public static final String OooO00o = "0.###";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f20991OooO00o = false;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7922oO0o0O0O f20992OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7929oO0o0OoO f20993OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Collection<C7928oO0o0Oo> f20994OooO00o = new ArrayList();
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Integer, Object> f20995OooO00o = new HashMap();
    @NotNull
    public final Collection<String> OooO0O0 = new ArrayList(4);

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m19643OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract HashMap<Integer, String> m19647OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19650OooO00o(int i) {
        return this.f20995OooO00o.containsKey(Integer.valueOf(i));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19656OooO0O0() {
        return this.OooO0O0.isEmpty() && this.f20994OooO00o.isEmpty();
    }

    @NotNull
    public String OooO0OO(int i) {
        HashMap<Integer, String> OooO00o2 = m19647OooO00o();
        if (OooO00o2.containsKey(Integer.valueOf(i))) {
            return OooO00o2.get(Integer.valueOf(i));
        }
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 4) {
            hexString = "0" + hexString;
        }
        return "Unknown tag (0x" + hexString + C3848l.f10402t;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = m19643OooO00o();
        objArr[1] = Integer.valueOf(this.f20995OooO00o.size());
        objArr[2] = this.f20995OooO00o.size() == 1 ? CommonNetImpl.TAG : "tags";
        return String.format("%s Directory (%d %s)", objArr);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<C7928oO0o0Oo> m19645OooO00o() {
        return Collections.unmodifiableCollection(this.f20994OooO00o);
    }

    public int OooO0O0() {
        return this.f20994OooO00o.size();
    }

    public void OooO00o(@NotNull C7929oO0o0OoO oo0o0ooo) {
        if (oo0o0ooo != null) {
            this.f20993OooO00o = oo0o0ooo;
            return;
        }
        throw new NullPointerException("cannot set a null descriptor");
    }

    public void OooO0O0(int i, @NotNull Object obj) {
        OooO00o(i, obj);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19657OooO0O0(int i) throws MetadataException {
        Boolean OooO00o2 = m19636OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.booleanValue();
        }
        Object OooO00o3 = m19642OooO00o(i);
        if (OooO00o3 == null) {
            throw new MetadataException("Tag '" + OooO0OO(i) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i + "' cannot be converted to a boolean.  It is of type '" + OooO00o3.getClass() + "'.");
    }

    public void OooO00o(@NotNull String str) {
        this.OooO0O0.add(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19649OooO00o() {
        return this.OooO0O0.size() > 0;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterable<String> m19640OooO00o() {
        return Collections.unmodifiableCollection(this.OooO0O0);
    }

    public int OooO00o() {
        return this.OooO0O0.size();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m19658OooO0OO(int i) {
        return m19647OooO00o().containsKey(Integer.valueOf(i));
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7922oO0o0O0O m19634OooO00o() {
        return this.f20992OooO00o;
    }

    @Nullable
    public String OooO0O0(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof Rational) {
            return ((Rational) OooO00o2).toSimpleString(true);
        }
        if (OooO00o2.getClass().isArray()) {
            int length = Array.getLength(OooO00o2);
            Class<?> componentType = OooO00o2.getClass().getComponentType();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (Object.class.isAssignableFrom(componentType)) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.get(OooO00o2, i2).toString());
                    i2++;
                }
            } else if (componentType.getName().equals("int")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getInt(OooO00o2, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("short")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append((int) Array.getShort(OooO00o2, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("long")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getLong(OooO00o2, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("float")) {
                DecimalFormat decimalFormat = new DecimalFormat(OooO00o);
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    String format = decimalFormat.format((double) Array.getFloat(OooO00o2, i2));
                    if (format.equals("-0")) {
                        format = "0";
                    }
                    sb.append(format);
                    i2++;
                }
            } else if (componentType.getName().equals("double")) {
                DecimalFormat decimalFormat2 = new DecimalFormat(OooO00o);
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    String format2 = decimalFormat2.format(Array.getDouble(OooO00o2, i2));
                    if (format2.equals("-0")) {
                        format2 = "0";
                    }
                    sb.append(format2);
                    i2++;
                }
            } else if (componentType.getName().equals("byte")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getByte(OooO00o2, i2) & 255);
                    i2++;
                }
            } else {
                OooO00o("Unexpected array component type: " + componentType.getName());
            }
            return sb.toString();
        } else if (OooO00o2 instanceof Double) {
            return new DecimalFormat(OooO00o).format(((Double) OooO00o2).doubleValue());
        } else {
            if (OooO00o2 instanceof Float) {
                return new DecimalFormat(OooO00o).format((double) ((Float) OooO00o2).floatValue());
            }
            return OooO00o2.toString();
        }
    }

    public void OooO00o(@NotNull AbstractC7922oO0o0O0O oo0o0o0o) {
        this.f20992OooO00o = oo0o0o0o;
    }

    public void OooO00o(int i, int i2) {
        OooO00o(i, Integer.valueOf(i2));
    }

    public void OooO00o(int i, @NotNull int[] iArr) {
        OooO0O0(i, iArr);
    }

    public void OooO00o(int i, float f) {
        OooO00o(i, Float.valueOf(f));
    }

    public void OooO00o(int i, @NotNull float[] fArr) {
        OooO0O0(i, fArr);
    }

    public void OooO00o(int i, double d) {
        OooO00o(i, Double.valueOf(d));
    }

    public void OooO00o(int i, @NotNull double[] dArr) {
        OooO0O0(i, dArr);
    }

    public void OooO00o(int i, @NotNull C7927oO0o0OOo oo0o0ooo) {
        if (oo0o0ooo != null) {
            OooO00o(i, (Object) oo0o0ooo);
            return;
        }
        throw new NullPointerException("cannot set a null StringValue");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19648OooO00o(int i, @NotNull String str) {
        if (str != null) {
            OooO00o(i, (Object) str);
            return;
        }
        throw new NullPointerException("cannot set a null String");
    }

    public void OooO00o(int i, @NotNull String[] strArr) {
        OooO0O0(i, strArr);
    }

    public void OooO00o(int i, @NotNull C7927oO0o0OOo[] oo0o0oooArr) {
        OooO0O0(i, oo0o0oooArr);
    }

    public void OooO00o(int i, boolean z) {
        OooO00o(i, Boolean.valueOf(z));
    }

    public void OooO00o(int i, long j) {
        OooO00o(i, Long.valueOf(j));
    }

    public void OooO00o(int i, @NotNull Date date) {
        OooO00o(i, (Object) date);
    }

    public void OooO00o(int i, @NotNull Rational rational) {
        OooO00o(i, (Object) rational);
    }

    public void OooO00o(int i, @NotNull Rational[] rationalArr) {
        OooO0O0(i, rationalArr);
    }

    public void OooO00o(int i, @NotNull byte[] bArr) {
        OooO0O0(i, bArr);
    }

    public void OooO00o(int i, @NotNull Object obj) {
        if (obj != null) {
            if (!this.f20995OooO00o.containsKey(Integer.valueOf(i))) {
                this.f20994OooO00o.add(new C7928oO0o0Oo(i, this));
            }
            this.f20995OooO00o.put(Integer.valueOf(i), obj);
            return;
        }
        throw new NullPointerException("cannot set a null object");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19631OooO00o(int i) throws MetadataException {
        Integer OooO00o2 = m19639OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.intValue();
        }
        Object OooO00o3 = m19642OooO00o(i);
        if (OooO00o3 == null) {
            throw new MetadataException("Tag '" + OooO0OO(i) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i + "' cannot be converted to int.  It is of type '" + OooO00o3.getClass() + "'.");
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Integer m19639OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof Number) {
            return Integer.valueOf(((Number) OooO00o2).intValue());
        }
        if ((OooO00o2 instanceof String) || (OooO00o2 instanceof C7927oO0o0OOo)) {
            try {
                return Integer.valueOf(Integer.parseInt(OooO00o2.toString()));
            } catch (NumberFormatException unused) {
                long j = 0;
                for (byte b : OooO00o2.toString().getBytes()) {
                    j = (j << 8) + ((long) (b & 255));
                }
                return Integer.valueOf((int) j);
            }
        } else {
            if (OooO00o2 instanceof Rational[]) {
                Rational[] rationalArr = (Rational[]) OooO00o2;
                if (rationalArr.length == 1) {
                    return Integer.valueOf(rationalArr[0].intValue());
                }
            } else if (OooO00o2 instanceof byte[]) {
                byte[] bArr = (byte[]) OooO00o2;
                if (bArr.length == 1) {
                    return Integer.valueOf(bArr[0]);
                }
            } else if (OooO00o2 instanceof int[]) {
                int[] iArr = (int[]) OooO00o2;
                if (iArr.length == 1) {
                    return Integer.valueOf(iArr[0]);
                }
            } else if (OooO00o2 instanceof short[]) {
                short[] sArr = (short[]) OooO00o2;
                if (sArr.length == 1) {
                    return Integer.valueOf(sArr[0]);
                }
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m19655OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof String[]) {
            return (String[]) OooO00o2;
        }
        int i2 = 0;
        if (OooO00o2 instanceof String) {
            return new String[]{(String) OooO00o2};
        } else if (OooO00o2 instanceof C7927oO0o0OOo) {
            return new String[]{OooO00o2.toString()};
        } else if (OooO00o2 instanceof C7927oO0o0OOo[]) {
            C7927oO0o0OOo[] oo0o0oooArr = (C7927oO0o0OOo[]) OooO00o2;
            int length = oo0o0oooArr.length;
            String[] strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = oo0o0oooArr[i2].toString();
                i2++;
            }
            return strArr;
        } else if (OooO00o2 instanceof int[]) {
            int[] iArr = (int[]) OooO00o2;
            int length2 = iArr.length;
            String[] strArr2 = new String[length2];
            while (i2 < length2) {
                strArr2[i2] = Integer.toString(iArr[i2]);
                i2++;
            }
            return strArr2;
        } else if (OooO00o2 instanceof byte[]) {
            byte[] bArr = (byte[]) OooO00o2;
            int length3 = bArr.length;
            String[] strArr3 = new String[length3];
            while (i2 < length3) {
                strArr3[i2] = Byte.toString(bArr[i2]);
                i2++;
            }
            return strArr3;
        } else if (!(OooO00o2 instanceof Rational[])) {
            return null;
        } else {
            Rational[] rationalArr = (Rational[]) OooO00o2;
            int length4 = rationalArr.length;
            String[] strArr4 = new String[length4];
            for (int i3 = 0; i3 < length4; i3++) {
                strArr4[i3] = rationalArr[i3].toSimpleString(false);
            }
            return strArr4;
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7927oO0o0OOo[] m19654OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof C7927oO0o0OOo[]) {
            return (C7927oO0o0OOo[]) OooO00o2;
        }
        if (!(OooO00o2 instanceof C7927oO0o0OOo)) {
            return null;
        }
        return new C7927oO0o0OOo[]{(C7927oO0o0OOo) OooO00o2};
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m19652OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof int[]) {
            return (int[]) OooO00o2;
        }
        int i2 = 0;
        if (OooO00o2 instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) OooO00o2;
            int length = rationalArr.length;
            int[] iArr = new int[length];
            while (i2 < length) {
                iArr[i2] = rationalArr[i2].intValue();
                i2++;
            }
            return iArr;
        } else if (OooO00o2 instanceof short[]) {
            short[] sArr = (short[]) OooO00o2;
            int[] iArr2 = new int[sArr.length];
            while (i2 < sArr.length) {
                iArr2[i2] = sArr[i2];
                i2++;
            }
            return iArr2;
        } else if (OooO00o2 instanceof byte[]) {
            byte[] bArr = (byte[]) OooO00o2;
            int[] iArr3 = new int[bArr.length];
            while (i2 < bArr.length) {
                iArr3[i2] = bArr[i2];
                i2++;
            }
            return iArr3;
        } else if (OooO00o2 instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) OooO00o2;
            int[] iArr4 = new int[charSequence.length()];
            while (i2 < charSequence.length()) {
                iArr4[i2] = charSequence.charAt(i2);
                i2++;
            }
            return iArr4;
        } else if (!(OooO00o2 instanceof Integer)) {
            return null;
        } else {
            return new int[]{((Integer) OooO00o2).intValue()};
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19651OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof C7927oO0o0OOo) {
            return ((C7927oO0o0OOo) OooO00o2).m19665OooO00o();
        }
        int i2 = 0;
        if (OooO00o2 instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) OooO00o2;
            int length = rationalArr.length;
            byte[] bArr = new byte[length];
            while (i2 < length) {
                bArr[i2] = rationalArr[i2].byteValue();
                i2++;
            }
            return bArr;
        } else if (OooO00o2 instanceof byte[]) {
            return (byte[]) OooO00o2;
        } else {
            if (OooO00o2 instanceof int[]) {
                int[] iArr = (int[]) OooO00o2;
                byte[] bArr2 = new byte[iArr.length];
                while (i2 < iArr.length) {
                    bArr2[i2] = (byte) iArr[i2];
                    i2++;
                }
                return bArr2;
            } else if (OooO00o2 instanceof short[]) {
                short[] sArr = (short[]) OooO00o2;
                byte[] bArr3 = new byte[sArr.length];
                while (i2 < sArr.length) {
                    bArr3[i2] = (byte) sArr[i2];
                    i2++;
                }
                return bArr3;
            } else if (OooO00o2 instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) OooO00o2;
                byte[] bArr4 = new byte[charSequence.length()];
                while (i2 < charSequence.length()) {
                    bArr4[i2] = (byte) charSequence.charAt(i2);
                    i2++;
                }
                return bArr4;
            } else if (!(OooO00o2 instanceof Integer)) {
                return null;
            } else {
                return new byte[]{((Integer) OooO00o2).byteValue()};
            }
        }
    }

    public double OooO00o(int i) throws MetadataException {
        Double OooO00o2 = m19637OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.doubleValue();
        }
        Object OooO00o3 = m19642OooO00o(i);
        if (OooO00o3 == null) {
            throw new MetadataException("Tag '" + OooO0OO(i) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i + "' cannot be converted to a double.  It is of type '" + OooO00o3.getClass() + "'.");
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Double m19637OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if ((OooO00o2 instanceof String) || (OooO00o2 instanceof C7927oO0o0OOo)) {
            try {
                return Double.valueOf(Double.parseDouble(OooO00o2.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (OooO00o2 instanceof Number) {
            return Double.valueOf(((Number) OooO00o2).doubleValue());
        } else {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m19630OooO00o(int i) throws MetadataException {
        Float OooO00o2 = m19638OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.floatValue();
        }
        Object OooO00o3 = m19642OooO00o(i);
        if (OooO00o3 == null) {
            throw new MetadataException("Tag '" + OooO0OO(i) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i + "' cannot be converted to a float.  It is of type '" + OooO00o3.getClass() + "'.");
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Float m19638OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if ((OooO00o2 instanceof String) || (OooO00o2 instanceof C7927oO0o0OOo)) {
            try {
                return Float.valueOf(Float.parseFloat(OooO00o2.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (OooO00o2 instanceof Number) {
            return Float.valueOf(((Number) OooO00o2).floatValue());
        } else {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m19632OooO00o(int i) throws MetadataException {
        Long OooO00o2 = m19641OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2.longValue();
        }
        Object OooO00o3 = m19642OooO00o(i);
        if (OooO00o3 == null) {
            throw new MetadataException("Tag '" + OooO0OO(i) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i + "' cannot be converted to a long.  It is of type '" + OooO00o3.getClass() + "'.");
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Long m19641OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof Number) {
            return Long.valueOf(((Number) OooO00o2).longValue());
        }
        if ((OooO00o2 instanceof String) || (OooO00o2 instanceof C7927oO0o0OOo)) {
            try {
                return Long.valueOf(Long.parseLong(OooO00o2.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else {
            if (OooO00o2 instanceof Rational[]) {
                Rational[] rationalArr = (Rational[]) OooO00o2;
                if (rationalArr.length == 1) {
                    return Long.valueOf(rationalArr[0].longValue());
                }
            } else if (OooO00o2 instanceof byte[]) {
                byte[] bArr = (byte[]) OooO00o2;
                if (bArr.length == 1) {
                    return Long.valueOf((long) bArr[0]);
                }
            } else if (OooO00o2 instanceof int[]) {
                int[] iArr = (int[]) OooO00o2;
                if (iArr.length == 1) {
                    return Long.valueOf((long) iArr[0]);
                }
            } else if (OooO00o2 instanceof short[]) {
                short[] sArr = (short[]) OooO00o2;
                if (sArr.length == 1) {
                    return Long.valueOf((long) sArr[0]);
                }
            }
            return null;
        }
    }

    @Nullable
    @SuppressWarnings(justification = "keep API interface consistent", value = "NP_BOOLEAN_RETURN_NULL")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Boolean m19636OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof Boolean) {
            return (Boolean) OooO00o2;
        }
        if ((OooO00o2 instanceof String) || (OooO00o2 instanceof C7927oO0o0OOo)) {
            try {
                return Boolean.valueOf(Boolean.getBoolean(OooO00o2.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (!(OooO00o2 instanceof Number)) {
            return null;
        } else {
            return Boolean.valueOf(((Number) OooO00o2).doubleValue() != AbstractC8352oOoOOoO0.OooO0O0);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m19646OooO00o(int i) {
        return OooO00o(i, null, null);
    }

    @Nullable
    public Date OooO00o(int i, @Nullable TimeZone timeZone) {
        return OooO00o(i, null, timeZone);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    @com.drew.lang.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date OooO00o(int r9, @com.drew.lang.annotations.Nullable java.lang.String r10, @com.drew.lang.annotations.Nullable java.util.TimeZone r11) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC7922oO0o0O0O.OooO00o(int, java.lang.String, java.util.TimeZone):java.util.Date");
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rational m19633OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof Rational) {
            return (Rational) OooO00o2;
        }
        if (OooO00o2 instanceof Integer) {
            return new Rational((long) ((Integer) OooO00o2).intValue(), 1);
        }
        if (OooO00o2 instanceof Long) {
            return new Rational(((Long) OooO00o2).longValue(), 1);
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rational[] m19653OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 != null && (OooO00o2 instanceof Rational[])) {
            return (Rational[]) OooO00o2;
        }
        return null;
    }

    @Nullable
    public String OooO00o(int i, String str) {
        byte[] OooO00o2 = m19651OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return new String(OooO00o2, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7927oO0o0OOo m19635OooO00o(int i) {
        Object OooO00o2 = m19642OooO00o(i);
        if (OooO00o2 instanceof C7927oO0o0OOo) {
            return (C7927oO0o0OOo) OooO00o2;
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m19642OooO00o(int i) {
        return this.f20995OooO00o.get(Integer.valueOf(i));
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19644OooO00o(int i) {
        return this.f20993OooO00o.OooO0OO(i);
    }
}
