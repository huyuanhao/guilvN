package com.p118pd.sdk;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

@Deprecated
/* renamed from: com.pd.sdk.o000Oooo  reason: case insensitive filesystem */
public final class C7013o000Oooo {

    @Deprecated
    /* renamed from: com.pd.sdk.o000Oooo$OooO00o */
    public static final class OooO00o {
        public static OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C4951OooO00o f19279OooO00o = new C4951OooO00o();

        /* renamed from: com.pd.sdk.o000Oooo$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4951OooO00o {
            public void OooO00o(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static OooO00o OooO00o() {
            if (OooO00o == null) {
                OooO00o = new OooO00o();
            }
            return OooO00o;
        }

        @Deprecated
        public void OooO00o(@NonNull SharedPreferences.Editor editor) {
            this.f19279OooO00o.OooO00o(editor);
        }
    }
}
