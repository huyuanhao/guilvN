package com.qiyukf.unicorn.mediaselect.internal.p241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C8702oo0o0O0;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2741b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.d.a */
public final class C2754a {

    /* renamed from: a */
    public final WeakReference<Activity> f5717a;

    /* renamed from: b */
    public final WeakReference<Fragment> f5718b = null;

    /* renamed from: c */
    public C2741b f5719c;

    /* renamed from: d */
    public Uri f5720d;

    /* renamed from: e */
    public String f5721e;

    public C2754a(Activity activity) {
        this.f5717a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final Uri mo36551a() {
        return this.f5720d;
    }

    /* renamed from: a */
    public final void mo36552a(Context context) {
        File file;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            File file2 = null;
            try {
                String format = String.format("JPEG_%s.jpg", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
                if (this.f5719c.f5663a) {
                    file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = this.f5717a.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                }
                if (this.f5719c.f5665c != null) {
                    File file3 = new File(file, this.f5719c.f5665c);
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    file = file3;
                }
                File file4 = new File(file, format);
                if ("mounted".equals(C8702oo0o0O0.OooO00o(file4))) {
                    file2 = file4;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (file2 != null) {
                this.f5721e = file2.getAbsolutePath();
                Uri uriForFile = FileProvider.getUriForFile(this.f5717a.get(), this.f5719c.f5664b, file2);
                this.f5720d = uriForFile;
                intent.putExtra("output", uriForFile);
                intent.addFlags(2);
                if (Build.VERSION.SDK_INT < 21) {
                    for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                        context.grantUriPermission(resolveInfo.activityInfo.packageName, this.f5720d, 3);
                    }
                }
                WeakReference<Fragment> weakReference = this.f5718b;
                if (weakReference != null) {
                    weakReference.get().startActivityForResult(intent, 24);
                } else {
                    this.f5717a.get().startActivityForResult(intent, 24);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36553a(C2741b bVar) {
        this.f5719c = bVar;
    }

    /* renamed from: b */
    public final String mo36554b() {
        return this.f5721e;
    }
}
