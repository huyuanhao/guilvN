package com.megvii.meglive_sdk.detect.color;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.megvii.action.fmp.liveness.lib.p089a.C1456d;
import com.megvii.action.fmp.liveness.lib.p090b.C1461e;
import com.megvii.action.fmp.liveness.lib.p091c.C1464c;
import com.megvii.meglive_sdk.C1503R;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p096b.C1516c;
import com.megvii.meglive_sdk.p098d.C1523c;
import com.megvii.meglive_sdk.p098d.C1524d;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b;
import com.megvii.meglive_sdk.p100e.p101a.p102a.C1534a;
import com.megvii.meglive_sdk.p100e.p101a.p102a.C1537c;
import com.megvii.meglive_sdk.p100e.p101a.p102a.C1538d;
import com.megvii.meglive_sdk.p100e.p105c.C1550a;
import com.megvii.meglive_sdk.p106f.C1562d;
import com.megvii.meglive_sdk.p106f.C1564f;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1566h;
import com.megvii.meglive_sdk.p106f.C1567i;
import com.megvii.meglive_sdk.p106f.C1569k;
import com.megvii.meglive_sdk.p106f.C1570l;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1575p;
import com.megvii.meglive_sdk.p106f.C1577r;
import com.megvii.meglive_sdk.p106f.C1580u;
import com.megvii.meglive_sdk.p106f.C1581v;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.C1584y;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import com.megvii.meglive_sdk.view.color.CameraGLColorfulView;
import com.megvii.meglive_sdk.view.color.CoverColorfulView;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1613c;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C7546o0o000O0;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.umeng.message.common.C3777a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

public class FmpColorfulActivity extends Activity implements Camera.PreviewCallback, TextureView.SurfaceTextureListener, View.OnClickListener, CameraGLColorfulView.AbstractC1592c {

    /* renamed from: a */
    public static String f2231a = "";

    /* renamed from: A */
    public String f2232A;

    /* renamed from: B */
    public Handler f2233B = null;

    /* renamed from: C */
    public Handler f2234C = null;

    /* renamed from: D */
    public C1567i f2235D;

    /* renamed from: E */
    public C1550a f2236E;

    /* renamed from: F */
    public int f2237F;

    /* renamed from: G */
    public int f2238G = 3;

    /* renamed from: H */
    public int f2239H = 0;

    /* renamed from: I */
    public boolean f2240I = false;

    /* renamed from: J */
    public boolean f2241J = false;

    /* renamed from: K */
    public List<Integer> f2242K;

    /* renamed from: L */
    public int f2243L = 0;

    /* renamed from: M */
    public int f2244M = 1;

    /* renamed from: N */
    public int f2245N = 2;

    /* renamed from: O */
    public int f2246O = 3;

    /* renamed from: P */
    public int f2247P = 4;

    /* renamed from: Q */
    public int f2248Q = 5;

    /* renamed from: R */
    public int f2249R = 6;

    /* renamed from: S */
    public String f2250S = "521";

    /* renamed from: T */
    public float f2251T = 0.8f;

    /* renamed from: U */
    public float f2252U = 8.1f;

    /* renamed from: V */
    public float f2253V = 5.5f;

    /* renamed from: W */
    public int f2254W = 0;

    /* renamed from: X */
    public int f2255X = 120;

    /* renamed from: Y */
    public int f2256Y = 3;

    /* renamed from: Z */
    public int f2257Z = 4;

    /* renamed from: aA */
    public boolean f2258aA = false;

    /* renamed from: aB */
    public int f2259aB = 0;

    /* renamed from: aC */
    public int f2260aC = -1;

    /* renamed from: aD */
    public C1464c f2261aD;

    /* renamed from: aE */
    public boolean f2262aE = false;

    /* renamed from: aF */
    public int f2263aF;

    /* renamed from: aG */
    public float f2264aG = 0.025f;

    /* renamed from: aH */
    public int f2265aH = 0;

    /* renamed from: aI */
    public float f2266aI = -1.0f;

    /* renamed from: aJ */
    public boolean f2267aJ = false;

    /* renamed from: aK */
    public int f2268aK = 0;

    /* renamed from: aL */
    public String f2269aL = "";

    /* renamed from: aM */
    public Runnable f2270aM = new OooO0OO();

    /* renamed from: aN */
    public Runnable f2271aN = new OooOOOO();

    /* renamed from: aO */
    public long f2272aO = 0;

    /* renamed from: aP */
    public long f2273aP = 0;

    /* renamed from: aQ */
    public long f2274aQ = 0;

    /* renamed from: aR */
    public boolean f2275aR = true;

    /* renamed from: aS */
    public Runnable f2276aS = new OooOO0();

    /* renamed from: aT */
    public C1537c f2277aT;

    /* renamed from: aU */
    public boolean f2278aU = true;

    /* renamed from: aV */
    public boolean f2279aV = false;

    /* renamed from: aW */
    public String f2280aW = "";

    /* renamed from: aX */
    public final AbstractRunnableC1535b.AbstractC1536a f2281aX = new OooOOO0();

    /* renamed from: aa */
    public int f2282aa = 10;

    /* renamed from: ab */
    public String[] f2283ab;

    /* renamed from: ac */
    public int f2284ac = 0;

    /* renamed from: ad */
    public int f2285ad = 0;

    /* renamed from: ae */
    public int f2286ae = -1;

