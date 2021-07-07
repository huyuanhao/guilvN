package com.p118pd.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.template.ScreenActionReceiver;
import com.jinhui365.template.TemplateApplication;
import com.jinhui365.template.view.SplashActivity;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0o0Oo0  reason: case insensitive filesystem */
public class C8710oo0o0Oo0 implements AbstractC8711oo0o0OoO {
    public static final int OooO00o = 7001;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21877OooO00o = "DefaultLifeCycleHandler";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f21878OooO00o = false;
    public static final int OooO0O0 = 1000;
    public static final int OooO0OO = 30000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21879OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21880OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScreenActionReceiver f21881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8712oo0o0Ooo f21882OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f21883OooO00o = new OooO0O0();

    /* renamed from: com.pd.sdk.oo0o0Oo0$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 7001) {
                LogCollectorManager.sharedInstance().noticeReport();
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0o0Oo0$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            if (C8710oo0o0Oo0.f21878OooO00o) {
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.SESSION_END.getValue(), true, (Map<String, String>) null);
            }
        }
    }

    public C8710oo0o0Oo0(AbstractC8712oo0o0Ooo oo0o0ooo) {
        this.f21882OooO00o = oo0o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC8711oo0o0OoO
    public void OooO00o() {
        ScreenActionReceiver screenActionReceiver = new ScreenActionReceiver();
        this.f21881OooO00o = screenActionReceiver;
        screenActionReceiver.OooO00o(TemplateApplication.OooO00o());
        Activity OooO0O02 = C8707oo0o0OOO.OooO0O0();
        AbstractC8712oo0o0Ooo oo0o0ooo = this.f21882OooO00o;
        if (oo0o0ooo != null) {
            oo0o0ooo.OooO0Oo();
        }
        if (f21878OooO00o) {
            OooO00o("enterForeground");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.FOREGOUND.getValue(), (Map<String, String>) null);
            this.f21880OooO00o.sendEmptyMessageDelayed(7001, 1000);
            this.f21880OooO00o.removeCallbacks(this.f21883OooO00o);
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f21879OooO00o;
            long j2 = currentTimeMillis - j;
            if (j != 0 && j2 > 30000) {
                LogCollectorManager.sharedInstance().sessionStart();
                if (!(this.f21882OooO00o == null || OooO0O02 == null)) {
                    Intent intent = new Intent(OooO0O02, this.f21882OooO00o.OooO00o());
                    intent.putExtra(SplashActivity.oo0o0Oo, "1");
                    OooO0O02.startActivity(intent);
                }
            }
            f21878OooO00o = false;
        }
        AbstractC8712oo0o0Ooo oo0o0ooo2 = this.f21882OooO00o;
        if (oo0o0ooo2 != null) {
            oo0o0ooo2.OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8711oo0o0OoO
    public void OooO0O0() {
        C8707oo0o0OOO.OooO0O0();
        if (!f21878OooO00o) {
            this.f21881OooO00o.OooO0O0(TemplateApplication.OooO00o());
            AbstractC8712oo0o0Ooo oo0o0ooo = this.f21882OooO00o;
            if (oo0o0ooo != null) {
                oo0o0ooo.m20335OooO00o();
            }
            OooO00o("enterBackground");
            this.f21879OooO00o = System.currentTimeMillis();
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.BACKGROUND.getValue(), (Map<String, String>) null);
            this.f21880OooO00o.sendEmptyMessageDelayed(7001, 1000);
            this.f21880OooO00o.postDelayed(this.f21883OooO00o, 30000);
            AbstractC8712oo0o0Ooo oo0o0ooo2 = this.f21882OooO00o;
            if (oo0o0ooo2 != null) {
                oo0o0ooo2.OooO0O0();
            }
            f21878OooO00o = true;
        }
    }

    public void OooO00o(String str) {
        if (C8731oo0oOO00.OooO00o().OooO0O0()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("__EVENT_TYPE__", str);
            C8654oo0Oo00.OooO00o().OooO00o(createMap);
        }
    }
}
