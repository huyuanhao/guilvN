package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.C7605o0o0OoO;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import java.io.File;

public final class GlideApp {
    @NonNull
    public static ComponentCallbacks2C7604o0o0Oo0o get(@NonNull Context context) {
        return ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context) {
        return ComponentCallbacks2C7604o0o0Oo0o.m19232OooO00o(context);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    @Deprecated
    public static void init(ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o) {
        ComponentCallbacks2C7604o0o0Oo0o.OooO00o(o0o0oo0o);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void tearDown() {
        ComponentCallbacks2C7604o0o0Oo0o.OooO0OO();
    }

    @NonNull
    public static GlideRequests with(@NonNull Context context) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(context);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String str) {
        return ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context, str);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void init(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
        ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context, o0o0ooo);
    }

    @NonNull
    public static GlideRequests with(@NonNull Activity activity) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.OooO00o(activity);
    }

    @NonNull
    public static GlideRequests with(@NonNull FragmentActivity fragmentActivity) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.OooO00o(fragmentActivity);
    }

    @NonNull
    public static GlideRequests with(@NonNull Fragment fragment) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.OooO00o(fragment);
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull android.app.Fragment fragment) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.OooO00o(fragment);
    }

    @NonNull
    public static GlideRequests with(@NonNull View view) {
        return (GlideRequests) ComponentCallbacks2C7604o0o0Oo0o.OooO00o(view);
    }
}
