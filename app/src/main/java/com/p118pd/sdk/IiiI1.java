package com.p118pd.sdk;

import android.util.Log;

/* renamed from: com.pd.sdk.Iii丨I1  reason: invalid class name */
public class IiiI1 implements C1Lll {
    @Override // com.p118pd.sdk.C1Lll
    public int OooO00o(String str, String str2) {
        return Log.v(str, str2);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0O0(String str, String str2, Throwable th) {
        return Log.v(str, str2, th);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0OO(String str, String str2) {
        return Log.i(str, str2);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0Oo(String str, String str2, Throwable th) {
        return Log.w(str, str2, th);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0o0(String str, String str2, Throwable th) {
        return Log.i(str, str2, th);
    }

    @Override // com.p118pd.sdk.C1Lll
    /* renamed from: d */
    public int mo18544d(String str, String str2) {
        return Log.d(str, str2);
    }

    @Override // com.p118pd.sdk.C1Lll
    /* renamed from: e */
    public int mo18545e(String str, String str2) {
        return Log.e(str, str2);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO00o(String str, String str2, Throwable th) {
        return Log.d(str, str2, th);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0O0(String str, String str2) {
        return Log.w(str, str2);
    }

    @Override // com.p118pd.sdk.C1Lll
    public int OooO0OO(String str, String str2, Throwable th) {
        return Log.e(str, str2, th);
    }
}
