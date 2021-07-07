package com.p118pd.sdk;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7004o000Oo0o;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o000O00O  reason: case insensitive filesystem */
public class C6981o000O00O extends C7009o000OoOo {
    public static OooO0OO OooO00o;

    /* renamed from: com.pd.sdk.o000O00O$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String[] f19184OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO00o(String[] strArr, Activity activity, int i) {
            this.f19184OooO00o = strArr;
            this.OooO00o = activity;
            this.o00oO0O = i;
        }

        public void run() {
            int[] iArr = new int[this.f19184OooO00o.length];
            PackageManager packageManager = this.OooO00o.getPackageManager();
            String packageName = this.OooO00o.getPackageName();
            int length = this.f19184OooO00o.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f19184OooO00o[i], packageName);
            }
            ((OooO0O0) this.OooO00o).onRequestPermissionsResult(this.o00oO0O, this.f19184OooO00o, iArr);
        }
    }

    /* renamed from: com.pd.sdk.o000O00O$OooO0O0 */
    public interface OooO0O0 {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* renamed from: com.pd.sdk.o000O00O$OooO0OO */
    public interface OooO0OO {
        boolean OooO00o(@NonNull Activity activity, @IntRange(from = 0) int i, int i2, @Nullable Intent intent);

        boolean OooO00o(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.o000O00O$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC6982OooO0Oo {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    /* renamed from: com.pd.sdk.o000O00O$OooO0o0  reason: case insensitive filesystem */
    public static class SharedElementCallbackC6983OooO0o0 extends SharedElementCallback {
        public final AbstractC7004o000Oo0o OooO00o;

        /* renamed from: com.pd.sdk.o000O00O$OooO0o0$OooO00o */
        public class OooO00o implements AbstractC7004o000Oo0o.OooO00o {
            public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener OooO00o;

            public OooO00o(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.OooO00o = onSharedElementsReadyListener;
            }

            @Override // com.p118pd.sdk.AbstractC7004o000Oo0o.OooO00o
            public void OooO00o() {
                this.OooO00o.onSharedElementsReady();
            }
        }

        public SharedElementCallbackC6983OooO0o0(AbstractC7004o000Oo0o o000oo0o) {
            this.OooO00o = o000oo0o;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.OooO00o.OooO00o(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.OooO00o.OooO00o(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.OooO00o.OooO00o(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.OooO00o.OooO00o(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.OooO00o.OooO00o(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.OooO00o.OooO0O0(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.OooO00o.OooO00o(list, list2, new OooO00o(onSharedElementsReadyListener));
        }
    }

    public static void OooO00o(@Nullable OooO0OO oooO0OO) {
        OooO00o = oooO0OO;
    }

    public static void OooO0O0(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void OooO0OO(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void OooO0Oo(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static OooO0OO OooO00o() {
        return OooO00o;
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18194OooO00o(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void OooO00o(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void OooO0O0(@NonNull Activity activity, @Nullable AbstractC7004o000Oo0o o000oo0o) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(o000oo0o != null ? new SharedElementCallbackC6983OooO0o0(o000oo0o) : null);
        }
    }

    public static void OooO00o(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18193OooO00o(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    @Nullable
    public static Uri OooO00o(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @NonNull
    public static <T extends View> T OooO00o(@NonNull Activity activity, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void OooO00o(@NonNull Activity activity, @Nullable AbstractC7004o000Oo0o o000oo0o) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(o000oo0o != null ? new SharedElementCallbackC6983OooO0o0(o000oo0o) : null);
        }
    }

    public static void OooO00o(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i) {
        OooO0OO oooO0OO = OooO00o;
        if (oooO0OO != null && oooO0OO.OooO00o(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractC6982OooO0Oo) {
                ((AbstractC6982OooO0Oo) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof OooO0O0) {
            new Handler(Looper.getMainLooper()).post(new OooO00o(strArr, activity, i));
        }
    }

    public static boolean OooO00o(@NonNull Activity activity, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    @Nullable
    public static C8584oo0O OooO00o(Activity activity, DragEvent dragEvent) {
        return C8584oo0O.OooO00o(activity, dragEvent);
    }
}
