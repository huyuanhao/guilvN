package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.o0OOoOO  reason: case insensitive filesystem */
public class C7432o0OOoOO implements AbstractC7414o0OOOooo {
    public C7452o0Oo00oO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Iterator f20242OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public String o0ooOOo = null;

    /* renamed from: com.pd.sdk.o0OOoOO$OooO00o */
    public class OooO00o implements Iterator {
        public static final int o0OOO0o = 2;
        public static final int o0ooOOo = 0;
        public static final int o0ooOoO = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7434o0OOoOo f20243OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7454o0Oo0O f20244OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Iterator f20245OooO00o = null;
        public Iterator OooO0O0 = Collections.EMPTY_LIST.iterator();
        public int o00oO0O = 0;
        public int o0ooOO0 = 0;

        /* renamed from: o0ooOOo  reason: collision with other field name */
        public String f20246o0ooOOo;

        /* renamed from: com.pd.sdk.o0OOoOO$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4967OooO00o implements AbstractC7454o0Oo0O {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7434o0OOoOo f20247OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ String f20248OooO00o;
            public final /* synthetic */ String OooO0O0;
            public final /* synthetic */ String OooO0OO;

            public C4967OooO00o(C7434o0OOoOo o0ooooo, String str, String str2, String str3) {
                this.f20247OooO00o = o0ooooo;
                this.f20248OooO00o = str;
                this.OooO0O0 = str2;
                this.OooO0OO = str3;
            }

            @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O, com.p118pd.sdk.AbstractC7454o0Oo0O, com.p118pd.sdk.AbstractC7454o0Oo0O
            public C7710o0ooO0O0 OooO00o() {
                return this.f20247OooO00o.m19030OooO00o();
            }

            @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O, com.p118pd.sdk.AbstractC7454o0Oo0O, com.p118pd.sdk.AbstractC7454o0Oo0O
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m19006OooO00o() {
                return this.OooO0O0;
            }

            @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
            public String OooO0O0() {
                return null;
            }

            @Override // com.p118pd.sdk.AbstractC7454o0Oo0O
            public String getNamespace() {
                if (this.f20247OooO00o.m19030OooO00o().OooOO0O()) {
                    return this.f20248OooO00o;
                }
                return C7415o0OOo00.m18952OooO00o().OooO0O0(new C7430o0OOoO0O(this.f20247OooO00o.m19031OooO00o()).OooO0O0());
            }

            @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O, com.p118pd.sdk.AbstractC7454o0Oo0O
            public String getValue() {
                return this.OooO0OO;
            }
        }

        public OooO00o() {
        }

        public OooO00o(C7434o0OOoOo o0ooooo, String str, int i) {
            this.f20243OooO00o = o0ooooo;
            this.o00oO0O = 0;
            if (o0ooooo.m19030OooO00o().OooOO0O()) {
                C7432o0OOoOO.this.OooO00o(o0ooooo.m19031OooO00o());
            }
            this.f20246o0ooOOo = OooO00o(o0ooooo, str, i);
        }

        private boolean OooO00o(Iterator it) {
            C7432o0OOoOO o0ooooo = C7432o0OOoOO.this;
            if (o0ooooo.OooO0O0) {
                o0ooooo.OooO0O0 = false;
                this.OooO0O0 = Collections.EMPTY_LIST.iterator();
            }
            if (!this.OooO0O0.hasNext() && it.hasNext()) {
                int i = this.o0ooOO0 + 1;
                this.o0ooOO0 = i;
                this.OooO0O0 = new OooO00o((C7434o0OOoOo) it.next(), this.f20246o0ooOOo, i);
            }
            if (!this.OooO0O0.hasNext()) {
                return false;
            }
            this.f20244OooO00o = (AbstractC7454o0Oo0O) this.OooO0O0.next();
            return true;
        }

        public AbstractC7454o0Oo0O OooO00o() {
            return this.f20244OooO00o;
        }

        public AbstractC7454o0Oo0O OooO00o(C7434o0OOoOo o0ooooo, String str, String str2) {
            return new C4967OooO00o(o0ooooo, str, str2, o0ooooo.m19030OooO00o().OooOO0O() ? null : o0ooooo.m19037OooO0O0());
        }

