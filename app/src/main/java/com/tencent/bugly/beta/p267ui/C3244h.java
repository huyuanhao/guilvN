package com.tencent.bugly.beta.p267ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;
import com.tencent.bugly.beta.download.C3219a;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.C3227f;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.global.View$OnClickListenerC3223b;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3372y;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tencent.bugly.beta.ui.h */
public class C3244h extends AbstractC3234a {

    /* renamed from: v */
    public static C3244h f7461v = new C3244h();

    /* renamed from: A */
    public DownloadListener f7462A = new C3219a(2, this);

    /* renamed from: B */
    public ViewTreeObserver$OnPreDrawListenerC3240d f7463B = null;

    /* renamed from: n */
    public TextView f7464n;

    /* renamed from: o */
    public TextView f7465o;

    /* renamed from: p */
    public C3372y f7466p;

    /* renamed from: q */
    public DownloadTask f7467q;

    /* renamed from: r */
    public Runnable f7468r;

    /* renamed from: s */
    public Runnable f7469s;

    /* renamed from: t */
    public Bitmap f7470t = null;

    /* renamed from: u */
    public BitmapDrawable f7471u;

    /* renamed from: w */
    public UILifecycleListener f7472w;

    /* renamed from: x */
    public View.OnClickListener f7473x = new View$OnClickListenerC3223b(4, this);

    /* renamed from: y */
    public View.OnClickListener f7474y = new View$OnClickListenerC3223b(5, this);

