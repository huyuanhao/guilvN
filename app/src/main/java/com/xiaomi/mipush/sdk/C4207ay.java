package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.service.C4626at;

/* renamed from: com.xiaomi.mipush.sdk.ay */
public class C4207ay extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C4204aw f11263a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4207ay(C4204aw awVar, Handler handler) {
        super(handler);
        this.f11263a = awVar;
    }

    public void onChange(boolean z) {
        C4204aw awVar = this.f11263a;
        awVar.f11254a = Integer.valueOf(C4626at.m13995a(C4204aw.m11439a(awVar)).mo42688a());
        if (C4204aw.m11445a(this.f11263a).intValue() != 0) {
            C4204aw.m11439a(this.f11263a).getContentResolver().unregisterContentObserver(this);
            if (C4274az.m11735b(C4204aw.m11439a(this.f11263a))) {
                this.f11263a.m11487c();
            }
        }
    }
}
