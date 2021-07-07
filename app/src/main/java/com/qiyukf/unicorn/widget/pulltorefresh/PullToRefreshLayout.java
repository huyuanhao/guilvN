package com.qiyukf.unicorn.widget.pulltorefresh;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import java.util.Timer;
import java.util.TimerTask;

public class PullToRefreshLayout extends FrameLayout {

    /* renamed from: A */
    public boolean f6631A;

    /* renamed from: B */
    public Runnable f6632B;

    /* renamed from: a */
    public int f6633a;

    /* renamed from: b */
    public AbstractC3031a f6634b;

    /* renamed from: c */
    public float f6635c;

    /* renamed from: d */
    public float f6636d;

    /* renamed from: e */
    public float f6637e;

    /* renamed from: f */
    public float f6638f;

    /* renamed from: g */
    public float f6639g;

    /* renamed from: h */
    public C3032b f6640h;

    /* renamed from: i */
    public Handler f6641i;

    /* renamed from: j */
    public boolean f6642j;

    /* renamed from: k */
    public boolean f6643k;

    /* renamed from: l */
    public float f6644l;

    /* renamed from: m */
    public RotateAnimation f6645m;

    /* renamed from: n */
    public RotateAnimation f6646n;

    /* renamed from: o */
    public View f6647o;

    /* renamed from: p */
    public ImageView f6648p;

    /* renamed from: q */
    public ProgressBar f6649q;

    /* renamed from: r */
    public TextView f6650r;

    /* renamed from: s */
    public View f6651s;

    /* renamed from: t */
    public ImageView f6652t;

    /* renamed from: u */
    public ProgressBar f6653u;

    /* renamed from: v */
    public TextView f6654v;

    /* renamed from: w */
    public View f6655w;

    /* renamed from: x */
    public int f6656x;

    /* renamed from: y */
    public boolean f6657y;

    /* renamed from: z */
    public boolean f6658z;

    /* renamed from: com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout$a */
    public interface AbstractC3031a {
        /* renamed from: a_ */
        void mo36648a_();
    }

    /* renamed from: com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout$b */
    public class C3032b {

        /* renamed from: b */
        public Timer f6663b = new Timer();

        /* renamed from: c */
        public C3033a f6664c;

        /* renamed from: d */
        public boolean f6665d = false;

        /* renamed from: com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout$b$a */
        public class C3033a extends TimerTask {
            public C3033a() {
            }

            public /* synthetic */ C3033a(C3032b bVar, byte b) {
                this();
            }

            public final void run() {
                PullToRefreshLayout.this.f6641i.post(PullToRefreshLayout.this.f6632B);
            }
        }

        public C3032b() {
        }

        /* renamed from: a */
        public final void mo36912a() {
            if (!this.f6665d) {
                C3033a aVar = this.f6664c;
                if (aVar != null) {
                    aVar.cancel();
                    this.f6664c = null;
                }
                C3033a aVar2 = new C3033a(this, (byte) 0);
                this.f6664c = aVar2;
                this.f6663b.schedule(aVar2, 0, 5);
            }
        }

        /* renamed from: b */
        public final void mo36913b() {
            C3033a aVar = this.f6664c;
            if (aVar != null) {
                aVar.cancel();
                this.f6664c = null;
            }
        }

        /* renamed from: c */
        public final void mo36914c() {
            this.f6665d = true;
            mo36913b();
            this.f6663b.cancel();
        }
    }

