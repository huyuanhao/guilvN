package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import javax.annotation.Nullable;

public class SupportAlertFragment extends DialogInterface$OnCancelListenerC7165o00o0OoO implements DialogInterface.OnClickListener {
    @Nullable
    public final DialogModule.AlertFragmentListener mListener;

    public SupportAlertFragment() {
        this.mListener = null;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onClick(dialogInterface, i);
        }
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public Dialog onCreateDialog(Bundle bundle) {
        return AlertFragment.createDialog(getActivity(), getArguments(), this);
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.AlertFragmentListener alertFragmentListener = this.mListener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onDismiss(dialogInterface);
        }
    }

    @SuppressLint({"ValidFragment"})
    public SupportAlertFragment(@Nullable DialogModule.AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }
}
