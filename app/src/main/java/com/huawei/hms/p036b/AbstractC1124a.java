package com.huawei.hms.p036b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.b.a */
public abstract class AbstractC1124a {

    /* renamed from: a */
    public Activity f1158a;

    /* renamed from: b */
    public AlertDialog f1159b;

    /* renamed from: c */
    public AbstractC1125a f1160c;

    /* renamed from: com.huawei.hms.b.a$a */
    public interface AbstractC1125a {
        /* renamed from: a */
        void mo15390a(AbstractC1124a aVar);

        /* renamed from: b */
        void mo15391b(AbstractC1124a aVar);
    }

    /* renamed from: e */
    public static int m1045e(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    /* renamed from: a */
    public AlertDialog mo15401a(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo15409e(), mo15410f());
        String c = mo15405c(activity);
        if (c != null) {
            builder.setTitle(c);
        }
        String a = mo15330a((Context) activity);
        if (a != null) {
            builder.setMessage(a);
        }
        String b = mo15331b(activity);
        if (b != null) {
            builder.setPositiveButton(b, new DialogInterface$OnClickListenerC1126b(this));
        }
        String d = mo15407d(activity);
        if (d != null) {
            builder.setNegativeButton(d, new DialogInterface$OnClickListenerC1127c(this));
        }
        return builder.create();
    }

    /* renamed from: a */
    public abstract String mo15330a(Context context);

    /* renamed from: b */
    public abstract String mo15331b(Context context);

    /* renamed from: b */
    public void mo15404b() {
        AlertDialog alertDialog = this.f1159b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: c */
    public abstract String mo15405c(Context context);

    /* renamed from: c */
    public void mo15406c() {
        AbstractC1125a aVar = this.f1160c;
        if (aVar != null) {
            aVar.mo15391b(this);
        }
    }

    /* renamed from: d */
    public abstract String mo15407d(Context context);

    /* renamed from: d */
    public void mo15408d() {
        AbstractC1125a aVar = this.f1160c;
        if (aVar != null) {
            aVar.mo15390a(this);
        }
    }

    /* renamed from: f */
    public int mo15410f() {
        return (m1045e(this.f1158a) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    /* renamed from: e */
    public Activity mo15409e() {
        return this.f1158a;
    }

    /* renamed from: a */
    public void mo15403a(Activity activity, AbstractC1125a aVar) {
        this.f1158a = activity;
        this.f1160c = aVar;
        if (activity == null || activity.isFinishing()) {
            C1202a.m1320d("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog a = mo15401a(this.f1158a);
        this.f1159b = a;
        a.setCanceledOnTouchOutside(false);
        this.f1159b.setOnCancelListener(new DialogInterface$OnCancelListenerC1128d(this));
        this.f1159b.setOnKeyListener(new DialogInterface$OnKeyListenerC1129e(this));
        this.f1159b.show();
    }

    /* renamed from: a */
    public void mo15402a() {
        AlertDialog alertDialog = this.f1159b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }
}
