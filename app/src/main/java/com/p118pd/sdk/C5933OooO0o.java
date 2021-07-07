package com.p118pd.sdk;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.OooO0o  reason: case insensitive filesystem */
public class C5933OooO0o extends DialogInterface$OnCancelListenerC7165o00o0OoO {
    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC5934OooO0o0(getContext(), getTheme());
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC5934OooO0o0) {
            DialogC5934OooO0o0 oooO0o0 = (DialogC5934OooO0o0) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            oooO0o0.OooO00o(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
