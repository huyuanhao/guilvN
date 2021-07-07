package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;
import s.h.e.l.l.C;

@KeepForSdk
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public T zare;
    public Bundle zarf;
    public LinkedList<zaa> zarg;
    public final OnDelegateCreatedListener<T> zarh = new zaa(this);

    public interface zaa {
        int getState();

        void zaa(LifecycleDelegate lifecycleDelegate);
    }

    static {
        C.i(14);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String errorMessage = ConnectionErrorMessages.getErrorMessage(context, isGooglePlayServicesAvailable);
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(errorMessage);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(errorDialogButtonMessage);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
    }

    private final void zaa(Bundle bundle, zaa zaa2) {
        T t = this.zare;
        if (t != null) {
            zaa2.zaa(t);
            return;
        }
        if (this.zarg == null) {
            this.zarg = new LinkedList<>();
        }
        this.zarg.add(zaa2);
        if (bundle != null) {
            Bundle bundle2 = this.zarf;
            if (bundle2 == null) {
                this.zarf = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zarh);
    }

    private final native void zal(int i);

    @KeepForSdk
    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @KeepForSdk
    public T getDelegate() {
        return this.zare;
    }

    @KeepForSdk
    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(Bundle bundle) {
        zaa(bundle, new zac(this, bundle));
    }

    @KeepForSdk
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaa(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zare == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.zare;
        if (t != null) {
            t.onDestroy();
        } else {
            zal(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.zare;
        if (t != null) {
            t.onDestroyView();
        } else {
            zal(2);
        }
    }

    @KeepForSdk
    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zaa(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.zare;
        if (t != null) {
            t.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t = this.zare;
        if (t != null) {
            t.onPause();
        } else {
            zal(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        zaa((Bundle) null, new zag(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle bundle) {
        T t = this.zare;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zarf;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        zaa((Bundle) null, new zaf(this));
    }

    @KeepForSdk
    public void onStop() {
        T t = this.zare;
        if (t != null) {
            t.onStop();
        } else {
            zal(4);
        }
    }
}
