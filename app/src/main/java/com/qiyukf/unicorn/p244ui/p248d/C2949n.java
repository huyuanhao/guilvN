package com.qiyukf.unicorn.p244ui.p248d;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2590t;
import com.qiyukf.unicorn.p232k.C2700f;

/* renamed from: com.qiyukf.unicorn.ui.d.n */
public class C2949n extends AbstractC2924c {
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2924c, com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        Resources resources;
        Button button;
        super.bindContentView();
        final C2590t tVar = (C2590t) this.message.getAttachment();
        C2700f.m6246a(this.f6315a, tVar.mo36108f(), C1862c.m3540a(202.0f), this.message.getSessionId());
        if (tVar.mo36109g()) {
            this.f6317c.setEnabled(false);
            button = this.f6317c;
            resources = this.context.getResources();
            i = C2364R.C2365color.ysf_grey_999999;
        } else {
            this.f6317c.setEnabled(true);
            button = this.f6317c;
            resources = this.context.getResources();
            i = C2364R.C2365color.ysf_grey_666666;
        }
        button.setTextColor(resources.getColor(i));
        this.f6317c.setText(C2364R.string.ysf_retry_connect);
        this.f6317c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2949n.View$OnClickListenerC29501 */

            public final void onClick(View view) {
                if (C2949n.this.getAdapter().mo34517d() != null) {
                    C2949n.this.getAdapter().mo34517d().mo34520b();
                    tVar.mo36110h();
                    ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(C2949n.this.message, true);
                }
            }
        });
    }
}
