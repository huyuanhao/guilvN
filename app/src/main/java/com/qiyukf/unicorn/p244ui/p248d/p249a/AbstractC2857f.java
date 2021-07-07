package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnBotEventListener;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2545c;
import com.qiyukf.unicorn.widget.p251a.C3021g;

/* renamed from: com.qiyukf.unicorn.ui.d.a.f */
public abstract class AbstractC2857f extends AbstractC2083b {
    /* renamed from: a */
    public abstract void mo36692a();

    /* renamed from: a */
    public final void mo36699a(String str) {
        OnBotEventListener onBotEventListener = C2452d.m5373e().onBotEventListener;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("tel:") && str.length() > 4) {
                final String substring = str.substring(4);
                C3021g.m7057a(this.context, (CharSequence) null, new CharSequence[]{this.context.getString(C2364R.string.ysf_call_str), this.context.getString(C2364R.string.ysf_copy_phone_str), this.context.getString(C2364R.string.ysf_cancel)}, new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f.C28581 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        if (i == 0) {
                            try {
                                AbstractC2857f.this.context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + substring)));
                            } catch (SecurityException unused) {
                                C1865f.m3555a(C2364R.string.ysf_go_call_error);
                            }
                        } else if (i == 1) {
                            try {
                                ((ClipboardManager) AbstractC2857f.this.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", substring));
                                C1865f.m3555a(C2364R.string.ysf_copy_phone_success_str);
                            } catch (Exception unused2) {
                                C1865f.m3555a(C2364R.string.ysf_copy_phone_error_str);
                            }
                        }
                    }
                });
            } else if (onBotEventListener != null) {
                onBotEventListener.onUrlClick(this.context, str);
            }
        }
    }

    /* renamed from: a */
    public void mo36700a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo36701a(String str, String str2, String str3) {
        C2545c cVar = new C2545c();
        cVar.mo35934a(str3);
        C2374b bVar = new C2374b();
        if (str == null) {
            str = "";
        }
        bVar.mo35239a(str);
        if (str2 == null) {
            str2 = "";
        }
        bVar.mo35241b(str2);
        bVar.mo35240a(cVar.mo35935c());
        cVar.mo35276a(bVar);
        getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(this.message.getSessionId(), SessionTypeEnum.Ysf, cVar));
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final void bindContentView() {
        if (mo36702e() && this.contentContainer.getChildCount() == 1) {
            this.contentContainer.getChildAt(0).setBackgroundResource(isReceivedMessage() ? mo36696c() : mo36697d());
        }
        mo36692a();
    }

    /* renamed from: c */
    public int mo36696c() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgRobotItemBackgroundLeft) <= 0) ? C2364R.C2366drawable.ysf_message_left_bg_no_padding_selector : i;
    }

    /* renamed from: d */
    public int mo36697d() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgRobotItemBackgroundRight) <= 0) ? C2364R.C2366drawable.ysf_message_right_bg_no_padding_selector : i;
    }

    /* renamed from: e */
    public boolean mo36702e() {
        return true;
    }

    /* renamed from: f */
    public void mo36703f() {
    }

    /* renamed from: g */
    public final boolean mo36704g() {
        if (this.message == null) {
            return true;
        }
        C2474i b = C2452d.m5375g().mo36345b(this.message.getSessionId());
        return (b != null && b.f4891f) || C2452d.m5375g().mo36351d(this.message.getSessionId()) == null || C2452d.m5375g().mo36355f(this.message.getSessionId()) != 0 || C2452d.m5375g().mo36349c(this.message.getSessionId()) == getMsgSessionId();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final int rightBackground() {
        return 0;
    }
}