    public PullToRefreshLayout(Context context) {
        this(context, null);
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6633a = 0;
        this.f6635c = 0.0f;
        this.f6636d = 0.0f;
        this.f6638f = 200.0f;
        this.f6639g = 200.0f;
        this.f6640h = new C3032b();
        this.f6641i = new Handler();
        this.f6642j = false;
        this.f6643k = false;
        this.f6644l = 2.0f;
        this.f6657y = true;
        this.f6658z = true;
        this.f6631A = true;
        this.f6632B = new Runnable() {
            /* class com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.RunnableC30303 */

            public final void run() {
                double measuredHeight = (double) PullToRefreshLayout.this.getMeasuredHeight();
                Double.isNaN(measuredHeight);
                double d = 1.5707963267948966d / measuredHeight;
                double abs = (double) (PullToRefreshLayout.this.f6635c + Math.abs(PullToRefreshLayout.this.f6636d));
                Double.isNaN(abs);
                float tan = (float) ((Math.tan(d * abs) * 5.0d) + 8.0d);
                if (!PullToRefreshLayout.this.f6643k) {
                    if (PullToRefreshLayout.this.f6633a == 2 && PullToRefreshLayout.this.f6635c <= PullToRefreshLayout.this.f6638f) {
                        PullToRefreshLayout pullToRefreshLayout = PullToRefreshLayout.this;
                        pullToRefreshLayout.f6635c = pullToRefreshLayout.f6638f;
                    } else if (PullToRefreshLayout.this.f6633a == 4 && (-PullToRefreshLayout.this.f6636d) <= PullToRefreshLayout.this.f6639g) {
                        PullToRefreshLayout pullToRefreshLayout2 = PullToRefreshLayout.this;
                        pullToRefreshLayout2.f6636d = -pullToRefreshLayout2.f6639g;
                    }
                    PullToRefreshLayout.this.f6640h.mo36913b();
                }
                if (PullToRefreshLayout.this.f6635c > 0.0f) {
                    PullToRefreshLayout.this.f6635c -= tan;
                } else if (PullToRefreshLayout.this.f6636d < 0.0f) {
                    PullToRefreshLayout.this.f6636d += tan;
                }
                if (PullToRefreshLayout.this.f6635c < 0.0f) {
                    PullToRefreshLayout.this.f6635c = 0.0f;
                    PullToRefreshLayout.this.f6648p.clearAnimation();
                    if (!(PullToRefreshLayout.this.f6633a == 2 || PullToRefreshLayout.this.f6633a == 4)) {
                        PullToRefreshLayout.this.m7084b((PullToRefreshLayout) 0);
                    }
                    PullToRefreshLayout.this.f6640h.mo36913b();
                    PullToRefreshLayout.this.requestLayout();
                }
                if (PullToRefreshLayout.this.f6636d > 0.0f) {
                    PullToRefreshLayout.this.f6636d = 0.0f;
                    PullToRefreshLayout.this.f6652t.clearAnimation();
                    if (!(PullToRefreshLayout.this.f6633a == 2 || PullToRefreshLayout.this.f6633a == 4)) {
                        PullToRefreshLayout.this.m7084b((PullToRefreshLayout) 0);
                    }
                    PullToRefreshLayout.this.f6640h.mo36913b();
                    PullToRefreshLayout.this.requestLayout();
                }
                PullToRefreshLayout.this.requestLayout();
                if (PullToRefreshLayout.this.f6635c + Math.abs(PullToRefreshLayout.this.f6636d) == 0.0f) {
                    PullToRefreshLayout.this.f6640h.mo36913b();
                }
            }
        };
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        this.f6645m = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f6645m.setFillAfter(true);
        this.f6645m.setDuration(100);
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f6646n = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.f6646n.setFillAfter(true);
        this.f6646n.setDuration(100);
    }

