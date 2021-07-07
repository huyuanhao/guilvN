package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.pd.sdk.o00o0o0O  reason: case insensitive filesystem */
public abstract class AbstractC7174o00o0o0O<E> extends AbstractC7166o00o0Ooo {
    public final int OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Activity f19614OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19615OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f19616OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LayoutInflater$Factory2C7167o00o0o f19617OooO00o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractC7174o00o0o0O(@NonNull Context context, @NonNull Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LayoutInflater m18655OooO00o() {
        return LayoutInflater.from(this.f19615OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @Nullable
    public View OooO00o(int i) {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract E m18657OooO00o();

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18658OooO00o() {
    }

    public void OooO00o(Fragment fragment) {
    }

    public void OooO00o(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
    }

    public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18659OooO00o() {
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18660OooO00o(Fragment fragment) {
        return true;
    }

    public boolean OooO00o(@NonNull String str) {
        return false;
    }

    public boolean OooO0O0() {
        return true;
    }

    public AbstractC7174o00o0o0O(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    public void OooO00o(Fragment fragment, Intent intent, int i) {
        OooO00o(fragment, intent, i, (Bundle) null);
    }

    public AbstractC7174o00o0o0O(@Nullable Activity activity, @NonNull Context context, @NonNull Handler handler, int i) {
        this.f19617OooO00o = new LayoutInflater$Factory2C7167o00o0o();
        this.f19614OooO00o = activity;
        this.f19615OooO00o = (Context) C7086o00OO0OO.OooO00o(context, "context == null");
        this.f19616OooO00o = (Handler) C7086o00OO0OO.OooO00o(handler, "handler == null");
        this.OooO00o = i;
    }

    public void OooO00o(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            this.f19615OooO00o.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void OooO00o(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C6981o000O00O.OooO00o(this.f19614OooO00o, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    public int OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Activity m18652OooO00o() {
        return this.f19614OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m18653OooO00o() {
        return this.f19615OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Handler m18654OooO00o() {
        return this.f19616OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LayoutInflater$Factory2C7167o00o0o m18656OooO00o() {
        return this.f19617OooO00o;
    }
}
