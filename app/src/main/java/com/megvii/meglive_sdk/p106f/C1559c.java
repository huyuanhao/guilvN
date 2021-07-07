package com.megvii.meglive_sdk.p106f;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.megvii.meglive_sdk.C1503R;

/* renamed from: com.megvii.meglive_sdk.f.c */
public final class C1559c {

    /* renamed from: a */
    public AnimationDrawable f2559a = null;

    /* renamed from: b */
    public Context f2560b = null;

    /* renamed from: c */
    public View f2561c;

    /* renamed from: d */
    public Drawable f2562d = null;

    /* renamed from: com.megvii.meglive_sdk.f.c$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public final void run() {
            AnimationDrawable animationDrawable = C1559c.this.f2559a;
            if (animationDrawable != null) {
                animationDrawable.stop();
            }
            C1559c cVar = C1559c.this;
            if (cVar.f2562d == null) {
                int a = C1580u.m2676a(cVar.f2560b).mo17198a(C1559c.this.f2560b.getResources().getString(C1503R.string.key_mouth_close));
                C1559c cVar2 = C1559c.this;
                cVar2.f2562d = cVar2.f2560b.getResources().getDrawable(a);
            }
            if (C1559c.this.f2561c.getVisibility() == 0) {
                C1559c cVar3 = C1559c.this;
                cVar3.f2561c.setBackgroundDrawable(cVar3.f2562d);
            }
        }
    }

    public C1559c(Context context, View view) {
        this.f2560b = context;
        this.f2561c = view;
    }

    /* renamed from: a */
    public final void mo17178a() {
        ((Activity) this.f2560b).runOnUiThread(new OooO00o());
    }
}
