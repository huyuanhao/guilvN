package com.qiyukf.unicorn.p213f.p214a.p220d;

import android.content.Context;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2552c;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.qiyukf.unicorn.p232k.C2700f;

@AbstractC2549b(mo35941a = 65)
/* renamed from: com.qiyukf.unicorn.f.a.d.p */
public class C2581p extends AbstractC2597e implements AbstractC2552c {
    @AbstractC2548a(mo35940a = "content")

    /* renamed from: a */
    public String f5230a;

    /* renamed from: a */
    public static C2581p m5811a(String str, String str2) {
        String str3 = "<img src=\"" + str + "\" title=\"" + str2 + "\">";
        C2581p pVar = new C2581p();
        pVar.f5230a = str3;
        return pVar;
    }

    /* renamed from: a */
    public final String mo36069a() {
        return this.f5230a;
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2552c
    /* renamed from: a */
    public final String mo35923a(Context context) {
        return C2700f.m6245a(this.f5230a);
    }

    /* renamed from: a */
    public final void mo36070a(String str) {
        this.f5230a = str;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public boolean countToUnread() {
        return true;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return C2700f.m6245a(this.f5230a).replace("\n", " ");
    }
}
