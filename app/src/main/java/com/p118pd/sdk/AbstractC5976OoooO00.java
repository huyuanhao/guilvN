package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OoooO00  reason: case insensitive filesystem */
public interface AbstractC5976OoooO00 {

    /* renamed from: com.pd.sdk.OoooO00$OooO00o */
    public interface OooO00o {
        void OooO00o(C5967Oooo0OO oooo0OO, int i);

        void OooO00o(boolean z, char c);

        boolean OooO00o();

        boolean OooO0OO();

        C5967Oooo0OO getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void OooO00o(C5965Oooo00o oooo00o);

    int getWindowAnimations();
}
