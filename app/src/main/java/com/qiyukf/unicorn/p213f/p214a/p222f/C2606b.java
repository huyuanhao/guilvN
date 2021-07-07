package com.qiyukf.unicorn.p213f.p214a.p222f;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;

@AbstractC2549b(mo35941a = 26)
/* renamed from: com.qiyukf.unicorn.f.a.f.b */
public class C2606b extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "sessionid")

    /* renamed from: a */
    public long f5317a;
    @AbstractC2548a(mo35940a = "message")

    /* renamed from: b */
    public String f5318b;

    /* renamed from: a */
    public final void mo36153a(long j) {
        this.f5317a = j;
    }

    /* renamed from: a */
    public final void mo36154a(String str) {
        this.f5318b = str;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        if (!TextUtils.isEmpty(this.f5318b)) {
            return this.f5318b;
        }
        return "[" + context.getString(C2364R.string.ysf_msg_quit_session_tips) + "]";
    }
}
