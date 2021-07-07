package com.qiyukf.unicorn.mediaselect.internal.p242ui.widget;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.IncapableDialog */
public class IncapableDialog extends DialogInterface$OnCancelListenerC7165o00o0OoO {
    public static IncapableDialog newInstance(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (!TextUtils.isEmpty(string)) {
            builder.setTitle(string);
        }
        if (!TextUtils.isEmpty(string2)) {
            builder.setMessage(string2);
        }
        builder.setPositiveButton(C2364R.string.ysf_button_ok, new DialogInterface.OnClickListener() {
            /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.IncapableDialog.DialogInterface$OnClickListenerC27741 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
}
