package com.qiyukf.unicorn.p229h;

import android.util.Base64;
import android.util.SparseArray;
import com.p118pd.sdk.C6980o000O000;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2558d;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.C2604f;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2593w;

/* renamed from: com.qiyukf.unicorn.h.e */
public final class C2680e {

    /* renamed from: a */
    public C6980o000O000<String, SparseArray<C2593w>> f5570a;

    /* renamed from: com.qiyukf.unicorn.h.e$a */
    public static class C2681a {

        /* renamed from: a */
        public static C2680e f5571a = new C2680e((byte) 0);
    }

    public C2680e() {
        this.f5570a = new C6980o000O000<>(5);
    }

    public /* synthetic */ C2680e(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo36377a(long j, String str, C2593w wVar) {
        String str2 = str + C8932ooOOO0o.OooO0OO + wVar.mo36120c();
        SparseArray<C2593w> sparseArray = this.f5570a.get(str2);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f5570a.put(str2, sparseArray);
        }
        sparseArray.put(wVar.mo36122e(), wVar);
        if (sparseArray.size() == wVar.mo36121d()) {
            this.f5570a.remove(str2);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sparseArray.size(); i++) {
                sb.append(sparseArray.get(i).mo36123f());
            }
            AbstractC2558d a = C2604f.m5892a().parse(new String(Base64.decode(sb.toString(), 0)));
            if (a != null) {
                if (wVar.mo36118a() == 1) {
                    C2315c.m4986a(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, wVar.mo36119b(), a, j));
                } else if (a instanceof AbstractC2597e) {
                    C2209b.m4597a(MessageBuilder.createCustomReceivedNotification(str, (AbstractC2597e) a, j));
                }
            }
        }
    }
}
