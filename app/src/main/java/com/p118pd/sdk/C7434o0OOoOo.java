package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.pd.sdk.o0OOoOo  reason: case insensitive filesystem */
public class C7434o0OOoOo implements Comparable {
    public static final /* synthetic */ boolean OooO0o = false;
    public C7434o0OOoOo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7710o0ooO0O0 f20253OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f20254OooO00o;
    public List OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20255OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;
    public String o0ooOOo;
    public String o0ooOoO;

    /* renamed from: com.pd.sdk.o0OOoOo$OooO00o */
    public class OooO00o implements Iterator {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Iterator f20256OooO00o;

        public OooO00o(Iterator it) {
            this.f20256OooO00o = it;
        }

        public boolean hasNext() {
            return this.f20256OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f20256OooO00o.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
        }
    }

    public C7434o0OOoOo(String str, C7710o0ooO0O0 o0ooo0o0) {
        this(str, null, o0ooo0o0);
    }

    public C7434o0OOoOo(String str, String str2, C7710o0ooO0O0 o0ooo0o0) {
        this.f20254OooO00o = null;
        this.OooO0O0 = null;
        this.f20253OooO00o = null;
        this.o0ooOOo = str;
        this.o0ooOoO = str2;
        this.f20253OooO00o = o0ooo0o0;
    }

