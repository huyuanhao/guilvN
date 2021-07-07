package com.p118pd.sdk;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;
import androidx.appcompat.app.AlertController;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.OooO0OO */
public class OooO0OO extends DialogC5934OooO0o0 implements DialogInterface {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public final AlertController OooO00o;

    /* renamed from: com.pd.sdk.OooO0OO$OooO00o */
    public static class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AlertController.OooO0o f17024OooO00o;

        public OooO00o(@NonNull Context context) {
            this(context, OooO0OO.OooO0O0(context, 0));
        }

        @NonNull
        public Context OooO00o() {
            return this.f17024OooO00o.f13559OooO00o;
        }

        public OooO00o OooO0O0(@Nullable CharSequence charSequence) {
            this.f17024OooO00o.f13572OooO00o = charSequence;
            return this;
        }

        public OooO00o OooO0OO(@StringRes int i) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13580OooO0O0 = oooO0o.f13559OooO00o.getText(i);
            return this;
        }

        public OooO00o OooO0Oo(@StringRes int i) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13572OooO00o = oooO0o.f13559OooO00o.getText(i);
            return this;
        }

        public OooO00o OooO0o0(int i) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13579OooO0O0 = null;
            oooO0o.OooO0OO = i;
            oooO0o.f13582OooO0O0 = false;
            return this;
        }

        public OooO00o(@NonNull Context context, @StyleRes int i) {
            this.f17024OooO00o = new AlertController.OooO0o(new ContextThemeWrapper(context, OooO0OO.OooO0O0(context, i)));
            this.OooO00o = i;
        }

        public OooO00o OooO00o(@Nullable View view) {
            this.f17024OooO00o.f13568OooO00o = view;
            return this;
        }

        public OooO00o OooO0O0(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.f17024OooO00o.f13559OooO00o.getTheme().resolveAttribute(i, typedValue, true);
            this.f17024OooO00o.OooO00o = typedValue.resourceId;
            return this;
        }

        public OooO00o OooO0OO(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13585OooO0OO = charSequence;
            oooO0o.f13561OooO00o = onClickListener;
            return this;
        }

        public OooO00o OooO0Oo(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13585OooO0OO = oooO0o.f13559OooO00o.getText(i);
            this.f17024OooO00o.f13561OooO00o = onClickListener;
            return this;
        }

        public OooO00o OooO00o(@Nullable CharSequence charSequence) {
            this.f17024OooO00o.f13580OooO0O0 = charSequence;
            return this;
        }

        public OooO00o OooO00o(@DrawableRes int i) {
            this.f17024OooO00o.OooO00o = i;
            return this;
        }

        public OooO00o OooO0OO(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13592OooO0o0 = oooO0o.f13559OooO00o.getText(i);
            this.f17024OooO00o.f13583OooO0OO = onClickListener;
            return this;
        }

        public OooO00o OooO0Oo(Drawable drawable) {
            this.f17024OooO00o.f13578OooO0O0 = drawable;
            return this;
        }

        public OooO00o OooO00o(@Nullable Drawable drawable) {
            this.f17024OooO00o.f13566OooO00o = drawable;
            return this;
        }

        public OooO00o OooO0O0(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13589OooO0Oo = oooO0o.f13559OooO00o.getText(i);
            this.f17024OooO00o.f13577OooO0O0 = onClickListener;
            return this;
        }

        public OooO00o OooO00o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13589OooO0Oo = charSequence;
            oooO0o.f13577OooO0O0 = onClickListener;
            return this;
        }

        public OooO00o OooO0OO(Drawable drawable) {
            this.f17024OooO00o.f13588OooO0Oo = drawable;
            return this;
        }

        public OooO00o OooO0O0(Drawable drawable) {
            this.f17024OooO00o.f13584OooO0OO = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO00o OooO0OO(boolean z) {
            this.f17024OooO00o.f13591OooO0o = z;
            return this;
        }

        public OooO00o OooO00o(boolean z) {
            this.f17024OooO00o.f13574OooO00o = z;
            return this;
        }

        public OooO00o OooO0O0(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13592OooO0o0 = charSequence;
            oooO0o.f13583OooO0OO = onClickListener;
            return this;
        }

        public OooO00o OooO00o(DialogInterface.OnCancelListener onCancelListener) {
            this.f17024OooO00o.f13560OooO00o = onCancelListener;
            return this;
        }

        public OooO00o OooO00o(DialogInterface.OnDismissListener onDismissListener) {
            this.f17024OooO00o.f13562OooO00o = onDismissListener;
            return this;
        }

        public OooO00o OooO0O0(View view) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13579OooO0O0 = view;
            oooO0o.OooO0OO = 0;
            oooO0o.f13582OooO0O0 = false;
            return this;
        }

        public OooO00o OooO00o(DialogInterface.OnKeyListener onKeyListener) {
            this.f17024OooO00o.f13563OooO00o = onKeyListener;
            return this;
        }

        public OooO00o OooO00o(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = oooO0o.f13559OooO00o.getResources().getTextArray(i);
            this.f17024OooO00o.f13587OooO0Oo = onClickListener;
            return this;
        }

        @Deprecated
        public OooO00o OooO0O0(boolean z) {
            this.f17024OooO00o.f13593OooO0o0 = z;
            return this;
        }

        public OooO00o OooO00o(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = charSequenceArr;
            oooO0o.f13587OooO0Oo = onClickListener;
            return this;
        }

        public OooO0OO OooO0O0() {
            OooO0OO OooO00o2 = m16670OooO00o();
            OooO00o2.show();
            return OooO00o2;
        }

        public OooO00o OooO00o(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13570OooO00o = listAdapter;
            oooO0o.f13587OooO0Oo = onClickListener;
            return this;
        }

        public OooO00o OooO00o(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13565OooO00o = cursor;
            oooO0o.f13573OooO00o = str;
            oooO0o.f13587OooO0Oo = onClickListener;
            return this;
        }

        public OooO00o OooO00o(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = oooO0o.f13559OooO00o.getResources().getTextArray(i);
            AlertController.OooO0o oooO0o2 = this.f17024OooO00o;
            oooO0o2.f13564OooO00o = onMultiChoiceClickListener;
            oooO0o2.f13576OooO00o = zArr;
            oooO0o2.f13586OooO0OO = true;
            return this;
        }

        public OooO00o OooO00o(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = charSequenceArr;
            oooO0o.f13564OooO00o = onMultiChoiceClickListener;
            oooO0o.f13576OooO00o = zArr;
            oooO0o.f13586OooO0OO = true;
            return this;
        }

        public OooO00o OooO00o(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13565OooO00o = cursor;
            oooO0o.f13564OooO00o = onMultiChoiceClickListener;
            oooO0o.f13581OooO0O0 = str;
            oooO0o.f13573OooO00o = str2;
            oooO0o.f13586OooO0OO = true;
            return this;
        }

        public OooO00o OooO00o(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = oooO0o.f13559OooO00o.getResources().getTextArray(i);
            AlertController.OooO0o oooO0o2 = this.f17024OooO00o;
            oooO0o2.f13587OooO0Oo = onClickListener;
            oooO0o2.OooO0oo = i2;
            oooO0o2.f13590OooO0Oo = true;
            return this;
        }

        public OooO00o OooO00o(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13565OooO00o = cursor;
            oooO0o.f13587OooO0Oo = onClickListener;
            oooO0o.OooO0oo = i;
            oooO0o.f13573OooO00o = str;
            oooO0o.f13590OooO0Oo = true;
            return this;
        }

        public OooO00o OooO00o(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13575OooO00o = charSequenceArr;
            oooO0o.f13587OooO0Oo = onClickListener;
            oooO0o.OooO0oo = i;
            oooO0o.f13590OooO0Oo = true;
            return this;
        }

        public OooO00o OooO00o(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13570OooO00o = listAdapter;
            oooO0o.f13587OooO0Oo = onClickListener;
            oooO0o.OooO0oo = i;
            oooO0o.f13590OooO0Oo = true;
            return this;
        }

        public OooO00o OooO00o(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f17024OooO00o.f13569OooO00o = onItemSelectedListener;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Deprecated
        public OooO00o OooO00o(View view, int i, int i2, int i3, int i4) {
            AlertController.OooO0o oooO0o = this.f17024OooO00o;
            oooO0o.f13579OooO0O0 = view;
            oooO0o.OooO0OO = 0;
            oooO0o.f13582OooO0O0 = true;
            oooO0o.OooO0Oo = i;
            oooO0o.OooO0o0 = i2;
            oooO0o.OooO0o = i3;
            oooO0o.OooO0oO = i4;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m16670OooO00o() {
            OooO0OO oooO0OO = new OooO0OO(this.f17024OooO00o.f13559OooO00o, this.OooO00o);
            this.f17024OooO00o.OooO00o(oooO0OO.OooO00o);
            oooO0OO.setCancelable(this.f17024OooO00o.f13574OooO00o);
            if (this.f17024OooO00o.f13574OooO00o) {
                oooO0OO.setCanceledOnTouchOutside(true);
            }
            oooO0OO.setOnCancelListener(this.f17024OooO00o.f13560OooO00o);
            oooO0OO.setOnDismissListener(this.f17024OooO00o.f13562OooO00o);
            DialogInterface.OnKeyListener onKeyListener = this.f17024OooO00o.f13563OooO00o;
            if (onKeyListener != null) {
                oooO0OO.setOnKeyListener(onKeyListener);
            }
            return oooO0OO;
        }
    }

    static {
        C.i(19);
    }

    public OooO0OO(@NonNull Context context) {
        this(context, 0);
    }

    public static int OooO0O0(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0033R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // com.p118pd.sdk.DialogC5934OooO0o0
    public native Button OooO00o(int i);

    @Override // com.p118pd.sdk.DialogC5934OooO0o0, com.p118pd.sdk.DialogC5934OooO0o0
    public native ListView OooO00o();

    public native void OooO00o(Drawable drawable);

    public native void OooO00o(View view);

    public native void OooO00o(CharSequence charSequence);

    public native void OooO0O0(int i);

    public native void OooO0O0(View view);

    public native void OooO0OO(int i);

    @Override // com.p118pd.sdk.DialogC5934OooO0o0
    public native void onCreate(Bundle bundle);

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native boolean onKeyUp(int i, KeyEvent keyEvent);

    @Override // com.p118pd.sdk.DialogC5934OooO0o0, android.app.Dialog
    public native void setTitle(CharSequence charSequence);

    public OooO0OO(@NonNull Context context, @StyleRes int i) {
        super(context, OooO0O0(context, i));
        this.OooO00o = new AlertController(getContext(), this, getWindow());
    }

    public OooO0OO(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void OooO00o(View view, int i, int i2, int i3, int i4) {
        this.OooO00o.OooO00o(view, i, i2, i3, i4);
    }

    @Override // com.p118pd.sdk.DialogC5934OooO0o0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16669OooO00o(int i) {
        this.OooO00o.m14347OooO00o(i);
    }

    public void OooO00o(int i, CharSequence charSequence, Message message) {
        this.OooO00o.OooO00o(i, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    public void OooO00o(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.OooO00o.OooO00o(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    public void OooO00o(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.OooO00o.OooO00o(i, charSequence, onClickListener, (Message) null, drawable);
    }
}
