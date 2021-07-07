package com.qiyukf.nim.uikit.session.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b;
import com.qiyukf.nim.uikit.session.C1936a;
import com.qiyukf.nim.uikit.session.module.AbstractC2048b;
import com.qiyukf.nim.uikit.session.module.C2023a;
import com.qiyukf.nim.uikit.session.module.input.C2066e;
import com.qiyukf.nim.uikit.session.module.p153a.C2024a;
import com.qiyukf.nim.uikit.session.p152b.C1965b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2369a;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2537s;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2623s;
import com.qiyukf.unicorn.p229h.C2667c;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.List;
import s.h.e.l.l.C;

public class MessageFragment extends TFragment implements AbstractC2048b {

    /* renamed from: a */
    public View f3925a;

    /* renamed from: b */
    public TextView f3926b;

    /* renamed from: c */
    public LinearLayout f3927c;

    /* renamed from: d */
    public C2066e f3928d;

    /* renamed from: e */
    public C2024a f3929e;

    /* renamed from: f */
    public C2023a f3930f;

    /* renamed from: g */
    public String f3931g;

    /* renamed from: h */
    public SessionTypeEnum f3932h;

    /* renamed from: i */
    public SensorEventListener f3933i;

    /* renamed from: j */
    public boolean f3934j = false;

    /* renamed from: k */
    public String f3935k;

    /* renamed from: l */
    public View f3936l;

    /* renamed from: m */
    public C1936a f3937m;

    /* renamed from: n */
    public SensorManager f3938n;

    /* renamed from: o */
    public Sensor f3939o;

    /* renamed from: p */
    public C2452d.AbstractC2459a f3940p = new C2452d.AbstractC2459a() {
        /* class com.qiyukf.nim.uikit.session.fragment.MessageFragment.C19971 */

        @Override // com.qiyukf.unicorn.C2452d.AbstractC2459a
        /* renamed from: a */
        public final void mo34456a() {
            MessageFragment.this.m3975a((MessageFragment) true);
            MessageFragment.m3977b(MessageFragment.this);
            if (MessageFragment.this.isResumed()) {
                MessageFragment messageFragment = MessageFragment.this;
                ((MsgService) NIMClient.getService(MsgService.class)).setChattingAccount(messageFragment.f3931g, messageFragment.f3932h);
            }
        }
    };

    /* renamed from: q */
    public AbstractC1886a.AbstractC1889a f3941q = new AbstractC1886a.AbstractC1889a() {
        /* class com.qiyukf.nim.uikit.session.fragment.MessageFragment.C19993 */

        @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.AbstractC1889a
        /* renamed from: a */
        public final void mo34202a(AbstractC1891b bVar) {
            MessageFragment.this.getActivity().getWindow().setFlags(128, 128);
            MessageFragment.this.getActivity();
            if (C1965b.m3881i().mo34191b() == 0) {
                MessageFragment.this.f3929e.mo34487b(C2364R.string.ysf_audio_is_playing_by_earphone);
            }
        }

        @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.AbstractC1889a
        /* renamed from: b */
        public final void mo34203b(AbstractC1891b bVar) {
            MessageFragment.this.getActivity().getWindow().setFlags(0, 128);
            MessageFragment.m3979d(MessageFragment.this);
        }
    };

