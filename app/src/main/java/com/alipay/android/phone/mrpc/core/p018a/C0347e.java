package com.alipay.android.phone.mrpc.core.p018a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.p118pd.sdk.C7460o0Oo0OOO;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.alipay.android.phone.mrpc.core.a.e */
public final class C0347e extends AbstractC0344b {

    /* renamed from: c */
    public int f780c;

    /* renamed from: d */
    public Object f781d;

    public C0347e(int i, String str, Object obj) {
        super(str, obj);
        this.f780c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.p018a.AbstractC0348f
    /* renamed from: a */
    public final void mo4116a(Object obj) {
        this.f781d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.p018a.AbstractC0348f
    /* renamed from: a */
    public final byte[] mo4117a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f781d != null) {
                arrayList.add(new BasicNameValuePair("extParam", C7460o0Oo0OOO.m19090OooO00o(this.f781d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f778a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f780c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            new StringBuilder("mParams is:").append(this.f779b);
            arrayList.add(new BasicNameValuePair("requestData", this.f779b == null ? "[]" : C7460o0Oo0OOO.m19090OooO00o(this.f779b)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f779b);
            sb2.append(Constants.COLON_SEPARATOR);
            sb2.append(e);
            throw new RpcException(9, sb2.toString() == null ? "" : e.getMessage(), e);
        }
    }
}
