package com.qiyukf.nim.uikit.session.viewholder;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1864e;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nim.uikit.session.helper.C2015e;
import com.qiyukf.nim.uikit.session.helper.View$OnTouchListenerC2001a;
import com.qiyukf.nim.uikit.session.p152b.C1964a;
import com.qiyukf.nim.uikit.session.p152b.C1965b;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p231j.C2690a;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.a */
public class C2080a extends AbstractC2083b {

    /* renamed from: a */
    public TextView f4187a;

    /* renamed from: b */
    public View f4188b;

    /* renamed from: c */
    public View f4189c;

    /* renamed from: d */
    public ImageView f4190d;

    /* renamed from: e */
    public C1965b f4191e;

    /* renamed from: f */
    public TextView f4192f;

    /* renamed from: g */
    public boolean f4193g;

    /* renamed from: h */
    public AbstractC1886a.AbstractC1889a f4194h = new AbstractC1886a.AbstractC1889a() {
        /* class com.qiyukf.nim.uikit.session.viewholder.C2080a.C20811 */

        @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.AbstractC1889a
        /* renamed from: a */
        public final void mo34202a(AbstractC1891b bVar) {
            if (C2080a.m4233a(C2080a.this, bVar)) {
                C2080a.this.m4228a();
            }
        }

        @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.AbstractC1889a
        /* renamed from: b */
        public final void mo34203b(AbstractC1891b bVar) {
            if (C2080a.m4233a(C2080a.this, bVar)) {
                C2080a.this.m4229a((C2080a) bVar.mo34210a());
                C2080a.this.m4234b();
            }
        }
    };

    /* renamed from: com.qiyukf.nim.uikit.session.viewholder.a$2 */
    public static /* synthetic */ class C20822 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4196a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.qiyukf.unicorn.api.msg.MsgStatusEnum[] r0 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.nim.uikit.session.viewholder.C2080a.C20822.f4196a = r0
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.fail     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.C2080a.C20822.f4196a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.sending     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.C2080a.C20822.f4196a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.unread     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.qiyukf.nim.uikit.session.viewholder.C2080a.C20822.f4196a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.qiyukf.unicorn.api.msg.MsgStatusEnum r1 = com.qiyukf.unicorn.api.msg.MsgStatusEnum.read     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.viewholder.C2080a.C20822.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m4228a() {
        if (this.f4190d.getBackground() instanceof AnimationDrawable) {
            ((AnimationDrawable) this.f4190d.getBackground()).start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m4229a(long j) {
        long a = C1864e.m3551a(j);
        if (a >= 0) {
            TextView textView = this.f4187a;
            textView.setText(a + "\"");
            return;
        }
        this.f4187a.setText("");
    }

    /* renamed from: a */
    private void m4232a(boolean z) {
        int i = 0;
        this.f4192f.setVisibility(z ? 0 : 8);
        this.f4188b.setVisibility(z ? 8 : 0);
        View view = this.f4189c;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4233a(C2080a aVar, AbstractC1891b bVar) {
        return (bVar instanceof C1964a) && ((C1964a) bVar).mo34391c() == aVar.message;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m4234b() {
        if (this.f4190d.getBackground() instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f4190d.getBackground();
            animationDrawable.stop();
            animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
        }
    }

    /* renamed from: c */
    public static int m4236c() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundLeft) <= 0) ? C2364R.C2366drawable.ysf_msg_back_left_selector : i;
    }

    /* renamed from: d */
    public static int m4237d() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        return (uICustomization == null || (i = uICustomization.msgItemBackgroundRight) <= 0) ? C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector : i;
    }

