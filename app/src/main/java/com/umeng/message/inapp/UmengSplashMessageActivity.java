package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.UImageLoadTask;
import com.umeng.message.proguard.C3846j;
import java.util.Calendar;

public class UmengSplashMessageActivity extends Activity {

    /* renamed from: a */
    public static final String f10227a = UmengSplashMessageActivity.class.getName();

    /* renamed from: s */
    public static int f10228s = 2000;

    /* renamed from: t */
    public static int f10229t = 1000;

    /* renamed from: b */
    public Activity f10230b;

    /* renamed from: c */
    public UImageLoadTask f10231c;

    /* renamed from: d */
    public ImageView f10232d;

    /* renamed from: e */
    public ImageView f10233e;

    /* renamed from: f */
    public TextView f10234f;

    /* renamed from: g */
    public boolean f10235g = true;

    /* renamed from: h */
    public boolean f10236h = true;

    /* renamed from: i */
    public C3802a f10237i;

    /* renamed from: j */
    public C3802a f10238j;

    /* renamed from: k */
    public UInAppMessage f10239k;

    /* renamed from: l */
    public UInAppHandler f10240l;

    /* renamed from: m */
    public boolean f10241m = false;

    /* renamed from: n */
    public boolean f10242n = false;

    /* renamed from: o */
    public boolean f10243o = false;

    /* renamed from: p */
    public boolean f10244p = false;

    /* renamed from: q */
    public long f10245q;

    /* renamed from: r */
    public long f10246r;

