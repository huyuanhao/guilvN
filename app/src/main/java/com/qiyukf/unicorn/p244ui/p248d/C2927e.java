package com.qiyukf.unicorn.p244ui.p248d;

import android.view.View;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2573h;
import com.qiyukf.unicorn.p232k.C2700f;

/* renamed from: com.qiyukf.unicorn.ui.d.e */
public class C2927e extends AbstractC2924c {
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2924c, com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        super.bindContentView();
        final C2573h hVar = (C2573h) this.message.getAttachment();
        C2700f.m6246a(this.f6315a, hVar.mo36050a(), C1862c.m3540a(202.0f), this.message.getSessionId());
        this.f6317c.setText(hVar.mo36050a());
        if (hVar.mo36052b()) {
            this.f6317c.setEnabled(false);
            this.f6317c.setTextColor(this.context.getResources().getColor(C2364R.C2365color.ysf_grey_999999));
            this.f6317c.setText(this.context.getString(C2364R.string.ysf_cancel_in_queue));
            return;
        }
        this.f6317c.setEnabled(true);
        this.f6317c.setTextColor(this.context.getResources().getColor(C2364R.C2365color.ysf_grey_666666));
        this.f6317c.setText(this.context.getString(C2364R.string.ysf_cancel_in_queue));
        this.f6317c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2927e.View$OnClickListenerC29281 */

            public final void onClick(View view) {
                if (C2927e.this.getAdapter().mo34517d() != null) {
                    hVar.mo36053c();
                    C2927e.this.getAdapter().mo34517d().mo34519a();
                    ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(C2927e.this.message, true);
                }
            }
        });
    }
}
