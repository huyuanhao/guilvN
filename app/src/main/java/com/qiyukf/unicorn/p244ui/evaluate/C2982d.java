package com.qiyukf.unicorn.p244ui.evaluate;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2433b;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.evaluation.EvaluationApi;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p229h.C2658a;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p232k.C2724p;
import com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.evaluate.d */
public final class C2982d {

    /* renamed from: a */
    public Fragment f6486a;

    /* renamed from: b */
    public Context f6487b;

    /* renamed from: c */
    public List<View> f6488c;

    /* renamed from: d */
    public List<ImageView> f6489d;

    /* renamed from: e */
    public List<String> f6490e;

    /* renamed from: f */
    public DialogC2972b f6491f;

    /* renamed from: g */
    public String f6492g;

    /* renamed from: h */
    public int f6493h = 0;

    /* renamed from: i */
    public boolean f6494i = false;

    public C2982d(Fragment fragment, String str) {
        this.f6486a = fragment;
        this.f6492g = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m6935a(C2982d dVar, int i, List list, String str, int i2) {
        dVar.f6491f.mo36806a(false);
        dVar.f6491f.mo36807b(true);
        C2452d.m5375g().mo36350c().mo36319a(dVar.f6492g, i, str, list, i2, new RequestCallbackWrapper<String>() {
            /* class com.qiyukf.unicorn.p244ui.evaluate.C2982d.C29842 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, String str, Throwable th) {
                if (i == 200 && C2982d.this.f6491f != null) {
                    C2982d.this.f6491f.cancel();
                    C2982d.this.f6491f = null;
                } else if (i != 200 && C2982d.this.f6491f != null && C2982d.this.f6491f.isShowing()) {
                    C2982d.this.f6491f.mo36806a(true);
                    C2982d.this.f6491f.mo36807b(false);
                    C1865f.m3557a(C2982d.this.f6487b.getString(C2364R.string.ysf_network_error));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo36819a() {
        if (this.f6488c != null) {
            C2706g.m6260a(this.f6486a);
            if (this.f6493h == 1) {
                C2452d.m5375g();
                C2555c a = C2658a.m6097a(this.f6492g);
                long m = C2437b.m5290m(String.valueOf(C2437b.m5282i(this.f6492g)));
                if ((a == null || System.currentTimeMillis() > (a.mo35963f().longValue() * 60 * 1000) + m) && m != 0) {
                    C1865f.m3555a(C2364R.string.ysf_evaluation_time_out);
                    return;
                }
                List<ImageView> list = this.f6489d;
                if (!(list == null || list.get(0) == null)) {
                    this.f6489d.get(0).clearAnimation();
                }
                DialogC2972b bVar = new DialogC2972b(this.f6487b, this.f6492g);
                this.f6491f = bVar;
                bVar.setCanceledOnTouchOutside(false);
                this.f6491f.mo36805a(new DialogC2972b.AbstractC2980a() {
                    /* class com.qiyukf.unicorn.p244ui.evaluate.C2982d.C29831 */

                    @Override // com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.AbstractC2980a
                    public final void onSubmit(int i, List<String> list, String str, String str2, int i2) {
                        C2982d.m6935a(C2982d.this, i, list, str, i2);
                    }
                });
                this.f6491f.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo36820a(View view, String str) {
        if (view != null) {
            if (this.f6488c == null) {
                this.f6489d = new ArrayList();
                this.f6488c = new ArrayList();
                this.f6490e = new ArrayList();
                this.f6487b = view.getContext();
            }
            this.f6488c.add(view);
            this.f6490e.add(str);
            this.f6489d.add((ImageView) view.findViewById(C2364R.C2367id.ysf_action_menu_icon));
        }
    }

    /* renamed from: a */
    public final void mo36821a(String str) {
        this.f6492g = str;
    }

    /* renamed from: a */
    public final void mo36822a(boolean z) {
        this.f6494i = z;
        mo36823b();
    }

    /* renamed from: b */
    public final void mo36823b() {
        Context context;
        boolean z = false;
        if (this.f6494i) {
            this.f6493h = C2437b.m5286k(this.f6492g);
        } else {
            this.f6493h = 0;
        }
        if (C2433b.m5229a().mo35650b() != null) {
            C2433b.m5229a();
        }
        if (EvaluationApi.getInstance().getOnEvaluationEventListener() != null) {
            EvaluationApi.getInstance().getOnEvaluationEventListener().onEvaluationStateChange(this.f6493h);
        }
        List<View> list = this.f6488c;
        if (list != null) {
            for (View view : list) {
                C2724p.m6289a(view, this.f6493h != 0);
            }
            if (!(this.f6489d == null || this.f6488c == null)) {
                for (int i = 0; i < this.f6489d.size(); i++) {
                    ImageView imageView = this.f6489d.get(i);
                    if (this.f6493h != 2 || TextUtils.isEmpty(this.f6490e.get(i)) || (context = this.f6487b) == null) {
                        imageView.setImageLevel(this.f6493h);
                    } else {
                        int dimension = (int) context.getResources().getDimension(C2364R.dimen.ysf_title_bar_icon_size);
                        C1870a.m3568a(this.f6490e.get(i), imageView, dimension, dimension);
                    }
                }
                for (ImageView imageView2 : this.f6489d) {
                }
                if (this.f6493h == 0 && this.f6489d.get(0) != null) {
                    this.f6489d.get(0).clearAnimation();
                }
            }
        }
        if (C2437b.m5284j(this.f6492g) == 4) {
            z = true;
        }
        if (this.f6494i && z) {
            mo36824c();
        }
    }

    /* renamed from: c */
    public final void mo36824c() {
        if (this.f6488c != null && this.f6493h == 1) {
            DialogC2972b bVar = this.f6491f;
            if (bVar == null || !bVar.isShowing()) {
                C2437b.m5244a(this.f6492g, -1);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -8.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new CycleInterpolator(3.0f));
                rotateAnimation.setDuration(400);
                rotateAnimation.setStartOffset(800);
                rotateAnimation.setRepeatCount(4);
                List<ImageView> list = this.f6489d;
                if (list != null && list.get(0) != null) {
                    this.f6489d.get(0).startAnimation(rotateAnimation);
                }
            }
        }
    }
}
