package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.h */
public class C3680h extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9647a = "newumid";

    /* renamed from: b */
    public Context f9648b;

    public C3680h(Context context) {
        super(f9647a);
        this.f9648b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return UMEnvelopeBuild.imprintProperty(this.f9648b, "umid", null);
    }
}
