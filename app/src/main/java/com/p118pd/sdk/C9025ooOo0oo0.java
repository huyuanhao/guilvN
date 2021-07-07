package com.p118pd.sdk;

import com.p118pd.sdk.C8941ooOOOOO0;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOo0oo0  reason: case insensitive filesystem */
public class C9025ooOo0oo0 {
    public static final String OooO00o = "LruDiskCache";

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8941ooOOOOO0 f22343OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9029ooOoO00 f22344OooO00o;

    public C9025ooOo0oo0(AbstractC9029ooOoO00 ooooo00, File file, int i, long j) {
        this.f22344OooO00o = ooooo00;
        try {
            this.f22343OooO00o = C8941ooOOOOO0.OooO00o(file, i, 1, j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T> T OooO00o(String str, Type type) {
        C8941ooOOOOO0 ooooooo0 = this.f22343OooO00o;
        if (ooooooo0 == null) {
            return null;
        }
        try {
            C8941ooOOOOO0.OooO0OO OooO00o2 = ooooooo0.m20599OooO00o(str);
            if (OooO00o2 == null) {
                return null;
            }
            InputStream OooO00o3 = OooO00o2.OooO00o(0);
            if (OooO00o3 != null) {
                T t = (T) this.f22344OooO00o.OooO00o(OooO00o3, type);
                OooO00o2.OooO0OO();
                return t;
            }
            OooO00o2.OooO00o();
            return null;
        } catch (Exception e) {
            e.toString();
        }
    }

    public boolean OooO0O0(String str) {
        try {
            return this.f22343OooO00o.m20603OooO00o(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public <T> boolean OooO00o(String str, T t) {
        C8941ooOOOOO0 ooooooo0 = this.f22343OooO00o;
        if (ooooooo0 == null) {
            return false;
        }
        try {
            C8941ooOOOOO0.OooO0OO OooO00o2 = ooooooo0.m20599OooO00o(str);
            if (OooO00o2 == null) {
                return false;
            }
            OutputStream OooO00o3 = OooO00o2.m20606OooO00o(0);
            if (OooO00o3 != null) {
                this.f22344OooO00o.OooO00o(OooO00o3, t);
                OooO00o2.OooO0OO();
                return true;
            }
            OooO00o2.OooO00o();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean OooO00o(String str) {
        try {
            return this.f22343OooO00o.m20600OooO00o(str) != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void OooO00o() {
        try {
            this.f22343OooO00o.m20602OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
