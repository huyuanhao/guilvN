package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.tencent.bugly.AbstractC3215a;
import com.tencent.bugly.C3216b;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ah */
public class C3311ah {
    /* renamed from: a */
    public static C3344bh m8283a(UserInfoBean userInfoBean, C3269a aVar) {
        if (userInfoBean == null) {
            return null;
        }
        C3344bh bhVar = new C3344bh();
        bhVar.f8176a = userInfoBean.f7570e;
        bhVar.f8180e = userInfoBean.f7575j;
        bhVar.f8179d = userInfoBean.f7568c;
        bhVar.f8178c = userInfoBean.f7569d;
        bhVar.f8182g = C3269a.m7966b().mo38166i();
        bhVar.f8183h = userInfoBean.f7580o == 1;
        int i = userInfoBean.f7567b;
        if (i == 1) {
            bhVar.f8177b = 1;
        } else if (i == 2) {
            bhVar.f8177b = 4;
        } else if (i == 3) {
            bhVar.f8177b = 2;
        } else if (i == 4) {
            bhVar.f8177b = 3;
        } else if (i < 10 || i >= 20) {
            C3321an.m8357e("unknown uinfo type %d ", Integer.valueOf(userInfoBean.f7567b));
            return null;
        } else {
            bhVar.f8177b = (byte) i;
        }
        HashMap hashMap = new HashMap();
        bhVar.f8181f = hashMap;
        if (userInfoBean.f7581p >= 0) {
            hashMap.put("C01", "" + userInfoBean.f7581p);
        }
        if (userInfoBean.f7582q >= 0) {
            Map<String, String> map = bhVar.f8181f;
            map.put("C02", "" + userInfoBean.f7582q);
        }
        Map<String, String> map2 = userInfoBean.f7583r;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f7583r.entrySet()) {
                Map<String, String> map3 = bhVar.f8181f;
                map3.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f7584s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f7584s.entrySet()) {
                Map<String, String> map5 = bhVar.f8181f;
                map5.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map6 = bhVar.f8181f;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(!userInfoBean.f7577l);
        map6.put("A36", sb.toString());
        Map<String, String> map7 = bhVar.f8181f;
        map7.put("F02", "" + userInfoBean.f7572g);
        Map<String, String> map8 = bhVar.f8181f;
        map8.put("F03", "" + userInfoBean.f7573h);
        Map<String, String> map9 = bhVar.f8181f;
        map9.put("F04", "" + userInfoBean.f7575j);
        Map<String, String> map10 = bhVar.f8181f;
        map10.put("F05", "" + userInfoBean.f7574i);
        Map<String, String> map11 = bhVar.f8181f;
        map11.put("F06", "" + userInfoBean.f7578m);
        Map<String, String> map12 = bhVar.f8181f;
        map12.put("F10", "" + userInfoBean.f7576k);
        C3321an.m8355c("summary type %d vm:%d", Byte.valueOf(bhVar.f8177b), Integer.valueOf(bhVar.f8181f.size()));
        return bhVar;
    }

