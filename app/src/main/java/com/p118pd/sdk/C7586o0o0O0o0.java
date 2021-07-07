package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.o0o0O0o0  reason: case insensitive filesystem */
public class C7586o0o0O0o0 implements AbstractC7584o0o0O0OO {
    public static AbstractC7575o0o00ooo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC7584o0o0O0OO f20423OooO00o;

    public static AbstractC7584o0o0O0OO OooO00o(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f20423OooO00o == null) {
            OooO00o = C7581o0o0O00o.OooO00o(context, str);
            f20423OooO00o = new C7586o0o0O0o0();
        }
        return f20423OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7584o0o0O0OO
    public C7582o0o0O0O OooO00o(C7602o0o0Oo00 o0o0oo00) {
        return C7583o0o0O0O0.OooO00o(OooO00o.OooO00o(C7583o0o0O0O0.OooO00o(o0o0oo00)));
    }

    @Override // com.p118pd.sdk.AbstractC7584o0o0O0OO
    /* renamed from: a */
    public boolean mo27531a(String str) {
        return OooO00o.mo27521a(str);
    }
}
