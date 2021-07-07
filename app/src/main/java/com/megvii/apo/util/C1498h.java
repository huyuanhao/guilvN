package com.megvii.apo.util;

import android.content.Context;
import com.megvii.apo.p093b.C1469a;
import com.megvii.apo.p093b.C1470b;
import com.umeng.commonsdk.proguard.C3617o;
import java.io.File;

/* renamed from: com.megvii.apo.util.h */
public final class C1498h {

    /* renamed from: a */
    public Context f2018a;

    /* renamed from: b */
    public File f2019b;

    /* renamed from: c */
    public File f2020c;

    /* renamed from: d */
    public File f2021d;

    /* renamed from: e */
    public C1469a f2022e;

    /* renamed from: f */
    public long f2023f = 0;

    /* renamed from: g */
    public long f2024g = 0;

    public C1498h(Context context) {
        this.f2018a = context;
        this.f2019b = new File(context.getFilesDir(), "a");
        this.f2020c = new File(context.getFilesDir(), "d");
        this.f2021d = new File(context.getFilesDir(), C3617o.f9365as);
        this.f2022e = new C1469a(this.f2018a);
    }

    /* renamed from: a */
    public final void mo16965a(int i) {
        File[] listFiles;
        File file = null;
        if (i == 1) {
            try {
                file = this.f2019b;
            } catch (Throwable th) {
                C1495e.m2258a(th);
                return;
            }
        } else if (i == 2) {
            file = this.f2020c;
        } else if (i == 3) {
            file = this.f2021d;
        }
        if (!(file == null || (listFiles = file.listFiles()) == null)) {
            if (listFiles.length > 0) {
                for (File file2 : listFiles) {
                    m2271a(file2);
                }
                if (i < 3) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    private void m2271a(File file) {
        try {
            C1470b bVar = new C1470b();
            bVar.mo16952a("file", file);
            bVar.mo16953a("version", "1");
            String a = this.f2022e.mo16950a("http://10.104.4.50:8089/v1/collection", new String(bVar.mo16954b()), bVar.mo16951a(), null);
            if (a != null && C1469a.m2182a(a)) {
                file.delete();
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }
}
