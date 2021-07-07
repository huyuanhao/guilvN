package com.huawei.hms.update.p053a;

import java.io.File;

/* renamed from: com.huawei.hms.update.a.f */
public class RunnableC1217f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1338a;

    /* renamed from: b */
    public final /* synthetic */ int f1339b;

    /* renamed from: c */
    public final /* synthetic */ int f1340c;

    /* renamed from: d */
    public final /* synthetic */ File f1341d;

    /* renamed from: e */
    public final /* synthetic */ C1215d f1342e;

    public RunnableC1217f(C1215d dVar, int i, int i2, int i3, File file) {
        this.f1342e = dVar;
        this.f1338a = i;
        this.f1339b = i2;
        this.f1340c = i3;
        this.f1341d = file;
    }

    public void run() {
        this.f1342e.f1334a.mo15730a(this.f1338a, this.f1339b, this.f1340c, this.f1341d);
    }
}