    /* renamed from: a */
    public static C3345bi m8284a(List<UserInfoBean> list, int i) {
        C3269a b;
        if (list == null || list.size() == 0 || (b = C3269a.m7966b()) == null) {
            return null;
        }
        b.mo38177t();
        C3345bi biVar = new C3345bi();
        biVar.f8187b = b.f7681e;
        biVar.f8188c = b.mo38165h();
        ArrayList<C3344bh> arrayList = new ArrayList<>();
        for (UserInfoBean userInfoBean : list) {
            C3344bh a = m8283a(userInfoBean, b);
            if (a != null) {
                arrayList.add(a);
            }
        }
        biVar.f8189d = arrayList;
        HashMap hashMap = new HashMap();
        biVar.f8190e = hashMap;
        hashMap.put("A7", "" + b.f7688l);
        Map<String, String> map = biVar.f8190e;
        map.put("A6", "" + b.mo38176s());
        Map<String, String> map2 = biVar.f8190e;
        map2.put("A5", "" + b.mo38175r());
        Map<String, String> map3 = biVar.f8190e;
        map3.put("A2", "" + b.mo38173p());
        Map<String, String> map4 = biVar.f8190e;
        map4.put("A1", "" + b.mo38173p());
        Map<String, String> map5 = biVar.f8190e;
        map5.put("A24", "" + b.f7690n);
        Map<String, String> map6 = biVar.f8190e;
        map6.put("A17", "" + b.mo38174q());
        Map<String, String> map7 = biVar.f8190e;
        map7.put("A15", "" + b.mo38180w());
        Map<String, String> map8 = biVar.f8190e;
        map8.put("A13", "" + b.mo38181x());
        Map<String, String> map9 = biVar.f8190e;
        map9.put("F08", "" + b.f7621B);
        Map<String, String> map10 = biVar.f8190e;
        map10.put("F09", "" + b.f7622C);
        Map<String, String> G = b.mo38131G();
        if (G != null && G.size() > 0) {
            for (Map.Entry<String, String> entry : G.entrySet()) {
                Map<String, String> map11 = biVar.f8190e;
                map11.put("C04_" + entry.getKey(), entry.getValue());
            }
        }
        if (i == 1) {
            biVar.f8186a = 1;
        } else if (i != 2) {
            C3321an.m8357e("unknown up type %d ", Integer.valueOf(i));
            return null;
        } else {
            biVar.f8186a = 2;
        }
        return biVar;
    }

