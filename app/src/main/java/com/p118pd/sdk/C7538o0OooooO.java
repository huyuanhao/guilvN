package com.p118pd.sdk;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.o0OooooO  reason: case insensitive filesystem */
public class C7538o0OooooO {
    public static boolean OooO00o = (Build.VERSION.SDK_INT >= 11);

    public static Dialog OooO00o(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder OooO00o2 = OooO00o(context, str, str3, onClickListener, str4, onClickListener2);
        OooO00o2.setTitle(str);
        OooO00o2.setMessage(str2);
        AlertDialog create = OooO00o2.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface$OnKeyListenerC7541o0o0000());
        try {
            create.show();
        } catch (Throwable th) {
            C7620o0oOOOoo.OooO00o(C7494o0OoOOOo.OooO00o, th);
        }
        return create;
    }

    public static AlertDialog.Builder OooO00o(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (OooO00o) {
            if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
                builder.setPositiveButton(str3, onClickListener2);
            }
            if (!TextUtils.isEmpty(str2) && onClickListener != null) {
                builder.setNegativeButton(str2, onClickListener);
            }
        } else {
            if (!TextUtils.isEmpty(str2) && onClickListener != null) {
                builder.setPositiveButton(str2, onClickListener);
            }
            if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
                builder.setNegativeButton(str3, onClickListener2);
            }
        }
        return builder;
    }
}
