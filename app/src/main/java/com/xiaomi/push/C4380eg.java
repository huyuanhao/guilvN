package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.eg */
public class C4380eg extends AbstractC4379ef {

    /* renamed from: a */
    public boolean f11646a;

    /* renamed from: b */
    public boolean f11647b;

    /* renamed from: c */
    public boolean f11648c;

    /* renamed from: d */
    public boolean f11649d;

    public C4380eg(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, i);
        this.f11646a = z;
        this.f11647b = z2;
        if (C4563l.m13731d()) {
            this.f11647b = false;
        }
        this.f11648c = z3;
        this.f11649d = z4;
    }

    /* renamed from: a */
    private String m12170a(Context context) {
        return !this.f11649d ? "off" : "";
    }

    @Override // com.xiaomi.push.AbstractC4379ef
    /* renamed from: b */
    private String m12171b() {
        if (!this.f11646a) {
            return "off";
        }
        try {
            String c = m12172c();
            if (TextUtils.isEmpty(c)) {
                return "";
            }
            return C4285bf.m11800a(c) + Constants.ACCEPT_TIME_SEPARATOR_SP + C4285bf.m11809b(c);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private String m12172c() {
        return "";
    }

    /* renamed from: d */
    private String m12173d() {
        return !this.f11647b ? "off" : "";
    }

    /* renamed from: e */
    private String m12174e() {
        return !this.f11648c ? "off" : "";
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 13;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12176a() {
        return EnumC4496hq.DeviceBaseInfo;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12177a() {
        return m12171b() + "|" + m12173d() + "|" + m12174e() + "|" + m12170a(((AbstractC4379ef) this).f11645a);
    }
}