    /* renamed from: a */
    public static <T extends AbstractC3357m> T m8285a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T newInstance = cls.newInstance();
                C3354k kVar = new C3354k(bArr);
                kVar.mo38450a("utf-8");
                newInstance.mo38326a(kVar);
                return newInstance;
            } catch (Throwable th) {
                if (!C3321an.m8353b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C3340bd m8281a(Context context, int i, byte[] bArr) {
        C3269a b = C3269a.m7966b();
        StrategyBean c = C3272a.m8069a().mo38194c();
        if (b == null || c == null) {
            C3321an.m8357e("Can not create request pkg for parameters is invalid.", new Object[0]);
            return null;
        }
        try {
            C3340bd bdVar = new C3340bd();
            synchronized (b) {
                bdVar.f8124a = b.f7679c;
                bdVar.f8125b = b.mo38161f();
                bdVar.f8126c = b.f7680d;
                bdVar.f8127d = b.f7692p;
                bdVar.f8128e = b.f7694r;
                b.getClass();
                bdVar.f8129f = "2.6.5";
                bdVar.f8130g = i;
                bdVar.f8131h = bArr == null ? "".getBytes() : bArr;
                bdVar.f8132i = b.f7689m;
                bdVar.f8133j = b.f7690n;
                bdVar.f8134k = new HashMap();
                bdVar.f8135l = b.mo38159e();
                bdVar.f8136m = c.f7723p;
                bdVar.f8138o = b.mo38165h();
                bdVar.f8139p = C3270b.m8040f(context);
                bdVar.f8140q = System.currentTimeMillis();
                bdVar.f8141r = "" + b.mo38168k();
                bdVar.f8142s = b.mo38167j();
                bdVar.f8143t = "" + b.mo38170m();
                bdVar.f8144u = b.mo38169l();
                bdVar.f8145v = "" + b.mo38171n();
                bdVar.f8146w = bdVar.f8139p;
                b.getClass();
                bdVar.f8137n = "com.tencent.bugly";
                Map<String, String> map = bdVar.f8134k;
                map.put("A26", "" + b.mo38182y());
                Map<String, String> map2 = bdVar.f8134k;
                map2.put("A60", "" + b.mo38183z());
                Map<String, String> map3 = bdVar.f8134k;
                map3.put("A61", "" + b.mo38125A());
                Map<String, String> map4 = bdVar.f8134k;
                map4.put("A62", "" + b.mo38142R());
                Map<String, String> map5 = bdVar.f8134k;
                map5.put("A63", "" + b.mo38143S());
                Map<String, String> map6 = bdVar.f8134k;
                map6.put("F11", "" + b.f7625F);
                Map<String, String> map7 = bdVar.f8134k;
                map7.put("F12", "" + b.f7624E);
                Map<String, String> map8 = bdVar.f8134k;
                map8.put("G1", "" + b.mo38178u());
                Map<String, String> map9 = bdVar.f8134k;
                map9.put("A64", "" + b.mo38144T());
                if (b.f7629J) {
                    Map<String, String> map10 = bdVar.f8134k;
                    map10.put("G2", "" + b.mo38136L());
                    Map<String, String> map11 = bdVar.f8134k;
                    map11.put("G3", "" + b.mo38137M());
                    Map<String, String> map12 = bdVar.f8134k;
                    map12.put("G4", "" + b.mo38138N());
                    Map<String, String> map13 = bdVar.f8134k;
                    map13.put("G5", "" + b.mo38139O());
                    Map<String, String> map14 = bdVar.f8134k;
                    map14.put("G6", "" + b.mo38140P());
                    Map<String, String> map15 = bdVar.f8134k;
                    map15.put("G7", "" + Long.toString(b.mo38141Q()));
                }
                Map<String, String> map16 = bdVar.f8134k;
                map16.put("D3", "" + b.f7693q);
                if (C3216b.f7323b != null) {
                    for (AbstractC3215a aVar : C3216b.f7323b) {
                        if (!(aVar.versionKey == null || aVar.version == null)) {
                            bdVar.f8134k.put(aVar.versionKey, aVar.version);
                        }
                    }
                }
                bdVar.f8134k.put("G15", C3325ap.m8427c("G15", ""));
                bdVar.f8134k.put("D4", C3325ap.m8427c("D4", "0"));
            }
            C3314ak a = C3314ak.m8297a();
            if (!(a == null || a.f7997b || bArr == null)) {
                byte[] a2 = C3325ap.m8410a(bdVar.f8131h, 2, 1, c.f7728u);
                bdVar.f8131h = a2;
                if (a2 == null) {
                    C3321an.m8357e("reqPkg sbuffer error!", new Object[0]);
                    return null;
                }
            }
            Map<String, String> F = b.mo38130F();
            if (F != null) {
                for (Map.Entry<String, String> entry : F.entrySet()) {
                    bdVar.f8134k.put(entry.getKey(), entry.getValue());
                }
            }
            return bdVar;
        } catch (Throwable th) {
            if (!C3321an.m8353b(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m8287a(Object obj) {
        try {
            C3348e eVar = new C3348e();
            eVar.mo38418b();
            eVar.mo38413a("utf-8");
            eVar.mo38419a(1);
            eVar.mo38422b("RqdServer");
            eVar.mo38423c(BaseJavaModule.METHOD_TYPE_SYNC);
            eVar.mo38414a("detail", obj);
            return eVar.mo38416a();
        } catch (Throwable th) {
            if (C3321an.m8353b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C3341be m8282a(byte[] bArr, StrategyBean strategyBean, boolean z) {
        if (bArr != null) {
            try {
                C3348e eVar = new C3348e();
                eVar.mo38418b();
                eVar.mo38413a("utf-8");
                eVar.mo38415a(bArr);
                Object b = eVar.mo38417b("detail", new C3341be());
                C3341be beVar = C3341be.class.isInstance(b) ? (C3341be) C3341be.class.cast(b) : null;
                if (!z && beVar != null && beVar.f8152c != null && beVar.f8152c.length > 0) {
                    C3321an.m8355c("resp buf %d", Integer.valueOf(beVar.f8152c.length));
                    byte[] b2 = C3325ap.m8424b(beVar.f8152c, 2, 1, StrategyBean.f7711d);
                    beVar.f8152c = b2;
                    if (b2 == null) {
                        C3321an.m8357e("resp sbuffer error!", new Object[0]);
                        return null;
                    }
                }
                return beVar;
            } catch (Throwable th) {
                if (!C3321an.m8353b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m8286a(AbstractC3357m mVar) {
        try {
            C3356l lVar = new C3356l();
            lVar.mo38471a("utf-8");
            mVar.mo38327a(lVar);
            return lVar.mo38494b();
        } catch (Throwable th) {
            if (C3321an.m8353b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
