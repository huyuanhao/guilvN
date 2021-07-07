package com.p118pd.sdk;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.丨Lil  reason: invalid class name and case insensitive filesystem */
public class C9511Lil implements PolicyNode {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23088OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PolicyNode f23089OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f23090OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set f23091OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23092OooO00o;
    public Set OooO0O0;

    public C9511Lil(List list, int i, Set set, PolicyNode policyNode, Set set2, String str, boolean z) {
        this.f23090OooO00o = list;
        this.OooO00o = i;
        this.f23091OooO00o = set;
        this.f23089OooO00o = policyNode;
        this.OooO0O0 = set2;
        this.f23088OooO00o = str;
        this.f23092OooO00o = z;
    }

    public C9511Lil OooO00o() {
        HashSet hashSet = new HashSet();
        for (String str : this.f23091OooO00o) {
            hashSet.add(new String(str));
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.OooO0O0) {
            hashSet2.add(new String(str2));
        }
        C9511Lil r8 = new C9511Lil(new ArrayList(), this.OooO00o, hashSet, null, hashSet2, new String(this.f23088OooO00o), this.f23092OooO00o);
        for (C9511Lil r1 : this.f23090OooO00o) {
            C9511Lil OooO00o2 = r1.OooO00o();
            OooO00o2.OooO0OO(r8);
            r8.OooO00o(OooO00o2);
        }
        return r8;
    }

    public String OooO00o(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.f23088OooO00o);
        stringBuffer.append(" {\n");
        for (int i = 0; i < this.f23090OooO00o.size(); i++) {
            stringBuffer.append(((C9511Lil) this.f23090OooO00o.get(i)).OooO00o(str + C9878I1.f23489OooO00o));
        }
        stringBuffer.append(str);
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public void OooO00o(C9511Lil r2) {
        this.f23090OooO00o.add(r2);
        r2.OooO0OO(this);
    }

    public void OooO00o(Set set) {
        this.f23091OooO00o = set;
    }

    public void OooO00o(boolean z) {
        this.f23092OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21574OooO00o() {
        return !this.f23090OooO00o.isEmpty();
    }

    public void OooO0O0(C9511Lil r2) {
        this.f23090OooO00o.remove(r2);
    }

    public void OooO0OO(C9511Lil r1) {
        this.f23089OooO00o = r1;
    }

    @Override // java.lang.Object
    public Object clone() {
        return OooO00o();
    }

    @Override // java.security.cert.PolicyNode
    public Iterator getChildren() {
        return this.f23090OooO00o.iterator();
    }

    public int getDepth() {
        return this.OooO00o;
    }

    @Override // java.security.cert.PolicyNode
    public Set getExpectedPolicies() {
        return this.f23091OooO00o;
    }

    public PolicyNode getParent() {
        return this.f23089OooO00o;
    }

    @Override // java.security.cert.PolicyNode
    public Set getPolicyQualifiers() {
        return this.OooO0O0;
    }

    public String getValidPolicy() {
        return this.f23088OooO00o;
    }

    public boolean isCritical() {
        return this.f23092OooO00o;
    }

    public String toString() {
        return OooO00o("");
    }
}
