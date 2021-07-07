package com.qiyukf.unicorn.api.customization.msg_list.baseviewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.p229h.C2667c;
import org.json.JSONObject;

public abstract class TextViewHolderBase extends UnicornMessageViewHolder {
    @Override // com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public final void bindContentView(IMMessage iMMessage, Context context) {
        String str;
        SpannableStringBuilder a = C2015e.m4002a(context, C2667c.m6114a(iMMessage) == 2 ? C1990f.m3947a(context, iMMessage.getContent(), iMMessage.getSessionId()) : C1990f.m3945a(context, iMMessage.getContent()));
        JSONObject f = C1810b.m3433f(iMMessage.getExtension(), "action");
        String str2 = null;
        if (f != null) {
            str2 = !TextUtils.isEmpty(C1810b.m3432e(f, "label")) ? C1810b.m3432e(f, "label") : "知道了";
            str = C1810b.m3432e(f, "url");
        } else {
            str = null;
        }
        bindTextMsgView(context, a, str2, str);
    }

    public abstract void bindTextMsgView(Context context, CharSequence charSequence, String str, String str2);
}
