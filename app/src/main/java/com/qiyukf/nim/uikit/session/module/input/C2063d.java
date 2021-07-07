package com.qiyukf.nim.uikit.session.module.input;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C8783oo0oooOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.emoji.AbstractC1989e;
import com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p232k.C2709i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.d */
public final class C2063d {

    /* renamed from: a */
    public static int f4103a;

    /* renamed from: c */
    public static final int f4104c = C1862c.m3540a(380.0f);

    /* renamed from: d */
    public static final int f4105d = C1862c.m3540a(200.0f);

    /* renamed from: b */
    public AbstractC2065a f4106b;

    /* renamed from: e */
    public Fragment f4107e;

    /* renamed from: f */
    public AbstractC1989e f4108f;

    /* renamed from: g */
    public List<BaseAction> f4109g;

    /* renamed from: h */
    public int f4110h;

    /* renamed from: i */
    public LinearLayout f4111i;

    /* renamed from: j */
    public MessageBottomContainer f4112j;

    /* renamed from: k */
    public EmoticonPickerView f4113k;

    /* renamed from: l */
    public View f4114l;

    /* renamed from: m */
    public View f4115m;

    /* renamed from: n */
    public EditText f4116n;

    /* renamed from: o */
    public View f4117o;

    /* renamed from: p */
    public View f4118p;

    /* renamed from: q */
    public TextView f4119q;

    /* renamed from: r */
    public LinearLayout f4120r;

    /* renamed from: s */
    public boolean f4121s = false;

    /* renamed from: t */
    public boolean f4122t = false;

    /* renamed from: u */
    public boolean f4123u = false;

    /* renamed from: com.qiyukf.nim.uikit.session.module.input.d$a */
    public interface AbstractC2065a {
        /* renamed from: a */
        void mo34554a(boolean z);
    }

    public C2063d(Fragment fragment, LinearLayout linearLayout, AbstractC1989e eVar, List<BaseAction> list, int i) {
        ArrayList arrayList = new ArrayList();
        this.f4109g = arrayList;
        this.f4107e = fragment;
        this.f4108f = eVar;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f4110h = i;
        this.f4111i = linearLayout;
        this.f4112j = (MessageBottomContainer) linearLayout.findViewById(C2364R.C2367id.nim_message_emoticon_container);
        this.f4113k = (EmoticonPickerView) linearLayout.findViewById(C2364R.C2367id.emoticon_picker_view);
        this.f4115m = linearLayout.findViewById(C2364R.C2367id.textMessageLayout);
        this.f4116n = (EditText) linearLayout.findViewById(C2364R.C2367id.editTextMessage);
        this.f4120r = (LinearLayout) linearLayout.findViewById(C2364R.C2367id.ysf_fl_edit_and_emoji_parent);
        this.f4117o = linearLayout.findViewById(C2364R.C2367id.buttonAudioMessage);
        this.f4118p = linearLayout.findViewById(C2364R.C2367id.buttonTextMessage);
        this.f4119q = (TextView) linearLayout.findViewById(C2364R.C2367id.audioRecord);
    }

    /* renamed from: a */
    public static int m4137a() {
        if (f4103a == 0) {
            f4103a = C2437b.m5250b(f4105d);
        }
        int min = Math.min(f4104c, Math.max(f4105d, f4103a));
        C1709a.m3011a(C8783oo0oooOO.OooO0OO, "getValidBottomHeight:" + min);
        return min;
    }

