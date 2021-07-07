package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.pd.sdk.o00o0o0o  reason: case insensitive filesystem */
public abstract class AbstractC7175o00o0o0o {
    public static final int o00oO0O = 1;

    /* renamed from: com.pd.sdk.o00o0o0o$OooO00o */
    public interface OooO00o {
        @StringRes
        int OooO00o();

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        CharSequence m18670OooO00o();

        @StringRes
        int OooO0O0();

        @Nullable
        /* renamed from: OooO0O0  reason: collision with other method in class */
        CharSequence m18671OooO0O0();

        int getId();

        @Nullable
        String getName();
    }

    /* renamed from: com.pd.sdk.o00o0o0o$OooO0O0 */
    public static abstract class OooO0O0 {
        public void OooO00o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO00o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void OooO00o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void OooO00o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void OooO0O0(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO0O0(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void OooO0O0(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void OooO0OO(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO0OO(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void OooO0Oo(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO0Oo(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void OooO0o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO0o0(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }

        public void OooO0oO(@NonNull AbstractC7175o00o0o0o o00o0o0o, @NonNull Fragment fragment) {
        }
    }

    /* renamed from: com.pd.sdk.o00o0o0o$OooO0OO */
    public interface OooO0OO {
        void OooO00o();
    }

    public static void OooO00o(boolean z) {
        LayoutInflater$Factory2C7167o00o0o.OooO0oo = z;
    }

    public abstract int OooO00o();

    @Nullable
    public abstract Fragment.SavedState OooO00o(Fragment fragment);

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Fragment m18661OooO00o();

    @Nullable
    public abstract Fragment OooO00o(@IdRes int i);

    @Nullable
    public abstract Fragment OooO00o(@NonNull Bundle bundle, @NonNull String str);

    @Nullable
    public abstract Fragment OooO00o(@Nullable String str);

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract OooO00o m18662OooO00o(int i);

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC7179o00o0oOo m18663OooO00o();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract List<Fragment> m18664OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m18665OooO00o();

    public abstract void OooO00o(int i, int i2);

    public abstract void OooO00o(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment);

    public abstract void OooO00o(@NonNull OooO0O0 oooO0O0);

    public abstract void OooO00o(@NonNull OooO0O0 oooO0O0, boolean z);

    public abstract void OooO00o(@NonNull OooO0OO oooO0OO);

    public abstract void OooO00o(@Nullable String str, int i);

    public abstract void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18666OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18667OooO00o(int i, int i2);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18668OooO00o(@Nullable String str, int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public AbstractC7179o00o0oOo OooO0O0() {
        return m18663OooO00o();
    }

    public abstract void OooO0O0(@NonNull OooO0OO oooO0OO);

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m18669OooO0O0();

    public abstract boolean OooO0OO();

    public abstract boolean OooO0Oo();
}
