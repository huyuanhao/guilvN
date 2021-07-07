package com.qiyukf.unicorn.p212e;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;

/* renamed from: com.qiyukf.unicorn.e.b */
public final class C2466b implements AbstractC2498a {
    @AbstractC2548a(mo35940a = ConnType.PK_OPEN)

    /* renamed from: a */
    public int f4857a;
    @AbstractC2548a(mo35940a = "dialogColor")

    /* renamed from: b */
    public String f4858b;
    @AbstractC2548a(mo35940a = "audioSwitch")

    /* renamed from: c */
    public int f4859c;
    @AbstractC2548a(mo35940a = "emojiSwitch")

    /* renamed from: d */
    public int f4860d;
    @AbstractC2548a(mo35940a = "placeHolder")

    /* renamed from: e */
    public String f4861e;
    @AbstractC2548a(mo35940a = "staffPortraitPosition")

    /* renamed from: f */
    public int f4862f;

    /* renamed from: a */
    public final int mo35689a() {
        return this.f4857a;
    }

    /* renamed from: b */
    public final String mo35690b() {
        return TextUtils.isEmpty(this.f4858b) ? "#337EFF" : this.f4858b;
    }

    /* renamed from: c */
    public final int mo35691c() {
        return this.f4859c;
    }

    /* renamed from: d */
    public final int mo35692d() {
        return this.f4860d;
    }

    /* renamed from: e */
    public final String mo35693e() {
        return this.f4861e;
    }

    /* renamed from: f */
    public final int mo35694f() {
        return this.f4862f;
    }
}
