package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.sdk.service.p075b.AbstractC1295a;
import com.huawei.updatesdk.sdk.service.p075b.C1296b;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.deamon.download.C1340d;
import com.huawei.updatesdk.service.deamon.download.DownloadService;
import com.huawei.updatesdk.support.p082b.C1370d;
import com.huawei.updatesdk.support.p083c.C1371a;
import com.huawei.updatesdk.support.p084d.AbstractC1374b;
import com.huawei.updatesdk.support.p084d.C1375c;
import com.huawei.updatesdk.support.p085e.AbstractC1377a;
import com.huawei.updatesdk.support.p085e.C1379c;
import com.huawei.updatesdk.support.p085e.C1380d;
import com.huawei.updatesdk.support.p086f.AbstractC1388b;
import com.huawei.updatesdk.support.p086f.C1381a;
import com.huawei.updatesdk.support.p087pm.C1399g;
import com.p118pd.sdk.C8413oOoo0o;
import com.umeng.message.common.C3777a;
import s.h.e.l.l.C;

public class AppUpdateActivity extends Activity implements AbstractC1356a, AbstractC1374b {

    /* renamed from: a */
    public AlertDialog f1601a;

    /* renamed from: b */
    public C1381a f1602b;

    /* renamed from: c */
    public C1381a f1603c;

    /* renamed from: d */
    public ProgressBar f1604d;

    /* renamed from: e */
    public TextView f1605e;

    /* renamed from: f */
    public ImageView f1606f;

    /* renamed from: g */
    public RelativeLayout f1607g;

    /* renamed from: h */
    public boolean f1608h = false;

    /* renamed from: i */
    public boolean f1609i = false;

    /* renamed from: j */
    public ApkUpgradeInfo f1610j = null;

    /* renamed from: k */
    public boolean f1611k = false;

    /* renamed from: l */
    public boolean f1612l = false;

    /* renamed from: m */
    public int f1613m = -99;

    /* renamed from: n */
    public int f1614n = -99;

    /* renamed from: o */
    public int f1615o = -99;

    /* renamed from: p */
    public Intent f1616p = null;

