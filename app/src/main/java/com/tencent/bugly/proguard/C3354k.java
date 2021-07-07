package com.tencent.bugly.proguard;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.k */
public final class C3354k {

    /* renamed from: a */
    public String f8220a = "GBK";

    /* renamed from: b */
    public ByteBuffer f8221b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class C3355a {

        /* renamed from: a */
        public byte f8222a;

        /* renamed from: b */
        public int f8223b;
    }

    public C3354k() {
    }

    /* renamed from: b */
    private int m8532b(C3355a aVar) {
        return m8529a(aVar, this.f8221b.duplicate());
    }

    /* renamed from: a */
    public void mo38460a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f8221b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f8221b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: b */
    private void m8534b(int i) {
        ByteBuffer byteBuffer = this.f8221b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public C3354k(byte[] bArr) {
        this.f8221b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: b */
    private void m8533b() {
        C3355a aVar = new C3355a();
        mo38459a(aVar);
        m8531a(aVar.f8222a);
    }

    /* renamed from: a */
    public static int m8529a(C3355a aVar, ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        aVar.f8222a = (byte) (b & 15);
        int i = (b & 240) >> 4;
        aVar.f8223b = i;
        if (i != 15) {
            return 1;
        }
        aVar.f8223b = byteBuffer.get();
        return 2;
    }

    public C3354k(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f8221b = wrap;
        wrap.position(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m8535b(T t, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    T[] tArr = (T[]) ((Object[]) Array.newInstance(t.getClass(), a));
                    for (int i2 = 0; i2 < a; i2++) {
                        tArr[i2] = mo38453a((Object) t, 0, true);
                    }
                    return tArr;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public void mo38459a(C3355a aVar) {
        m8529a(aVar, this.f8221b);
    }

    /* renamed from: a */
    public boolean mo38461a(int i) {
        try {
            C3355a aVar = new C3355a();
            while (true) {
                int b = m8532b(aVar);
                if (i <= aVar.f8223b) {
                    break;
                } else if (aVar.f8222a == 11) {
                    break;
                } else {
                    m8534b(b);
                    m8531a(aVar.f8222a);
                }
            }
            if (i == aVar.f8223b) {
                return true;
            }
            return false;
        } catch (C3351h | BufferUnderflowException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo38458a() {
        C3355a aVar = new C3355a();
        do {
            mo38459a(aVar);
            m8531a(aVar.f8222a);
        } while (aVar.f8222a != 11);
    }

    /* renamed from: a */
    private void m8531a(byte b) {
        int i = 0;
        switch (b) {
            case 0:
                m8534b(1);
                return;
            case 1:
                m8534b(2);
                return;
            case 2:
                m8534b(4);
                return;
            case 3:
                m8534b(8);
                return;
            case 4:
                m8534b(4);
                return;
            case 5:
                m8534b(8);
                return;
            case 6:
                int i2 = this.f8221b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                m8534b(i2);
                return;
            case 7:
                m8534b(this.f8221b.getInt());
                return;
            case 8:
                int a = mo38449a(0, 0, true);
                while (i < a * 2) {
                    m8533b();
                    i++;
                }
                return;
            case 9:
                int a2 = mo38449a(0, 0, true);
                while (i < a2) {
                    m8533b();
                    i++;
                }
                return;
            case 10:
                mo38458a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                C3355a aVar = new C3355a();
                mo38459a(aVar);
                if (aVar.f8222a == 0) {
                    m8534b(mo38449a(0, 0, true));
                    return;
                }
                throw new C3351h("skipField with invalid type, type value: " + ((int) b) + ", " + ((int) aVar.f8222a));
            default:
                throw new C3351h("invalid type.");
        }
    }

    /* renamed from: a */
    public boolean mo38462a(boolean z, int i, boolean z2) {
        return mo38446a((byte) 0, i, z2) != 0;
    }

    /* renamed from: a */
    public byte mo38446a(byte b, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b2 = aVar.f8222a;
            if (b2 == 0) {
                return this.f8221b.get();
            }
            if (b2 == 12) {
                return 0;
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return b;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public short mo38457a(short s, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 0) {
                return (short) this.f8221b.get();
            }
            if (b == 1) {
                return this.f8221b.getShort();
            }
            if (b == 12) {
                return 0;
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return s;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public int mo38449a(int i, int i2, boolean z) {
        if (mo38461a(i2)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 0) {
                return this.f8221b.get();
            }
            if (b == 1) {
                return this.f8221b.getShort();
            }
            if (b == 2) {
                return this.f8221b.getInt();
            }
            if (b == 12) {
                return 0;
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return i;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public long mo38451a(long j, int i, boolean z) {
        int i2;
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 0) {
                i2 = this.f8221b.get();
            } else if (b == 1) {
                i2 = this.f8221b.getShort();
            } else if (b == 2) {
                i2 = this.f8221b.getInt();
            } else if (b == 3) {
                return this.f8221b.getLong();
            } else {
                if (b == 12) {
                    return 0;
                }
                throw new C3351h("type mismatch.");
            }
            return (long) i2;
        } else if (!z) {
            return j;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public float mo38448a(float f, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 4) {
                return this.f8221b.getFloat();
            }
            if (b == 12) {
                return 0.0f;
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return f;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public double mo38447a(double d, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 4) {
                return (double) this.f8221b.getFloat();
            }
            if (b == 5) {
                return this.f8221b.getDouble();
            }
            if (b == 12) {
                return AbstractC8352oOoOOoO0.OooO0O0;
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return d;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public String mo38454a(int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 6) {
                int i2 = this.f8221b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.f8221b.get(bArr);
                try {
                    return new String(bArr, this.f8220a);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr);
                }
            } else if (b == 7) {
                int i3 = this.f8221b.getInt();
                if (i3 > 104857600 || i3 < 0) {
                    throw new C3351h("String too long: " + i3);
                }
                byte[] bArr2 = new byte[i3];
                this.f8221b.get(bArr2);
                try {
                    return new String(bArr2, this.f8220a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            } else {
                throw new C3351h("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public <K, V> HashMap<K, V> mo38455a(Map<K, V> map, int i, boolean z) {
        return (HashMap) m8530a(new HashMap(), map, i, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m8530a(Map<K, V> map, Map<K, V> map2, int i, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry<K, V> next = map2.entrySet().iterator().next();
        K key = next.getKey();
        V value = next.getValue();
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 8) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    for (int i2 = 0; i2 < a; i2++) {
                        map.put(mo38453a((Object) key, 0, true), mo38453a((Object) value, 1, true));
                    }
                } else {
                    throw new C3351h("size invalid: " + a);
                }
            } else {
                throw new C3351h("type mismatch.");
            }
        } else if (z) {
            throw new C3351h("require field not exist.");
        }
        return map;
    }

    /* renamed from: a */
    public boolean[] mo38470a(boolean[] zArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    boolean[] zArr2 = new boolean[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        zArr2[i2] = mo38462a(zArr2[0], 0, true);
                    }
                    return zArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public byte[] mo38463a(byte[] bArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            byte b = aVar.f8222a;
            if (b == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    byte[] bArr2 = new byte[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        bArr2[i2] = mo38446a(bArr2[0], 0, true);
                    }
                    return bArr2;
                }
                throw new C3351h("size invalid: " + a);
            } else if (b == 13) {
                C3355a aVar2 = new C3355a();
                mo38459a(aVar2);
                if (aVar2.f8222a == 0) {
                    int a2 = mo38449a(0, 0, true);
                    if (a2 >= 0) {
                        byte[] bArr3 = new byte[a2];
                        this.f8221b.get(bArr3);
                        return bArr3;
                    }
                    throw new C3351h("invalid size, tag: " + i + ", type: " + ((int) aVar.f8222a) + ", " + ((int) aVar2.f8222a) + ", size: " + a2);
                }
                throw new C3351h("type mismatch, tag: " + i + ", type: " + ((int) aVar.f8222a) + ", " + ((int) aVar2.f8222a));
            } else {
                throw new C3351h("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public short[] mo38469a(short[] sArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    short[] sArr2 = new short[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        sArr2[i2] = mo38457a(sArr2[0], 0, true);
                    }
                    return sArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public int[] mo38466a(int[] iArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    int[] iArr2 = new int[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        iArr2[i2] = mo38449a(iArr2[0], 0, true);
                    }
                    return iArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public long[] mo38467a(long[] jArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    long[] jArr2 = new long[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        jArr2[i2] = mo38451a(jArr2[0], 0, true);
                    }
                    return jArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public float[] mo38465a(float[] fArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    float[] fArr2 = new float[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        fArr2[i2] = mo38448a(fArr2[0], 0, true);
                    }
                    return fArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public double[] mo38464a(double[] dArr, int i, boolean z) {
        if (mo38461a(i)) {
            C3355a aVar = new C3355a();
            mo38459a(aVar);
            if (aVar.f8222a == 9) {
                int a = mo38449a(0, 0, true);
                if (a >= 0) {
                    double[] dArr2 = new double[a];
                    for (int i2 = 0; i2 < a; i2++) {
                        dArr2[i2] = mo38447a(dArr2[0], 0, true);
                    }
                    return dArr2;
                }
                throw new C3351h("size invalid: " + a);
            }
            throw new C3351h("type mismatch.");
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* renamed from: a */
    public <T> T[] mo38468a(T[] tArr, int i, boolean z) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m8535b(tArr[0], i, z);
        }
        throw new C3351h("unable to get type of key and value.");
    }

    /* renamed from: a */
    public <T> List<T> mo38456a(List<T> list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] b = m8535b(list.get(0), i, z);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public AbstractC3357m mo38452a(AbstractC3357m mVar, int i, boolean z) {
        if (mo38461a(i)) {
            try {
                AbstractC3357m mVar2 = (AbstractC3357m) mVar.getClass().newInstance();
                C3355a aVar = new C3355a();
                mo38459a(aVar);
                if (aVar.f8222a == 10) {
                    mVar2.mo38326a(this);
                    mo38458a();
                    return mVar2;
                }
                throw new C3351h("type mismatch.");
            } catch (Exception e) {
                throw new C3351h(e.getMessage());
            }
        } else if (!z) {
            return null;
        } else {
            throw new C3351h("require field not exist.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.tencent.bugly.proguard.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> Object mo38453a(T t, int i, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(mo38446a((byte) 0, i, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(mo38462a(false, i, z));
        }
        if (t instanceof Short) {
            return Short.valueOf(mo38457a((short) 0, i, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(mo38449a(0, i, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(mo38451a(0L, i, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(mo38448a(0.0f, i, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(mo38447a((double) AbstractC8352oOoOOoO0.OooO0O0, i, z));
        }
        if (t instanceof String) {
            return String.valueOf(mo38454a(i, z));
        }
        if (t instanceof Map) {
            return mo38455a((Map) t, i, z);
        }
        if (t instanceof List) {
            return mo38456a((List) t, i, z);
        }
        if (t instanceof AbstractC3357m) {
            return mo38452a((AbstractC3357m) t, i, z);
        }
        if (!t.getClass().isArray()) {
            throw new C3351h("read object error: unsupport type.");
        } else if ((t instanceof byte[]) || (t instanceof Byte[])) {
            return mo38463a((byte[]) null, i, z);
        } else {
            if (t instanceof boolean[]) {
                return mo38470a((boolean[]) null, i, z);
            }
            if (t instanceof short[]) {
                return mo38469a((short[]) null, i, z);
            }
            if (t instanceof int[]) {
                return mo38466a((int[]) null, i, z);
            }
            if (t instanceof long[]) {
                return mo38467a((long[]) null, i, z);
            }
            if (t instanceof float[]) {
                return mo38465a((float[]) null, i, z);
            }
            if (t instanceof double[]) {
                return mo38464a((double[]) null, i, z);
            }
            return mo38468a((Object[]) t, i, z);
        }
    }

    /* renamed from: a */
    public int mo38450a(String str) {
        this.f8220a = str;
        return 0;
    }
}