    /* renamed from: a */
    private void m7078a() {
        this.f6657y = true;
        this.f6658z = true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m7083b() {
        C3032b bVar = this.f6640h;
        if (bVar != null) {
            bVar.mo36912a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m7084b(int i) {
        TextView textView;
        int i2;
        this.f6633a = i;
        if (i == 0) {
            if (this.f6648p.getAnimation() != null) {
                this.f6648p.startAnimation(this.f6646n);
            }
            this.f6648p.setVisibility(0);
            this.f6650r.setText(C2364R.string.ysf_ptr_pull_to_refresh);
            if (this.f6652t.getAnimation() != null) {
                this.f6652t.startAnimation(this.f6646n);
            }
            this.f6652t.setVisibility(0);
            textView = this.f6654v;
            i2 = C2364R.string.ysf_ptr_pull_to_load;
        } else if (i == 1) {
            this.f6648p.startAnimation(this.f6645m);
            textView = this.f6650r;
            i2 = C2364R.string.ysf_ptr_release_to_refresh;
        } else if (i == 2) {
            this.f6648p.clearAnimation();
            this.f6648p.setVisibility(4);
            this.f6649q.setVisibility(0);
            textView = this.f6650r;
            i2 = C2364R.string.ysf_ptr_refreshing;
        } else if (i == 3) {
            this.f6652t.startAnimation(this.f6645m);
            textView = this.f6654v;
            i2 = C2364R.string.ysf_ptr_release_to_load;
        } else if (i == 4) {
            this.f6652t.clearAnimation();
            this.f6652t.setVisibility(4);
            this.f6653u.setVisibility(0);
            this.f6654v.setText(C2364R.string.ysf_ptr_loading);
            return;
        } else {
            return;
        }
        textView.setText(i2);
    }

    /* renamed from: a */
    public final void mo36902a(int i) {
        ProgressBar progressBar = this.f6653u;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        this.f6654v.setText(i != 0 ? i != 2 ? C2364R.string.ysf_ptr_load_failed : C2364R.string.ysf_ptr_load_completed : C2364R.string.ysf_ptr_load_succeed);
        if (this.f6636d >= 0.0f || !(i == 1 || i == 2)) {
            m7084b(5);
            post(new Runnable() {
                /* class com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.RunnableC30292 */

                public final void run() {
                    ((AbstractC3034a) PullToRefreshLayout.this.f6655w).mo36916a((int) (-PullToRefreshLayout.this.f6636d));
                    PullToRefreshLayout.this.f6636d = 0.0f;
                    PullToRefreshLayout.this.requestLayout();
                }
            });
            return;
        }
        postDelayed(new Runnable() {
            /* class com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.RunnableC30281 */

            public final void run() {
                PullToRefreshLayout.this.m7084b((PullToRefreshLayout) 5);
                PullToRefreshLayout.this.m7083b();
            }
        }, 1000);
    }

    /* renamed from: a */
    public final void mo36903a(AbstractC3031a aVar) {
        this.f6634b = aVar;
    }

    /* renamed from: a */
    public final void mo36904a(boolean z) {
        this.f6631A = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r12.f6633a == 4) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r12.f6633a == 2) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.widget.pulltorefresh.PullToRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (!this.f6642j) {
            View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_ptr_header, (ViewGroup) this, false);
            this.f6647o = inflate;
            addView(inflate, 0, layoutParams);
            View inflate2 = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_ptr_footer, (ViewGroup) this, false);
            this.f6651s = inflate2;
            addView(inflate2, layoutParams);
        }
    }

    public void onDetachedFromWindow() {
        this.f6640h.mo36914c();
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f6642j) {
            this.f6647o = getChildAt(0);
            this.f6655w = getChildAt(1);
            this.f6651s = getChildAt(2);
            this.f6642j = true;
            this.f6648p = (ImageView) this.f6647o.findViewById(C2364R.C2367id.ysf_ptr_header_pull_icon);
            this.f6649q = (ProgressBar) this.f6647o.findViewById(C2364R.C2367id.ysf_ptr_header_refreshing_icon);
            this.f6650r = (TextView) this.f6647o.findViewById(C2364R.C2367id.ysf_ptr_header_state_hint);
            this.f6652t = (ImageView) this.f6651s.findViewById(C2364R.C2367id.ysf_ptr_footer_pull_icon);
            this.f6653u = (ProgressBar) this.f6651s.findViewById(C2364R.C2367id.ysf_ptr_footer_loading_icon);
            this.f6654v = (TextView) this.f6651s.findViewById(C2364R.C2367id.ysf_ptr_footer_state_hint);
            this.f6638f = (float) ((ViewGroup) this.f6647o).getChildAt(0).getMeasuredHeight();
            this.f6639g = (float) ((ViewGroup) this.f6651s).getChildAt(0).getMeasuredHeight();
        }
        View view = this.f6647o;
        view.layout(0, ((int) (this.f6635c + this.f6636d)) - view.getMeasuredHeight(), this.f6647o.getMeasuredWidth(), (int) (this.f6635c + this.f6636d));
        View view2 = this.f6655w;
        view2.layout(0, (int) (this.f6635c + this.f6636d), view2.getMeasuredWidth(), ((int) (this.f6635c + this.f6636d)) + this.f6655w.getMeasuredHeight());
        this.f6651s.layout(0, ((int) (this.f6635c + this.f6636d)) + this.f6655w.getMeasuredHeight(), this.f6651s.getMeasuredWidth(), ((int) (this.f6635c + this.f6636d)) + this.f6655w.getMeasuredHeight() + this.f6651s.getMeasuredHeight());
        if (!this.f6631A) {
            this.f6651s.setVisibility(8);
        }
    }
}