    /* renamed from: q */
    public C1355c f1617q;

    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$a */
    public static class DialogInterface$OnDismissListenerC1353a implements DialogInterface.OnDismissListener {
        public DialogInterface$OnDismissListenerC1353a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10001);
            C1357b.m1992a().mo16177b(intent);
        }
    }

    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$b */
    public static class DialogInterface$OnShowListenerC1354b implements DialogInterface.OnShowListener {
        public DialogInterface$OnShowListenerC1354b() {
        }

        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10002);
            C1357b.m1992a().mo16177b(intent);
        }
    }

    /* renamed from: com.huawei.updatesdk.service.otaupdate.AppUpdateActivity$c */
    public class C1355c extends AbstractC1295a {
        public C1355c() {
        }

        @Override // com.huawei.updatesdk.sdk.service.p075b.AbstractC1295a
        /* renamed from: a */
        public void mo15902a(Context context, C1296b bVar) {
            if (bVar.mo15911d()) {
                if (AppUpdateActivity.this.f1602b != null) {
                    AppUpdateActivity.this.f1602b.mo16221c();
                }
                AppUpdateActivity.this.m1970f();
                String b = bVar.mo15908b();
                String dataString = bVar.mo15910c().getDataString();
                if (dataString != null && dataString.length() >= 9) {
                    String substring = dataString.substring(8);
                    if ("android.intent.action.PACKAGE_ADDED".equals(b) && C8413oOoo0o.f21545OooO0O0.equals(substring)) {
                        C1357b.m1992a().mo16175a(AppUpdateActivity.this.m1940a((AppUpdateActivity) 6, 0, -1));
                        C1399g.AsyncTaskC1400a.m2138a(substring, 1);
                        AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                        appUpdateActivity.m1952a((AppUpdateActivity) appUpdateActivity.f1610j.getPackage_(), AppUpdateActivity.this.f1610j.getDetailId_());
                        if (AppUpdateActivity.this.f1611k) {
                            AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                            appUpdateActivity2.m1967e((AppUpdateActivity) appUpdateActivity2.f1610j);
                        }
                    }
                }
            }
        }
    }

    static {
        C.i(50331728);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private Intent m1940a(int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra(UpdateKey.MARKET_DLD_STATUS, i3);
        intent.putExtra(UpdateKey.MARKET_INSTALL_STATE, i);
        intent.putExtra(UpdateKey.MARKET_INSTALL_TYPE, i2);
        return intent;
    }

    /* renamed from: a */
    private synchronized void m1943a() {
        if (C1340d.m1934b() != null) {
            C1340d.m1934b().mo16151d();
        }
        AbstractC1377a.m2067a(this, this.f1617q);
        C1375c.m2060b().mo16204b(this);
    }

    /* renamed from: a */
    private void m1944a(Context context) {
        if (!DownloadService.m1914a()) {
            C1340d.m1933a();
        }
        C1340d.m1934b().mo16153f();
        C1375c.m2060b().mo16203a(this);
    }

    /* renamed from: a */
    private void m1945a(View view) {
        try {
            ScrollView scrollView = (ScrollView) view.findViewById(C1380d.m2078a(this, "scroll_layout"));
            if (Build.VERSION.SDK_INT >= 22) {
                TypedValue typedValue = new TypedValue();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getTheme().resolveAttribute(16843987, typedValue, true);
                ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                scrollView.setPadding(complexToDimensionPixelSize, 0, complexToDimensionPixelSize, 0);
            }
        } catch (Exception e) {
            C1278a.m1584d("AppUpdateActivity", e.toString());
        }
    }

    /* renamed from: a */
    private void m1946a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView != null) {
            if (apkUpgradeInfo.getDiffSize_() > 0) {
                String a = C1370d.m2045a(this, (long) apkUpgradeInfo.getSize_());
                SpannableString spannableString = new SpannableString(a);
                spannableString.setSpan(new StrikethroughSpan(), 0, a.length(), 33);
                spannableString.setSpan(new TextAppearanceSpan("HwChinese-medium", 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
                textView.setText(spannableString);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1951a(String str) {
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(C8413oOoo0o.f21545OooO0O0);
        intent.putExtra("APP_PACKAGENAME", str);
        intent.putExtra("APP_MUST_UPDATE_BTN", this.f1612l);
        try {
            this.f1609i = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException e) {
            C1278a.m1584d("AppUpdateActivity", "goHiappUpgrade error: " + e.toString());
            this.f1609i = true;
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            C1357b.m1992a().mo16177b(intent2);
            m1967e(this.f1610j);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m1952a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f1613m = 1;
            finish();
            return;
        }
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
        intent.setPackage(C8413oOoo0o.f21545OooO0O0);
        intent.putExtra("appDetailId", str2);
        intent.putExtra("thirdId", str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (!this.f1611k) {
                finish();
            }
        } catch (ActivityNotFoundException unused) {
            C1359d.m2011a(this);
            C1359d.m2009a();
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            C1357b.m1992a().mo16177b(intent2);
            C1381a aVar = this.f1603c;
            if (aVar != null) {
                aVar.mo16221c();
            }
        }
    }

    /* renamed from: b */
    private void m1955b() {
        C1381a aVar = this.f1603c;
        if (aVar != null) {
            aVar.mo16212a(new DialogInterface$OnDismissListenerC1353a());
            this.f1603c.mo16214a(new DialogInterface$OnShowListenerC1354b());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m1956b(final String str) {
        C1381a a = C1381a.m2085a(this, null, getString(C1380d.m2081b(this, "upsdk_third_app_dl_cancel_download_prompt_ex")));
        this.f1602b = a;
        a.mo16218a(new AbstractC1388b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C13463 */

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: a */
            public void mo16168a() {
                AppUpdateActivity.this.f1604d.setProgress(0);
                AppUpdateActivity.this.f1604d.setMax(0);
                AppUpdateActivity.this.f1605e.setText("");
                AppUpdateActivity.this.m1970f();
                C1359d.m2012a(str);
                AppUpdateActivity.this.f1602b.mo16221c();
                if (AppUpdateActivity.this.f1611k) {
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.m1967e((AppUpdateActivity) appUpdateActivity.f1610j);
                    return;
                }
                AppUpdateActivity.this.f1613m = 4;
                AppUpdateActivity.this.finish();
            }

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: b */
            public void mo16169b() {
                AppUpdateActivity.this.f1602b.mo16221c();
            }
        });
        String string = getString(C1380d.m2081b(this, "upsdk_third_app_dl_sure_cancel_download"));
        this.f1602b.mo16217a(new C1381a.AbstractC1387b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C13474 */

            @Override // com.huawei.updatesdk.support.p086f.C1381a.AbstractC1387b
            /* renamed from: a */
            public void mo16166a() {
                AppUpdateActivity.this.finish();
            }
        });
        this.f1602b.mo16216a(C1381a.EnumC1386a.CONFIRM, string);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m1958c() {
        if (!C1371a.m2053b(this, C8413oOoo0o.f21545OooO0O0)) {
            if (C1294a.m1650a() == null) {
                C1294a.m1651a(this);
            }
            C1359d.m2011a(this);
            C1359d.m2009a();
            this.f1603c.mo16221c();
            return;
        }
        m1952a(this.f1610j.getPackage_(), this.f1610j.getDetailId_());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m1959c(int i) {
        if (i == 5 || i == 4) {
            Toast.makeText(this, getString(C1380d.m2081b(this, "upsdk_third_app_dl_install_failed")), 0).show();
            C1399g.AsyncTaskC1400a.m2138a(C8413oOoo0o.f21545OooO0O0, -1000001);
            finish();
        }
        if (i == 7) {
            C1399g.AsyncTaskC1400a.m2138a(C8413oOoo0o.f21545OooO0O0, -1000001);
            if (this.f1608h) {
                m1967e(this.f1610j);
            } else {
                finish();
            }
        }
    }

    /* renamed from: c */
    private void m1960c(final ApkUpgradeInfo apkUpgradeInfo) {
        final C1381a a = C1381a.m2085a(this, null, getString(C1380d.m2081b(this, "upsdk_install")));
        a.mo16218a(new AbstractC1388b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C13496 */

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: a */
            public void mo16168a() {
                if (!C1291b.m1636a(AppUpdateActivity.this)) {
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    Toast.makeText(appUpdateActivity, C1380d.m2081b(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                    AppUpdateActivity.this.finish();
                    return;
                }
                C1359d.m2010a(apkUpgradeInfo);
                a.mo16221c();
            }

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: b */
            public void mo16169b() {
                a.mo16221c();
                if (AppUpdateActivity.this.f1611k) {
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.m1967e((AppUpdateActivity) appUpdateActivity.f1610j);
                    return;
                }
                AppUpdateActivity.this.f1613m = 4;
                AppUpdateActivity.this.finish();
            }
        });
        String string = getString(C1380d.m2081b(this, "upsdk_app_download_info_new"));
        a.mo16217a(new C1381a.AbstractC1387b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C13507 */

            @Override // com.huawei.updatesdk.support.p086f.C1381a.AbstractC1387b
            /* renamed from: a */
            public void mo16166a() {
                AppUpdateActivity.this.finish();
            }
        });
        a.mo16216a(C1381a.EnumC1386a.CONFIRM, string);
        a.mo16213a(new DialogInterface.OnKeyListener() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.DialogInterface$OnKeyListenerC13518 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                if (AppUpdateActivity.this.f1611k) {
                    a.mo16221c();
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.m1967e((AppUpdateActivity) appUpdateActivity.f1610j);
                    return true;
                }
                AppUpdateActivity.this.f1613m = 4;
                AppUpdateActivity.this.finish();
                return true;
            }
        });
    }

    /* renamed from: c */
    private void m1962c(final String str) {
        AlertDialog alertDialog = this.f1601a;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.f1601a = new AlertDialog.Builder(this).create();
            View inflate = LayoutInflater.from(this).inflate(C1380d.m2082c(this, "upsdk_app_dl_progress_dialog"), (ViewGroup) null);
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(C1380d.m2078a(this, "third_app_dl_progressbar"));
            this.f1604d = progressBar;
            progressBar.setMax(100);
            this.f1605e = (TextView) inflate.findViewById(C1380d.m2078a(this, "third_app_dl_progress_text"));
            this.f1606f = (ImageView) inflate.findViewById(C1380d.m2078a(this, "cancel_imageview"));
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C1380d.m2078a(this, "cancel_bg"));
            this.f1607g = relativeLayout;
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.View$OnClickListenerC13485 */

                public void onClick(View view) {
                    AppUpdateActivity.this.m1956b((AppUpdateActivity) str);
                }
            });
            this.f1601a.setView(inflate);
            this.f1601a.setCancelable(false);
            this.f1601a.setCanceledOnTouchOutside(false);
            TextView textView = (TextView) inflate.findViewById(C1380d.m2078a(this, "third_app_warn_text"));
            if (C8413oOoo0o.f21545OooO0O0.equals(str)) {
                textView.setText(getString(C1380d.m2081b(this, "upsdk_app_dl_installing")));
            }
            if (!AbstractC1377a.m2069a(this)) {
                this.f1601a.show();
            }
            this.f1605e.setText(C1370d.m2044a(0));
        }
    }

    /* renamed from: d */
    private long m1963d(ApkUpgradeInfo apkUpgradeInfo) {
        return apkUpgradeInfo.getDiffSize_() > 0 ? (long) apkUpgradeInfo.getDiffSize_() : (long) apkUpgradeInfo.getSize_();
    }

    /* renamed from: d */
    private void m1965d() {
        int b = C1379c.m2071a().mo16208b();
        if (b >= 11 && b < 17) {
            this.f1603c.mo16211a(C1380d.m2083d(this, "upsdk_update_all_button"), C1380d.m2084e(this, "upsdk_white"));
        }
    }

    /* renamed from: e */
    private void m1966e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(C3777a.f10045u);
        C1355c cVar = new C1355c();
        this.f1617q = cVar;
        AbstractC1377a.m2068a(this, intentFilter, cVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m1967e(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = TextUtils.isEmpty(apkUpgradeInfo.getNewFeatures_()) ? getString(C1380d.m2081b(this, "upsdk_choice_update")) : apkUpgradeInfo.getNewFeatures_();
        String a = C1370d.m2045a(this, m1963d(apkUpgradeInfo));
        String version_ = apkUpgradeInfo.getVersion_();
        String name_ = apkUpgradeInfo.getName_();
        String string2 = getString(C1380d.m2081b(this, "upsdk_ota_title"));
        String string3 = getString(C1380d.m2081b(this, "upsdk_ota_notify_updatebtn"));
        String string4 = getString(C1380d.m2081b(this, "upsdk_ota_cancel"));
        View inflate = LayoutInflater.from(this).inflate(C1380d.m2082c(this, "upsdk_ota_update_view"), (ViewGroup) null);
        ((TextView) inflate.findViewById(C1380d.m2078a(this, "content_textview"))).setText(string);
        ((TextView) inflate.findViewById(C1380d.m2078a(this, "version_textview"))).setText(version_);
        ((TextView) inflate.findViewById(C1380d.m2078a(this, "appsize_textview"))).setText(a);
        ((TextView) inflate.findViewById(C1380d.m2078a(this, "name_textview"))).setText(name_);
        m1946a(apkUpgradeInfo, (TextView) inflate.findViewById(C1380d.m2078a(this, "allsize_textview")));
        m1945a(inflate);
        C1381a a2 = C1381a.m2085a(this, string2, null);
        this.f1603c = a2;
        a2.mo16215a(inflate);
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string4 = getString(C1380d.m2081b(this, "upsdk_ota_force_cancel_new"));
            if (this.f1612l) {
                this.f1603c.mo16210a();
            }
            this.f1608h = true;
        }
        this.f1603c.mo16218a(new AbstractC1388b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C13529 */

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: a */
            public void mo16168a() {
                AppUpdateActivity.this.f1615o = 101;
                if (!C1291b.m1636a(AppUpdateActivity.this)) {
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    Toast.makeText(appUpdateActivity, C1380d.m2081b(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                    AppUpdateActivity.this.f1613m = 2;
                    AppUpdateActivity.this.finish();
                    return;
                }
                AppUpdateActivity.this.m1958c();
            }

            @Override // com.huawei.updatesdk.support.p086f.AbstractC1388b
            /* renamed from: b */
            public void mo16169b() {
                AppUpdateActivity.this.f1603c.mo16221c();
                AppUpdateActivity.this.f1613m = 4;
                AppUpdateActivity.this.f1615o = 100;
                AppUpdateActivity.this.finish();
            }
        });
        m1955b();
        this.f1603c.mo16217a(new C1381a.AbstractC1387b() {
            /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.C134410 */

            @Override // com.huawei.updatesdk.support.p086f.C1381a.AbstractC1387b
            /* renamed from: a */
            public void mo16166a() {
                AppUpdateActivity.this.finish();
            }
        });
        if (this.f1608h) {
            this.f1603c.mo16219a(false);
        } else {
            this.f1603c.mo16213a(new DialogInterface.OnKeyListener() {
                /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.DialogInterface$OnKeyListenerC13452 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || keyEvent.getAction() != 0) {
                        return false;
                    }
                    AppUpdateActivity.this.f1613m = 4;
                    AppUpdateActivity.this.finish();
                    return true;
                }
            });
        }
        this.f1603c.mo16216a(C1381a.EnumC1386a.CONFIRM, string3);
        this.f1603c.mo16216a(C1381a.EnumC1386a.CANCEL, string4);
        m1965d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m1970f() {
        try {
            if (this.f1601a != null && this.f1601a.isShowing()) {
                this.f1601a.dismiss();
                this.f1601a = null;
            }
        } catch (IllegalArgumentException unused) {
            C1278a.m1580a("AppUpdateActivity", "progressDialog dismiss IllegalArgumentException");
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC1356a
    /* renamed from: a */
    public void mo16156a(int i) {
        Toast.makeText(this, getString(C1380d.m2081b(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        C1357b.m1992a().mo16174a(i);
        finish();
    }

    @Override // com.huawei.updatesdk.support.p084d.AbstractC1374b
    /* renamed from: a */
    public void mo16157a(int i, final C1296b bVar) {
        if (bVar != null) {
            if (i == 0) {
                Bundle a = bVar.mo15905a();
                if (a != null) {
                    int i2 = a.getInt("downloadtask.status", -1);
                    C1357b.m1992a().mo16175a(m1940a(-1, -1, i2));
                    switch (i2) {
                        case 3:
                        case 4:
                        case 7:
                            m1970f();
                            return;
                        case 5:
                        case 6:
                        case 8:
                            m1970f();
                            Toast.makeText(this, getString(C1380d.m2081b(this, "upsdk_third_app_dl_install_failed")), 0).show();
                            finish();
                            return;
                        default:
                            return;
                    }
                }
            } else if (1 == i) {
                DownloadTask a2 = DownloadTask.m1716a(bVar.mo15906a("downloadtask.all"));
                if (a2 != null) {
                    int z = a2.mo16006z();
                    ProgressBar progressBar = this.f1604d;
                    if (progressBar != null) {
                        progressBar.setProgress(z);
                        this.f1605e.setText(C1370d.m2044a((int) ((((float) this.f1604d.getProgress()) / ((float) this.f1604d.getMax())) * 100.0f)));
                    }
                }
            } else if (2 == i) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.huawei.updatesdk.service.otaupdate.AppUpdateActivity.RunnableC13431 */

                    public void run() {
                        Bundle a = bVar.mo15905a();
                        if (a != null) {
                            int i = a.getInt("INSTALL_STATE");
                            C1357b.m1992a().mo16175a(AppUpdateActivity.this.m1940a((AppUpdateActivity) i, a.getInt("INSTALL_TYPE"), -1));
                            AppUpdateActivity.this.m1959c((AppUpdateActivity) i);
                        }
                    }
                });
            }
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC1356a
    /* renamed from: a */
    public void mo16158a(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo != null) {
            m1944a((Context) this);
            m1960c(apkUpgradeInfo);
            return;
        }
        Toast.makeText(this, getString(C1380d.m2081b(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC1356a
    /* renamed from: b */
    public void mo16159b(int i) {
        Toast.makeText(this, getString(C1380d.m2081b(this, "upsdk_connect_server_fail_prompt_toast")), 0).show();
        C1357b.m1992a().mo16174a(i);
        finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.AbstractC1356a
    /* renamed from: b */
    public void mo16160b(ApkUpgradeInfo apkUpgradeInfo) {
        m1966e();
        m1962c(apkUpgradeInfo.getPackage_());
    }

    public native void finish();

    public native void onActivityResult(int i, int i2, Intent intent);

    public native void onCreate(Bundle bundle);

    public native void onDestroy();
}