    /* renamed from: r */
    public Observer<List<IMMessage>> f3942r = new Observer<List<IMMessage>>() {
        /* class com.qiyukf.nim.uikit.session.fragment.MessageFragment.C20004 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(List<IMMessage> list) {
            List<IMMessage> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                MessageFragment.this.f3929e.mo34485a(list2);
                MessageFragment.this.onReceiveMessage(list2);
            }
        }
    };

    static {
        C.i(16777269);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m3975a(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeReceiveMessage(this.f3942r, z);
        C2667c.m6117a(z ? this : null);
    }

    /* renamed from: b */
    private void m3976b() {
        SensorManager sensorManager;
        SensorEventListener sensorEventListener;
        if (this.f3939o != null && (sensorManager = this.f3938n) != null && (sensorEventListener = this.f3933i) != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m3977b(MessageFragment messageFragment) {
        C2066e eVar;
        C2024a aVar = messageFragment.f3929e;
        if (aVar == null) {
            messageFragment.f3929e = new C2024a(messageFragment.f3930f, messageFragment.f3925a);
        } else {
            aVar.mo34481a(messageFragment.f3930f);
        }
        C2066e eVar2 = messageFragment.f3928d;
        if (eVar2 == null) {
            eVar = new C2066e(messageFragment.f3930f, messageFragment.f3925a, messageFragment.f3937m);
            messageFragment.f3928d = eVar;
        } else {
            eVar2.mo34557a(messageFragment.f3930f);
            eVar = messageFragment.f3928d;
        }
        eVar.mo34563b(messageFragment.f3935k);
        C1936a aVar2 = messageFragment.f3937m;
        if (aVar2 != null) {
            messageFragment.f3928d.mo34555a(aVar2.f3722c);
            C2024a aVar3 = messageFragment.f3929e;
            C1936a aVar4 = messageFragment.f3937m;
            aVar3.mo34484a(aVar4.f3720a, aVar4.f3721b);
            return;
        }
        messageFragment.f3929e.mo34484a((String) null, 0);
        messageFragment.f3928d.mo34555a(0);
    }

    /* renamed from: c */
    public static /* synthetic */ void m3978c(MessageFragment messageFragment) {
        if (messageFragment.getActivity() != null) {
            messageFragment.getActivity().getWindow().setFlags(32768, 32768);
            messageFragment.getActivity().getWindow().setFlags(1024, 1024);
            if (messageFragment.f3936l == null) {
                View.inflate(messageFragment.getActivity(), C2364R.layout.ysf_screen_lock_layout, (ViewGroup) messageFragment.getActivity().getWindow().getDecorView());
                messageFragment.f3936l = messageFragment.getActivity().findViewById(C2364R.C2367id.screen_lock_layout);
            }
            messageFragment.f3936l.setVisibility(0);
            if (!C2437b.m5285j()) {
                messageFragment.getActivity();
                if (C1965b.m3881i().mo34197f()) {
                    messageFragment.getActivity().setVolumeControlStream(0);
                }
            }
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m3979d(MessageFragment messageFragment) {
        View view;
        if (messageFragment.getActivity() != null && (view = messageFragment.f3936l) != null && view.getVisibility() != 8) {
            boolean g = messageFragment.f3929e.mo34493g();
            messageFragment.getActivity().getWindow().setFlags(0, 32768);
            messageFragment.getActivity().getWindow().clearFlags(1024);
            if (Build.VERSION.SDK_INT >= 14) {
                messageFragment.getActivity().getWindow().getDecorView().setSystemUiVisibility(0);
            }
            View view2 = messageFragment.f3936l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (g) {
                messageFragment.f3929e.mo34494h();
            }
            if (!C2437b.m5285j()) {
                messageFragment.getActivity();
                if (C1965b.m3881i().mo34198g()) {
                    messageFragment.getActivity().setVolumeControlStream(3);
                    messageFragment.f3929e.mo34487b(C2364R.string.ysf_audio_switch_to_speaker);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34448a() {
        this.f3929e.mo34481a(this.f3930f);
    }

    /* renamed from: a */
    public final void mo34449a(String str) {
        this.f3931g = str;
        this.f3930f.f3993c = str;
        ((MsgService) NIMClient.getService(MsgService.class)).setChattingAccount(str, this.f3932h);
    }

    @Override // com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public native boolean isAllowSendMessage(boolean z);

    @Override // com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public native boolean isLongClickEnabled();

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onActivityCreated(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.fragment.app.Fragment
    public native void onConfigurationChanged(Configuration configuration);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onDestroy();

    @Override // androidx.fragment.app.Fragment
    public native void onPause();

    public void onReceiveMessage(List<IMMessage> list) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        FragmentActivity fragmentActivity;
        SensorManager sensorManager;
        SensorEventListener sensorEventListener;
        super.onResume();
        if (!this.f3934j) {
            C2024a aVar = this.f3929e;
            if (aVar != null) {
                aVar.mo34490d();
            }
            C2066e eVar = this.f3928d;
            if (eVar != null) {
                eVar.mo34562b();
            }
            C2024a aVar2 = this.f3929e;
            if (aVar2 != null) {
                aVar2.mo34492f();
            }
            getActivity();
            C1965b.m3881i().mo34188a(this.f3941q);
            if (this.f3938n == null) {
                SensorManager sensorManager2 = (SensorManager) getActivity().getSystemService(C3617o.f9339Z);
                this.f3938n = sensorManager2;
                this.f3939o = sensorManager2.getDefaultSensor(8);
                this.f3933i = new SensorEventListener() {
                    /* class com.qiyukf.nim.uikit.session.fragment.MessageFragment.C19982 */

                    public final void onAccuracyChanged(Sensor sensor, int i) {
                    }

                    public final void onSensorChanged(SensorEvent sensorEvent) {
                        if (sensorEvent.sensor.getType() == 8) {
                            float f = sensorEvent.values[0];
                            if (f >= 5.0f || f >= sensorEvent.sensor.getMaximumRange()) {
                                MessageFragment.m3979d(MessageFragment.this);
                                return;
                            }
                            MessageFragment.this.getActivity();
                            if (C1965b.m3881i().mo34195d()) {
                                MessageFragment.m3978c(MessageFragment.this);
                            }
                        }
                    }
                };
            }
            Sensor sensor = this.f3939o;
            int i = 3;
            if (!(sensor == null || (sensorManager = this.f3938n) == null || (sensorEventListener = this.f3933i) == null)) {
                sensorManager.registerListener(sensorEventListener, sensor, 3);
            }
            if (C2437b.m5285j()) {
                fragmentActivity = getActivity();
                i = 0;
            } else {
                fragmentActivity = getActivity();
            }
            fragmentActivity.setVolumeControlStream(i);
            if (C2452d.m5366b()) {
                ((MsgService) NIMClient.getService(MsgService.class)).setChattingAccount(this.f3931g, this.f3932h);
                if (C2452d.m5375g().mo36364n(this.f3930f.f3993c) != null && C2452d.m5375g().mo36355f(this.f3931g) == 0) {
                    C2623s sVar = new C2623s();
                    sVar.mo36221a(String.valueOf(C2452d.m5375g().mo36349c(this.f3931g)));
                    C2667c.m6115a((AbstractC2597e) sVar, this.f3931g, true);
                }
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public native void saveMessageToLocal(IMMessage iMMessage, boolean z, boolean z2);

    @Override // com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public boolean sendMessage(IMMessage iMMessage, boolean z) {
        C2313a a;
        if (!isAllowSendMessage(true)) {
            return false;
        }
        if (!TextUtils.isEmpty(C2437b.m5272e(C2452d.m5375g().mo36349c(this.f3931g))) && (a = C2323f.m5018a(C2437b.m5272e(C2452d.m5375g().mo36349c(this.f3931g)))) != null && a.getAttachment() != null && (a.getAttachment() instanceof C2537s)) {
            C2537s sVar = (C2537s) a.getAttachment();
            sVar.mo35916h();
            ((C2369a) sVar.mo35275a()).mo35229a("isAlreadyShowQuickEntry", true);
            ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(a, true);
            C2437b.m5240a(C2452d.m5375g().mo36349c(this.f3931g), "");
        }
        ((MsgService) NIMClient.getService(MsgService.class)).sendMessage(iMMessage, z, true);
        if (!z) {
            this.f3929e.mo34483a(iMMessage);
        }
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public native void shouldCollapseInputPanel();
}
