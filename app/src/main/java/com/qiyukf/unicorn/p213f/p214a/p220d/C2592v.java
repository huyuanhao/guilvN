package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;

@AbstractC2549b(mo35941a = 70)
/* renamed from: com.qiyukf.unicorn.f.a.d.v */
public class C2592v extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "sessionid")

    /* renamed from: a */
    public long f5271a;
    @AbstractC2548a(mo35940a = "message")

    /* renamed from: b */
    public String f5272b;
    @AbstractC2548a(mo35940a = "richmessage")

    /* renamed from: c */
    public String f5273c;

    /* renamed from: a */
    public final String mo36115a() {
        return this.f5273c;
    }

    /* renamed from: b */
    public final String mo36116b() {
        return this.f5272b;
    }

    /* renamed from: c */
    public final long mo36117c() {
        return this.f5271a;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return this.f5272b;
    }
}
