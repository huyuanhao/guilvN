package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.cache.impl.AbstractC4105a;
import com.vivo.push.model.C4117a;
import com.vivo.push.util.C4137g;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4156z;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vivo.push.cache.a */
public final class C4099a extends AbstractC4102d<C4117a> {
    public C4099a(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.AbstractC4102d
    /* renamed from: a */
    public final String mo40985a() {
        return "com.vivo.pushservice.back_up";
    }

    @Override // com.vivo.push.cache.AbstractC4102d
    /* renamed from: a */
    public final List<C4117a> mo40986a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.trim().split(AbstractC4105a.SPILTE_TAG)) {
                String trim = str2.trim();
                String[] split = trim.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length >= 2) {
                    try {
                        arrayList.add(new C4117a(split[0], trim.substring(split[0].length() + 1)));
                    } catch (Exception e) {
                        C4146p.m11216d("AppConfigSettings", "str2Clients E: " + e);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.AbstractC4102d
    /* renamed from: b */
    public final String mo40988b(String str) throws Exception {
        return new String(C4137g.m11168a(C4137g.m11167a(AbstractC4102d.f11002a), C4137g.m11167a(AbstractC4102d.f11003b), Base64.decode(str, 2)), "utf-8");
    }

    /* renamed from: c */
    public final C4117a mo40989c(String str) {
        synchronized (AbstractC4102d.f11004c) {
            for (T t : this.f11005d) {
                if (!TextUtils.isEmpty(t.mo41076a()) && t.mo41076a().equals(str)) {
                    return t;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public final int mo40987b() {
        C4117a c = mo40989c("push_mode");
        if (c != null && !TextUtils.isEmpty(c.mo41077b())) {
            try {
                return Integer.parseInt(c.mo41077b());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m11051a(int i) {
        if (i != -1) {
            return (i & 1) != 0;
        }
        return C4156z.m11267b("persist.sys.log.ctrl", "no").equals("yes");
    }
}
