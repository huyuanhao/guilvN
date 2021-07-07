package com.p118pd.sdk;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.o000O0Oo  reason: case insensitive filesystem */
public class C6986o000O0Oo {
    public static final String OooO00o = "android.activity.usage_time";
    public static final String OooO0O0 = "android.usage_time_packages";

    @RequiresApi(16)
    /* renamed from: com.pd.sdk.o000O0Oo$OooO00o */
    public static class OooO00o extends C6986o000O0Oo {
        public final ActivityOptions OooO00o;

        public OooO00o(ActivityOptions activityOptions) {
            this.OooO00o = activityOptions;
        }

        @Override // com.p118pd.sdk.C6986o000O0Oo, com.p118pd.sdk.C6986o000O0Oo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Bundle m18205OooO00o() {
            return this.OooO00o.toBundle();
        }

        @Override // com.p118pd.sdk.C6986o000O0Oo
        public void OooO00o(C6986o000O0Oo o000o0oo) {
            if (o000o0oo instanceof OooO00o) {
                this.OooO00o.update(((OooO00o) o000o0oo).OooO00o);
            }
        }

        @Override // com.p118pd.sdk.C6986o000O0Oo
        public void OooO00o(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                this.OooO00o.requestUsageTimeReport(pendingIntent);
            }
        }

        @Override // com.p118pd.sdk.C6986o000O0Oo
        public C6986o000O0Oo OooO00o(@Nullable Rect rect) {
            if (Build.VERSION.SDK_INT < 24) {
                return this;
            }
            return new OooO00o(this.OooO00o.setLaunchBounds(rect));
        }

        @Override // com.p118pd.sdk.C6986o000O0Oo, com.p118pd.sdk.C6986o000O0Oo
        public Rect OooO00o() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.OooO00o.getLaunchBounds();
        }
    }

    @NonNull
    public static C6986o000O0Oo OooO00o(@NonNull Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new OooO00o(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C6986o000O0Oo();
    }

    @NonNull
    public static C6986o000O0Oo OooO0O0(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new OooO00o(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
        }
        return new C6986o000O0Oo();
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rect m18203OooO00o() {
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m18204OooO00o() {
        return null;
    }

    @NonNull
    public C6986o000O0Oo OooO00o(@Nullable Rect rect) {
        return this;
    }

    public void OooO00o(@NonNull PendingIntent pendingIntent) {
    }

    public void OooO00o(@NonNull C6986o000O0Oo o000o0oo) {
    }

    @NonNull
    public static C6986o000O0Oo OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new OooO00o(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
        }
        return new C6986o000O0Oo();
    }

    @NonNull
    public static C6986o000O0Oo OooO0O0() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new OooO00o(ActivityOptions.makeTaskLaunchBehind());
        }
        return new C6986o000O0Oo();
    }

    @NonNull
    public static C6986o000O0Oo OooO00o(@NonNull View view, @NonNull Bitmap bitmap, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new OooO00o(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
        }
        return new C6986o000O0Oo();
    }

    @NonNull
    public static C6986o000O0Oo OooO00o(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new OooO00o(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C6986o000O0Oo();
    }

    @NonNull
    public static C6986o000O0Oo OooO00o(@NonNull Activity activity, C7085o00OO0O0<View, String>... o00oo0o0Arr) {
        if (Build.VERSION.SDK_INT < 21) {
            return new C6986o000O0Oo();
        }
        Pair[] pairArr = null;
        if (o00oo0o0Arr != null) {
            pairArr = new Pair[o00oo0o0Arr.length];
            for (int i = 0; i < o00oo0o0Arr.length; i++) {
                pairArr[i] = Pair.create(o00oo0o0Arr[i].OooO00o, o00oo0o0Arr[i].OooO0O0);
            }
        }
        return new OooO00o(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @NonNull
    public static C6986o000O0Oo OooO00o() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new OooO00o(ActivityOptions.makeBasic());
        }
        return new C6986o000O0Oo();
    }
}
