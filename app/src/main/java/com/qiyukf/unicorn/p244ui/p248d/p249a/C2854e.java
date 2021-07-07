package com.qiyukf.unicorn.p244ui.p248d.p249a;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2369a;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;

/* renamed from: com.qiyukf.unicorn.ui.d.a.e */
public class C2854e extends AbstractC2857f {

    /* renamed from: a */
    public TextView f6069a;

    /* renamed from: b */
    public LinearLayout f6070b;

    /* renamed from: c */
    public Button f6071c;

    /* renamed from: d */
    public LinearLayout f6072d;

    /* renamed from: e */
    public C2504c f6073e;

    /* renamed from: f */
    public C2474i f6074f;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012f  */
    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36692a() {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p248d.p249a.C2854e.mo36692a():void");
    }

    /* renamed from: b */
    public final void mo36695b() {
        getAdapter().mo34518e().mo34506b();
        getAdapter().mo34518e().mo34504a(this.f6073e, this.message, new RequestCallback<String>() {
            /* class com.qiyukf.unicorn.p244ui.p248d.p249a.C2854e.C28562 */

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onException(Throwable th) {
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onFailed(int i) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final /* synthetic */ void onSuccess(String str) {
                if (C2854e.this.f6073e != null && C2854e.this.message != null) {
                    C2854e.this.f6073e.mo35779i();
                    ((C2369a) C2854e.this.f6073e.mo35275a()).mo35229a("hasCommit", true);
                    ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(C2854e.this.message, true);
                }
            }
        });
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: c */
    public final int mo36696c() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundLeft) <= 0) ? C2364R.C2366drawable.ysf_msg_back_left_selector : i;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.p249a.AbstractC2857f
    /* renamed from: d */
    public final int mo36697d() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundRight) <= 0) ? C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector : i;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_msg_holder_event_base;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6069a = (TextView) findViewById(C2364R.C2367id.ysf_tv_msg_event_base_title);
        this.f6071c = (Button) findViewById(C2364R.C2367id.ysf_btn_msg_event_base);
        this.f6070b = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_msg_event_base_btn_parent);
        this.f6072d = (LinearLayout) findViewById(C2364R.C2367id.ysf_divider_evaluation_event_line);
        this.f6069a.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
    }
}
