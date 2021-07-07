package com.umeng.commonsdk.proguard;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.umeng.commonsdk.proguard.u */
public final class C3629u {

    /* renamed from: a */
    public static final Comparator f9457a = new C3631a();

    /* renamed from: com.umeng.commonsdk.proguard.u$a */
    public static class C3631a implements Comparator {
        public C3631a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return C3629u.m9623a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return C3629u.m9625a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return C3629u.m9624a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return C3629u.m9628a((byte[]) obj, (byte[]) obj2);
            }
            return C3629u.m9619a((Comparable) obj, (Comparable) obj2);
        }
    }

    /* renamed from: a */
    public static int m9615a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* renamed from: a */
    public static int m9616a(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d2 < d ? 1 : 0;
    }

    /* renamed from: a */
    public static int m9617a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* renamed from: a */
    public static int m9618a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* renamed from: a */
    public static int m9620a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m9619a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m9623a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m9625a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m9624a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m9628a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* renamed from: a */
    public static int m9626a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m9633b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: c */
    public static ByteBuffer m9634c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (m9633b(byteBuffer)) {
            return byteBuffer;
        }
        return ByteBuffer.wrap(m9631a(byteBuffer));
    }

    /* renamed from: d */
    public static ByteBuffer m9635d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(wrap.array());
        }
        return wrap;
    }

    /* renamed from: a */
    public static int m9627a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public static int m9621a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m9628a(byte[] bArr, byte[] bArr2) {
        int a = m9617a(bArr.length, bArr2.length);
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a2 = m9615a(bArr[i], bArr2[i]);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m9619a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m9623a(List list, List list2) {
        int a = m9617a(list.size(), list2.size());
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f9457a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m9625a(Set set, Set set2) {
        int a = m9617a(set.size(), set2.size());
        if (a != 0) {
            return a;
        }
        TreeSet treeSet = new TreeSet(f9457a);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(f9457a);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f9457a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m9624a(Map map, Map map2) {
        int a = m9617a(map.size(), map2.size());
        if (a != 0) {
            return a;
        }
        TreeMap treeMap = new TreeMap(f9457a);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(f9457a);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compare = f9457a.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = f9457a.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m9630a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i = limit - position > 128 ? position + 128 : limit;
        for (int i2 = position; i2 < i; i2++) {
            if (i2 > position) {
                sb.append(" ");
            }
            sb.append(m9629a(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static String m9629a(byte b) {
        return Integer.toHexString((b | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static byte[] m9631a(ByteBuffer byteBuffer) {
        if (m9633b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m9622a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m9622a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, remaining);
        return remaining;
    }

    /* renamed from: a */
    public static byte[] m9632a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