    /* renamed from: af */
    public int f2287af;

    /* renamed from: ag */
    public int[] f2288ag = {0, 0, 0};

    /* renamed from: ah */
    public long f2289ah;

    /* renamed from: ai */
    public long f2290ai;

    /* renamed from: aj */
    public final long f2291aj = 500;

    /* renamed from: ak */
    public boolean f2292ak = true;

    /* renamed from: al */
    public String f2293al = "";

    /* renamed from: am */
    public boolean f2294am = false;

    /* renamed from: an */
    public float f2295an = 0.0f;

    /* renamed from: ao */
    public float f2296ao = 0.0f;

    /* renamed from: ap */
    public ValueAnimator f2297ap;

    /* renamed from: aq */
    public ValueAnimator f2298aq;

    /* renamed from: ar */
    public ValueAnimator f2299ar;

    /* renamed from: as */
    public ValueAnimator f2300as;

    /* renamed from: at */
    public ValueAnimator f2301at;

    /* renamed from: au */
    public ValueAnimator f2302au;

    /* renamed from: av */
    public volatile int f2303av = -1;

    /* renamed from: aw */
    public int f2304aw = -1;

    /* renamed from: ax */
    public boolean f2305ax = false;

    /* renamed from: ay */
    public volatile boolean f2306ay = false;

    /* renamed from: az */
    public boolean f2307az = false;

    /* renamed from: b */
    public AnimatorSet f2308b;

    /* renamed from: c */
    public boolean f2309c = false;

    /* renamed from: d */
    public C1525e f2310d;

    /* renamed from: e */
    public TextureView f2311e;

    /* renamed from: f */
    public CameraGLColorfulView f2312f;

    /* renamed from: g */
    public CoverColorfulView f2313g;

    /* renamed from: h */
    public ProgressBar f2314h;

    /* renamed from: i */
    public ImageView f2315i;

    /* renamed from: j */
    public ImageView f2316j;

    /* renamed from: k */
    public ImageView f2317k;

    /* renamed from: l */
    public ImageView f2318l;

    /* renamed from: m */
    public ImageView f2319m;

    /* renamed from: n */
    public AlertDialog f2320n;

    /* renamed from: o */
    public LinearLayout f2321o;

    /* renamed from: p */
    public LinearLayout f2322p;

    /* renamed from: q */
    public TextView f2323q;

    /* renamed from: r */
    public C1570l f2324r;

    /* renamed from: s */
    public boolean f2325s = false;

    /* renamed from: t */
    public Handler f2326t;

    /* renamed from: u */
    public byte[] f2327u;

    /* renamed from: v */
    public C1524d f2328v;

    /* renamed from: w */
    public C1516c f2329w;

    /* renamed from: x */
    public int f2330x;

    /* renamed from: y */
    public C1584y f2331y;

    /* renamed from: z */
    public String f2332z;

    public class OooO implements Runnable {
        public OooO() {
        }

        public final void run() {
            if (!FmpColorfulActivity.this.isFinishing()) {
                FmpColorfulActivity.this.finish();
            }
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpColorfulActivity.this.f2313g.setThreeCircleAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2313g.getMCenterX();
            float mCenterY = FmpColorfulActivity.this.f2313g.getMCenterY();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, (int) (mCenterY - ((float) (((int) FmpColorfulActivity.this.getResources().getDimension(C1503R.dimen.liveness_progress_maxsize)) / 2))), 0, 0);
            FmpColorfulActivity.this.f2321o.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooO0Oo  reason: case insensitive filesystem */
    public class C5127OooO0Oo extends AnimatorListenerAdapter {
        public C5127OooO0Oo() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FmpColorfulActivity.this.f2294am = false;
            FmpColorfulActivity.m2450q(FmpColorfulActivity.this);
            if (FmpColorfulActivity.this.f2265aH == 1) {
                FmpColorfulActivity.this.m2406a((FmpColorfulActivity) C1562d.m2626a(2));
            } else if (FmpColorfulActivity.this.f2265aH == 2) {
                FmpColorfulActivity.this.m2406a((FmpColorfulActivity) C1562d.m2626a(1));
                FmpColorfulActivity.this.f2265aH = 0;
            }
        }
    }

    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2315i.setColorFilter(Color.rgb(255, 255, 255));
            FmpColorfulActivity.this.f2315i.setImageDrawable(FmpColorfulActivity.this.getResources().getDrawable(C1503R.mipmap.bg_view_color_circle));
            FmpColorfulActivity.this.f2319m.setVisibility(8);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooO0o0  reason: case insensitive filesystem */
    public class RunnableC5128OooO0o0 implements Runnable {
        public RunnableC5128OooO0o0() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2308b.start();
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooO0oO  reason: case insensitive filesystem */
    public class RunnableC5129OooO0oO implements Runnable {
        public RunnableC5129OooO0oO() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2274aQ = System.currentTimeMillis();
            FmpColorfulActivity.this.f2321o.setVisibility(0);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooO0oo  reason: case insensitive filesystem */
    public class RunnableC5130OooO0oo implements Runnable {
        public final /* synthetic */ int o00oO0O;

        public RunnableC5130OooO0oo(int i) {
            this.o00oO0O = i;
        }

