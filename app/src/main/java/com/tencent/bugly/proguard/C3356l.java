package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.l */
public class C3356l {

    /* renamed from: a */
    public String f8224a;

    /* renamed from: b */
    public ByteBuffer f8225b;

    public C3356l(int i) {
        this.f8224a = "GBK";
        this.f8225b = ByteBuffer.allocate(i);
    }

    /* renamed from: a */
    public ByteBuffer mo38472a() {
        return this.f8225b;
    }

    /* renamed from: b */
    public byte[] mo38494b() {
        byte[] bArr = new byte[this.f8225b.position()];
        System.arraycopy(this.f8225b.array(), 0, bArr, 0, this.f8225b.position());
        return bArr;
    }

    /* renamed from: a */
    public void mo38476a(int i) {
        if (this.f8225b.remaining() < i) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f8225b.capacity() + i) * 2);
            allocate.put(this.f8225b.array(), 0, this.f8225b.position());
            this.f8225b = allocate;
        }
    }

    /* renamed from: b */
    public void mo38493b(byte b, int i) {
        mo38476a(3);
        if (b == 0) {
            mo38473a((byte) 12, i);
            return;
        }
        mo38473a((byte) 0, i);
        this.f8225b.put(b);
    }

    public C3356l() {
        this(128);
    }

    /* renamed from: a */
    public void mo38473a(byte b, int i) {
        if (i < 15) {
            this.f8225b.put((byte) (b | (i << 4)));
        } else if (i < 256) {
            this.f8225b.put((byte) (b | 240));
            this.f8225b.put((byte) i);
        } else {
            throw new C3353j("tag is too large: " + i);
        }
    }

    /* renamed from: a */
    public void mo38485a(boolean z, int i) {
        mo38493b(z ? (byte) 1 : 0, i);
    }

    /* renamed from: a */
    public void mo38484a(short s, int i) {
        mo38476a(4);
        if (s < -128 || s > 127) {
            mo38473a((byte) 1, i);
            this.f8225b.putShort(s);
            return;
        }
        mo38493b((byte) s, i);
    }

    /* renamed from: a */
    public void mo38477a(int i, int i2) {
        mo38476a(6);
        if (i < -32768 || i > 32767) {
            mo38473a((byte) 2, i2);
            this.f8225b.putInt(i);
            return;
        }
        mo38484a((short) i, i2);
    }

    /* renamed from: a */
    public void mo38478a(long j, int i) {
        mo38476a(10);
        if (j < -2147483648L || j > 2147483647L) {
            mo38473a((byte) 3, i);
            this.f8225b.putLong(j);
            return;
        }
        mo38477a((int) j, i);
    }

    /* renamed from: a */
    public void mo38475a(float f, int i) {
        mo38476a(6);
        mo38473a((byte) 4, i);
        this.f8225b.putFloat(f);
    }

    /* renamed from: a */
    public void mo38474a(double d, int i) {
        mo38476a(10);
        mo38473a((byte) 5, i);
        this.f8225b.putDouble(d);
    }

    /* renamed from: a */
    public void mo38481a(String str, int i) {
        byte[] bArr;
        try {
            bArr = str.getBytes(this.f8224a);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        mo38476a(bArr.length + 10);
        if (bArr.length > 255) {
            mo38473a((byte) 7, i);
            this.f8225b.putInt(bArr.length);
            this.f8225b.put(bArr);
            return;
        }
        mo38473a((byte) 6, i);
        this.f8225b.put((byte) bArr.length);
        this.f8225b.put(bArr);
    }

    /* renamed from: a */
    public <K, V> void mo38483a(Map<K, V> map, int i) {
        int i2;
        mo38476a(8);
        mo38473a((byte) 8, i);
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        mo38477a(i2, 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                mo38480a((Object) entry.getKey(), 0);
                mo38480a((Object) entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    public void mo38492a(boolean[] zArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(zArr.length, 0);
        for (boolean z : zArr) {
            mo38485a(z, 0);
        }
    }

    /* renamed from: a */
    public void mo38486a(byte[] bArr, int i) {
        mo38476a(bArr.length + 8);
        mo38473a((byte) 13, i);
        mo38473a((byte) 0, 0);
        mo38477a(bArr.length, 0);
        this.f8225b.put(bArr);
    }

    /* renamed from: a */
    public void mo38491a(short[] sArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(sArr.length, 0);
        for (short s : sArr) {
            mo38484a(s, 0);
        }
    }

    /* renamed from: a */
    public void mo38489a(int[] iArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(iArr.length, 0);
        for (int i2 : iArr) {
            mo38477a(i2, 0);
        }
    }

    /* renamed from: a */
    public void mo38490a(long[] jArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(jArr.length, 0);
        for (long j : jArr) {
            mo38478a(j, 0);
        }
    }

    /* renamed from: a */
    public void mo38488a(float[] fArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(fArr.length, 0);
        for (float f : fArr) {
            mo38475a(f, 0);
        }
    }

    /* renamed from: a */
    public void mo38487a(double[] dArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(dArr.length, 0);
        for (double d : dArr) {
            mo38474a(d, 0);
        }
    }

    /* renamed from: a */
    private void m8561a(Object[] objArr, int i) {
        mo38476a(8);
        mo38473a((byte) 9, i);
        mo38477a(objArr.length, 0);
        for (Object obj : objArr) {
            mo38480a(obj, 0);
        }
    }

    /* renamed from: a */
    public <T> void mo38482a(Collection<T> collection, int i) {
        int i2;
        mo38476a(8);
        mo38473a((byte) 9, i);
        if (collection == null) {
            i2 = 0;
        } else {
            i2 = collection.size();
        }
        mo38477a(i2, 0);
        if (collection != null) {
            for (T t : collection) {
                mo38480a((Object) t, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo38479a(AbstractC3357m mVar, int i) {
        mo38476a(2);
        mo38473a((byte) 10, i);
        mVar.mo38327a(this);
        mo38476a(2);
        mo38473a((byte) 11, 0);
    }

    /* renamed from: a */
    public void mo38480a(Object obj, int i) {
        if (obj instanceof Byte) {
            mo38493b(((Byte) obj).byteValue(), i);
        } else if (obj instanceof Boolean) {
            mo38485a(((Boolean) obj).booleanValue(), i);
        } else if (obj instanceof Short) {
            mo38484a(((Short) obj).shortValue(), i);
        } else if (obj instanceof Integer) {
            mo38477a(((Integer) obj).intValue(), i);
        } else if (obj instanceof Long) {
            mo38478a(((Long) obj).longValue(), i);
        } else if (obj instanceof Float) {
            mo38475a(((Float) obj).floatValue(), i);
        } else if (obj instanceof Double) {
            mo38474a(((Double) obj).doubleValue(), i);
        } else if (obj instanceof String) {
            mo38481a((String) obj, i);
        } else if (obj instanceof Map) {
            mo38483a((Map) obj, i);
        } else if (obj instanceof List) {
            mo38482a((Collection) ((List) obj), i);
        } else if (obj instanceof AbstractC3357m) {
            mo38479a((AbstractC3357m) obj, i);
        } else if (obj instanceof byte[]) {
            mo38486a((byte[]) obj, i);
        } else if (obj instanceof boolean[]) {
            mo38492a((boolean[]) obj, i);
        } else if (obj instanceof short[]) {
            mo38491a((short[]) obj, i);
        } else if (obj instanceof int[]) {
            mo38489a((int[]) obj, i);
        } else if (obj instanceof long[]) {
            mo38490a((long[]) obj, i);
        } else if (obj instanceof float[]) {
            mo38488a((float[]) obj, i);
        } else if (obj instanceof double[]) {
            mo38487a((double[]) obj, i);
        } else if (obj.getClass().isArray()) {
            m8561a((Object[]) obj, i);
        } else if (obj instanceof Collection) {
            mo38482a((Collection) obj, i);
        } else {
            throw new C3353j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public int mo38471a(String str) {
        this.f8224a = str;
        return 0;
    }
}
