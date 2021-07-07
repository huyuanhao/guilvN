package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.o0Oo00oo  reason: case insensitive filesystem */
public abstract class AbstractC7453o0Oo00oo {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f20287OooO00o = null;

    public AbstractC7453o0Oo00oo() {
    }

    public AbstractC7453o0Oo00oo(int i) throws XMPException {
        OooO0OO(i);
        m19078OooO0O0(i);
    }

    private Map OooO00o() {
        if (this.f20287OooO00o == null) {
            this.f20287OooO00o = new HashMap();
        }
        return this.f20287OooO00o;
    }

    private String OooO0O0(int i) {
        Map OooO00o2 = OooO00o();
        Integer num = new Integer(i);
        String str = (String) OooO00o2.get(num);
        if (str != null) {
            return str;
        }
        String OooO00o3 = OooO00o(i);
        if (OooO00o3 == null) {
            return "<option name not defined>";
        }
        OooO00o2.put(num, OooO00o3);
        return OooO00o3;
    }

    private void OooO0OO(int i) throws XMPException {
        int OooO0O0 = (OooO0O0() ^ -1) & i;
        if (OooO0O0 == 0) {
            m19076OooO00o(i);
            return;
        }
        throw new XMPException("The option bit(s) 0x" + Integer.toHexString(OooO0O0) + " are invalid!", 103);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19073OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19074OooO00o() {
        if (this.OooO00o == 0) {
            return "<none>";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.OooO00o;
        while (i != 0) {
            int i2 = (i - 1) & i;
            stringBuffer.append(OooO0O0(i ^ i2));
            if (i2 != 0) {
                stringBuffer.append(" | ");
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    public abstract String OooO00o(int i);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19075OooO00o() {
        this.OooO00o = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19076OooO00o(int i) throws XMPException {
    }

    public void OooO00o(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.OooO00o;
        } else {
            i2 = (i ^ -1) & this.OooO00o;
        }
        this.OooO00o = i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19077OooO00o(int i) {
        return (m19073OooO00o() & i) == i;
    }

    public abstract int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19078OooO0O0(int i) throws XMPException {
        OooO0OO(i);
        this.OooO00o = i;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19079OooO0O0(int i) {
        return (i & m19073OooO00o()) != 0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m19080OooO0OO(int i) {
        return (i & this.OooO00o) != 0;
    }

    public boolean OooO0Oo(int i) {
        return m19073OooO00o() == i;
    }

    public boolean equals(Object obj) {
        return m19073OooO00o() == ((AbstractC7453o0Oo00oo) obj).m19073OooO00o();
    }

    public int hashCode() {
        return m19073OooO00o();
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.OooO00o);
    }
}
