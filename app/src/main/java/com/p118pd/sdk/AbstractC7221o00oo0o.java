package com.p118pd.sdk;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.pd.sdk.o00oo0o  reason: case insensitive filesystem */
public abstract class AbstractC7221o00oo0o {

    /* renamed from: com.pd.sdk.o00oo0o$OooO00o */
    public interface OooO00o<D> {
        @NonNull
        @MainThread
        C7226o00ooO00<D> onCreateLoader(int i, @Nullable Bundle bundle);

        @MainThread
        void onLoadFinished(@NonNull C7226o00ooO00<D> o00ooo00, D d);

        @MainThread
        void onLoaderReset(@NonNull C7226o00ooO00<D> o00ooo00);
    }

    @NonNull
    public static <T extends AbstractC7202o00oOo00 & AbstractC7218o00oo0O0> AbstractC7221o00oo0o OooO00o(@NonNull T t) {
        return new C7223o00oo0oO(t, t.getViewModelStore());
    }

    @Nullable
    public abstract <D> C7226o00ooO00<D> OooO00o(int i);

    @NonNull
    @MainThread
    public abstract <D> C7226o00ooO00<D> OooO00o(int i, @Nullable Bundle bundle, @NonNull OooO00o<D> oooO00o);

    public abstract void OooO00o();

    @MainThread
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m18706OooO00o(int i);

    @Deprecated
    public abstract void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18707OooO00o() {
        return false;
    }

    @NonNull
    @MainThread
    public abstract <D> C7226o00ooO00<D> OooO0O0(int i, @Nullable Bundle bundle, @NonNull OooO00o<D> oooO00o);

    public static void OooO00o(boolean z) {
        C7223o00oo0oO.f19721OooO00o = z;
    }
}
