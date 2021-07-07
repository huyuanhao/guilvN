package com.qiyukf.nimlib.p180e.p181a;

import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import java.io.Serializable;

/* renamed from: com.qiyukf.nimlib.e.a.b */
public final class C2231b implements Serializable {

    /* renamed from: a */
    public final StatusCode f4441a;

    /* renamed from: b */
    public final LoginInfo f4442b;

    /* renamed from: c */
    public final int f4443c;

    public C2231b(StatusCode statusCode, int i, LoginInfo loginInfo) {
        this.f4441a = statusCode;
        this.f4443c = i;
        this.f4442b = loginInfo;
    }
}
