package com.qiyukf.nim.uikit.session.module.input;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.p118pd.sdk.C7265o0O000oo;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nim.uikit.session.C1936a;
import com.qiyukf.nim.uikit.session.emoji.AbstractC1989e;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView;
import com.qiyukf.nim.uikit.session.module.C2023a;
import com.qiyukf.nim.uikit.session.module.input.C2063d;
import com.qiyukf.nim.uikit.session.module.input.p154a.C2052a;
import com.qiyukf.nimlib.sdk.media.record.AudioRecorder;
import com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback;
import com.qiyukf.nimlib.sdk.media.record.RecordType;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.customization.action.AlbumAction;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import com.qiyukf.unicorn.api.customization.action.CameraAction;
import com.qiyukf.unicorn.api.customization.action.ImageAction;
import com.qiyukf.unicorn.api.customization.input.ActionListProvider;
import com.qiyukf.unicorn.api.customization.input.InputPanelOptions;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.AbstractC2471f;
import com.qiyukf.unicorn.p212e.C2469e;
import com.qiyukf.unicorn.p212e.C2477l;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2571g;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2581p;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2583r;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2599b;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2600c;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2601d;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2602e;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2603f;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2625u;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.C2714l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.e */
public final class C2066e implements AbstractC1989e, IAudioRecordCallback {

    /* renamed from: A */
    public boolean f4125A = false;

    /* renamed from: B */
    public boolean f4126B = false;

    /* renamed from: C */
    public boolean f4127C = false;

    /* renamed from: D */
    public String f4128D;

    /* renamed from: E */
    public boolean f4129E = false;

    /* renamed from: F */
    public List<BaseAction> f4130F;

    /* renamed from: G */
    public int f4131G = 0;

    /* renamed from: H */
    public C2063d f4132H;

    /* renamed from: I */
    public C2076f f4133I;

    /* renamed from: J */
    public String f4134J = "";

    /* renamed from: K */
    public C1936a f4135K;

    /* renamed from: L */
    public C2583r f4136L;

    /* renamed from: M */
    public Runnable f4137M = new Runnable() {
        /* class com.qiyukf.nim.uikit.session.module.input.C2066e.RunnableC20704 */

        public final void run() {
            C2477l k = C2452d.m5375g().mo36361k(C2066e.this.f4141b.f3993c);
            long c = C2452d.m5375g().mo36349c(C2066e.this.f4141b.f3993c);
            long f = (long) C2452d.m5375g().mo36355f(C2066e.this.f4141b.f3993c);
            String obj = C2066e.this.f4145f.getText().toString();
            if (k.mo35726a() && c > 0 && f == 0 && !C2066e.this.f4141b.f3993c.equals(C1877b.m3581b()) && !TextUtils.equals(obj, C2066e.this.f4134J)) {
                C2066e.this.f4134J = obj;
                C2625u uVar = new C2625u();
                uVar.mo36224a(c);
                uVar.mo36225a(C2066e.this.f4134J);
                uVar.mo36226b(System.currentTimeMillis());
                uVar.mo36223a(k.mo35727b());
                C2667c.m6115a((AbstractC2597e) uVar, C2066e.this.f4141b.f3993c, false);
            }
            C2066e.this.f4143d.postDelayed(this, (long) (k.mo35727b() * 1000.0f));
        }
    };

    /* renamed from: N */
    public View.OnClickListener f4138N = new View.OnClickListener() {
        /* class com.qiyukf.nim.uikit.session.module.input.C2066e.View$OnClickListenerC20715 */

        public final void onClick(View view) {
            if (view == C2066e.this.f4148i) {
                C2066e.this.f4132H.mo34547a(true);
                C2066e.this.m4184k();
            } else if (view == C2066e.this.f4149j) {
                C2066e.this.f4132H.mo34551e();
                C2066e.this.m4184k();
            } else if (view == C2066e.this.f4151l) {
                C2066e.m4186l(C2066e.this);
            } else if (view == C2066e.this.f4150k) {
                if (C2690a.m6219a().mo36462d()) {
                    C2066e.this.f4132H.mo34552f();
                } else if (C2066e.this.f4135K != null && C2066e.this.f4135K.f3727h) {
                    C2066e.this.f4132H.mo34552f();
                } else if (C2066e.this.f4130F == null || C2066e.this.f4130F.size() == 0) {
                    C1709a.m3011a("inputPanel", "actions is" + C2066e.this.f4130F);
                } else {
                    ((BaseAction) C2066e.this.f4130F.get(0)).onClick();
                }
            } else if (view == C2066e.this.f4152m) {
                C2066e.this.f4132H.mo34548b();
            } else if (view == C2066e.this.f4145f) {
                C2066e.this.f4132H.mo34547a(true);
            }
        }
    };

