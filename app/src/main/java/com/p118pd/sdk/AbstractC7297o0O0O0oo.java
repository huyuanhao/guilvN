package com.p118pd.sdk;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.o0O0O0oo  reason: case insensitive filesystem */
public interface AbstractC7297o0O0O0oo extends Animatable {

    /* renamed from: com.pd.sdk.o0O0O0oo$OooO00o */
    public static abstract class OooO00o {
        public Animatable2.AnimationCallback OooO00o;

        /* renamed from: com.pd.sdk.o0O0O0oo$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4959OooO00o extends Animatable2.AnimationCallback {
            public C4959OooO00o() {
            }

            public void onAnimationEnd(Drawable drawable) {
                OooO00o.this.OooO00o(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                OooO00o.this.OooO0O0(drawable);
            }
        }

        @RequiresApi(23)
        public Animatable2.AnimationCallback OooO00o() {
            if (this.OooO00o == null) {
                this.OooO00o = new C4959OooO00o();
            }
            return this.OooO00o;
        }

        public void OooO00o(Drawable drawable) {
        }

        public void OooO0O0(Drawable drawable) {
        }
    }

    void OooO00o(@NonNull OooO00o oooO00o);

    /* renamed from: OooO00o  reason: collision with other method in class */
    boolean m18795OooO00o(@NonNull OooO00o oooO00o);

    void clearAnimationCallbacks();
}
