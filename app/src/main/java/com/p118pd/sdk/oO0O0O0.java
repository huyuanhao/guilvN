package com.p118pd.sdk;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C7608o0o0OoOo;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oO0O0O0 */
public class oO0O0O0<T> implements C7608o0o0OoOo.OooO0O0<T>, AbstractC8301oOo00oO0 {
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f20894OooO00o;

    /* renamed from: com.pd.sdk.oO0O0O0$OooO00o */
    public static final class OooO00o extends oO0OO00O<View, Object> {
        public OooO00o(@NonNull View view, @NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            super(view);
            getSize(ooo00oo0);
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo<? super Object> oo00oooo) {
        }
    }

    public oO0O0O0() {
    }

    @Override // com.p118pd.sdk.C7608o0o0OoOo.OooO0O0
    @Nullable
    public int[] OooO00o(@NonNull T t, int i, int i2) {
        int[] iArr = this.f20894OooO00o;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public oO0O0O0(@NonNull View view) {
        this.OooO00o = new OooO00o(view, this);
    }

    @Override // com.p118pd.sdk.AbstractC8301oOo00oO0
    public void OooO00o(int i, int i2) {
        this.f20894OooO00o = new int[]{i, i2};
        this.OooO00o = null;
    }

    public void OooO00o(@NonNull View view) {
        if (this.f20894OooO00o == null && this.OooO00o == null) {
            this.OooO00o = new OooO00o(view, this);
        }
    }
}
