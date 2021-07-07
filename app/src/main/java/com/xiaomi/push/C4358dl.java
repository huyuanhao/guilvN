package com.xiaomi.push;

import com.xiaomi.push.C4354dk;
import java.io.File;
import java.util.Date;

/* renamed from: com.xiaomi.push.dl */
public class C4358dl extends C4354dk.C4356b {

    /* renamed from: a */
    public final /* synthetic */ int f11607a;

    /* renamed from: a */
    public final /* synthetic */ C4354dk f11608a;

    /* renamed from: a */
    public File f11609a;

    /* renamed from: a */
    public final /* synthetic */ String f11610a;

    /* renamed from: a */
    public final /* synthetic */ Date f11611a;

    /* renamed from: a */
    public final /* synthetic */ boolean f11612a;

    /* renamed from: b */
    public final /* synthetic */ String f11613b;

    /* renamed from: b */
    public final /* synthetic */ Date f11614b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4358dl(C4354dk dkVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f11608a = dkVar;
        this.f11607a = i;
        this.f11611a = date;
        this.f11614b = date2;
        this.f11610a = str;
        this.f11613b = str2;
        this.f11612a = z;
    }

    @Override // com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: b */
    public void mo41488b() {
        if (C4243aa.m11625d()) {
            try {
                File file = new File(C4354dk.m12089a(this.f11608a).getExternalFilesDir(null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    C4353dj djVar = new C4353dj();
                    djVar.mo41664a(this.f11607a);
                    this.f11609a = djVar.mo41663a(C4354dk.m12089a(this.f11608a), this.f11611a, this.f11614b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: c */
    public void mo41489c() {
        File file = this.f11609a;
        if (file != null && file.exists()) {
            C4354dk.m12091a(this.f11608a).add(new C4354dk.C4357c(this.f11610a, this.f11613b, this.f11609a, this.f11612a));
        }
        C4354dk.m12094a(this.f11608a, 0);
    }
}
