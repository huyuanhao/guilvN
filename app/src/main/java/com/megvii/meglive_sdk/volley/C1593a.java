package com.megvii.meglive_sdk.volley;

import android.content.Intent;

/* renamed from: com.megvii.meglive_sdk.volley.a */
public final class C1593a extends C1638t {

    /* renamed from: c */
    public Intent f2820c;

    public C1593a() {
    }

    public final String getMessage() {
        if (this.f2820c != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public C1593a(C1625j jVar) {
        super(jVar);
    }
}