    /* renamed from: u */
    public UImageLoadTask.ImageLoaderCallback f10247u = new UImageLoadTask.ImageLoaderCallback() {
        /* class com.umeng.message.inapp.UmengSplashMessageActivity.C37961 */

        @Override // com.umeng.message.inapp.UImageLoadTask.ImageLoaderCallback
        public void onLoadImage(Bitmap[] bitmapArr) {
            if (!UmengSplashMessageActivity.this.m10426e()) {
                if (UmengSplashMessageActivity.this.f10237i != null) {
                    UmengSplashMessageActivity.this.f10237i.mo39857a();
                    UmengSplashMessageActivity.this.f10237i = null;
                }
                try {
                    if (bitmapArr.length == 1) {
                        UmengSplashMessageActivity.this.f10232d.setOnClickListener(new View.OnClickListener() {
                            /* class com.umeng.message.inapp.UmengSplashMessageActivity.C37961.View$OnClickListenerC37971 */

                            public void onClick(View view) {
                                UmengSplashMessageActivity.this.f10241m = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.f10239k.action_type)) {
                                    UmengSplashMessageActivity.this.f10246r += SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f10245q;
                                    C3807d.m10462a(UmengSplashMessageActivity.this.f10230b).mo39863a(UmengSplashMessageActivity.this.f10239k.msg_id, UmengSplashMessageActivity.this.f10239k.msg_type, 1, 1, 0, 0, 0, (int) UmengSplashMessageActivity.this.f10246r, 0);
                                    UmengSplashMessageActivity.this.m10429f();
                                    UmengSplashMessageActivity.this.f10240l.handleInAppMessage(UmengSplashMessageActivity.this.f10230b, UmengSplashMessageActivity.this.f10239k, 16);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f10233e.setVisibility(8);
                        UmengSplashMessageActivity.this.f10232d.setImageBitmap(bitmapArr[0]);
                        UmengSplashMessageActivity.this.m10410a((UmengSplashMessageActivity) UmengSplashMessageActivity.this.f10232d);
                    }
                    if (bitmapArr.length == 2) {
                        UmengSplashMessageActivity.this.f10232d.setOnClickListener(new View.OnClickListener() {
                            /* class com.umeng.message.inapp.UmengSplashMessageActivity.C37961.View$OnClickListenerC37982 */

                            public void onClick(View view) {
                                UmengSplashMessageActivity.this.f10242n = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.f10239k.action_type)) {
                                    UmengSplashMessageActivity.this.f10246r += SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f10245q;
                                    C3807d a = C3807d.m10462a(UmengSplashMessageActivity.this.f10230b);
                                    String str = UmengSplashMessageActivity.this.f10239k.msg_id;
                                    int i = UmengSplashMessageActivity.this.f10239k.msg_type;
                                    UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                                    a.mo39863a(str, i, 1, 0, 1, umengSplashMessageActivity.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity.f10243o), 0, (int) UmengSplashMessageActivity.this.f10246r, 0);
                                    UmengSplashMessageActivity.this.m10429f();
                                    UmengSplashMessageActivity.this.f10240l.handleInAppMessage(UmengSplashMessageActivity.this.f10230b, UmengSplashMessageActivity.this.f10239k, 16);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f10233e.setOnClickListener(new View.OnClickListener() {
                            /* class com.umeng.message.inapp.UmengSplashMessageActivity.C37961.View$OnClickListenerC37993 */

                            public void onClick(View view) {
                                UmengSplashMessageActivity.this.f10243o = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.f10239k.bottom_action_type)) {
                                    UmengSplashMessageActivity.this.f10246r += SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f10245q;
                                    C3807d a = C3807d.m10462a(UmengSplashMessageActivity.this.f10230b);
                                    String str = UmengSplashMessageActivity.this.f10239k.msg_id;
                                    int i = UmengSplashMessageActivity.this.f10239k.msg_type;
                                    UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                                    a.mo39863a(str, i, 1, 0, umengSplashMessageActivity.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity.f10242n), 1, 0, (int) UmengSplashMessageActivity.this.f10246r, 0);
                                    UmengSplashMessageActivity.this.m10429f();
                                    UmengSplashMessageActivity.this.f10240l.handleInAppMessage(UmengSplashMessageActivity.this.f10230b, UmengSplashMessageActivity.this.f10239k, 17);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f10232d.setImageBitmap(bitmapArr[0]);
                        UmengSplashMessageActivity.this.f10233e.setImageBitmap(bitmapArr[1]);
                        UmengSplashMessageActivity.this.m10410a((UmengSplashMessageActivity) UmengSplashMessageActivity.this.f10232d);
                        UmengSplashMessageActivity.this.m10410a((UmengSplashMessageActivity) UmengSplashMessageActivity.this.f10233e);
                    }
                    UmengSplashMessageActivity.this.f10245q = SystemClock.elapsedRealtime();
                    if (!UmengSplashMessageActivity.this.f10239k.display_button) {
                        UmengSplashMessageActivity.this.f10234f.setVisibility(8);
                    } else {
                        UmengSplashMessageActivity.this.f10234f.setVisibility(0);
                        UmengSplashMessageActivity.this.f10234f.setOnClickListener(new View.OnClickListener() {
                            /* class com.umeng.message.inapp.UmengSplashMessageActivity.C37961.View$OnClickListenerC38004 */

                            public void onClick(View view) {
                                UmengSplashMessageActivity.this.f10246r += SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f10245q;
                                C3807d a = C3807d.m10462a(UmengSplashMessageActivity.this.f10230b);
                                String str = UmengSplashMessageActivity.this.f10239k.msg_id;
                                int i = UmengSplashMessageActivity.this.f10239k.msg_type;
                                UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                                int a2 = umengSplashMessageActivity.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity.f10241m);
                                UmengSplashMessageActivity umengSplashMessageActivity2 = UmengSplashMessageActivity.this;
                                int a3 = umengSplashMessageActivity2.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity2.f10242n);
                                UmengSplashMessageActivity umengSplashMessageActivity3 = UmengSplashMessageActivity.this;
                                a.mo39863a(str, i, 1, a2, a3, umengSplashMessageActivity3.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity3.f10243o), 1, (int) UmengSplashMessageActivity.this.f10246r, 0);
                                UmengSplashMessageActivity.this.m10429f();
                                UmengSplashMessageActivity.this.finish();
                            }
                        });
                    }
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f10230b).mo39783a(UmengSplashMessageActivity.this.f10239k);
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f10230b).mo39787a(UmengSplashMessageActivity.this.f10239k.msg_id, 1);
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f10230b).mo39804h();
                    UmengSplashMessageActivity.this.f10235g = false;
                    UmengSplashMessageActivity.this.f10238j = new C3802a((long) (UmengSplashMessageActivity.this.f10239k.display_time * 1000), (long) UmengSplashMessageActivity.f10229t);
                    UmengSplashMessageActivity.this.f10238j.mo39858b();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    /* renamed from: v */
    public IUmengInAppMessageCallback f10248v = new IUmengInAppMessageCallback() {
        /* class com.umeng.message.inapp.UmengSplashMessageActivity.C38012 */

        @Override // com.umeng.message.inapp.IUmengInAppMessageCallback
        public void onCardMessage(UInAppMessage uInAppMessage) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A[ADDED_TO_REGION] */
        @Override // com.umeng.message.inapp.IUmengInAppMessageCallback
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSplashMessage(com.umeng.message.entity.UInAppMessage r7) {
            /*
            // Method dump skipped, instructions count: 358
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.UmengSplashMessageActivity.C38012.onSplashMessage(com.umeng.message.entity.UInAppMessage):void");
        }
    };

    /* renamed from: com.umeng.message.inapp.UmengSplashMessageActivity$a */
    public class C3802a extends AbstractC3805c {
        public C3802a(long j, long j2) {
            super(j, j2);
        }

        @Override // com.umeng.message.inapp.AbstractC3805c
        /* renamed from: a */
        public void mo39853a(long j) {
            if (!UmengSplashMessageActivity.this.f10235g) {
                UmengSplashMessageActivity.this.f10234f.setVisibility(0);
                TextView textView = UmengSplashMessageActivity.this.f10234f;
                StringBuilder sb = new StringBuilder();
                double d = (double) j;
                Double.isNaN(d);
                double d2 = (double) UmengSplashMessageActivity.f10229t;
                Double.isNaN(d2);
                sb.append((int) Math.ceil((d * 1.0d) / d2));
                sb.append(" ");
                sb.append(UmengSplashMessageActivity.this.f10239k.display_name);
                textView.setText(sb.toString());
            }
        }

        @Override // com.umeng.message.inapp.AbstractC3805c
        /* renamed from: e */
        public void mo39854e() {
            if (!UmengSplashMessageActivity.this.m10426e() || !UmengSplashMessageActivity.this.f10235g) {
                if (!UmengSplashMessageActivity.this.f10235g) {
                    C3807d a = C3807d.m10462a(UmengSplashMessageActivity.this.f10230b);
                    String str = UmengSplashMessageActivity.this.f10239k.msg_id;
                    int i = UmengSplashMessageActivity.this.f10239k.msg_type;
                    UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                    int a2 = umengSplashMessageActivity.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity.f10241m);
                    UmengSplashMessageActivity umengSplashMessageActivity2 = UmengSplashMessageActivity.this;
                    int a3 = umengSplashMessageActivity2.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity2.f10242n);
                    UmengSplashMessageActivity umengSplashMessageActivity3 = UmengSplashMessageActivity.this;
                    a.mo39863a(str, i, 1, a2, a3, umengSplashMessageActivity3.m10405a((UmengSplashMessageActivity) umengSplashMessageActivity3.f10243o), 0, UmengSplashMessageActivity.this.f10239k.display_time * 1000, 0);
                }
                UmengSplashMessageActivity.this.m10429f();
                UmengSplashMessageActivity.this.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private int m10405a(boolean z) {
        return z ? 1 : 0;
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10230b = this;
        if ((getIntent().getFlags() & 4194304) > 0) {
            finish();
        } else if (!onCustomPretreatment()) {
            setRequestedOrientation(1);
            setContentView(m10420c());
            m10423d();
            this.f10240l = InAppMessageManager.getInstance(this.f10230b).getInAppHandler();
            C3802a aVar = new C3802a((long) f10228s, (long) f10229t);
            this.f10237i = aVar;
            aVar.mo39858b();
        }
    }

    public boolean onCustomPretreatment() {
        return false;
    }

    public final void onDestroy() {
        C3802a aVar = this.f10237i;
        if (aVar != null) {
            aVar.mo39857a();
        }
        C3802a aVar2 = this.f10238j;
        if (aVar2 != null) {
            aVar2.mo39857a();
        }
        UImageLoadTask uImageLoadTask = this.f10231c;
        if (uImageLoadTask != null) {
            uImageLoadTask.mo39818a((UImageLoadTask.ImageLoaderCallback) null);
        }
        this.f10244p = false;
        this.f10241m = false;
        this.f10242n = false;
        this.f10243o = false;
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        C3802a aVar = this.f10237i;
        if (aVar != null) {
            aVar.mo39859c();
        }
        if (this.f10238j != null) {
            this.f10246r += SystemClock.elapsedRealtime() - this.f10245q;
            this.f10238j.mo39859c();
        }
    }

    public void onResume() {
        super.onResume();
        C3802a aVar = this.f10237i;
        if (aVar != null) {
            aVar.mo39860d();
        }
        if (this.f10238j != null) {
            this.f10245q = SystemClock.elapsedRealtime();
            this.f10238j.mo39860d();
        }
    }

    public final void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private synchronized void m10429f() {
        if (this.f10236h) {
            this.f10236h = false;
            Intent intent = new Intent();
            intent.setClassName(this.f10230b, InAppMessageManager.getInstance(this).mo39782a());
            intent.setFlags(536870912);
            this.f10230b.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private boolean m10431g() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(InAppMessageManager.getInstance(this.f10230b).mo39806i());
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private View m10420c() {
        FrameLayout frameLayout = new FrameLayout(this.f10230b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this.f10230b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 13.0f);
        ImageView imageView = new ImageView(this.f10230b);
        this.f10232d = imageView;
        imageView.setLayoutParams(layoutParams);
        this.f10232d.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f10232d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 3.0f);
        ImageView imageView2 = new ImageView(this.f10230b);
        this.f10233e = imageView2;
        imageView2.setLayoutParams(layoutParams2);
        this.f10233e.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f10233e);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.rightMargin = C3846j.m10571a(this.f10230b, 30.0f);
        layoutParams3.topMargin = C3846j.m10571a(this.f10230b, 20.0f);
        TextView textView = new TextView(this.f10230b);
        this.f10234f = textView;
        textView.setLayoutParams(layoutParams3);
        int a = C3846j.m10571a(this.f10230b, 6.0f);
        int i = a / 3;
        this.f10234f.setPadding(a, i, a, i);
        this.f10234f.setTextSize(14.0f);
        this.f10234f.setBackgroundColor(Color.parseColor("#80000000"));
        this.f10234f.setTextColor(-1);
        this.f10234f.setVisibility(8);
        frameLayout.addView(this.f10234f);
        return frameLayout;
    }

    /* renamed from: d */
    private void m10423d() {
        if (InAppMessageManager.f10168a) {
            C3807d.m10462a(this).mo39862a(this.f10248v);
        } else if (System.currentTimeMillis() - InAppMessageManager.getInstance(this.f10230b).mo39795d() > ((long) InAppMessageManager.f10169b)) {
            C3807d.m10462a(this).mo39862a(this.f10248v);
        } else {
            this.f10248v.onSplashMessage(null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private synchronized boolean m10426e() {
        boolean z;
        z = this.f10244p;
        this.f10244p = true;
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m10410a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setDuration(500);
        view.startAnimation(alphaAnimation);
    }

    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }
}
