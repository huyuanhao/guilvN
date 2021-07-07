package com.alipay.android.phone.mrpc.core.p018a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.p118pd.sdk.C7513o0Ooo;
import com.p118pd.sdk.C7633o0oOo000;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* renamed from: com.alipay.android.phone.mrpc.core.a.d */
public final class C0346d extends AbstractC0343a {
    public C0346d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.p018a.AbstractC0345c
    /* renamed from: a */
    public final Object mo4115a() {
        try {
            String str = new String(this.f777b);
            StringBuilder sb = new StringBuilder("threadid = ");
            sb.append(Thread.currentThread().getId());
            sb.append("; rpc response:  ");
            sb.append(str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(C7513o0Ooo.OooO00o);
            if (i == 1000) {
                return this.f776a == String.class ? jSONObject.optString("result") : C7633o0oOo000.OooO00o(jSONObject.optString("result"), this.f776a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f777b));
            sb2.append(Constants.COLON_SEPARATOR);
            sb2.append(e);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e.getMessage());
        }
    }
}
