package com.qiyukf.nim.uikit.session.emoji;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.p150ui.imageview.CheckedImageButton;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.p212e.C2469e;
import com.qiyukf.unicorn.p213f.C2634c;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.C2714l;
import java.util.List;

public class EmoticonPickerView extends LinearLayout implements AbstractC1988d {

    /* renamed from: a */
    public RequestCallback<List<C2469e>> f3841a = new RequestCallback<List<C2469e>>() {
        /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.C19682 */

        @Override // com.qiyukf.unicorn.api.RequestCallback
        public final void onException(Throwable th) {
            EmoticonPickerView.this.f3858r.post(new Runnable() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.C19682.RunnableC19713 */

                public final void run() {
                    EmoticonPickerView.this.m3898d();
                }
            });
        }

        @Override // com.qiyukf.unicorn.api.RequestCallback
        public final void onFailed(int i) {
            EmoticonPickerView.this.f3858r.post(new Runnable() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.C19682.RunnableC19702 */

                public final void run() {
                    EmoticonPickerView.this.m3898d();
                }
            });
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.unicorn.api.RequestCallback
        public final /* synthetic */ void onSuccess(List<C2469e> list) {
            final List<C2469e> list2 = list;
            EmoticonPickerView.this.f3858r.post(new Runnable() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.C19682.RunnableC19691 */

                public final void run() {
                    if (!EmoticonPickerView.m3891a(list2)) {
                        EmoticonPickerView.m3889a(EmoticonPickerView.this);
                        EmoticonPickerView.this.f3856p.removeAllViews();
                        EmoticonPickerView.this.f3854n.removeAllViews();
                        return;
                    }
                    EmoticonPickerView.this.m3901e();
                    C1995i.m3963a().mo34440a(list2);
                    EmoticonPickerView.this.f3844d.mo34424a(list2);
                    EmoticonPickerView.this.m3893b();
                    EmoticonPickerView.this.f3845e = true;
                    EmoticonPickerView.this.m3896c();
                }
            });
        }
    };

    /* renamed from: b */
    public View.OnClickListener f3842b = new View.OnClickListener() {
        /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.View$OnClickListenerC19723 */

        public final void onClick(View view) {
            EmoticonPickerView.this.m3894b((EmoticonPickerView) view.getId());
        }
    };

    /* renamed from: c */
    public Context f3843c;

    /* renamed from: d */
    public AbstractC1989e f3844d;

    /* renamed from: e */
    public boolean f3845e = false;

    /* renamed from: f */
    public View f3846f;

    /* renamed from: g */
    public C1982c f3847g;

    /* renamed from: h */
    public ViewPager f3848h;

    /* renamed from: i */
    public LinearLayout f3849i;

    /* renamed from: j */
    public TextView f3850j;

    /* renamed from: k */
    public Button f3851k;

    /* renamed from: l */
    public TextView f3852l;

    /* renamed from: m */
    public LinearLayout f3853m;

    /* renamed from: n */
    public LinearLayout f3854n;

    /* renamed from: o */
    public HorizontalScrollView f3855o;

    /* renamed from: p */
    public LinearLayout f3856p;

    /* renamed from: q */
    public int f3857q;

    /* renamed from: r */
    public Handler f3858r;

    public EmoticonPickerView(Context context) {
        super(context);
        m3888a(context);
    }

    public EmoticonPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3888a(context);
    }

    @TargetApi(11)
    public EmoticonPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3888a(context);
    }

    /* renamed from: a */
    private CheckedImageButton m3887a(int i, View.OnClickListener onClickListener) {
        CheckedImageButton checkedImageButton = new CheckedImageButton(this.f3843c);
        checkedImageButton.mo34298b(C2364R.C2366drawable.ysf_sticker_button_background_normal_layer_list);
        checkedImageButton.mo34300c(C2364R.C2366drawable.ysf_sticker_button_background_pressed_layer_list);
        checkedImageButton.setId(i);
        checkedImageButton.setOnClickListener(onClickListener);
        checkedImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        checkedImageButton.mo34294a(C1862c.m3540a(7.0f));
        int a = C1862c.m3540a(50.0f);
        int a2 = C1862c.m3540a(44.0f);
        this.f3856p.addView(checkedImageButton);
        ViewGroup.LayoutParams layoutParams = checkedImageButton.getLayoutParams();
        layoutParams.width = a;
        layoutParams.height = a2;
        checkedImageButton.setLayoutParams(layoutParams);
        return checkedImageButton;
    }

    /* renamed from: a */
    private void m3888a(Context context) {
        this.f3843c = context;
        this.f3858r = new Handler(context.getMainLooper());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C2364R.layout.ysf_emoji_layout, this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3889a(EmoticonPickerView emoticonPickerView) {
        ViewPager viewPager = emoticonPickerView.f3848h;
        if (viewPager != null && emoticonPickerView.f3852l != null && emoticonPickerView.f3849i != null && emoticonPickerView.f3853m != null) {
            viewPager.setVisibility(8);
            emoticonPickerView.f3852l.setVisibility(8);
            emoticonPickerView.f3849i.setVisibility(8);
            emoticonPickerView.f3846f.setVisibility(8);
            emoticonPickerView.f3853m.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static boolean m3891a(List<C2469e> list) {
        if (list.size() == 0) {
            return false;
        }
        return (list.size() == 1 && list.get(0).mo35702a() == -1 && list.get(0).mo35706e() == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m3893b() {
        C1995i a = C1995i.m3963a();
        this.f3856p.removeAllViews();
        int i = 0;
        if (a.mo34443d()) {
            CheckedImageButton a2 = m3887a(0, this.f3842b);
            a2.mo34301d(C2364R.C2366drawable.ysf_emoji_icon_inactive);
            a2.mo34302e(C2364R.C2366drawable.ysf_emoji_icon);
            i = 1;
        }
        for (C1994h hVar : a.mo34442c()) {
            int i2 = i + 1;
            final CheckedImageButton a3 = m3887a(i, this.f3842b);
            C1870a.m3566a(hVar.mo34435c(), 100, 100, new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.C19734 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    a3.mo34295a(bitmap);
                    a3.mo34299b(bitmap);
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                    a3.mo34301d(C2364R.C2366drawable.ysf_emoji_icon_inactive);
                    a3.mo34302e(C2364R.C2366drawable.ysf_emoji_icon);
                }
            });
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m3894b(int i) {
        C1982c cVar;
        m3897c(i);
        if (this.f3847g == null) {
            cVar = new C1982c(this.f3843c, this.f3844d, this.f3848h, this.f3854n);
        } else {
            if (i == 0) {
                cVar = new C1982c(this.f3843c, this.f3844d, this.f3848h, this.f3854n);
            }
            this.f3847g.mo34417a(i);
        }
        this.f3847g = cVar;
        cVar.mo34418a(this);
        this.f3847g.mo34417a(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m3896c() {
        if (this.f3844d == null) {
            C1709a.m3011a("sticker", "show picker view when listener is null");
        }
        m3894b(0);
        this.f3858r.postDelayed(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.RunnableC19745 */

            /* renamed from: a */
            public final /* synthetic */ int f3868a = 0;

            public final void run() {
                if (EmoticonPickerView.this.f3855o.getChildAt(0).getWidth() == 0) {
                    EmoticonPickerView.this.f3858r.postDelayed(this, 100);
                }
                View childAt = EmoticonPickerView.this.f3856p.getChildAt(this.f3868a);
                int right = (childAt == null || childAt.getRight() <= EmoticonPickerView.this.f3855o.getWidth()) ? -1 : childAt.getRight() - EmoticonPickerView.this.f3855o.getWidth();
                if (right != -1) {
                    EmoticonPickerView.this.f3855o.smoothScrollTo(right, 0);
                }
            }
        }, 100);
    }

    /* renamed from: c */
    private void m3897c(int i) {
        for (int i2 = 0; i2 < this.f3856p.getChildCount(); i2++) {
            View childAt = this.f3856p.getChildAt(i2);
            if (childAt instanceof FrameLayout) {
                childAt = ((FrameLayout) childAt).getChildAt(0);
            }
            if (childAt != null && (childAt instanceof CheckedImageButton)) {
                CheckedImageButton checkedImageButton = (CheckedImageButton) childAt;
                if (checkedImageButton.mo34297a() && i2 != i) {
                    checkedImageButton.mo34296a(false);
                } else if (!checkedImageButton.mo34297a() && i2 == i) {
                    checkedImageButton.mo34296a(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m3898d() {
        String str;
        TextView textView;
        ViewPager viewPager = this.f3848h;
        if (viewPager != null && this.f3852l != null && this.f3849i != null && this.f3853m != null) {
            viewPager.setVisibility(8);
            this.f3852l.setVisibility(8);
            this.f3849i.setVisibility(0);
            this.f3853m.setVisibility(8);
            this.f3846f.setVisibility(0);
            C1995i a = C1995i.m3963a();
            if (C2714l.m6275a(this.f3843c) || a.mo34443d() || a.mo34442c().size() != 0) {
                textView = this.f3850j;
                str = "加载失败，请重新加载";
            } else {
                textView = this.f3850j;
                str = "当前网络不可用";
            }
            textView.setText(str);
            this.f3851k.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.View$OnClickListenerC19756 */

                public final void onClick(View view) {
                    new Thread(new Runnable() {
                        /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.View$OnClickListenerC19756.RunnableC19761 */

                        public final void run() {
                            C2634c.m6003a(EmoticonPickerView.this.f3841a);
                        }
                    }).start();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m3901e() {
        ViewPager viewPager = this.f3848h;
        if (viewPager != null && this.f3852l != null && this.f3849i != null && this.f3853m != null) {
            viewPager.setVisibility(0);
            this.f3852l.setVisibility(8);
            this.f3846f.setVisibility(0);
            this.f3853m.setVisibility(8);
            this.f3849i.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo34395a() {
        C1982c cVar = this.f3847g;
        if (cVar != null) {
            cVar.mo34416a();
        }
    }

    @Override // com.qiyukf.nim.uikit.session.emoji.AbstractC1988d
    /* renamed from: a */
    public final void mo34396a(int i) {
        if (this.f3857q != i) {
            this.f3857q = i;
            m3897c(i);
        }
    }

    /* renamed from: a */
    public final void mo34397a(AbstractC1989e eVar) {
        if (eVar != null) {
            this.f3844d = eVar;
        } else {
            C1709a.m3011a("sticker", "listener is null");
        }
        if (!eVar.mo34425a()) {
            if (!C2714l.m6275a(this.f3843c)) {
                m3898d();
                return;
            }
            ViewPager viewPager = this.f3848h;
            if (!(viewPager == null || this.f3852l == null || this.f3849i == null || this.f3853m == null)) {
                viewPager.setVisibility(8);
                this.f3852l.setVisibility(0);
                this.f3849i.setVisibility(8);
                this.f3853m.setVisibility(8);
                this.f3846f.setVisibility(0);
                this.f3852l.setText("正在加载表情请稍后...");
            }
            new Thread(new Runnable() {
                /* class com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView.RunnableC19671 */

                public final void run() {
                    C2634c.m6003a(EmoticonPickerView.this.f3841a);
                }
            }).start();
        } else if (!this.f3845e) {
            m3893b();
            this.f3845e = true;
            m3901e();
            m3896c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3848h = (ViewPager) findViewById(C2364R.C2367id.emotion_icon_pager);
        this.f3846f = findViewById(C2364R.C2367id.bottom_divider_line);
        this.f3854n = (LinearLayout) findViewById(C2364R.C2367id.layout_scr_bottom);
        this.f3856p = (LinearLayout) findViewById(C2364R.C2367id.emoj_tab_view);
        this.f3855o = (HorizontalScrollView) findViewById(C2364R.C2367id.emoj_tab_view_container);
        this.f3852l = (TextView) findViewById(C2364R.C2367id.tv_load_and_fail_message);
        this.f3853m = (LinearLayout) findViewById(C2364R.C2367id.ll_load_empty_parent);
        this.f3849i = (LinearLayout) findViewById(C2364R.C2367id.ll_load_fail_parent);
        this.f3851k = (Button) findViewById(C2364R.C2367id.btn_load_fail_reload);
        C2690a.m6219a().mo36459a(this.f3851k);
        this.f3850j = (TextView) findViewById(C2364R.C2367id.ysf_tv_network_error_pic);
        findViewById(C2364R.C2367id.top_divider_line).setVisibility(0);
    }
}
