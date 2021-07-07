package com.megvii.apo.util;

import android.content.Context;
import com.megvii.apo.PhoneFingerManager;
import com.umeng.commonsdk.proguard.C3617o;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.megvii.apo.util.i */
public final class C1499i {

    /* renamed from: a */
    public File f2025a;

    /* renamed from: b */
    public File f2026b;

    /* renamed from: c */
    public File f2027c;

    /* renamed from: d */
    public Context f2028d;

    /* renamed from: e */
    public PhoneFingerManager f2029e;

    public C1499i(Context context, PhoneFingerManager phoneFingerManager) {
        this.f2028d = context;
        this.f2029e = phoneFingerManager;
        this.f2026b = new File(context.getFilesDir(), "a");
        this.f2027c = new File(context.getFilesDir(), "d");
        this.f2025a = new File(context.getFilesDir(), C3617o.f9365as);
    }

    /* renamed from: a */
    public final synchronized String mo16966a() {
        String format;
        format = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.CHINA).format(new Date(System.currentTimeMillis()));
        return format + ".txt";
    }
}