    /* renamed from: e */
    public static int m4238e() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization == null || (i = uICustomization.textMsgColorLeft) == 0) {
            return -16777216;
        }
        return i;
    }

    /* renamed from: f */
    public static int m4239f() {
        int i;
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization == null || (i = uICustomization.textMsgColorRight) == 0) {
            return -1;
        }
        return i;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        int i;
        TextView textView;
        int i2;
        int i3;
        int i4;
        int i5;
        AudioAttachment audioAttachment = (AudioAttachment) this.message.getAttachment();
        boolean z = true;
        if (!audioAttachment.getAutoTransform() || audioAttachment.getText() == null) {
            m4232a(false);
            if (isReceivedMessage()) {
                setGravity(this.f4190d, 19);
                setGravity(this.f4187a, 21);
                this.f4188b.setBackgroundResource(m4236c());
                ImageView imageView = this.f4190d;
                UICustomization uICustomization = C2452d.m5373e().uiCustomization;
                if (uICustomization == null || (i4 = uICustomization.audioMsgAnimationLeft) <= 0) {
                    i4 = C2364R.C2366drawable.ysf_audio_animation_list_left;
                }
                imageView.setBackgroundResource(i4);
                textView = this.f4187a;
                i = m4238e();
            } else {
                setGravity(this.f4190d, 21);
                setGravity(this.f4187a, 19);
                this.f4189c.setVisibility(8);
                this.f4188b.setBackgroundResource(m4237d());
                C2690a.m6219a().mo36459a(this.f4188b);
                ImageView imageView2 = this.f4190d;
                UICustomization uICustomization2 = C2452d.m5373e().uiCustomization;
                if (uICustomization2 == null || (i3 = uICustomization2.audioMsgAnimationRight) <= 0) {
                    i3 = C2364R.C2366drawable.ysf_audio_animation_list_right;
                }
                imageView2.setBackgroundResource(i3);
                textView = this.f4187a;
                i = m4239f();
            }
            textView.setTextColor(i);
            MsgStatusEnum status = this.message.getStatus();
            AttachStatusEnum attachStatus = this.message.getAttachStatus();
            if (TextUtils.isEmpty(((AudioAttachment) this.message.getAttachment()).getPath())) {
                if (attachStatus == AttachStatusEnum.fail || status == MsgStatusEnum.fail) {
                    this.alertButton.setVisibility(0);
                } else {
                    this.alertButton.setVisibility(8);
                }
            }
            if (status == MsgStatusEnum.sending || attachStatus == AttachStatusEnum.transferring) {
                this.progressBar.setVisibility(0);
            } else {
                this.progressBar.setVisibility(8);
            }
            if (!isReceivedMessage() || attachStatus != AttachStatusEnum.transferred || status == MsgStatusEnum.read) {
                this.f4189c.setVisibility(8);
            } else {
                this.f4189c.setVisibility(0);
            }
            long duration = ((AudioAttachment) this.message.getAttachment()).getDuration();
            long a = C1864e.m3551a(duration);
            double c = (double) C1862c.m3543c();
            Double.isNaN(c);
            int i6 = (int) (c * 0.6d);
            double c2 = (double) C1862c.m3543c();
            Double.isNaN(c2);
            int i7 = (int) (c2 * 0.1875d);
            if (a <= 0) {
                i2 = i7;
            } else if (a <= 0 || a > 120) {
                i2 = i6;
            } else {
                double d = (double) (i6 - i7);
                Double.isNaN(d);
                double d2 = (double) a;
                Double.isNaN(d2);
                double atan = d * 0.6366197723675814d * Math.atan(d2 / 10.0d);
                double d3 = (double) i7;
                Double.isNaN(d3);
                i2 = (int) (atan + d3);
            }
            if (i2 < i7) {
                i6 = i7;
            } else if (i2 <= i6) {
                i6 = i2;
            }
            ViewGroup.LayoutParams layoutParams = this.f4188b.getLayoutParams();
            layoutParams.width = i6;
            this.f4188b.setLayoutParams(layoutParams);
            C1965b bVar = this.f4191e;
            IMMessage iMMessage = this.message;
            if (bVar.mo34394j() == null || !bVar.mo34394j().isTheSame(iMMessage)) {
                z = false;
            }
            if (!z) {
                m4229a(duration);
                m4234b();
            } else {
                m4228a();
            }
            this.f4191e.mo34188a(this.f4194h);
            return;
        }
        m4232a(true);
        if (isReceivedMessage()) {
            this.f4192f.setBackgroundResource(m4236c());
            this.f4192f.setTextColor(m4238e());
        } else {
            this.f4192f.setBackgroundResource(m4237d());
            this.f4192f.setTextColor(m4239f());
            C2690a.m6219a().mo36459a(this.f4192f);
        }
        UICustomization uICustomization3 = C2452d.m5373e().uiCustomization;
        if (uICustomization3 != null) {
            float f = uICustomization3.textMsgSize;
            if (f > 0.0f) {
                this.f4192f.setTextSize(f);
            }
        }
        this.f4192f.setText(C2015e.m4002a(this.context, C1990f.m3945a(this.context, ((AudioAttachment) this.message.getAttachment()).getText())));
        TextView textView2 = this.f4192f;
        UICustomization uICustomization4 = C2452d.m5373e().uiCustomization;
        if (uICustomization4 == null || ((!isReceivedMessage() || (i5 = uICustomization4.hyperLinkColorLeft) == 0) && (isReceivedMessage() || (i5 = uICustomization4.hyperLinkColorRight) == 0))) {
            i5 = textView2.getCurrentTextColor();
            if ((16777215 & i5) == 0) {
                i5 = textView2.getContext().getResources().getColor(C2364R.C2365color.ysf_text_link_color_blue);
            }
        }
        textView2.setLinkTextColor(i5);
        this.f4192f.setOnTouchListener(View$OnTouchListenerC2001a.m3985a());
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_audio;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f4187a = (TextView) findViewById(C2364R.C2367id.message_item_audio_duration);
        this.f4188b = findViewById(C2364R.C2367id.message_item_audio_container);
        this.f4189c = findViewById(C2364R.C2367id.message_item_audio_unread_indicator);
        this.f4190d = (ImageView) findViewById(C2364R.C2367id.message_item_audio_playing_animation);
        this.f4192f = (TextView) findViewById(C2364R.C2367id.nim_message_item_text_body);
        this.f4191e = C1965b.m3881i();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onDetached() {
        this.f4191e.mo34192b(this.f4194h);
        m4234b();
        super.onDetached();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        if (this.f4188b.getVisibility() == 0 && this.f4191e != null) {
            if (!isReceivedMessage() || this.message.getAttachStatus() == AttachStatusEnum.transferred) {
                if (this.message.getStatus() != MsgStatusEnum.read) {
                    this.f4189c.setVisibility(8);
                }
                this.f4191e.mo34392a(this.message, C2437b.m5285j() ? 0 : 3);
                this.f4191e.mo34393a(true, this.adapter, this.message);
                return;
            }
            C1865f.m3555a(C2364R.string.ysf_no_permission_audio_error);
        }
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public void reclaim() {
        this.f4191e.mo34192b(this.f4194h);
        m4234b();
        super.reclaim();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void setStatus() {
        int i = C20822.f4196a[this.message.getStatus().ordinal()];
        if (i == 1) {
            this.progressBar.setVisibility(8);
            this.alertButton.setVisibility(0);
            if (((AudioAttachment) this.message.getAttachment()).getAutoTransform() && this.f4193g) {
                C1865f.m3555a(C2364R.string.ysf_audio_translate_to_text_failed);
                this.f4193g = false;
            }
        } else if (i == 2) {
            this.progressBar.setVisibility(0);
            this.alertButton.setVisibility(8);
            this.f4193g = true;
        } else if (i != 3) {
            if (i != 4) {
                this.progressBar.setVisibility(8);
                this.alertButton.setVisibility(8);
            } else if (C2452d.m5375g().mo36364n(this.message.getSessionId()) != null && "1".equals(C2452d.m5375g().mo36364n(this.message.getSessionId()).mo35685a())) {
                this.progressBar.setVisibility(8);
                this.alertButton.setVisibility(8);
                this.tvMessageItemReadStatus.setVisibility(0);
                this.tvMessageItemReadStatus.setText("已读");
                this.tvMessageItemReadStatus.setTextColor(Color.rgb(177, 177, 177));
            }
        } else if (C2452d.m5375g().mo36364n(this.message.getSessionId()) == null || !"1".equals(C2452d.m5375g().mo36364n(this.message.getSessionId()).mo35685a())) {
            this.progressBar.setVisibility(8);
            this.alertButton.setVisibility(8);
            this.tvMessageItemReadStatus.setVisibility(8);
        } else {
            this.progressBar.setVisibility(8);
            this.alertButton.setVisibility(8);
            this.tvMessageItemReadStatus.setVisibility(0);
            this.tvMessageItemReadStatus.setText("未读");
            this.tvMessageItemReadStatus.setTextColor(Color.rgb(51, 136, 255));
        }
    }
}
