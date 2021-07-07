package com.qiyukf.nimlib.p183g.p191c.p194c;

import com.p118pd.sdk.O0O00O;
import com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import java.util.Collection;

/* renamed from: com.qiyukf.nimlib.g.c.c.d */
public final class C2297d {
    /* renamed from: a */
    public static C2293b m4893a(C2299f fVar) {
        C2293b bVar = new C2293b();
        fVar.mo34975a(bVar);
        return bVar;
    }

    /* renamed from: a */
    public static void m4894a(C2295b bVar, Collection<?> collection) {
        if (collection == null) {
            bVar.mo34969b(0);
            return;
        }
        bVar.mo34969b(collection.size());
        for (Object obj : collection) {
            if (obj instanceof Integer) {
                bVar.mo34961a(((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                bVar.mo34966a(((Short) obj).shortValue());
            } else if (obj instanceof Long) {
                bVar.mo34962a(((Long) obj).longValue());
            } else if (obj instanceof String) {
                bVar.mo34964a((String) obj);
            } else if (obj instanceof AbstractC2292a) {
                bVar.mo34963a((AbstractC2292a) obj);
            } else if (obj instanceof Collection) {
                m4894a(bVar, (Collection) obj);
            } else if (obj instanceof byte[]) {
                bVar.mo34971b((byte[]) obj);
            } else if (obj instanceof Byte) {
                bVar.mo34960a(((Byte) obj).byteValue());
            } else {
                throw new IllegalArgumentException("unmarshallable type: " + obj.getClass());
            }
        }
    }

    /* renamed from: a */
    public static byte[] m4895a(int i) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (true) {
            byte b = (byte) (i % 128);
            i /= 128;
            if (i > 0) {
                b = (byte) (b | O0O00O.OooO00o);
            }
            int i3 = i2 + 1;
            bArr[i2] = b;
            if (i <= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                return bArr2;
            }
            i2 = i3;
        }
    }

    /* renamed from: b */
    public static int m4896b(int i) {
        int i2 = 0;
        do {
            i /= 128;
            i2++;
        } while (i > 0);
        return i2;
    }
}
