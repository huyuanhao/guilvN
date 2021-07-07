package com.p118pd.sdk;

import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.entity.BodyHandlerEntry;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO000  reason: case insensitive filesystem */
public class C7362o0OO000 implements AbstractC7322o0O0OooO {
    public int OooO00o = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BodyEntry f20103OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20104OooO00o;
    @Deprecated

    /* renamed from: OooO00o  reason: collision with other field name */
    public URI f20105OooO00o;
    @Deprecated

    /* renamed from: OooO00o  reason: collision with other field name */
    public URL f20106OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC7323o0O0Oooo> f20107OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f20108OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20109OooO00o = true;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f20110OooO0O0 = "GET";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<AbstractC7320o0O0Ooo> f20111OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f20112OooO0OO = "utf-8";
    public String OooO0Oo;
    public String OooO0o0;

    public C7362o0OO000() {
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7318o0O0OoO0 m18865OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public URI m18867OooO00o() {
        URI uri = this.f20105OooO00o;
        if (uri != null) {
            return uri;
        }
        if (this.f20104OooO00o != null) {
            try {
                this.f20105OooO00o = new URI(this.f20104OooO00o);
            } catch (Exception e) {
                ALog.m288e("anet.RequestImpl", "uri error", this.OooO0o0, e, new Object[0]);
            }
        }
        return this.f20105OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List<AbstractC7323o0O0Oooo> m18875OooO0O0() {
        return this.f20107OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0OO(String str) {
        this.f20112OooO0OO = str;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    public void OooO0Oo(int i) {
        this.OooO0Oo = String.valueOf(i);
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public String getMethod() {
        return this.f20110OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public int getReadTimeout() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0O0(List<AbstractC7323o0O0Oooo> list) {
        this.f20107OooO00o = list;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0OO(int i) {
        this.OooO0OO = i;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0Oo(String str) {
        this.OooO0Oo = str;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0O0(String str, String str2) {
        if (str != null && str2 != null) {
            if (this.f20107OooO00o == null) {
                this.f20107OooO00o = new ArrayList();
            }
            this.f20107OooO00o.add(new C7359o0O0oooo(str, str2));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public String OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public String OooO0Oo() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    public void OooO00o(URI uri) {
        this.f20105OooO00o = uri;
    }

    @Deprecated
    public C7362o0OO000(URI uri) {
        this.f20105OooO00o = uri;
        this.f20104OooO00o = uri.toString();
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public URL m18868OooO00o() {
        URL url = this.f20106OooO00o;
        if (url != null) {
            return url;
        }
        if (this.f20104OooO00o != null) {
            try {
                this.f20106OooO00o = new URL(this.f20104OooO00o);
            } catch (Exception e) {
                ALog.m288e("anet.RequestImpl", "url error", this.OooO0o0, e, new Object[0]);
            }
        }
        return this.f20106OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0O0(AbstractC7323o0O0Oooo o0o0oooo) {
        List<AbstractC7323o0O0Oooo> list = this.f20107OooO00o;
        if (list != null) {
            list.remove(o0o0oooo);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    public int OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0O0(int i) {
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18874OooO0O0() {
        return this.f20112OooO0OO;
    }

    @Deprecated
    public void OooO00o(URL url) {
        this.f20106OooO00o = url;
        this.f20104OooO00o = url.toString();
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO0O0(String str) {
        this.OooO0o0 = str;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18876OooO0O0() {
        return !"false".equals(OooO00o(C7383o0OOO0O.OooO0Oo));
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18866OooO00o() {
        return this.f20104OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    @Deprecated
    public void OooO0O0(boolean z) {
        OooO00o(C7383o0OOO0O.OooO0Oo, z ? "true" : "false");
    }

    @Deprecated
    public C7362o0OO000(URL url) {
        this.f20106OooO00o = url;
        this.f20104OooO00o = url.toString();
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18872OooO00o() {
        return this.f20109OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(boolean z) {
        this.f20109OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(AbstractC7323o0O0Oooo o0o0oooo) {
        if (o0o0oooo != null) {
            if (this.f20107OooO00o == null) {
                this.f20107OooO00o = new ArrayList();
            }
            int i = 0;
            int size = this.f20107OooO00o.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (o0o0oooo.getName().equalsIgnoreCase(this.f20107OooO00o.get(i).getName())) {
                    this.f20107OooO00o.set(i, o0o0oooo);
                    break;
                }
                i++;
            }
            if (i < this.f20107OooO00o.size()) {
                this.f20107OooO00o.add(o0o0oooo);
            }
        }
    }

    public C7362o0OO000(String str) {
        this.f20104OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7323o0O0Oooo[] m18873OooO00o(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f20107OooO00o == null) {
            return null;
        }
        for (int i = 0; i < this.f20107OooO00o.size(); i++) {
            if (!(this.f20107OooO00o.get(i) == null || this.f20107OooO00o.get(i).getName() == null || !this.f20107OooO00o.get(i).getName().equalsIgnoreCase(str))) {
                arrayList.add(this.f20107OooO00o.get(i));
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC7323o0O0Oooo[] o0o0ooooArr = new AbstractC7323o0O0Oooo[arrayList.size()];
        arrayList.toArray(o0o0ooooArr);
        return o0o0ooooArr;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18871OooO00o(String str) {
        this.f20110OooO0O0 = str;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<AbstractC7320o0O0Ooo> m18869OooO00o() {
        return this.f20111OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(List<AbstractC7320o0O0Ooo> list) {
        this.f20111OooO0O0 = list;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BodyEntry m18864OooO00o() {
        return this.f20103OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(BodyEntry bodyEntry) {
        this.f20103OooO00o = bodyEntry;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(AbstractC7318o0O0OoO0 o0o0ooo0) {
        this.f20103OooO00o = new BodyHandlerEntry(o0o0ooo0);
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(int i) {
        this.OooO0O0 = i;
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO
    public void OooO00o(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f20108OooO00o == null) {
                this.f20108OooO00o = new HashMap();
            }
            this.f20108OooO00o.put(str, str2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    public String OooO00o(String str) {
        Map<String, String> map = this.f20108OooO00o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO, com.p118pd.sdk.AbstractC7322o0O0OooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m18870OooO00o() {
        return this.f20108OooO00o;
    }
}
