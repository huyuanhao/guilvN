package com.qiyukf.nim.uikit.session.emoji;

import com.qiyukf.unicorn.p212e.C2469e;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.h */
public final class C1994h implements Serializable {
    public static final long serialVersionUID = -81692490861539040L;

    /* renamed from: a */
    public String f3914a;

    /* renamed from: b */
    public String f3915b;

    /* renamed from: c */
    public int f3916c;

    /* renamed from: d */
    public transient List<C2469e.C2470a> f3917d;

    public C1994h(String str, String str2, List<C2469e.C2470a> list, int i) {
        this.f3914a = str;
        this.f3915b = str2;
        this.f3917d = list;
        this.f3916c = i;
    }

    /* renamed from: a */
    public final List<C2469e.C2470a> mo34433a() {
        return this.f3917d;
    }

    /* renamed from: b */
    public final boolean mo34434b() {
        List<C2469e.C2470a> list = this.f3917d;
        return list != null && list.size() > 0;
    }

    /* renamed from: c */
    public final String mo34435c() {
        return this.f3915b;
    }

    /* renamed from: d */
    public final int mo34436d() {
        return this.f3916c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1994h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return ((C1994h) obj).f3914a.equals(this.f3914a);
    }

    public final int hashCode() {
        return this.f3914a.hashCode();
    }
}
