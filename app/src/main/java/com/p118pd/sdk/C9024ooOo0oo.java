package com.p118pd.sdk;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.pd.sdk.ooOo0oo  reason: case insensitive filesystem */
public class C9024ooOo0oo {
    public C6980o000O000<String, Object> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9027ooOo0ooo f22341OooO00o = new C9027ooOo0ooo((byte) 0, (byte) 0, (byte) 4);

    /* renamed from: OooO00o  reason: collision with other field name */
    public HashMap<String, Integer> f22342OooO00o = new HashMap<>();

    /* renamed from: com.pd.sdk.ooOo0oo$OooO00o */
    public class OooO00o extends C6980o000O000<String, Object> {
        public OooO00o(int i) {
            super(i);
        }

        /* renamed from: OooO00o */
        public int sizeOf(String str, Object obj) {
            if (C9024ooOo0oo.this.f22342OooO00o.get(str) != null) {
                return ((Integer) C9024ooOo0oo.this.f22342OooO00o.get(str)).intValue();
            }
            C9024ooOo0oo.this.f22342OooO00o.remove(str);
            return 0;
        }
    }

    public C9024ooOo0oo(int i) {
        this.OooO00o = new OooO00o(i);
    }

    public final boolean OooO0O0(String str) {
        if (this.OooO00o.remove(str) == null) {
            return false;
        }
        this.f22342OooO00o.remove(str);
        return true;
    }

    public <T> T OooO00o(String str) {
        return (T) this.OooO00o.get(str);
    }

    public <T> boolean OooO00o(String str, T t) {
        if (t == null) {
            return false;
        }
        this.f22342OooO00o.put(str, Integer.valueOf((int) OooO00o((Object) t)));
        this.OooO00o.put(str, t);
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20687OooO00o(String str) {
        return this.f22342OooO00o.containsKey(str);
    }

    public void OooO00o() {
        this.f22342OooO00o.clear();
        this.OooO00o.evictAll();
    }

    private long OooO00o(Object obj) {
        int i;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Bitmap) {
            return C9026ooOo0ooO.OooO00o((Bitmap) obj);
        }
        if (obj instanceof Serializable) {
            try {
                return C9026ooOo0ooO.OooO00o((Serializable) obj);
            } catch (Exception unused) {
                i = this.f22341OooO00o.OooO0O0(obj);
            }
        } else {
            i = this.f22341OooO00o.OooO0O0(obj);
            return (long) i;
        }
    }
}
