package com.p118pd.sdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.o00o0OoO  reason: case insensitive filesystem */
public class DialogInterface$OnCancelListenerC7165o00o0OoO extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final String SAVED_BACK_STACK_ID = "android:backStackId";
    public static final String SAVED_CANCELABLE = "android:cancelable";
    public static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    public static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    public static final String SAVED_STYLE = "android:style";
    public static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    public int mBackStackId = -1;
    public boolean mCancelable = true;
    public Dialog mDialog;
    public boolean mDismissed;
    public boolean mShownByMe;
    public boolean mShowsDialog = true;
    public int mStyle = 0;
    public int mTheme = 0;
    public boolean mViewDestroyed;

    static {
        C.i(21);
    }

    public native void dismiss();

    public native void dismissAllowingStateLoss();

    public native void dismissInternal(boolean z);

    public native Dialog getDialog();

    public native boolean getShowsDialog();

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public native boolean isCancelable();

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.mShowsDialog) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.mDialog.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.mDialog.setOwnerActivity(activity);
            }
            this.mDialog.setCancelable(this.mCancelable);
            this.mDialog.setOnCancelListener(this);
            this.mDialog.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
                this.mDialog.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public native void onAttach(Context context);

    public native void onCancel(DialogInterface dialogInterface);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new Dialog(getActivity(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public native void onDestroyView();

    @Override // androidx.fragment.app.Fragment
    public native void onDetach();

    public native void onDismiss(DialogInterface dialogInterface);

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog onCreateDialog = onCreateDialog(bundle);
        this.mDialog = onCreateDialog;
        if (onCreateDialog == null) {
            return (LayoutInflater) this.mHost.m18653OooO00o().getSystemService("layout_inflater");
        }
        setupDialog(onCreateDialog, this.mStyle);
        return (LayoutInflater) this.mDialog.getContext().getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Bundle onSaveInstanceState;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public native void onStart();

    @Override // androidx.fragment.app.Fragment
    public native void onStop();

    public native void setCancelable(boolean z);

    public native void setShowsDialog(boolean z);

    public void setStyle(int i, @StyleRes int i2) {
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setupDialog(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public native int show(AbstractC7179o00o0oOo o00o0ooo, String str);

    public native void show(AbstractC7175o00o0o0o o00o0o0o, String str);

    public native void showNow(AbstractC7175o00o0o0o o00o0o0o, String str);
}
