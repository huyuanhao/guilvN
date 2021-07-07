package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.lang.reflect.Method;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.as */
public class C4267as implements AbstractC4266ar {

    /* renamed from: a */
    public Context f11384a;

    /* renamed from: a */
    public Class<?> f11385a;

    /* renamed from: a */
    public Object f11386a;

    /* renamed from: a */
    public Method f11387a = null;

    /* renamed from: b */
    public Method f11388b = null;

    /* renamed from: c */
    public Method f11389c = null;

    /* renamed from: d */
    public Method f11390d = null;

    public C4267as(Context context) {
        this.f11384a = context;
        m11694a(context);
    }

    /* renamed from: a */
    private String m11693a(Context context, Method method) {
        Object obj = this.f11386a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            AbstractC4163b.m11302a("miui invoke error", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m11694a(Context context) {
        try {
            Class<?> a = C4688t.m14219a(context, "com.android.id.impl.IdProviderImpl");
            this.f11385a = a;
            this.f11386a = a.newInstance();
            this.f11387a = this.f11385a.getMethod("getUDID", Context.class);
            this.f11388b = this.f11385a.getMethod("getOAID", Context.class);
            this.f11389c = this.f11385a.getMethod("getVAID", Context.class);
            this.f11390d = this.f11385a.getMethod("getAAID", Context.class);
        } catch (Exception e) {
            AbstractC4163b.m11302a("miui load class error", e);
        }
    }

    /* renamed from: a */
    public static boolean m11695a(Context context) {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName());
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public String mo41492a() {
        return m11693a(this.f11384a, this.f11387a);
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public boolean m11697a() {
        return (this.f11385a == null || this.f11386a == null) ? false : true;
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: b */
    public String mo41493b() {
        return m11693a(this.f11384a, this.f11388b);
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: c */
    public String mo41494c() {
        return m11693a(this.f11384a, this.f11389c);
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: d */
    public String mo41495d() {
        return m11693a(this.f11384a, this.f11390d);
    }
}
