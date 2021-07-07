package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC5961Oooo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0OOO0o  reason: case insensitive filesystem */
public interface AbstractC7385o0OOO0o {
    void OooO00o();

    void OooO00o(int i);

    void OooO00o(SparseArray<Parcelable> sparseArray);

    void OooO00o(Menu menu, AbstractC5961Oooo.OooO00o oooO00o);

    /* renamed from: OooO00o  reason: collision with other method in class */
    boolean m18913OooO00o();

    void OooO0O0();

    void OooO0O0(SparseArray<Parcelable> sparseArray);

    /* renamed from: OooO0O0  reason: collision with other method in class */
    boolean m18914OooO0O0();

    boolean OooO0OO();

    boolean OooO0Oo();

    boolean OooO0o();

    boolean OooO0o0();

    boolean OooO0oO();

    CharSequence getTitle();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