    private C7434o0OOoOo OooO00o(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7434o0OOoOo o0ooooo = (C7434o0OOoOo) it.next();
            if (o0ooooo.m19031OooO00o().equals(str)) {
                return o0ooooo;
            }
        }
        return null;
    }

    private void OooO00o(StringBuffer stringBuffer, boolean z, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            stringBuffer.append('\t');
        }
        if (this.OooO00o != null) {
            if (m19030OooO00o().OooOO0()) {
                stringBuffer.append('?');
            } else if (m19029OooO00o().m19030OooO00o().OooO0Oo()) {
                stringBuffer.append('[');
                stringBuffer.append(i2);
                stringBuffer.append(']');
            }
            stringBuffer.append(this.o0ooOOo);
        } else {
            stringBuffer.append("ROOT NODE");
            String str = this.o0ooOOo;
            if (str != null && str.length() > 0) {
                stringBuffer.append(" (");
                stringBuffer.append(this.o0ooOOo);
                stringBuffer.append(')');
            }
        }
        String str2 = this.o0ooOoO;
        if (str2 != null && str2.length() > 0) {
            stringBuffer.append(" = \"");
            stringBuffer.append(this.o0ooOoO);
            stringBuffer.append(C8318oOo0oooo.OooO00o);
        }
        if (m19030OooO00o().m19079OooO0O0(-1)) {
            stringBuffer.append("\t(");
            stringBuffer.append(m19030OooO00o().toString());
            stringBuffer.append(" : ");
            stringBuffer.append(m19030OooO00o().m19074OooO00o());
            stringBuffer.append(')');
        }
        stringBuffer.append('\n');
        if (z && OooO0oO()) {
            C7434o0OOoOo[] o0oooooArr = (C7434o0OOoOo[]) OooO0OO().toArray(new C7434o0OOoOo[m19041OooO0OO()]);
            int i5 = 0;
            while (o0oooooArr.length > i5 && (AbstractC7410o0OOOoOo.Ooooooo.equals(o0oooooArr[i5].m19031OooO00o()) || AbstractC7410o0OOOoOo.o0OoOo0.equals(o0oooooArr[i5].m19031OooO00o()))) {
                i5++;
            }
            Arrays.sort(o0oooooArr, i5, o0oooooArr.length);
            int i6 = 0;
            while (i6 < o0oooooArr.length) {
                i6++;
                o0oooooArr[i6].OooO00o(stringBuffer, z, i + 2, i6);
            }
        }
        if (z && OooO0o()) {
            C7434o0OOoOo[] o0oooooArr2 = (C7434o0OOoOo[]) OooO0O0().toArray(new C7434o0OOoOo[OooO00o()]);
            if (!m19030OooO00o().OooO0Oo()) {
                Arrays.sort(o0oooooArr2);
            }
            while (i3 < o0oooooArr2.length) {
                i3++;
                o0oooooArr2[i3].OooO00o(stringBuffer, z, i + 1, i3);
            }
        }
    }

    private List OooO0O0() {
        if (this.f20254OooO00o == null) {
            this.f20254OooO00o = new ArrayList(0);
        }
        return this.f20254OooO00o;
    }

    private List OooO0OO() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new ArrayList(0);
        }
        return this.OooO0O0;
    }

    private void OooO0OO(String str) throws XMPException {
        if (!"[]".equals(str) && OooO00o(str) != null) {
            throw new XMPException("Duplicate property or field node '" + str + "'", 203);
        }
    }

    private void OooO0Oo(String str) throws XMPException {
        if (!"[]".equals(str) && OooO0O0(str) != null) {
            throw new XMPException("Duplicate '" + str + "' qualifier", 203);
        }
    }

    private boolean OooOO0() {
        return AbstractC7410o0OOOoOo.Ooooooo.equals(this.o0ooOOo);
    }

    private boolean OooOO0O() {
        return AbstractC7410o0OOOoOo.o0OoOo0.equals(this.o0ooOOo);
    }

    public boolean OooO() {
        return this.f20255OooO0O0;
    }

    public int OooO00o() {
        List list = this.f20254OooO00o;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7434o0OOoOo m19029OooO00o() {
        return this.OooO00o;
    }

    public C7434o0OOoOo OooO00o(int i) {
        return (C7434o0OOoOo) OooO0O0().get(i - 1);
    }

    public C7434o0OOoOo OooO00o(String str) {
        return OooO00o(OooO0O0(), str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7710o0ooO0O0 m19030OooO00o() {
        if (this.f20253OooO00o == null) {
            this.f20253OooO00o = new C7710o0ooO0O0();
        }
        return this.f20253OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19031OooO00o() {
        return this.o0ooOOo;
    }

    public String OooO00o(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(512);
        OooO00o(stringBuffer, z, 0, 0);
        return stringBuffer.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterator m19032OooO00o() {
        return this.f20254OooO00o != null ? OooO0O0().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m19033OooO00o() {
        return Collections.unmodifiableList(new ArrayList(OooO0O0()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19034OooO00o() {
        if (this.f20254OooO00o.isEmpty()) {
            this.f20254OooO00o = null;
        }
    }

    public void OooO00o(int i, C7434o0OOoOo o0ooooo) throws XMPException {
        OooO0OO(o0ooooo.m19031OooO00o());
        o0ooooo.OooO0o(this);
        OooO0O0().add(i - 1, o0ooooo);
    }

    public void OooO00o(C7434o0OOoOo o0ooooo) throws XMPException {
        OooO0OO(o0ooooo.m19031OooO00o());
        o0ooooo.OooO0o(this);
        OooO0O0().add(o0ooooo);
    }

    public void OooO00o(C7710o0ooO0O0 o0ooo0o0) {
        this.f20253OooO00o = o0ooo0o0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19035OooO00o(String str) {
        this.o0ooOOo = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19036OooO00o(boolean z) {
        this.OooO0Oo = z;
    }

    public C7434o0OOoOo OooO0O0(int i) {
        return (C7434o0OOoOo) OooO0OO().get(i - 1);
    }

    public C7434o0OOoOo OooO0O0(String str) {
        return OooO00o(this.OooO0O0, str);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19037OooO0O0() {
        return this.o0ooOoO;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Iterator m19038OooO0O0() {
        return this.OooO0O0 != null ? new OooO00o(OooO0OO().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19039OooO0O0() {
        this.f20253OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f20254OooO00o = null;
        this.OooO0O0 = null;
    }

    public void OooO0O0(int i, C7434o0OOoOo o0ooooo) {
        o0ooooo.OooO0o(this);
        OooO0O0().set(i - 1, o0ooooo);
    }

    public void OooO0O0(C7434o0OOoOo o0ooooo) throws XMPException {
        List OooO0OO2;
        boolean OooO00o2;
        OooO0Oo(o0ooooo.m19031OooO00o());
        o0ooooo.OooO0o(this);
        o0ooooo.m19030OooO00o().OooO0oo(true);
        m19030OooO00o().OooO0o(true);
        if (o0ooooo.OooOO0()) {
            this.f20253OooO00o.OooO0o0(true);
            OooO0OO2 = OooO0OO();
            OooO00o2 = false;
        } else if (o0ooooo.OooOO0O()) {
            this.f20253OooO00o.OooO0oO(true);
            OooO0OO2 = OooO0OO();
            OooO00o2 = this.f20253OooO00o.OooO00o();
        } else {
            OooO0OO().add(o0ooooo);
            return;
        }
        int i = OooO00o2 ? 1 : 0;
        int i2 = OooO00o2 ? 1 : 0;
        int i3 = OooO00o2 ? 1 : 0;
        OooO0OO2.add(i, o0ooooo);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19040OooO0O0(String str) {
        this.o0ooOoO = str;
    }

    public void OooO0O0(boolean z) {
        this.OooO0OO = z;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m19041OooO0OO() {
        List list = this.OooO0O0;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m19042OooO0OO() {
        this.f20254OooO00o = null;
    }

    public void OooO0OO(C7434o0OOoOo o0ooooo) {
        try {
            Iterator OooO00o2 = m19032OooO00o();
            while (OooO00o2.hasNext()) {
                o0ooooo.OooO00o((C7434o0OOoOo) ((C7434o0OOoOo) OooO00o2.next()).clone());
            }
            Iterator OooO0O02 = m19038OooO0O0();
            while (OooO0O02.hasNext()) {
                o0ooooo.OooO0O0((C7434o0OOoOo) ((C7434o0OOoOo) OooO0O02.next()).clone());
            }
        } catch (XMPException unused) {
        }
    }

    public void OooO0OO(boolean z) {
        this.OooO0o0 = z;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m19043OooO0OO() {
        return this.OooO0OO;
    }

    public void OooO0Oo() {
        C7710o0ooO0O0 OooO00o2 = m19030OooO00o();
        OooO00o2.OooO0o(false);
        OooO00o2.OooO0o0(false);
        OooO00o2.OooO0oO(false);
        this.OooO0O0 = null;
    }

    public void OooO0Oo(C7434o0OOoOo o0ooooo) {
        OooO0O0().remove(o0ooooo);
        m19034OooO00o();
    }

    public void OooO0Oo(boolean z) {
        this.f20255OooO0O0 = z;
    }

    public void OooO0o(int i) {
        OooO0O0().remove(i - 1);
        m19034OooO00o();
    }

    public void OooO0o(C7434o0OOoOo o0ooooo) {
        this.OooO00o = o0ooooo;
    }

    public boolean OooO0o() {
        List list = this.f20254OooO00o;
        return list != null && list.size() > 0;
    }

    public void OooO0o0() {
        if (OooO0oO()) {
            C7434o0OOoOo[] o0oooooArr = (C7434o0OOoOo[]) OooO0OO().toArray(new C7434o0OOoOo[m19041OooO0OO()]);
            int i = 0;
            while (o0oooooArr.length > i && (AbstractC7410o0OOOoOo.Ooooooo.equals(o0oooooArr[i].m19031OooO00o()) || AbstractC7410o0OOOoOo.o0OoOo0.equals(o0oooooArr[i].m19031OooO00o()))) {
                o0oooooArr[i].OooO0o0();
                i++;
            }
            Arrays.sort(o0oooooArr, i, o0oooooArr.length);
            ListIterator listIterator = this.OooO0O0.listIterator();
            for (int i2 = 0; i2 < o0oooooArr.length; i2++) {
                listIterator.next();
                listIterator.set(o0oooooArr[i2]);
                o0oooooArr[i2].OooO0o0();
            }
        }
        if (OooO0o()) {
            if (!m19030OooO00o().OooO0Oo()) {
                Collections.sort(this.f20254OooO00o);
            }
            Iterator OooO00o2 = m19032OooO00o();
            while (OooO00o2.hasNext()) {
                ((C7434o0OOoOo) OooO00o2.next()).OooO0o0();
            }
        }
    }

    public void OooO0o0(C7434o0OOoOo o0ooooo) {
        C7710o0ooO0O0 OooO00o2 = m19030OooO00o();
        if (o0ooooo.OooOO0()) {
            OooO00o2.OooO0o0(false);
        } else if (o0ooooo.OooOO0O()) {
            OooO00o2.OooO0oO(false);
        }
        OooO0OO().remove(o0ooooo);
        if (this.OooO0O0.isEmpty()) {
            OooO00o2.OooO0o(false);
            this.OooO0O0 = null;
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m19044OooO0o0() {
        return this.OooO0o0;
    }

    public boolean OooO0oO() {
        List list = this.OooO0O0;
        return list != null && list.size() > 0;
    }

    public boolean OooO0oo() {
        return this.OooO0Oo;
    }

    @Override // java.lang.Object
    public Object clone() {
        C7710o0ooO0O0 o0ooo0o0;
        try {
            o0ooo0o0 = new C7710o0ooO0O0(m19030OooO00o().m19073OooO00o());
        } catch (XMPException unused) {
            o0ooo0o0 = new C7710o0ooO0O0();
        }
        C7434o0OOoOo o0ooooo = new C7434o0OOoOo(this.o0ooOOo, this.o0ooOoO, o0ooo0o0);
        OooO0OO(o0ooooo);
        return o0ooooo;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        String OooO00o2;
        if (m19030OooO00o().OooOO0O()) {
            str = this.o0ooOoO;
            OooO00o2 = ((C7434o0OOoOo) obj).m19037OooO0O0();
        } else {
            str = this.o0ooOOo;
            OooO00o2 = ((C7434o0OOoOo) obj).m19031OooO00o();
        }
        return str.compareTo(OooO00o2);
    }
}
