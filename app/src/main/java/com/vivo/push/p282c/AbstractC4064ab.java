package com.vivo.push.p282c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.C4121p;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4150t;
import java.security.PublicKey;

/* renamed from: com.vivo.push.c.ab */
public abstract class AbstractC4064ab extends AbstractRunnableC4157v {

    /* renamed from: b */
    public PushMessageCallback f10953b;

    public AbstractC4064ab(AbstractC4160y yVar) {
        super(yVar);
    }

    /* renamed from: a */
    public final void mo40944a(PushMessageCallback pushMessageCallback) {
        this.f10953b = pushMessageCallback;
    }

    /* renamed from: a */
    public final boolean mo40945a(PublicKey publicKey, String str, String str2) {
        if (!C4121p.m11080a().mo41119d()) {
            C4146p.m11216d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        } else if (publicKey == null) {
            C4146p.m11216d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            C4146p.m11216d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                C4146p.m11216d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
                if (C4150t.m11237a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                    C4146p.m11216d("OnVerifyCallBackCommand", "vertify id is success");
                    return true;
                }
                C4146p.m11216d("OnVerifyCallBackCommand", "vertify fail srcDigest is " + str);
                Context context = this.f11150a;
                C4146p.m11215c(context, "vertify fail srcDigest is " + str);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                C4146p.m11216d("OnVerifyCallBackCommand", "vertify exception");
                return false;
            }
        } else {
            C4146p.m11216d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
    }
}
