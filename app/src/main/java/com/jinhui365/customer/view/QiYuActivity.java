package com.jinhui365.customer.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.api.msg.UnicornMessageBuilder;
import com.qiyukf.unicorn.p244ui.activity.ServiceMessageActivity;
import s.h.e.l.l.C;

public class QiYuActivity extends ServiceMessageActivity {
    public static Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f14963OooO00o = new OooO00o();

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            Intent intent = QiYuActivity.this.getIntent();
            if (intent.hasExtra("content")) {
                String stringExtra = intent.getStringExtra("content");
                if (!TextUtils.isEmpty(stringExtra)) {
                    MessageService.sendMessage(UnicornMessageBuilder.buildTextMessage(UnicornMessageBuilder.getSessionId(), stringExtra));
                }
                intent.removeExtra("content");
            }
        }
    }

    static {
        C.i(50331731);
    }

    public static native void OooO00o();

    public static native void OooO00o(Context context, String str, ConsultSource consultSource, String str2);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity, com.qiyukf.unicorn.p244ui.activity.ServiceMessageActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onPause();

    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        this.f14963OooO00o.sendEmptyMessageDelayed(0, 1000);
    }

    public native void onUserLeaveHint();
}