        public final void run() {
            FmpColorfulActivity.this.f2323q.setText(C1580u.m2676a(FmpColorfulActivity.this).mo17199b(FmpColorfulActivity.this.getResources().getString(C1503R.string.key_liveness_too_bright_text)));
            FmpColorfulActivity.this.f2323q.setVisibility(this.o00oO0O);
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        public final void run() {
            try {
                if (FmpColorfulActivity.this.f2320n != null) {
                    FmpColorfulActivity.this.f2320n.dismiss();
                }
                FmpColorfulActivity.this.f2260aC = 1;
                FmpColorfulActivity.this.f2309c = true;
                FmpColorfulActivity.this.m2419c((FmpColorfulActivity) 1);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2315i.setColorFilter(Color.rgb(255, 255, 255));
            FmpColorfulActivity.this.f2315i.setImageDrawable(FmpColorfulActivity.this.getResources().getDrawable(C1503R.mipmap.bg_view_color_circle));
            FmpColorfulActivity.this.f2319m.setVisibility(8);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOO0o  reason: case insensitive filesystem */
    public class RunnableC5131OooOO0o implements Runnable {
        public RunnableC5131OooOO0o() {
        }

        public final void run() {
            if (FmpColorfulActivity.this.f2327u == null) {
                FmpColorfulActivity.this.mo17046a(EnumC1568j.DEVICE_NOT_SUPPORT, (String) null);
            }
        }
    }

    public class OooOOO implements Runnable {
        public OooOOO() {
        }

        public final void run() {
            if (FmpColorfulActivity.this.f2242K != null && FmpColorfulActivity.this.f2242K.size() > 0) {
                FmpColorfulActivity fmpColorfulActivity = FmpColorfulActivity.this;
                fmpColorfulActivity.f2287af = ((Integer) fmpColorfulActivity.f2242K.get(FmpColorfulActivity.this.f2285ad)).intValue();
                FmpColorfulActivity fmpColorfulActivity2 = FmpColorfulActivity.this;
                fmpColorfulActivity2.f2288ag = C1562d.m2626a(fmpColorfulActivity2.f2287af);
                FmpColorfulActivity.this.f2313g.setFalshDraw(FmpColorfulActivity.this.f2288ag);
                FmpColorfulActivity.this.f2315i.setImageDrawable(FmpColorfulActivity.this.getResources().getDrawable(C1503R.mipmap.bg_view_color_shade));
                FmpColorfulActivity.this.f2315i.setColorFilter(Color.rgb(FmpColorfulActivity.this.f2288ag[0], FmpColorfulActivity.this.f2288ag[1], FmpColorfulActivity.this.f2288ag[2]));
                if (FmpColorfulActivity.this.f2285ad < FmpColorfulActivity.this.f2282aa - 1) {
                    FmpColorfulActivity.m2394K(FmpColorfulActivity.this);
                }
            }
        }
    }

    public class OooOOO0 implements AbstractRunnableC1535b.AbstractC1536a {
        public OooOOO0() {
        }

        @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b.AbstractC1536a
        /* renamed from: a */
        public final void mo17072a(AbstractRunnableC1535b bVar) {
            if (bVar instanceof C1538d) {
                FmpColorfulActivity.this.f2312f.setVideoEncoder((C1538d) bVar);
            }
        }

        @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b.AbstractC1536a
        /* renamed from: b */
        public final void mo17073b(AbstractRunnableC1535b bVar) {
            if (bVar instanceof C1538d) {
                FmpColorfulActivity.this.f2312f.setVideoEncoder(null);
            }
        }

        @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b.AbstractC1536a
        /* renamed from: c */
        public final void mo17074c(AbstractRunnableC1535b bVar) {
            if (!(bVar instanceof C1538d)) {
                return;
            }
            if (FmpColorfulActivity.this.f2303av == FmpColorfulActivity.this.f2245N || FmpColorfulActivity.this.f2309c) {
                C1571m.m2654a("onReleased: failedType=" + FmpColorfulActivity.this.f2260aC + ", liveness_failure_reason=" + FmpColorfulActivity.this.f2259aB + ",curStep=" + FmpColorfulActivity.this.f2303av + ",lastStep=" + FmpColorfulActivity.this.f2304aw);
                C1575p.m2665a("MediaColorEncoder onReleased...");
                FmpColorfulActivity.this.m2423d((FmpColorfulActivity) true);
            }
        }
    }

    public class OooOOOO implements Runnable {
        public OooOOOO() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2240I = true;
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOOOo  reason: case insensitive filesystem */
    public class RunnableC5132OooOOOo implements Runnable {
        public final /* synthetic */ Camera.Size OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f15081OooO00o;

        public RunnableC5132OooOOOo(byte[] bArr, Camera.Size size) {
            this.f15081OooO00o = bArr;
            this.OooO00o = size;
        }

        public final void run() {
            FmpColorfulActivity fmpColorfulActivity = FmpColorfulActivity.this;
            byte[] bArr = this.f15081OooO00o;
            Camera.Size size = this.OooO00o;
            FmpColorfulActivity.m2402a(fmpColorfulActivity, bArr, size.width, size.height);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOOo  reason: case insensitive filesystem */
    public class RunnableC5133OooOOo implements Runnable {
        public final /* synthetic */ boolean OooO0O0;

        public RunnableC5133OooOOo(boolean z) {
            this.OooO0O0 = z;
        }

        public final void run() {
            if (FmpColorfulActivity.m2424d()) {
                FmpColorfulActivity.m2413b(FmpColorfulActivity.this, this.OooO0O0);
            } else if (FmpColorfulActivity.this.f2236E != null) {
                C1550a aVar = FmpColorfulActivity.this.f2236E;
                C1550a.C1552b bVar = aVar.f2534a;
                if (bVar != null) {
                    bVar.f2552g = false;
                    bVar.f2546a.flush();
                    bVar.f2546a.stop();
                    bVar.f2546a.release();
                }
                C1550a.C1551a aVar2 = aVar.f2535b;
                if (aVar2 != null) {
                    aVar2.f2544b = false;
                    aVar2.f2543a = false;
                    aVar2.f2545c.flush();
                    aVar2.f2545c.stop();
                    aVar2.f2545c.release();
                }
                FmpColorfulActivity fmpColorfulActivity = FmpColorfulActivity.this;
                fmpColorfulActivity.f2280aW = fmpColorfulActivity.f2236E.f2536c;
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOOo0  reason: case insensitive filesystem */
    public class RunnableC5134OooOOo0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f15082OooO00o;

        public RunnableC5134OooOOo0(byte[] bArr) {
            this.f15082OooO00o = bArr;
        }

        public final void run() {
            if (!FmpColorfulActivity.this.f2258aA) {
                return;
            }
            if (!FmpColorfulActivity.m2424d()) {
                if (!FmpColorfulActivity.this.f2307az) {
                    C1571m.m2655a(C7383o0OOO0O.OooOOO0, "mIMediaMuxer init...");
                    FmpColorfulActivity.this.f2236E = new C1550a(FmpColorfulActivity.this);
                    C1550a aVar = FmpColorfulActivity.this.f2236E;
                    if (C1550a.m2616a() && aVar.f2534a == null) {
                        aVar.f2534a = new C1550a.C1552b();
                    }
                    FmpColorfulActivity.this.f2273aP = System.currentTimeMillis();
                }
                C1550a aVar2 = FmpColorfulActivity.this.f2236E;
                byte[] a = C1581v.m2684a(this.f15082OooO00o, FmpColorfulActivity.this.f2324r.f2603b, FmpColorfulActivity.this.f2324r.f2604c, 360 - FmpColorfulActivity.this.f2324r.f2606e);
                C1550a.C1552b bVar = aVar2.f2534a;
                if (bVar != null) {
                    bVar.f2552g = true;
                    if (bVar.f2551f.size() >= bVar.f2551f.size()) {
                        bVar.f2551f.poll();
                    }
                    bVar.f2551f.add(a);
                }
                C1550a.C1551a aVar3 = aVar2.f2535b;
                if (aVar3 != null) {
                    aVar3.f2543a = true;
                    aVar3.f2544b = true;
                }
                FmpColorfulActivity.this.f2307az = true;
            } else if (!FmpColorfulActivity.this.f2307az) {
                FmpColorfulActivity fmpColorfulActivity = FmpColorfulActivity.this;
                fmpColorfulActivity.f2307az = fmpColorfulActivity.m2447o();
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOOoo  reason: case insensitive filesystem */
    public class RunnableC5135OooOOoo implements Runnable {
        public RunnableC5135OooOOoo() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2316j.setImageDrawable(FmpColorfulActivity.this.getResources().getDrawable(C1503R.mipmap.icon_flash_close_normal));
        }
    }

    public class OooOo extends AnimatorListenerAdapter {
        public OooOo() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOo0  reason: case insensitive filesystem */
    public class C5136OooOo0 implements ValueAnimator.AnimatorUpdateListener {
        public C5136OooOo0() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpColorfulActivity.this.f2313g.setOneCircleRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FmpColorfulActivity.this.f2313g.setIsOneStart(true);
        }
    }

    public class OooOo00 implements Runnable {
        public OooOo00() {
        }

        public final void run() {
            FmpColorfulActivity.this.f2316j.setImageDrawable(FmpColorfulActivity.this.getResources().getDrawable(C1503R.mipmap.icon_flash_close_white));
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOo0O  reason: case insensitive filesystem */
    public class C5137OooOo0O extends AnimatorListenerAdapter {
        public C5137OooOo0O() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            FmpColorfulActivity.this.m2425e();
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOo0o  reason: case insensitive filesystem */
    public class C5138OooOo0o implements ValueAnimator.AnimatorUpdateListener {
        public C5138OooOo0o() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpColorfulActivity.this.f2313g.setTwoCircleRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FmpColorfulActivity.this.f2313g.setIsTwoStart(true);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOoO  reason: case insensitive filesystem */
    public class C5139OooOoO extends AnimatorListenerAdapter {
        public C5139OooOoO() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FmpColorfulActivity.this.f2268aK = 0;
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOoO0  reason: case insensitive filesystem */
    public class C5140OooOoO0 implements ValueAnimator.AnimatorUpdateListener {
        public C5140OooOoO0() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FmpColorfulActivity.this.f2313g.setThreeCircleRadius(floatValue);
            FmpColorfulActivity.this.f2313g.setIsThreeStart(true);
            if (floatValue <= (FmpColorfulActivity.this.f2295an * 8.0f) / 10.0f || FmpColorfulActivity.this.f2268aK >= 4) {
                FmpColorfulActivity.this.f2267aJ = false;
            } else {
                FmpColorfulActivity.this.f2267aJ = true;
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOoOO  reason: case insensitive filesystem */
    public class C5141OooOoOO implements ValueAnimator.AnimatorUpdateListener {
        public C5141OooOoOO() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpColorfulActivity.this.f2313g.setOneCircleAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOoo  reason: case insensitive filesystem */
    public class C5142OooOoo implements ValueAnimator.AnimatorUpdateListener {
        public C5142OooOoo() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FmpColorfulActivity.this.f2313g.setTwoCircleAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity$OooOoo0  reason: case insensitive filesystem */
    public class C5143OooOoo0 extends AnimatorListenerAdapter {
        public C5143OooOoo0() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    static {
        C.i(50331741);
    }

    /* renamed from: K */
    public static /* synthetic */ int m2394K(FmpColorfulActivity fmpColorfulActivity) {
        int i = fmpColorfulActivity.f2285ad;
        fmpColorfulActivity.f2285ad = i + 1;
        return i;
    }

    /* renamed from: q */
    public static /* synthetic */ int m2450q(FmpColorfulActivity fmpColorfulActivity) {
        int i = fmpColorfulActivity.f2265aH;
        fmpColorfulActivity.f2265aH = i + 1;
        return i;
    }

    public void onClick(View view) {
        if (view.getId() == C1503R.C1506id.ll_detect_close) {
            AlertDialog alertDialog = this.f2320n;
            if (alertDialog == null || !alertDialog.isShowing()) {
                this.f2320n = this.f2235D.mo17182a(this);
                m2439k();
                C1512a.m2287a(this.f2269aL);
                C1583x.m2690a(C1512a.m2289a("click_quit_icon", C1565g.m2630a(this.f2310d.f2160a), this.f2238G));
            }
        } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_left) {
            AlertDialog alertDialog2 = this.f2320n;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            C1456d dVar = C1461e.m2162a().f1917a;
            long j = dVar.f1909b;
            if (j != 0) {
                dVar.f1908a.nativeFlashDetectReset(j);
            }
            this.f2312f.mo17255a();
            m2425e();
            C1512a.m2287a(this.f2269aL);
            C1583x.m2690a(C1512a.m2289a("click_cancel_quit", C1565g.m2630a(this.f2310d.f2160a), this.f2238G));
            C1564f.m2628a(this);
        } else if (view.getId() == C1503R.C1506id.tv_megvii_dialog_right) {
            AlertDialog alertDialog3 = this.f2320n;
            if (alertDialog3 != null) {
                alertDialog3.dismiss();
            }
            C1512a.m2287a(this.f2269aL);
            C1583x.m2690a(C1512a.m2289a("click_confirm_quit", C1565g.m2630a(this.f2310d.f2160a), this.f2238G));
            if (!this.f2241J) {
                this.f2241J = true;
                mo17046a(EnumC1568j.USER_CANCEL, (String) null);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x02af A[Catch:{ all -> 0x0345 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
        // Method dump skipped, instructions count: 842
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f2241J) {
            this.f2241J = true;
            C1512a.m2287a(this.f2269aL);
            C1583x.m2690a(C1512a.m2289a("fail_liveness:go_to_background", this.f2232A, this.f2238G));
            this.f2259aB = 3003;
            long currentTimeMillis = System.currentTimeMillis();
            String c = m2417c(false);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            C1571m.m2657c(C7546o0o000O0.o00000Oo, sb.toString());
            mo17046a(EnumC1568j.GO_TO_BACKGROUND, c);
            C1571m.m2657c(C3777a.f10015C, "delta data=".concat(String.valueOf(c)));
            if (!isFinishing()) {
                finish();
            }
        }
        m2401a(-1);
        if (this.f2328v != null) {
            C1456d dVar = C1461e.m2162a().f1917a;
            long j = dVar.f1909b;
            if (j != 0) {
                dVar.f1908a.nativeFlashRelease(j);
                dVar.f1909b = 0;
            }
        }
        C1584y yVar = this.f2331y;
        if (yVar != null) {
            yVar.mo17204a();
        }
        Handler handler = this.f2326t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C1571m.m2657c(C7546o0o000O0.o00000Oo, "onDestroy");
        try {
            m2414b(false);
            this.f2312f.setPreviewCallback(null);
            this.f2312f.setICameraOpenCallBack(null);
            this.f2312f.mo17258c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        m2430g();
        m2428f();
        CoverColorfulView coverColorfulView = this.f2313g;
        if (coverColorfulView != null && coverColorfulView.f2786a != null) {
            coverColorfulView.f2786a = null;
        }
    }

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public void onPause() {
        super.onPause();
        try {
            if (m2424d() && this.f2312f != null) {
                this.f2312f.setPreviewCallback(null);
                this.f2312f.setICameraOpenCallBack(null);
                this.f2312f.onPause();
            } else if (this.f2324r != null) {
                this.f2324r.mo17188b();
            }
            if (this.f2313g != null) {
                this.f2313g.removeCallbacks(this.f2270aM);
                this.f2313g.removeCallbacks(this.f2271aN);
            }
            this.f2311e = null;
            if (this.f2233B != null) {
                this.f2233B.removeCallbacksAndMessages(null);
            }
            if (this.f2326t != null) {
                this.f2326t.removeCallbacksAndMessages(null);
            }
            if (this.f2320n != null) {
                this.f2320n.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!isFinishing()) {
            finish();
        }
        C1571m.m2657c(C7546o0o000O0.o00000Oo, "onPause");
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f2327u == null) {
            this.f2327u = bArr;
        }
        if (!this.f2305ax && !this.f2306ay) {
            if (this.f2303av == -1) {
                this.f2272aO = System.currentTimeMillis();
            }
            boolean z = false;
            if (this.f2237F == 1 && System.currentTimeMillis() - this.f2272aO >= ((long) (this.f2330x * 1000))) {
                m2419c(1);
                return;
            }
            if (this.f2237F == 2 || this.f2240I || this.f2331y.mo17205b()) {
                z = true;
            }
            if (z || this.f2303av != 0) {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                this.f2234C.post(new RunnableC5134OooOOo0(bArr));
                this.f2233B.post(new RunnableC5132OooOOOo(bArr, previewSize));
                return;
            }
            m2426e(Color.parseColor("#666666"));
            m2404a(getResources().getString(C1580u.m2676a(this).mo17199b(getString(C1503R.string.key_livenessHomePromptVerticalText))));
        }
    }

    public void onResume() {
        super.onResume();
        if (m2424d() && this.f2312f != null) {
            CameraGLColorfulView.f2746a = 1;
            if (!C1570l.m2648c()) {
                CameraGLColorfulView.f2746a = 0;
            }
            this.f2312f.onResume();
        }
        this.f2313g.postDelayed(this.f2270aM, 200);
    }

    public native void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2);

    public native boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture);

    public native void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2);

    public native void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    /* renamed from: d */
    public static boolean m2424d() {
        return Build.VERSION.SDK_INT >= 18;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m2425e() {
        this.f2313g.setStopFlashState(true);
        runOnUiThread(new OooOO0O());
        this.f2313g.setDrawRing(false);
        this.f2285ad = 0;
        this.f2284ac = 0;
        this.f2293al = "";
        this.f2287af = 0;
        this.f2292ak = true;
        this.f2290ai = System.currentTimeMillis();
        m2411b();
    }

    /* renamed from: f */
    private void m2428f() {
        try {
            if (this.f2313g != null) {
                this.f2313g.removeCallbacks(this.f2276aS);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m2430g() {
        ValueAnimator valueAnimator = this.f2297ap;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2297ap.end();
            this.f2297ap.removeAllListeners();
            this.f2297ap.removeAllUpdateListeners();
            this.f2297ap = null;
        }
        ValueAnimator valueAnimator2 = this.f2298aq;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f2298aq.end();
            this.f2298aq.removeAllListeners();
            this.f2298aq.removeAllUpdateListeners();
            this.f2298aq = null;
        }
        ValueAnimator valueAnimator3 = this.f2299ar;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f2299ar.end();
            this.f2299ar.removeAllListeners();
            this.f2299ar.removeAllUpdateListeners();
            this.f2299ar = null;
        }
        ValueAnimator valueAnimator4 = this.f2300as;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
            this.f2300as.end();
            this.f2300as.removeAllListeners();
            this.f2300as.removeAllUpdateListeners();
            this.f2300as = null;
        }
        ValueAnimator valueAnimator5 = this.f2301at;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
            this.f2301at.end();
            this.f2301at.removeAllListeners();
            this.f2301at.removeAllUpdateListeners();
            this.f2301at = null;
        }
        ValueAnimator valueAnimator6 = this.f2302au;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
            this.f2302au.end();
            this.f2302au.removeAllListeners();
            this.f2302au.removeAllUpdateListeners();
            this.f2302au = null;
        }
    }

    /* renamed from: h */
    private void m2433h() {
        this.f2303av = -1;
        this.f2304aw = -1;
        this.f2307az = false;
        this.f2258aA = false;
        this.f2305ax = false;
        this.f2306ay = false;
        this.f2261aD = null;
    }

    /* renamed from: i */
    private void m2435i() {
        runOnUiThread(new RunnableC5135OooOOoo());
    }

    /* renamed from: j */
    private void m2436j() {
        this.f2265aH = 0;
        m2406a(C1562d.m2626a(5));
        this.f2313g.setIsOneStart(false);
        this.f2313g.setIsTwoStart(false);
        this.f2313g.setIsThreeStart(false);
        this.f2295an = 0.0f;
        this.f2296ao = 0.0f;
        this.f2268aK = 0;
        this.f2267aJ = false;
    }

    /* renamed from: k */
    private void m2439k() {
        this.f2262aE = false;
        this.f2306ay = true;
        C1461e.m2162a().mo16890c();
        m2433h();
        m2414b(false);
        this.f2312f.mo17257b();
    }

    /* renamed from: l */
    private boolean m2441l() {
        C1575p.m2665a("checkVideo exec...");
        boolean z = false;
        int i = 40;
        int i2 = 0;
        while (true) {
            if (i <= 0) {
                break;
            }
            i2++;
            try {
                if (C1577r.m2669a(this.f2280aW)) {
                    z = true;
                    break;
                }
                Thread.sleep(50);
                i--;
            } catch (Exception e) {
                e.printStackTrace();
                C1575p.m2665a("checkVideo  Exception...");
            }
        }
        C1575p.m2665a("checkVideo  finish...,result= ".concat(String.valueOf(z)));
        C1571m.m2655a("check", "检查完毕，result = " + z + ",count=" + i2);
        return z;
    }

    /* renamed from: m */
    private void m2443m() {
        C1461e.m2162a().mo16889b();
        this.f2309c = false;
        this.f2313g.postDelayed(this.f2276aS, (long) (this.f2255X * 1000));
    }

    /* renamed from: n */
    private void m2445n() {
        this.f2326t.postDelayed(new RunnableC5131OooOO0o(), 1000);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private boolean m2447o() {
        try {
            C1571m.m2655a("recording", "start recording");
            this.f2277aT = new C1537c(this);
            if (this.f2278aU) {
                new C1538d(this.f2277aT, this.f2281aX, this.f2312f.f2748c, this.f2312f.f2749d);
            }
            if (this.f2279aV) {
                new C1534a(this.f2277aT, this.f2281aX);
            }
            C1537c cVar = this.f2277aT;
            if (cVar.f2427c != null) {
                cVar.f2427c.mo17129a();
            }
            if (cVar.f2428d != null) {
                cVar.f2428d.mo17129a();
            }
            C1537c cVar2 = this.f2277aT;
            if (cVar2.f2427c != null) {
                cVar2.f2427c.mo17130b();
            }
            if (cVar2.f2428d == null) {
                return true;
            }
            cVar2.f2428d.mo17130b();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    private void m2448p() {
        runOnUiThread(new OooOOO());
    }

    /* renamed from: c */
    private void m2418c() {
        try {
            this.f2242K = new ArrayList();
            if (!C1613c.m2776a(f2231a)) {
                String[] split = f2231a.split("");
                for (String str : split) {
                    if (!C1613c.m2776a(str)) {
                        this.f2242K.add(Integer.valueOf(str));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m2423d(boolean z) {
        C1575p.m2665a("verify exec...");
        try {
            runOnUiThread(new RunnableC5129OooO0oO());
            String c = m2417c(z);
            C1512a.m2287a(this.f2269aL);
            C1583x.m2690a(C1512a.m2289a("pass_liveness", C1565g.m2630a(this.f2310d.f2160a), this.f2238G));
            if (this.f2260aC == C1512a.EnumC1514b.f2108b - 1) {
                mo17046a(EnumC1568j.LIVENESS_TIME_OUT, c);
            } else if (this.f2260aC == C1512a.EnumC1514b.f2107a - 1) {
                mo17046a(EnumC1568j.LIVENESS_FINISH, c);
            } else {
                mo17046a(EnumC1568j.LIVENESS_FAILURE, c);
            }
        } catch (Exception e) {
            mo17046a(EnumC1568j.LIVENESS_FAILURE, "");
            e.printStackTrace();
            C1575p.m2665a("verify Exception...");
        }
    }

    /* renamed from: b */
    private void m2411b() {
        String[] strArr = this.f2283ab;
        if (strArr != null && strArr.length > 1) {
            if (this.f2254W == strArr.length - 1) {
                this.f2254W = 0;
            }
            String[] strArr2 = this.f2283ab;
            int i = this.f2254W;
            f2231a = strArr2[i];
            this.f2254W = i + 1;
        }
        this.f2282aa = f2231a.length();
        m2418c();
    }

    /* renamed from: a */
    private void m2401a(int i) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (i == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i <= 0) {
                i = 1;
            }
            attributes.screenBrightness = ((float) i) / 255.0f;
        }
        window.setAttributes(attributes);
    }

    /* renamed from: b */
    private void m2414b(boolean z) {
        C1575p.m2665a("doStopRecordVideo exec...");
        this.f2258aA = false;
        this.f2307az = false;
        this.f2234C.post(new RunnableC5133OooOOo(z));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m2419c(int i) {
        C1575p.m2665a("handleResult exec...,type =".concat(String.valueOf(i)));
        this.f2306ay = true;
        m2404a(getResources().getString(C1580u.m2676a(this).mo17199b(getString(C1503R.string.key_liveness_home_promptWait_text))));
        if (i == 0) {
            this.f2259aB = 0;
            m2400a(360.0f);
        } else {
            m2400a(360.0f);
            this.f2259aB = 3003;
            if (i == 1) {
                this.f2259aB = 3002;
            }
            C1512a.m2287a(this.f2269aL);
            C1583x.m2690a(C1512a.m2289a("fail_liveness:time_out", this.f2232A, this.f2238G));
        }
        m2414b(true);
        C1461e.m2162a().mo16890c();
    }

    /* renamed from: e */
    private void m2426e(int i) {
        this.f2313g.setTipsColor(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m2406a(int[] iArr) {
        this.f2313g.setCircleColor(iArr);
    }

    /* renamed from: a */
    private void m2405a(byte[] bArr, int i) {
        if (this.f2277aT != null) {
            C1571m.m2655a("=== numfps:", this.f2284ac + "压帧,number:" + this.f2293al);
            C1537c cVar = this.f2277aT;
            CameraGLColorfulView cameraGLColorfulView = this.f2312f;
            byte[] a = C1581v.m2684a(bArr, cameraGLColorfulView.f2749d, cameraGLColorfulView.f2748c, (360 - i) % 360);
            AbstractRunnableC1535b bVar = cVar.f2427c;
            if (bVar != null) {
                bVar.mo17134a(a);
            }
        }
    }

    /* renamed from: b */
    private void m2412b(int i) {
        if (i == 1) {
            this.f2313g.setStopFlashState(false);
            this.f2313g.setDrawRing(true);
            return;
        }
        this.f2313g.setStopFlashState(true);
        runOnUiThread(new OooO0o());
    }

    /* renamed from: d */
    private void m2422d(int i) {
        runOnUiThread(new RunnableC5130OooO0oo(i));
    }

    /* renamed from: b */
    public static /* synthetic */ void m2413b(FmpColorfulActivity fmpColorfulActivity, boolean z) {
        C1575p.m2665a("stopRecording exec...");
        try {
            if (fmpColorfulActivity.f2277aT != null) {
                C1575p.m2665a("mMuxer is not null...");
                C1537c cVar = fmpColorfulActivity.f2277aT;
                if (cVar.f2427c != null) {
                    cVar.f2427c.mo17136f();
                }
                cVar.f2427c = null;
                if (cVar.f2428d != null) {
                    cVar.f2428d.mo17136f();
                }
                cVar.f2428d = null;
                String str = fmpColorfulActivity.f2277aT.f2425a;
                fmpColorfulActivity.f2280aW = str;
                C1571m.m2655a("videoOutputPath", str);
                fmpColorfulActivity.f2277aT = null;
                fmpColorfulActivity.f2307az = false;
            } else if (z) {
                C1575p.m2665a("mMuxer is null...");
                fmpColorfulActivity.m2423d(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2400a(float f) {
        try {
            this.f2313g.setSweepAngle$2549578(f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2404a(String str) {
        this.f2313g.setTips(str);
    }

    /* renamed from: c */
    private String m2417c(boolean z) {
        Throwable th;
        String str;
        String str2 = "";
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C1571m.m2655a(FileAttachment.KEY_MD5, "videoOutputPath:" + this.f2280aW);
            File file = new File(this.f2280aW);
            if (z) {
                C1575p.m2665a("isNeedCheck is true...");
                if (!m2441l()) {
                    this.f2275aR = false;
                }
            }
            C1571m.m2654a("verify: failedType=" + this.f2260aC + ", liveness_failure_reason=" + this.f2259aB);
            String a = C1566h.m2641a(this.f2260aC, this.f2259aB, this.f2266aI, f2231a, this.f2254W);
            long length = file.length();
            C1571m.m2655a("video file size", String.valueOf(length));
            byte[] a2 = (length <= 0 || !this.f2275aR) ? null : C1569k.m2646a(file);
            String a3 = C1523c.m2305a(getApplicationContext()).mo17000a();
            System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            C1571m.m2655a("time const check", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a3.getBytes().length);
            C1571m.m2655a("fingerData size", sb2.toString());
            C1571m.m2655a("fingerData data", a3);
            C1571m.m2655a("getSdkLog", C1583x.m2689a());
            long currentTimeMillis2 = System.currentTimeMillis();
            C1575p.m2665a("getDelta begin...");
            boolean z2 = this.f2260aC == 0;
            String a4 = C1583x.m2689a();
            C1456d dVar = C1461e.m2162a().f1917a;
            if (dVar.f1909b == 0) {
                str = str2;
            } else {
                if (a2 == null) {
                    a2 = str2.getBytes();
                }
                str = dVar.f1908a.getFlashDeltaInfo(dVar.f1909b, a, z2, a4, a3, a2);
            }
            try {
                C1575p.m2665a("getDelta end...");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis() - currentTimeMillis2);
                C1571m.m2655a("fmpImage delta time const", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str.getBytes().length);
                C1571m.m2655a("fmpImage delta size", sb4.toString());
                if (file.exists()) {
                    file.delete();
                }
                return str == null ? str2 : str;
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
                mo17046a(EnumC1568j.LIVENESS_FAILURE, str2);
                th.printStackTrace();
                return str2;
            }
        } catch (Throwable th3) {
            th = th3;
            mo17046a(EnumC1568j.LIVENESS_FAILURE, str2);
            th.printStackTrace();
            return str2;
        }
    }

    /* renamed from: a */
    public final void mo17046a(EnumC1568j jVar, String str) {
        C1575p.m2665a("onFailed exec...");
        this.f2241J = true;
        long currentTimeMillis = System.currentTimeMillis() - this.f2274aQ;
        C1525e.m2307a().mo17004a(jVar, str);
        if (currentTimeMillis >= 500) {
            if (!isFinishing()) {
                finish();
            }
            C1575p.m2665a("activity finish...");
            return;
        }
        Handler handler = this.f2326t;
        if (handler != null) {
            try {
                handler.postDelayed(new OooO(), 500 - currentTimeMillis);
            } catch (Exception e) {
                finish();
                e.printStackTrace();
            }
        } else if (!isFinishing()) {
            finish();
        }
    }

    @Override // com.megvii.meglive_sdk.view.color.CameraGLColorfulView.AbstractC1592c
    /* renamed from: a */
    public final void mo17047a(boolean z) {
        if (z) {
            m2445n();
            m2443m();
            return;
        }
        mo17046a(EnumC1568j.DEVICE_NOT_SUPPORT, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0216  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m2402a(com.megvii.meglive_sdk.detect.color.FmpColorfulActivity r17, byte[] r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1936
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.detect.color.FmpColorfulActivity.m2402a(com.megvii.meglive_sdk.detect.color.FmpColorfulActivity, byte[], int, int):void");
    }
}
