package com.qiyukf.unicorn.p213f.p214a.p222f;

import android.text.TextUtils;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;

@AbstractC2549b(mo35941a = 52)
/* renamed from: com.qiyukf.unicorn.f.a.f.c */
public final class C2607c extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "foreignid")

    /* renamed from: a */
    public String f5319a;
    @AbstractC2548a(mo35940a = "authToken")

    /* renamed from: b */
    public String f5320b;
    @AbstractC2548a(mo35940a = "userinfo")

    /* renamed from: c */
    public String f5321c;

    /* renamed from: a */
    public final void mo36155a(String str) {
        this.f5319a = str;
    }

    /* renamed from: b */
    public final void mo36156b(String str) {
        this.f5321c = str;
    }

    /* renamed from: c */
    public final void mo36157c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5320b = str;
    }
}
