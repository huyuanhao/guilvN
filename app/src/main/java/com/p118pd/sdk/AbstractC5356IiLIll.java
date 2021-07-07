package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IiLIl丨l  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5356IiLIll {
    public static final String OooO00o = ".errorRendering";

    public final String OooO00o(Object obj) {
        try {
            return OooO0O0(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + OooO00o;
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            return obj.getClass().getName() + OooO00o;
        }
    }

    @Deprecated
    public void OooO00o(Throwable th) {
    }

    public String OooO0O0(Object obj) throws InterruptedException {
        return null;
    }
}