    /* renamed from: a */
    public static boolean m4139a(int i) {
        int max = Math.max(Math.min(i, f4104c), f4105d);
        int b = C2437b.m5250b(f4105d);
        if (b != max) {
            f4103a = max;
            C2437b.m5238a(max);
        }
        return b != max;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m4141b(boolean z) {
        if (this.f4114l != null) {
            if (this.f4123u) {
                this.f4106b.mo34554a(false);
            }
            this.f4123u = false;
            this.f4114l.setVisibility(8);
            if (z) {
                m4145h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m4143c(boolean z) {
        EmoticonPickerView emoticonPickerView = this.f4113k;
        if (emoticonPickerView != null) {
            this.f4121s = false;
            emoticonPickerView.setVisibility(8);
            this.f4112j.setVisibility(8);
            if (z) {
                m4145h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m4144d(boolean z) {
        int i = 0;
        this.f4119q.setVisibility(z ? 0 : 8);
        this.f4120r.setVisibility(z ? 8 : 0);
        this.f4118p.setVisibility(z ? 0 : 8);
        View view = this.f4117o;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: h */
    private void m4145h() {
        this.f4122t = true;
        C2706g.m6259a(this.f4116n);
    }

    /* renamed from: i */
    private void m4146i() {
        this.f4122t = false;
        C2706g.m6261b(this.f4116n);
    }

    /* renamed from: j */
    private void m4147j() {
        this.f4123u = true;
        this.f4106b.mo34554a(true);
        if (this.f4114l == null) {
            m4148k();
        }
        m4143c(false);
        m4146i();
        this.f4114l.setVisibility(0);
    }

    /* renamed from: k */
    private void m4148k() {
        View.inflate(this.f4107e.getContext(), C2364R.layout.ysf_message_activity_actions_layout, this.f4111i);
        View findViewById = this.f4111i.findViewById(C2364R.C2367id.actionsLayout);
        this.f4114l = findViewById;
        findViewById.setBackgroundColor(this.f4110h);
        C2061c.m4134a(this.f4114l, this.f4109g);
    }

    /* renamed from: l */
    private void m4149l() {
        this.f4121s = true;
        m4144d(false);
        m4146i();
        m4141b(false);
        this.f4116n.requestFocus();
        this.f4113k.setVisibility(0);
        this.f4112j.setVisibility(0);
        this.f4113k.mo34397a(this.f4108f);
    }

    /* renamed from: a */
    public final void mo34545a(AbstractC2065a aVar) {
        this.f4106b = aVar;
    }

    /* renamed from: a */
    public final void mo34546a(List<BaseAction> list) {
        this.f4109g.clear();
        this.f4109g.addAll(list);
        View view = this.f4114l;
        if (view == null) {
            m4148k();
        } else {
            C2061c.m4134a(view, this.f4109g);
        }
    }

    /* renamed from: a */
    public final void mo34547a(boolean z) {
        m4144d(false);
        m4143c(z);
        m4141b(z);
        this.f4115m.setVisibility(0);
        if (z) {
            m4145h();
        }
    }

    /* renamed from: b */
    public final void mo34548b() {
        EmoticonPickerView emoticonPickerView = this.f4113k;
        if (emoticonPickerView == null || emoticonPickerView.getVisibility() == 8) {
            m4149l();
        } else {
            m4143c(true);
        }
    }

    /* renamed from: c */
    public final void mo34549c() {
        if (this.f4121s) {
            m4149l();
        } else if (this.f4123u) {
            m4147j();
        } else {
            boolean z = this.f4122t;
            m4143c(z);
            m4141b(z);
        }
    }

    /* renamed from: d */
    public final void mo34550d() {
        m4146i();
        m4143c(false);
        m4141b(false);
    }

    /* renamed from: e */
    public final void mo34551e() {
        m4146i();
        C2709i.m6264a(this.f4107e).mo36469a("android.permission.RECORD_AUDIO").mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2063d.C20641 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_send_audio);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onGranted() {
                C2063d.this.m4143c((C2063d) false);
                C2063d.this.m4141b((C2063d) false);
                C2063d.this.m4144d(true);
            }
        }).mo36470a();
    }

    /* renamed from: f */
    public final void mo34552f() {
        View view = this.f4114l;
        if (view == null || view.getVisibility() == 8) {
            m4147j();
        } else {
            m4141b(true);
        }
    }

    /* renamed from: g */
    public final View mo34553g() {
        return this.f4114l;
    }
}
