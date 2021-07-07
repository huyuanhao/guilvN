package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
public final class C3352i {

    /* renamed from: a */
    public StringBuilder f8218a;

    /* renamed from: b */
    public int f8219b = 0;

    public C3352i(StringBuilder sb, int i) {
        this.f8218a = sb;
        this.f8219b = i;
    }

    /* renamed from: a */
    private void m8508a(String str) {
        for (int i = 0; i < this.f8219b; i++) {
            this.f8218a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f8218a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public C3352i mo38438a(boolean z, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(z ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38426a(byte b, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append((int) b);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38427a(char c, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(c);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38437a(short s, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append((int) s);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38430a(int i, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(i);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38431a(long j, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(j);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38429a(float f, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(f);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38428a(double d, String str) {
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append(d);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public C3352i mo38434a(String str, String str2) {
        m8508a(str2);
        if (str == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
        } else {
            StringBuilder sb2 = this.f8218a;
            sb2.append(str);
            sb2.append('\n');
        }
        return this;
    }

    /* renamed from: a */
    public C3352i mo38439a(byte[] bArr, String str) {
        m8508a(str);
        if (bArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(bArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(bArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (byte b : bArr) {
                iVar.mo38426a(b, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public C3352i mo38445a(short[] sArr, String str) {
        m8508a(str);
        if (sArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (sArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(sArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(sArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (short s : sArr) {
                iVar.mo38437a(s, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public C3352i mo38442a(int[] iArr, String str) {
        m8508a(str);
        if (iArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (iArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(iArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(iArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (int i : iArr) {
                iVar.mo38430a(i, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public C3352i mo38443a(long[] jArr, String str) {
        m8508a(str);
        if (jArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (jArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(jArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(jArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (long j : jArr) {
                iVar.mo38431a(j, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public C3352i mo38441a(float[] fArr, String str) {
        m8508a(str);
        if (fArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (fArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(fArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(fArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (float f : fArr) {
                iVar.mo38429a(f, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public C3352i mo38440a(double[] dArr, String str) {
        m8508a(str);
        if (dArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (dArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(dArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(dArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (double d : dArr) {
                iVar.mo38428a(d, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public <K, V> C3352i mo38436a(Map<K, V> map, String str) {
        m8508a(str);
        if (map == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(map.size());
            sb2.append(", {}");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(map.size());
            sb3.append(", {");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            C3352i iVar2 = new C3352i(this.f8218a, this.f8219b + 2);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                iVar.mo38427a('(', (String) null);
                iVar2.mo38433a((Object) entry.getKey(), (String) null);
                iVar2.mo38433a((Object) entry.getValue(), (String) null);
                iVar.mo38427a(')', (String) null);
            }
            mo38427a('}', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public <T> C3352i mo38444a(T[] tArr, String str) {
        m8508a(str);
        if (tArr == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb2 = this.f8218a;
            sb2.append(tArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        } else {
            StringBuilder sb3 = this.f8218a;
            sb3.append(tArr.length);
            sb3.append(", [");
            sb3.append('\n');
            C3352i iVar = new C3352i(this.f8218a, this.f8219b + 1);
            for (T t : tArr) {
                iVar.mo38433a((Object) t, (String) null);
            }
            mo38427a(']', (String) null);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.tencent.bugly.proguard.i */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> C3352i mo38435a(Collection<T> collection, String str) {
        if (collection != null) {
            return mo38444a(collection.toArray(), str);
        }
        m8508a(str);
        StringBuilder sb = this.f8218a;
        sb.append("null");
        sb.append('\t');
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.tencent.bugly.proguard.i */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> C3352i mo38433a(T t, String str) {
        if (t == null) {
            StringBuilder sb = this.f8218a;
            sb.append("null");
            sb.append('\n');
        } else if (t instanceof Byte) {
            mo38426a(t.byteValue(), str);
        } else if (t instanceof Boolean) {
            mo38438a(t.booleanValue(), str);
        } else if (t instanceof Short) {
            mo38437a(t.shortValue(), str);
        } else if (t instanceof Integer) {
            mo38430a(t.intValue(), str);
        } else if (t instanceof Long) {
            mo38431a(t.longValue(), str);
        } else if (t instanceof Float) {
            mo38429a(t.floatValue(), str);
        } else if (t instanceof Double) {
            mo38428a(t.doubleValue(), str);
        } else if (t instanceof String) {
            mo38434a((String) t, str);
        } else if (t instanceof Map) {
            mo38436a((Map) t, str);
        } else if (t instanceof List) {
            mo38435a((Collection) t, str);
        } else if (t instanceof AbstractC3357m) {
            mo38432a((AbstractC3357m) t, str);
        } else if (t instanceof byte[]) {
            mo38439a((byte[]) t, str);
        } else if (t instanceof boolean[]) {
            mo38433a((boolean[]) t, str);
        } else if (t instanceof short[]) {
            mo38445a((short[]) t, str);
        } else if (t instanceof int[]) {
            mo38442a((int[]) t, str);
        } else if (t instanceof long[]) {
            mo38443a((long[]) t, str);
        } else if (t instanceof float[]) {
            mo38441a((float[]) t, str);
        } else if (t instanceof double[]) {
            mo38440a((double[]) t, str);
        } else if (t.getClass().isArray()) {
            mo38444a((Object[]) t, str);
        } else {
            throw new C3353j("write object error: unsupport type.");
        }
        return this;
    }

    /* renamed from: a */
    public C3352i mo38432a(AbstractC3357m mVar, String str) {
        mo38427a('{', str);
        if (mVar == null) {
            StringBuilder sb = this.f8218a;
            sb.append('\t');
            sb.append("null");
        } else {
            mVar.mo38328a(this.f8218a, this.f8219b + 1);
        }
        mo38427a('}', (String) null);
        return this;
    }
}
