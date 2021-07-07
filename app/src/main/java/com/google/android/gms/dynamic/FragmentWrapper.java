package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
@SuppressLint({"NewApi"})
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    public Fragment zzhz;

    public FragmentWrapper(Fragment fragment) {
        this.zzhz = fragment;
    }

    @KeepForSdk
    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle getArguments() {
        return this.zzhz.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getId() {
        return this.zzhz.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getRetainInstance() {
        return this.zzhz.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String getTag() {
        return this.zzhz.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getTargetRequestCode() {
        return this.zzhz.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean getUserVisibleHint() {
        return this.zzhz.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isAdded() {
        return this.zzhz.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isDetached() {
        return this.zzhz.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isHidden() {
        return this.zzhz.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isInLayout() {
        return this.zzhz.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isRemoving() {
        return this.zzhz.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isResumed() {
        return this.zzhz.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isVisible() {
        return this.zzhz.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setHasOptionsMenu(boolean z) {
        this.zzhz.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setMenuVisibility(boolean z) {
        this.zzhz.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setRetainInstance(boolean z) {
        this.zzhz.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void setUserVisibleHint(boolean z) {
        this.zzhz.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivity(Intent intent) {
        this.zzhz.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivityForResult(Intent intent, int i) {
        this.zzhz.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zza(IObjectWrapper iObjectWrapper) {
        this.zzhz.registerForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzae() {
        return ObjectWrapper.wrap(this.zzhz.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzaf() {
        return wrap(this.zzhz.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzag() {
        return ObjectWrapper.wrap(this.zzhz.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzah() {
        return wrap(this.zzhz.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzai() {
        return ObjectWrapper.wrap(this.zzhz.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.zzhz.unregisterForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