    /* renamed from: O */
    public C2052a.AbstractC2055a f4139O = new C2052a.AbstractC2055a() {
        /* class com.qiyukf.nim.uikit.session.module.input.C2066e.C20759 */

        @Override // com.qiyukf.nim.uikit.session.module.input.p154a.C2052a.AbstractC2055a
        /* renamed from: a */
        public final void mo34541a(C2571g.C2572a aVar) {
            C2066e.this.f4145f.setText(aVar.mo36049a());
            C2066e.m4186l(C2066e.this);
        }
    };

    /* renamed from: a */
    public Runnable f4140a = new Runnable() {
        /* class com.qiyukf.nim.uikit.session.module.input.C2066e.RunnableC20671 */

        public final void run() {
            if (C2066e.this.f4141b.f3992b.getActivity() != null) {
                C2066e.this.f4141b.f3992b.getActivity().setTitle(TextUtils.isEmpty(C2066e.this.f4128D) ? C2714l.m6276b(C2066e.this.f4141b.f3991a) : C2066e.this.f4128D);
            }
        }
    };

    /* renamed from: b */
    public C2023a f4141b;

    /* renamed from: c */
    public View f4142c;

    /* renamed from: d */
    public Handler f4143d;

    /* renamed from: e */
    public LinearLayout f4144e;

    /* renamed from: f */
    public EditText f4145f;

    /* renamed from: g */
    public TextView f4146g;

    /* renamed from: h */
    public View f4147h;

    /* renamed from: i */
    public View f4148i;

    /* renamed from: j */
    public View f4149j;

    /* renamed from: k */
    public ImageView f4150k;

    /* renamed from: l */
    public View f4151l;

    /* renamed from: m */
    public View f4152m;

    /* renamed from: n */
    public C2052a f4153n;

    /* renamed from: o */
    public EmoticonPickerView f4154o;

    /* renamed from: p */
    public AudioRecorder f4155p;

    /* renamed from: q */
    public ViewGroup f4156q;

    /* renamed from: r */
    public LevelListDrawable f4157r;

    /* renamed from: s */
    public View f4158s;

    /* renamed from: t */
    public TextView f4159t;

    /* renamed from: u */
    public TextView f4160u;

    /* renamed from: v */
    public View f4161v;

    /* renamed from: w */
    public View f4162w;

    /* renamed from: x */
    public ImageView f4163x;

    /* renamed from: y */
    public ImageView f4164y;

    /* renamed from: z */
    public long f4165z;

    public C2066e(C2023a aVar, View view, C1936a aVar2) {
        this.f4141b = aVar;
        this.f4142c = view;
        ArrayList arrayList = new ArrayList();
        InputPanelOptions inputPanelOptions = C2452d.m5373e().inputPanelOptions;
        C1709a.m3011a("InputPanel", "inputPanelOption:" + inputPanelOptions);
        if (inputPanelOptions == null || !inputPanelOptions.showActionPanel) {
            arrayList.add(new ImageAction());
            C1709a.m3011a("InputPanel", "addImageAction" + arrayList);
        } else {
            ActionListProvider actionListProvider = inputPanelOptions.actionPanelOptions.actionListProvider;
            if (actionListProvider == null || actionListProvider.getActionList().size() == 0) {
                arrayList.add(new AlbumAction(C2364R.C2366drawable.ysf_ic_action_album, C2364R.string.ysf_picker_image_folder));
                arrayList.add(new CameraAction(C2364R.C2366drawable.ysf_ic_action_camera, C2364R.string.ysf_input_panel_take));
            } else {
                C1709a.m3011a("InputPanel", "actionListProvider" + inputPanelOptions.actionPanelOptions.actionListProvider.getActionList().size());
                arrayList.addAll(inputPanelOptions.actionPanelOptions.actionListProvider.getActionList());
            }
        }
        this.f4130F = arrayList;
        this.f4143d = new Handler();
        this.f4135K = aVar2;
        if (aVar2 != null) {
            this.f4131G = aVar2.f3722c;
        }
        m4180i();
    }

