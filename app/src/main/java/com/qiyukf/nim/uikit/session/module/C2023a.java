package com.qiyukf.nim.uikit.session.module;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;

/* renamed from: com.qiyukf.nim.uikit.session.module.a */
public final class C2023a {

    /* renamed from: a */
    public final Activity f3991a;

    /* renamed from: b */
    public final Fragment f3992b;

    /* renamed from: c */
    public String f3993c;

    /* renamed from: d */
    public final SessionTypeEnum f3994d;

    /* renamed from: e */
    public final AbstractC2048b f3995e;

    public C2023a(Fragment fragment, String str, SessionTypeEnum sessionTypeEnum, AbstractC2048b bVar) {
        this.f3992b = fragment;
        this.f3991a = fragment.getActivity();
        this.f3993c = str;
        this.f3994d = sessionTypeEnum;
        this.f3995e = bVar;
    }
}
