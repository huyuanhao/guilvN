package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 6)
/* renamed from: com.qiyukf.unicorn.f.a.d.t */
public class C2590t extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "sessionid")

    /* renamed from: a */
    public long f5260a;
    @AbstractC2548a(mo35940a = "evaluate")

    /* renamed from: b */
    public int f5261b;
    @AbstractC2548a(mo35940a = "evaluation_auto_popup")

    /* renamed from: c */
    public int f5262c;
    @AbstractC2548a(mo35940a = "message")

    /* renamed from: d */
    public String f5263d;
    @AbstractC2548a(mo35940a = "close_reason")

    /* renamed from: e */
    public int f5264e;
    @AbstractC2548a(mo35940a = "richmessage")

    /* renamed from: f */
    public String f5265f;
    @AbstractC2548a(mo35940a = "isclickrerequest")

    /* renamed from: g */
    public boolean f5266g = false;
    @AbstractC2548a(mo35940a = "messageInvite")

    /* renamed from: h */
    public String f5267h;

    /* renamed from: a */
    public final long mo36103a() {
        return this.f5260a;
    }

    /* renamed from: b */
    public final int mo36104b() {
        return this.f5261b;
    }

    /* renamed from: c */
    public final boolean mo36105c() {
        return this.f5262c == 1;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    /* renamed from: d */
    public final String mo36106d() {
        return this.f5263d;
    }

    /* renamed from: e */
    public final int mo36107e() {
        return this.f5264e;
    }

    /* renamed from: f */
    public final String mo36108f() {
        return TextUtils.isEmpty(this.f5265f) ? this.f5263d : this.f5265f;
    }

    /* renamed from: g */
    public final boolean mo36109g() {
        return this.f5266g;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return this.f5263d;
    }

    /* renamed from: h */
    public final void mo36110h() {
        this.f5266g = true;
    }

    /* renamed from: i */
    public final String mo36111i() {
        return this.f5267h;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2597e
    public JSONObject toJsonObject(boolean z) {
        C1810b.m3424a(super.toJsonObject(z), "isclickrerequest", Boolean.valueOf(this.f5266g));
        return super.toJsonObject(z);
    }
}
