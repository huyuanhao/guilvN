package com.p118pd.sdk;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.pd.sdk.ooOOOO  reason: case insensitive filesystem */
public class RunnableC8936ooOOOO implements Runnable {
    public static final String o0OOO0o = "CacheReadRunImpl";
    public Handler OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8940ooOOOO0o f22179OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8944ooOOOOOO f22180OooO00o;
    public int o00oO0O;
    public String o0ooOOo;
    public String o0ooOoO;

    /* renamed from: com.pd.sdk.ooOOOO$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            if (RunnableC8936ooOOOO.this.f22179OooO00o != null) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    RunnableC8936ooOOOO.this.f22179OooO00o.onFailure("数据解析失败");
                } else {
                    RunnableC8936ooOOOO.this.f22179OooO00o.OooO00o(bArr);
                }
            }
        }
    }

    public RunnableC8936ooOOOO(int i, String str, C8944ooOOOOOO oooooooo, String str2, AbstractC8940ooOOOO0o oooooo0o) {
        this.o00oO0O = i;
        this.o0ooOOo = str;
        this.o0ooOoO = str2;
        this.f22180OooO00o = oooooooo;
        this.f22179OooO00o = oooooo0o;
    }

    public void run() {
        Thread.currentThread().setPriority(this.o00oO0O);
        byte[] OooO00o2 = this.f22180OooO00o.m20618OooO00o(this.o0ooOOo);
        Message obtain = Message.obtain();
        if (OooO00o2 != null) {
            String OooO0O0 = C9045ooOoOO0o.OooO0O0(OooO00o2);
            if (!C9054ooOoOo0.OooO0Oo(OooO0O0) || !OooO0O0.equalsIgnoreCase(this.o0ooOoO)) {
                this.f22180OooO00o.m20617OooO00o(this.o0ooOOo);
            } else {
                obtain.obj = OooO00o2;
            }
        }
        this.OooO00o.sendMessage(obtain);
    }
}