    /* renamed from: z */
    public View.OnClickListener f7475z = new View$OnClickListenerC3223b(6, this);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38022a(com.tencent.bugly.beta.download.DownloadTask r9) {
        /*
            r8 = this;
            int r0 = r9.getStatus()
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x004e
            r3 = 1
            if (r0 == r3) goto L_0x0049
            if (r0 == r1) goto L_0x0024
            r9 = 3
            if (r0 == r9) goto L_0x001f
            r9 = 4
            if (r0 == r9) goto L_0x004e
            r9 = 5
            if (r0 == r9) goto L_0x001a
            java.lang.String r9 = ""
            r0 = r2
            goto L_0x0052
        L_0x001a:
            java.lang.String r9 = com.tencent.bugly.beta.Beta.strUpgradeDialogRetryBtn
            android.view.View$OnClickListener r0 = r8.f7473x
            goto L_0x0052
        L_0x001f:
            java.lang.String r9 = com.tencent.bugly.beta.Beta.strUpgradeDialogContinueBtn
            android.view.View$OnClickListener r0 = r8.f7473x
            goto L_0x0052
        L_0x0024:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            long r5 = r9.getSavedLength()
            float r5 = (float) r5
            long r6 = r9.getTotalLength()
            float r9 = (float) r6
            float r5 = r5 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r9
            java.lang.Float r9 = java.lang.Float.valueOf(r5)
            r3[r4] = r9
            java.lang.String r9 = "%.1f%%"
            java.lang.String r9 = java.lang.String.format(r0, r9, r3)
            android.view.View$OnClickListener r0 = r8.f7474y
            goto L_0x0052
        L_0x0049:
            java.lang.String r9 = com.tencent.bugly.beta.Beta.strUpgradeDialogInstallBtn
            android.view.View$OnClickListener r0 = r8.f7473x
            goto L_0x0052
        L_0x004e:
            java.lang.String r9 = com.tencent.bugly.beta.Beta.strUpgradeDialogUpgradeBtn
            android.view.View$OnClickListener r0 = r8.f7473x
        L_0x0052:
            com.tencent.bugly.proguard.y r3 = r8.f7466p
            byte r3 = r3.f8297g
            if (r3 == r1) goto L_0x0060
            java.lang.String r1 = com.tencent.bugly.beta.Beta.strUpgradeDialogCancelBtn
            android.view.View$OnClickListener r2 = r8.f7475z
            r8.mo38010a(r1, r2, r9, r0)
            goto L_0x0063
        L_0x0060:
            r8.mo38010a(r2, r2, r9, r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.p267ui.C3244h.mo38022a(com.tencent.bugly.beta.download.DownloadTask):void");
    }

    /* renamed from: c */
    public synchronized void mo38024c() {
        try {
            if (!(this.f7419b == null || this.f7466p == null)) {
                if (this.f7467q != null) {
                    Bitmap bitmap = null;
                    if (this.f7429l != 0) {
                        this.f7423f.setText(this.f7466p.f8291a);
                        if (this.f7422e != null) {
                            this.f7422e.setAdjustViewBounds(true);
                            if (this.f7428k != 0) {
                                Bitmap a = C3222a.m7753a(this.f7418a, 0, this.f7427j.mo37904a("IMG_title"));
                                this.f7470t = a;
                                this.f7471u = null;
                                if (a != null) {
                                    bitmap = a;
                                } else if (C3226e.f7357E.f7395h != 0) {
                                    bitmap = C3222a.m7753a(this.f7418a, 1, Integer.valueOf(C3226e.f7357E.f7395h));
                                }
                                this.f7422e.setImageBitmap(bitmap);
                            }
                        }
                    } else if (this.f7428k != 0) {
                        Bitmap a2 = C3222a.m7753a(this.f7418a, 0, this.f7427j.mo37904a("IMG_title"));
                        this.f7470t = a2;
                        this.f7471u = null;
                        if (a2 != null) {
                            bitmap = a2;
                        } else if (C3226e.f7357E.f7395h != 0) {
                            bitmap = C3222a.m7753a(this.f7418a, 1, Integer.valueOf(C3226e.f7357E.f7395h));
                        }
                        this.f7423f.getViewTreeObserver().removeOnPreDrawListener(this.f7463B);
                        this.f7463B = new ViewTreeObserver$OnPreDrawListenerC3240d(1, this, this.f7423f, bitmap, Integer.valueOf(this.f7428k));
                        this.f7423f.getViewTreeObserver().addOnPreDrawListener(this.f7463B);
                    } else {
                        this.f7423f.setHeight(C3222a.m7752a(this.f7418a, 42.0f));
                        this.f7423f.setText(this.f7466p.f8291a);
                    }
                    this.f7465o.setText(this.f7466p.f8292b.length() > 500 ? this.f7466p.f8292b.substring(0, 500) : this.f7466p.f8292b);
                    if (C3226e.f7357E.f7378U) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Beta.strUpgradeDialogVersionLabel);
                        sb.append(": ");
                        sb.append(this.f7466p.f8295e.f8264d);
                        sb.append("\n");
                        sb.append(Beta.strUpgradeDialogFileSizeLabel);
                        sb.append(": ");
                        float f = (float) this.f7466p.f8296f.f8258d;
                        if (f >= 1048576.0f) {
                            sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f / 1048576.0f)));
                            sb.append("M");
                        } else if (f >= 1024.0f) {
                            sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f / 1024.0f)));
                            sb.append("K");
                        } else {
                            sb.append(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
                            sb.append("B");
                        }
                        sb.append("\n");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA);
                        sb.append(Beta.strUpgradeDialogUpdateTimeLabel);
                        sb.append(": ");
                        sb.append(simpleDateFormat.format(new Date(this.f7466p.f8305o)));
                        this.f7464n.setText(sb);
                    }
                    mo38022a(this.f7467q);
                }
            }
        } catch (Exception e) {
            if (this.f7429l != 0) {
                C3321an.m8357e("please confirm your argument: [Beta.upgradeDialogLayoutId] is correct", new Object[0]);
            }
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3226e eVar = C3226e.f7357E;
        this.f7429l = eVar.f7396i;
        this.f7472w = eVar.f7398k;
        try {
            this.f7428k = Integer.parseInt(ResBean.f7346a.mo37904a("VAL_style"));
        } catch (Exception e) {
            C3321an.m8349a(e.getMessage(), new Object[0]);
            this.f7428k = 0;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3234a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f7429l != 0) {
            this.f7464n = (TextView) onCreateView.findViewWithTag(Beta.TAG_UPGRADE_INFO);
            this.f7465o = (TextView) onCreateView.findViewWithTag(Beta.TAG_UPGRADE_FEATURE);
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this.f7418a);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            ResBean resBean = ResBean.f7346a;
            if (C3226e.f7357E.f7378U) {
                TextView textView = new TextView(this.f7418a);
                this.f7464n = textView;
                textView.setLayoutParams(layoutParams2);
                TextView textView2 = this.f7464n;
                resBean.getClass();
                textView2.setTextColor(Color.parseColor("#757575"));
                this.f7464n.setTextSize((float) 14);
                this.f7464n.setTag(Beta.TAG_UPGRADE_INFO);
                this.f7464n.setLineSpacing(15.0f, 1.0f);
                linearLayout.addView(this.f7464n);
            }
            TextView textView3 = new TextView(this.f7418a);
            textView3.setLayoutParams(layoutParams2);
            resBean.getClass();
            textView3.setTextColor(Color.parseColor("#273238"));
            float f = (float) 14;
            textView3.setTextSize(f);
            textView3.setSingleLine();
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setText(String.valueOf(Beta.strUpgradeDialogFeatureLabel + ": "));
            textView3.setPadding(0, C3222a.m7752a(this.f7418a, 8.0f), 0, 0);
            linearLayout.addView(textView3);
            TextView textView4 = new TextView(this.f7418a);
            this.f7465o = textView4;
            textView4.setLayoutParams(layoutParams2);
            TextView textView5 = this.f7465o;
            resBean.getClass();
            textView5.setTextColor(Color.parseColor("#273238"));
            this.f7465o.setTextSize(f);
            this.f7465o.setTag(Beta.TAG_UPGRADE_FEATURE);
            this.f7465o.setMaxHeight(C3222a.m7752a(this.f7418a, 200.0f));
            this.f7465o.setLineSpacing(15.0f, 1.0f);
            linearLayout.addView(this.f7465o);
            this.f7426i.addView(linearLayout);
        }
        UILifecycleListener uILifecycleListener = this.f7472w;
        if (uILifecycleListener != null) {
            FragmentActivity activity = getActivity();
            C3372y yVar = this.f7466p;
            uILifecycleListener.onCreate(activity, onCreateView, yVar != null ? new UpgradeInfo(yVar) : null);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3234a
    public void onDestroyView() {
        try {
            super.onDestroyView();
            UpgradeInfo upgradeInfo = null;
            this.f7464n = null;
            this.f7465o = null;
            synchronized (this) {
                this.f7463B = null;
            }
            if (this.f7471u != null) {
                this.f7471u.setCallback(null);
            }
            if (this.f7472w != null) {
                UILifecycleListener uILifecycleListener = this.f7472w;
                Context context = this.f7418a;
                View view = this.f7419b;
                if (this.f7466p != null) {
                    upgradeInfo = new UpgradeInfo(this.f7466p);
                }
                uILifecycleListener.onDestroy(context, view, upgradeInfo);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3238b
    public void onPause() {
        DownloadTask downloadTask;
        super.onPause();
        DownloadListener downloadListener = this.f7462A;
        if (!(downloadListener == null || (downloadTask = this.f7467q) == null)) {
            downloadTask.removeListener(downloadListener);
        }
        UILifecycleListener uILifecycleListener = this.f7472w;
        if (uILifecycleListener != null) {
            Context context = this.f7418a;
            View view = this.f7419b;
            C3372y yVar = this.f7466p;
            uILifecycleListener.onPause(context, view, yVar != null ? new UpgradeInfo(yVar) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3238b
    public void onResume() {
        DownloadTask downloadTask;
        super.onResume();
        DownloadListener downloadListener = this.f7462A;
        if (!(downloadListener == null || (downloadTask = this.f7467q) == null)) {
            downloadTask.addListener(downloadListener);
        }
        mo38024c();
        if (this.f7428k != 0 && this.f7470t == null) {
            C3227f.f7414a.mo37917a(new RunnableC3225d(7, this));
        }
        UILifecycleListener uILifecycleListener = this.f7472w;
        if (uILifecycleListener != null) {
            Context context = this.f7418a;
            View view = this.f7419b;
            C3372y yVar = this.f7466p;
            uILifecycleListener.onResume(context, view, yVar != null ? new UpgradeInfo(yVar) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        UILifecycleListener uILifecycleListener = this.f7472w;
        if (uILifecycleListener != null) {
            Context context = this.f7418a;
            View view = this.f7419b;
            C3372y yVar = this.f7466p;
            uILifecycleListener.onStart(context, view, yVar != null ? new UpgradeInfo(yVar) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UILifecycleListener uILifecycleListener = this.f7472w;
        if (uILifecycleListener != null) {
            Context context = this.f7418a;
            View view = this.f7419b;
            C3372y yVar = this.f7466p;
            uILifecycleListener.onStop(context, view, yVar != null ? new UpgradeInfo(yVar) : null);
        }
    }

    /* renamed from: a */
    public synchronized void mo38023a(C3372y yVar, DownloadTask downloadTask) {
        this.f7466p = yVar;
        this.f7467q = downloadTask;
        downloadTask.addListener(this.f7462A);
        C3254e.m7893a(new RunnableC3225d(7, this));
    }

    @Override // com.tencent.bugly.beta.p267ui.AbstractC3238b
    /* renamed from: a */
    public boolean mo38016a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f7466p.f8297g == 2) {
            return true;
        }
        Runnable runnable = this.f7469s;
        if (runnable != null) {
            runnable.run();
        }
        mo38009a();
        return true;
    }
}
