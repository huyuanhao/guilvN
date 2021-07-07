package com.qiyukf.unicorn.p244ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.unicorn.p213f.p214a.p215a.C2542b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2514h;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2871j;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.CardPopupActivity */
public class CardPopupActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public LinearLayout f5836b;

    /* renamed from: c */
    public View f5837c;

    /* renamed from: d */
    public Observer<CustomNotification> f5838d = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.activity.CardPopupActivity.C27892 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            CustomNotification customNotification2 = customNotification;
            if (customNotification2.getSessionType() == SessionTypeEnum.Ysf && (customNotification2.getAttachment() instanceof C2542b)) {
                C2542b bVar = (C2542b) customNotification2.getAttachment();
                if (bVar.mo35926a() instanceof C2514h) {
                    CardPopupActivity.this.m6454a((CardPopupActivity) false);
                    CardPopupActivity.this.f5837c.setVisibility(8);
                    C2514h hVar = (C2514h) bVar.mo35926a();
                    CardPopupActivity.this.setTitle(hVar.mo35813c());
                    new View$OnClickListenerC2871j.C2872a(CardPopupActivity.this.f5836b).mo36722a(hVar.mo35814d());
                }
            }
        }
    };

    static {
        C.i(50331753);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6454a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f5838d, z);
    }

    public static native void start(Context context, String str, String str2, String str3);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();
}