    /* renamed from: a */
    private void m4162a(boolean z, boolean z2) {
        if (z) {
            this.f4159t.setText(C2364R.string.ysf_audio_record_cancel_tip);
            return;
        }
        TextView textView = this.f4159t;
        if (z2) {
            textView.setText(this.f4141b.f3991a.getString(C2364R.string.ysf_audio_record_time_is_up_tips, new Object[]{60}));
            return;
        }
        textView.setText(C2364R.string.ysf_audio_record_move_up_to_cancel);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4163a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return motionEvent.getRawX() < ((float) iArr[0]) || motionEvent.getRawX() > ((float) (iArr[0] + view.getWidth())) || motionEvent.getRawY() < ((float) (iArr[1] + -40));
    }

    /* renamed from: b */
    private List<AbstractC2471f> m4166b(List<C2583r.C2585b> list, boolean z) {
        Object dVar;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2583r.C2585b bVar : list) {
            String a = bVar.mo36090a();
            char c = 65535;
            switch (a.hashCode()) {
                case -1349088399:
                    if (a.equals("custom")) {
                        c = 3;
                        break;
                    }
                    break;
                case -548214421:
                    if (a.equals("create_worksheet")) {
                        c = 4;
                        break;
                    }
                    break;
                case 161787033:
                    if (a.equals("evaluate")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1235521359:
                    if (a.equals("close_session")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1546100943:
                    if (a.equals("open_link")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        dVar = new C2602e(bVar.mo36092c(), bVar.mo36091b());
                    } else if (c == 3) {
                        dVar = new C2600c(bVar.mo36091b(), bVar.mo36092c());
                    } else if (c == 4) {
                        try {
                            arrayList.add(new C2603f(bVar.mo36091b(), Long.parseLong(bVar.mo36093d())));
                        } catch (NumberFormatException e) {
                            C1709a.m3013a("inputPanel", "transfer worksheet id is error", e);
                        }
                    }
                } else if (C2452d.m5375g().mo36351d(this.f4141b.f3993c) != null) {
                    dVar = new C2599b(bVar.mo36091b());
                }
            } else if (z) {
                dVar = new C2601d(bVar.mo36091b());
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v39, resolved type: com.qiyukf.unicorn.api.customization.action.LinkClickAction */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r3.equals("take_photo") != false) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.qiyukf.unicorn.api.customization.action.BaseAction> m4168c(java.util.List<com.qiyukf.unicorn.p213f.p214a.p220d.C2583r.C2584a> r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 644
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.module.input.C2066e.m4168c(java.util.List, boolean):java.util.List");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m4172d(boolean z) {
        this.f4141b.f3991a.getWindow().setFlags(0, 128);
        this.f4155p.completeRecord(z);
        this.f4146g.setText(C2364R.string.ysf_audio_record_touch_to_record);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m4174e(boolean z) {
        if (this.f4125A && this.f4126B != z) {
            this.f4126B = z;
            m4176f(z);
        }
    }

    /* renamed from: f */
    private void m4176f(boolean z) {
        boolean z2 = false;
        TextView textView = this.f4146g;
        if (z) {
            textView.setText(C2364R.string.ysf_audio_record_touch_to_record);
            this.f4162w.setVisibility(4);
            this.f4158s.setVisibility(0);
        } else {
            textView.setText(C2364R.string.ysf_audio_record_up_to_complete);
            this.f4158s.setVisibility(4);
            this.f4162w.setVisibility(0);
            int i = ((System.currentTimeMillis() - this.f4165z) > 50000 ? 1 : ((System.currentTimeMillis() - this.f4165z) == 50000 ? 0 : -1));
            ViewGroup viewGroup = this.f4156q;
            if (i > 0) {
                viewGroup.setVisibility(4);
                this.f4160u.setVisibility(0);
            } else {
                viewGroup.setVisibility(0);
                this.f4160u.setVisibility(4);
            }
        }
        if (System.currentTimeMillis() - this.f4165z >= 59000) {
            z2 = true;
        }
        m4162a(z, z2);
    }

    /* renamed from: i */
    private void m4180i() {
        ImageView imageView;
        int i;
        GradientDrawable gradientDrawable;
        this.f4144e = (LinearLayout) this.f4142c.findViewById(C2364R.C2367id.messageActivityBottomLayout);
        this.f4148i = this.f4142c.findViewById(C2364R.C2367id.buttonTextMessage);
        this.f4149j = this.f4142c.findViewById(C2364R.C2367id.buttonAudioMessage);
        this.f4150k = (ImageView) this.f4142c.findViewById(C2364R.C2367id.action_list_trigger_button);
        this.f4152m = this.f4142c.findViewById(C2364R.C2367id.emoji_button);
        this.f4151l = this.f4142c.findViewById(C2364R.C2367id.send_message_button);
        this.f4145f = (EditText) this.f4142c.findViewById(C2364R.C2367id.editTextMessage);
        this.f4146g = (TextView) this.f4142c.findViewById(C2364R.C2367id.audioRecord);
        this.f4147h = this.f4142c.findViewById(C2364R.C2367id.ysf_audio_recording_panel);
        this.f4159t = (TextView) this.f4142c.findViewById(C2364R.C2367id.ysf_cancel_recording_text_view);
        this.f4156q = (ViewGroup) this.f4142c.findViewById(C2364R.C2367id.ysf_audio_amplitude_panel);
        this.f4163x = (ImageView) this.f4142c.findViewById(C2364R.C2367id.ysf_amplitude_indicator);
        this.f4164y = (ImageView) this.f4142c.findViewById(C2364R.C2367id.ysf_recording_view_mic);
        this.f4157r = (LevelListDrawable) ((ImageView) this.f4142c.findViewById(C2364R.C2367id.ysf_amplitude_indicator)).getDrawable();
        this.f4158s = this.f4142c.findViewById(C2364R.C2367id.ysf_recording_cancel_indicator);
        this.f4160u = (TextView) this.f4142c.findViewById(C2364R.C2367id.ysf_recording_count_down_label);
        this.f4162w = this.f4142c.findViewById(C2364R.C2367id.ysf_audio_recording_animation_view);
        this.f4161v = this.f4142c.findViewById(C2364R.C2367id.ysf_audio_record_end_tip);
        this.f4154o = (EmoticonPickerView) this.f4142c.findViewById(C2364R.C2367id.emoticon_picker_view);
        C2063d dVar = new C2063d(this.f4141b.f3992b, this.f4144e, this, this.f4130F, this.f4131G);
        this.f4132H = dVar;
        dVar.mo34545a(new C2063d.AbstractC2065a() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2066e.C20682 */

            @Override // com.qiyukf.nim.uikit.session.module.input.C2063d.AbstractC2065a
            /* renamed from: a */
            public final void mo34554a(boolean z) {
                C2066e.this.mo34566c(!z);
            }
        });
        this.f4133I = new C2076f(this.f4141b, this.f4144e);
        this.f4148i.setVisibility(8);
        if (!C2690a.m6219a().mo36462d() || C2690a.m6219a().mo36461c().mo35691c() != 0) {
            this.f4149j.setVisibility(0);
        } else {
            this.f4149j.setVisibility(8);
        }
        C2052a aVar = new C2052a();
        this.f4153n = aVar;
        aVar.mo34536a(this.f4141b.f3992b.getContext(), this.f4142c, this.f4141b.f3993c, this.f4139O);
        m4182j();
        this.f4148i.setOnClickListener(this.f4138N);
        this.f4149j.setOnClickListener(this.f4138N);
        this.f4152m.setOnClickListener(this.f4138N);
        this.f4151l.setOnClickListener(this.f4138N);
        this.f4150k.setOnClickListener(this.f4138N);
        this.f4145f.setOnClickListener(this.f4138N);
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null) {
            float f = uICustomization.inputTextSize;
            if (f > 0.0f) {
                this.f4145f.setTextSize(f);
            }
            int i2 = uICustomization.inputTextColor;
            if (i2 != 0) {
                this.f4145f.setTextColor(i2);
            }
        }
        this.f4145f.setInputType(131073);
        this.f4145f.addTextChangedListener(new TextWatcher() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2066e.C20693 */

            /* renamed from: b */
            public int f4169b;

            /* renamed from: c */
            public int f4170c;

            public final void afterTextChanged(Editable editable) {
                C2066e.this.m4184k();
                C1990f.m3948a(C2066e.this.f4141b.f3991a, editable, this.f4169b, this.f4170c);
                C2066e.this.f4153n.mo34537a(editable.toString());
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f4169b = i;
                this.f4170c = i3;
            }
        });
        String e = C2437b.m5273e(this.f4141b.f3993c);
        if (!TextUtils.isEmpty(e)) {
            this.f4145f.setText(e);
            this.f4145f.setSelection(e.length());
            C2437b.m5256b(this.f4141b.f3993c, (String) null);
        }
        if (uICustomization == null || !uICustomization.hideKeyboardOnEnterConsult) {
            this.f4132H.mo34547a(true);
        } else {
            this.f4132H.mo34547a(false);
        }
        this.f4146g.setOnTouchListener(new View.OnTouchListener() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2066e.View$OnTouchListenerC20726 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    C2066e.this.f4127C = true;
                    C2066e.m4191q(C2066e.this);
                    C2066e.m4192r(C2066e.this);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    C2066e.this.f4127C = false;
                    C2066e.this.m4172d((C2066e) C2066e.m4163a(view, motionEvent));
                } else if (motionEvent.getAction() == 2) {
                    C2066e.this.f4127C = false;
                    C2066e.this.m4174e((C2066e) C2066e.m4163a(view, motionEvent));
                }
                return true;
            }
        });
        m4184k();
        this.f4145f.setOnKeyListener(new View.OnKeyListener() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2066e.View$OnKeyListenerC20748 */

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1 && i == 4) {
                    return C2066e.this.mo34567d();
                }
                return false;
            }
        });
        if (!C2690a.m6219a().mo36462d() || C2690a.m6219a().mo36461c() == null) {
            this.f4150k.setBackgroundResource(C2364R.C2366drawable.ysf_ic_input_bottom_img_and_video);
            C1936a aVar2 = this.f4135K;
            if (aVar2 != null) {
                View view = this.f4149j;
                int i3 = aVar2.f3723d;
                if (i3 == 0) {
                    i3 = C2364R.C2366drawable.ysf_ic_input_voice_back;
                }
                view.setBackgroundResource(i3);
                View view2 = this.f4152m;
                int i4 = this.f4135K.f3724e;
                if (i4 == 0) {
                    i4 = C2364R.C2366drawable.ysf_ic_input_emoji_back;
                }
                view2.setBackgroundResource(i4);
                C1936a aVar3 = this.f4135K;
                if (aVar3.f3727h) {
                    imageView = this.f4150k;
                    i = aVar3.f3726g;
                    if (i == 0) {
                        i = C2364R.C2366drawable.ysf_ic_input_bottom_add;
                    }
                } else {
                    imageView = this.f4150k;
                    i = aVar3.f3725f;
                    if (i == 0) {
                        i = C2364R.C2366drawable.ysf_ic_input_bottom_img_and_video;
                    }
                }
                imageView.setBackgroundResource(i);
            }
        } else {
            String b = C2690a.m6219a().mo36461c().mo35690b();
            this.f4150k.setImageResource(C2364R.C2366drawable.ysf_ic_tigger_btn_transparent);
            ImageView imageView2 = this.f4150k;
            if (TextUtils.isEmpty(b)) {
                gradientDrawable = new GradientDrawable();
            } else {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(Color.parseColor(b));
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius((float) C1862c.m3540a(50.0f));
                gradientDrawable = gradientDrawable2;
            }
            imageView2.setBackgroundDrawable(gradientDrawable);
        }
        for (int i5 = 0; i5 < this.f4130F.size(); i5++) {
            this.f4130F.get(i5).setIndex(i5);
            this.f4130F.get(i5).setContainer(this.f4141b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4182j() {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.module.input.C2066e.m4182j():void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        if (r1 != false) goto L_0x0075;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4184k() {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.module.input.C2066e.m4184k():void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private void m4185l() {
        this.f4147h.setVisibility(8);
    }

    /* renamed from: l */
    public static /* synthetic */ void m4186l(C2066e eVar) {
        String trim = eVar.f4145f.getText().toString().trim();
        C2023a aVar = eVar.f4141b;
        if (eVar.f4141b.f3995e.sendMessage(MessageBuilder.createTextMessage(aVar.f3993c, aVar.f3994d, trim), false)) {
            eVar.f4145f.setText("");
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m4191q(C2066e eVar) {
        if (eVar.f4155p == null) {
            eVar.f4155p = new AudioRecorder(eVar.f4141b.f3991a, RecordType.AMR, 60, eVar);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m4192r(C2066e eVar) {
        eVar.f4141b.f3991a.getWindow().setFlags(128, 128);
        boolean startRecord = eVar.f4155p.startRecord();
        eVar.f4125A = startRecord;
        eVar.f4126B = false;
        if (startRecord && eVar.f4127C) {
            eVar.f4146g.setText(C2364R.string.ysf_audio_record_up_to_complete);
            eVar.m4176f(false);
            eVar.f4147h.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo34555a(int i) {
        this.f4131G = i;
    }

    /* renamed from: a */
    public final void mo34556a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            C2076f fVar = this.f4133I;
            if (fVar != null) {
                fVar.mo34588a(i, intent);
            }
            int i3 = (i << 16) >> 24;
            if (i3 != 0) {
                int i4 = i3 - 1;
                if (i4 < 0 || i4 >= this.f4130F.size()) {
                    C1709a.m3018d("MsgSendLayout", "request code out of actions' range");
                    return;
                }
                BaseAction baseAction = this.f4130F.get(i4);
                if (baseAction != null) {
                    baseAction.onActivityResult(i & 255, i2, intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34557a(C2023a aVar) {
        this.f4141b = aVar;
    }

    /* renamed from: a */
    public final void mo34558a(C2571g gVar) {
        if (gVar.mo36047a() == C2452d.m5375g().mo36353e(this.f4141b.f3993c)) {
            this.f4153n.mo34538a(gVar.mo36048b());
        }
    }

    /* renamed from: a */
    public final void mo34559a(C2583r rVar) {
        this.f4136L = rVar;
        if (C2690a.m6219a().mo36462d()) {
            if (this.f4136L.mo36084b() == null || this.f4136L.mo36084b().size() <= 0) {
                this.f4150k.setVisibility(8);
            } else {
                List<BaseAction> list = this.f4130F;
                if (list != null) {
                    list.clear();
                    this.f4130F.addAll(m4168c(this.f4136L.mo36084b(), C2452d.m5375g().mo36369s(this.f4141b.f3993c).booleanValue()));
                }
                this.f4132H.mo34546a(m4168c(this.f4136L.mo36084b(), C2452d.m5375g().mo36369s(this.f4141b.f3993c).booleanValue()));
            }
            this.f4133I.mo34589a(m4166b(this.f4136L.mo36083a(), C2452d.m5375g().mo36369s(this.f4141b.f3993c).booleanValue()));
        }
    }

    @Override // com.qiyukf.nim.uikit.session.emoji.AbstractC1989e
    /* renamed from: a */
    public final void mo34422a(String str) {
        int lastIndexOf;
        Editable text = this.f4145f.getText();
        int i = 0;
        if (str.equals("/DEL")) {
            this.f4145f.dispatchKeyEvent(new KeyEvent(0, 67));
        } else if (str.equals("/DEL_CUSTOM")) {
            try {
                String obj = text.toString();
                int selectionStart = this.f4145f.getSelectionStart();
                if (selectionStart != -1 && (lastIndexOf = obj.substring(0, selectionStart).lastIndexOf("[:")) < selectionStart && lastIndexOf != -1 && C1990f.m3950a(obj.substring(lastIndexOf, selectionStart)) && ']' == obj.charAt(selectionStart - 1)) {
                    this.f4145f.getText().delete(lastIndexOf, selectionStart);
                }
            } catch (Exception e) {
                C1709a.m3011a("deleteEmoji", "is error" + e);
            }
        } else {
            int selectionStart2 = this.f4145f.getSelectionStart();
            int selectionEnd = this.f4145f.getSelectionEnd();
            if (selectionStart2 < 0) {
                selectionStart2 = 0;
            }
            if (selectionEnd >= 0) {
                i = selectionEnd;
            }
            if (selectionStart2 <= i) {
                text.replace(selectionStart2, i, str);
            } else {
                text.replace(i, selectionStart2, str);
            }
            this.f4145f.setSelection(Math.min(selectionStart2, i) + str.length());
        }
    }

    @Override // com.qiyukf.nim.uikit.session.emoji.AbstractC1989e
    /* renamed from: a */
    public final void mo34423a(String str, String str2) {
        C2581p a = C2581p.m5811a(str2, str);
        IMMessage createCustomMessage = MessageBuilder.createCustomMessage(this.f4141b.f3993c, SessionTypeEnum.Ysf, a);
        createCustomMessage.setContent(a.mo36069a());
        this.f4141b.f3995e.sendMessage(createCustomMessage, false);
    }

    @Override // com.qiyukf.nim.uikit.session.emoji.AbstractC1989e
    /* renamed from: a */
    public final void mo34424a(List<C2469e> list) {
        C2452d.m5375g().mo36338a(Long.valueOf(C2452d.m5375g().mo36349c(this.f4141b.f3993c)), list);
    }

    /* renamed from: a */
    public final void mo34560a(List<? extends AbstractC2471f> list, boolean z) {
        if (!z || !C2690a.m6219a().mo36462d()) {
            this.f4133I.mo34589a(list);
        }
    }

    /* renamed from: a */
    public final void mo34561a(boolean z) {
        this.f4129E = z;
        m4174e(true);
        m4185l();
        this.f4132H.mo34547a(false);
        if (z) {
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            this.f4142c.findViewById(C2364R.C2367id.switchLayout).setVisibility((!C2690a.m6219a().mo36462d() ? uICustomization == null || !uICustomization.hideAudioWithRobot : C2690a.m6219a().mo36461c().mo35691c() != 0) ? 0 : 8);
            this.f4152m.setVisibility(8);
            this.f4150k.setVisibility(8);
            this.f4151l.setVisibility(0);
            return;
        }
        m4182j();
    }

    @Override // com.qiyukf.nim.uikit.session.emoji.AbstractC1989e
    /* renamed from: a */
    public final boolean mo34425a() {
        List<C2469e> a = C2452d.m5375g().mo36331a(Long.valueOf(C2452d.m5375g().mo36349c(this.f4141b.f3993c)));
        return (a == null || a.size() == 0) ? false : true;
    }

    /* renamed from: b */
    public final void mo34562b() {
        this.f4143d.post(this.f4137M);
    }

    /* renamed from: b */
    public final void mo34563b(String str) {
        this.f4128D = str;
    }

    /* renamed from: b */
    public final void mo34564b(boolean z) {
        if (z) {
            m4174e(true);
            m4185l();
            this.f4132H.mo34547a(false);
            this.f4145f.setText((CharSequence) null);
            this.f4132H.mo34550d();
        }
        String e = C2690a.m6219a().mo36462d() ? C2690a.m6219a().mo36461c().mo35693e() : (C2452d.m5373e().uiCustomization == null || TextUtils.isEmpty(C2452d.m5373e().uiCustomization.editTextHint)) ? "请输入想要咨询的问题" : C2452d.m5373e().uiCustomization.editTextHint;
        EditText editText = this.f4145f;
        if (z) {
            e = editText.getContext().getString(C2364R.string.ysf_no_staff_disabled);
        }
        editText.setHint(e);
        this.f4145f.setEnabled(!z);
        this.f4149j.setEnabled(!z);
        this.f4152m.setEnabled(!z);
        this.f4150k.setEnabled(!z);
    }

    /* renamed from: c */
    public final void mo34565c() {
        if (this.f4155p != null) {
            m4172d(true);
        }
        C2437b.m5256b(this.f4141b.f3993c, this.f4145f.getText().toString());
        this.f4143d.removeCallbacks(this.f4137M);
    }

    @TargetApi(11)
    /* renamed from: c */
    public final void mo34566c(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f4150k, BaseViewManager.PROP_ROTATION, 0.0f, 45.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f4150k, BaseViewManager.PROP_ROTATION, 45.0f, 0.0f);
        ofFloat.setDuration(300L);
        C1936a aVar = this.f4135K;
        if (aVar != null && aVar.f3727h) {
            if (z) {
                ofFloat2.start();
            } else {
                ofFloat.start();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo34567d() {
        View g = this.f4132H.mo34553g();
        EmoticonPickerView emoticonPickerView = this.f4154o;
        boolean z = (emoticonPickerView != null && emoticonPickerView.getVisibility() == 0) || (g != null && g.getVisibility() == 0);
        this.f4132H.mo34550d();
        return z;
    }

    /* renamed from: e */
    public final void mo34568e() {
        C2583r rVar = this.f4136L;
        if (rVar != null) {
            this.f4132H.mo34546a(m4168c(rVar.mo36084b(), true));
            this.f4133I.mo34589a(m4166b(this.f4136L.mo36083a(), true));
        }
    }

    /* renamed from: f */
    public final void mo34569f() {
        this.f4143d.removeCallbacks(this.f4140a);
        if (this.f4141b.f3992b.getActivity() != null) {
            this.f4141b.f3992b.getActivity().setTitle(C2364R.string.ysf_inputing_title);
        }
        this.f4143d.postDelayed(this.f4140a, C7265o0O000oo.OooO0o.OooO00o);
    }

    /* renamed from: g */
    public final boolean mo34570g() {
        AudioRecorder audioRecorder = this.f4155p;
        return audioRecorder != null && audioRecorder.isRecording();
    }

    /* renamed from: h */
    public final void mo34571h() {
        C2063d dVar = this.f4132H;
        if (dVar != null) {
            dVar.mo34549c();
        }
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordCancel() {
        m4185l();
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordFail() {
        this.f4163x.setVisibility(8);
        this.f4164y.setImageResource(C2364R.C2366drawable.ysf_recording_alert);
        this.f4159t.setText(C2364R.string.ysf_audio_record_alert);
        this.f4159t.setPadding(C1862c.m3540a(25.0f), C1862c.m3540a(5.0f), C1862c.m3540a(25.0f), C1862c.m3540a(5.0f));
        this.f4143d.postDelayed(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.input.C2066e.RunnableC20737 */

            public final void run() {
                C2066e.this.f4163x.setVisibility(0);
                C2066e.this.f4164y.setImageResource(C2364R.C2366drawable.ysf_recording_mic);
                C2066e.this.f4159t.setText(C2364R.string.ysf_audio_record_cancel_tip);
                C2066e.this.f4159t.setPadding(C1862c.m3540a(5.0f), C1862c.m3540a(5.0f), C1862c.m3540a(5.0f), C1862c.m3540a(5.0f));
                C2066e.this.m4185l();
            }
        }, 1000);
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordReachedMaxTime(int i) {
        m4185l();
        this.f4155p.handleEndRecord(true, i);
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordReady() {
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordStart(File file, RecordType recordType) {
        this.f4165z = System.currentTimeMillis();
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onRecordSuccess(File file, long j, RecordType recordType) {
        m4185l();
        C2023a aVar = this.f4141b;
        this.f4141b.f3995e.sendMessage(MessageBuilder.createAudioMessage(aVar.f3993c, aVar.f3994d, file, j, this.f4129E), false);
    }

    @Override // com.qiyukf.nimlib.sdk.media.record.IAudioRecordCallback
    public final void onUpdateAmplitude(int i) {
        boolean z = false;
        this.f4157r.setLevel(Math.max(0, Math.min(5, (int) (((float) ((int) (Math.log10((double) (i / 100)) * 20.0d))) / 7.3733335f))));
        long currentTimeMillis = 60 - ((System.currentTimeMillis() - this.f4165z) / 1000);
        if (currentTimeMillis >= 11) {
            this.f4156q.setVisibility(0);
            this.f4160u.setVisibility(4);
            this.f4161v.setVisibility(4);
        } else if (currentTimeMillis > 1) {
            this.f4156q.setVisibility(4);
            this.f4160u.setVisibility(0);
            this.f4161v.setVisibility(4);
            this.f4160u.setText(String.valueOf(currentTimeMillis - 1));
        } else {
            this.f4156q.setVisibility(4);
            this.f4160u.setVisibility(4);
            this.f4161v.setVisibility(0);
            if (this.f4158s.getVisibility() == 0) {
                z = true;
            }
            m4162a(z, true);
        }
    }
}
