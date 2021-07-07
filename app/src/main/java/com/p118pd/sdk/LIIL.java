package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.LIIL */
public class LIIL {
    public int OooO00o = 0;

    /* renamed from: com.pd.sdk.LIIL$OooO00o */
    public class OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f16278OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public StringBuffer f16279OooO00o = new StringBuffer();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f16280OooO00o = true;

        public OooO00o(String str) {
            this.f16278OooO00o = str;
        }

        public void OooO00o(String str) {
            if (this.f16280OooO00o) {
                this.f16280OooO00o = false;
            } else {
                this.f16279OooO00o.append(this.f16278OooO00o);
            }
            this.f16279OooO00o.append(str);
        }

        public String toString() {
            return this.f16279OooO00o.toString();
        }
    }

    public LIIL() {
    }

    public LIIL(int i) {
        this.OooO00o = i;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    public String OooO00o(Hashtable hashtable) {
        OooO00o oooO00o = new OooO00o(" ");
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (m16026OooO00o(num.intValue())) {
                oooO00o.OooO00o((String) hashtable.get(num));
            }
        }
        return oooO00o.toString();
    }

    public void OooO00o(int i) {
        this.OooO00o = i | this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16026OooO00o(int i) {
        return (i & this.OooO00o) != 0;
    }
}
