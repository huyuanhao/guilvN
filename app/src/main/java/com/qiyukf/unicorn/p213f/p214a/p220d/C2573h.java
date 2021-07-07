package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;

@AbstractC2549b(mo35941a = 89758)
/* renamed from: com.qiyukf.unicorn.f.a.d.h */
public class C2573h extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "content")

    /* renamed from: a */
    public String f5214a;
    @AbstractC2548a(mo35940a = "status")

    /* renamed from: b */
    public boolean f5215b;

    /* renamed from: a */
    public final String mo36050a() {
        return this.f5214a;
    }

    /* renamed from: a */
    public final void mo36051a(String str) {
        this.f5214a = str;
    }

    /* renamed from: b */
    public final boolean mo36052b() {
        return this.f5215b;
    }

    /* renamed from: c */
    public final void mo36053c() {
        this.f5215b = true;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return false;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return this.f5214a;
    }
}