        public String OooO00o(C7434o0OOoOo o0ooooo, String str, int i) {
            String str2;
            String str3;
            if (o0ooooo.m19029OooO00o() == null || o0ooooo.m19030OooO00o().OooOO0O()) {
                return null;
            }
            if (o0ooooo.m19029OooO00o().m19030OooO00o().OooO0Oo()) {
                str3 = "[" + String.valueOf(i) + "]";
                str2 = "";
            } else {
                str3 = o0ooooo.m19031OooO00o();
                str2 = C8932ooOOO0o.OooO0OO;
            }
            if (str == null || str.length() == 0) {
                return str3;
            }
            if (C7432o0OOoOO.this.OooO00o().m19072OooO0O0()) {
                return !str3.startsWith(C8932ooOOO0o.f22176OooO00o) ? str3 : str3.substring(1);
            }
            return str + str2 + str3;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Iterator m19003OooO00o() {
            return this.f20245OooO00o;
        }

        public void OooO00o(AbstractC7454o0Oo0O o0oo0o) {
            this.f20244OooO00o = o0oo0o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19004OooO00o(Iterator it) {
            this.f20245OooO00o = it;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m19005OooO00o() {
            this.o00oO0O = 1;
            if (this.f20243OooO00o.m19029OooO00o() == null || (C7432o0OOoOO.this.OooO00o().OooO0OO() && this.f20243OooO00o.OooO0o())) {
                return hasNext();
            }
            this.f20244OooO00o = OooO00o(this.f20243OooO00o, C7432o0OOoOO.this.m19001OooO00o(), this.f20246o0ooOOo);
            return true;
        }

        public boolean hasNext() {
            if (this.f20244OooO00o != null) {
                return true;
            }
            int i = this.o00oO0O;
            if (i == 0) {
                return m19005OooO00o();
            }
            if (i == 1) {
                if (this.f20245OooO00o == null) {
                    this.f20245OooO00o = this.f20243OooO00o.m19032OooO00o();
                }
                boolean OooO00o2 = OooO00o(this.f20245OooO00o);
                if (OooO00o2 || !this.f20243OooO00o.OooO0oO() || C7432o0OOoOO.this.OooO00o().OooO0Oo()) {
                    return OooO00o2;
                }
                this.o00oO0O = 2;
                this.f20245OooO00o = null;
                return hasNext();
            }
            if (this.f20245OooO00o == null) {
                this.f20245OooO00o = this.f20243OooO00o.m19038OooO0O0();
            }
            return OooO00o(this.f20245OooO00o);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                AbstractC7454o0Oo0O o0oo0o = this.f20244OooO00o;
                this.f20244OooO00o = null;
                return o0oo0o;
            }
            throw new NoSuchElementException("There are no more nodes to return");
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.pd.sdk.o0OOoOO$OooO0O0 */
    public class OooO0O0 extends OooO00o {
        public Iterator OooO0OO;
        public int o0Oo0oo = 0;
        public String o0ooOoO;

        public OooO0O0(C7434o0OOoOo o0ooooo, String str) {
            super();
            if (o0ooooo.m19030OooO00o().OooOO0O()) {
                C7432o0OOoOO.this.OooO00o(o0ooooo.m19031OooO00o());
            }
            this.o0ooOoO = OooO00o(o0ooooo, str, 1);
            this.OooO0OO = o0ooooo.m19032OooO00o();
        }

        @Override // com.p118pd.sdk.C7432o0OOoOO.OooO00o
        public boolean hasNext() {
            if (OooO00o() != null) {
                return true;
            }
            if (C7432o0OOoOO.this.OooO0O0 || !this.OooO0OO.hasNext()) {
                return false;
            }
            C7434o0OOoOo o0ooooo = (C7434o0OOoOo) this.OooO0OO.next();
            this.o0Oo0oo++;
            String str = null;
            if (o0ooooo.m19030OooO00o().OooOO0O()) {
                C7432o0OOoOO.this.OooO00o(o0ooooo.m19031OooO00o());
            } else if (o0ooooo.m19029OooO00o() != null) {
                str = OooO00o(o0ooooo, this.o0ooOoO, this.o0Oo0oo);
            }
            if (C7432o0OOoOO.this.OooO00o().OooO0OO() && o0ooooo.OooO0o()) {
                return hasNext();
            }
            OooO00o(OooO00o(o0ooooo, C7432o0OOoOO.this.m19001OooO00o(), str));
            return true;
        }
    }

    public C7432o0OOoOO(C7433o0OOoOOO o0oooooo, String str, String str2, C7452o0Oo00oO o0oo00oo) throws XMPException {
        C7434o0OOoOo o0ooooo;
        String str3 = null;
        this.OooO00o = o0oo00oo == null ? new C7452o0Oo00oO() : o0oo00oo;
        boolean z = str != null && str.length() > 0;
        boolean z2 = str2 != null && str2.length() > 0;
        if (!z && !z2) {
            o0ooooo = o0oooooo.m19008OooO00o();
        } else if (z && z2) {
            C7445o0OOooo0 OooO00o2 = C7444o0OOooo.OooO00o(str, str2);
            C7445o0OOooo0 o0ooooo0 = new C7445o0OOooo0();
            for (int i = 0; i < OooO00o2.OooO00o() - 1; i++) {
                o0ooooo0.OooO00o(OooO00o2.OooO00o(i));
            }
            o0ooooo = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), OooO00o2, false, (C7710o0ooO0O0) null);
            this.o0ooOOo = str;
            str3 = o0ooooo0.toString();
        } else if (!z || z2) {
            throw new XMPException("Schema namespace URI is required", 101);
        } else {
            o0ooooo = C7437o0OOoo0.OooO0OO(o0oooooo.m19008OooO00o(), str, false);
        }
        if (o0ooooo != null) {
            this.f20242OooO00o = !this.OooO00o.OooO00o() ? new OooO00o(o0ooooo, str3, 1) : new OooO0O0(o0ooooo, str3);
        } else {
            this.f20242OooO00o = Collections.EMPTY_LIST.iterator();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7414o0OOOooo
    public C7452o0Oo00oO OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7414o0OOOooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19001OooO00o() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC7414o0OOOooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19002OooO00o() {
        OooO0O0();
        this.OooO0O0 = true;
    }

    public void OooO00o(String str) {
        this.o0ooOOo = str;
    }

    @Override // com.p118pd.sdk.AbstractC7414o0OOOooo
    public void OooO0O0() {
        this.OooO0OO = true;
    }

    public boolean hasNext() {
        return this.f20242OooO00o.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f20242OooO00o.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
