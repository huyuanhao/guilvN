package com.p118pd.sdk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.o00o00oO  reason: case insensitive filesystem */
public class C7153o00o00oO extends AbstractC7151o00o00o {
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f19523OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19524OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f19525OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] OooO0O0;
    public int o0Oo0oo = -1;

    /* renamed from: com.pd.sdk.o00o00oO$OooO00o */
    public interface OooO00o {
        CharSequence OooO00o(Cursor cursor);
    }

    /* renamed from: com.pd.sdk.o00o00oO$OooO0O0 */
    public interface OooO0O0 {
        boolean OooO00o(View view, Cursor cursor, int i);
    }

    @Deprecated
    public C7153o00o00oO(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.OooO0O0 = iArr;
        this.f19525OooO00o = strArr;
        OooO00o(cursor, strArr);
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public void OooO00o(View view, Context context, Cursor cursor) {
        OooO0O0 oooO0O0 = this.f19523OooO00o;
        int[] iArr = this.OooO0O0;
        int length = iArr.length;
        int[] iArr2 = this.f19524OooO00o;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (oooO0O0 != null ? oooO0O0.OooO00o(findViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        OooO00o((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        OooO00o((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    public void OooO0OO(int i) {
        this.o0Oo0oo = i;
    }

    public C7153o00o00oO(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.OooO0O0 = iArr;
        this.f19525OooO00o = strArr;
        OooO00o(cursor, strArr);
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0O0 m18528OooO00o() {
        return this.f19523OooO00o;
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        this.f19523OooO00o = oooO0O0;
    }

    public void OooO00o(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void OooO00o(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    public int OooO00o() {
        return this.o0Oo0oo;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m18527OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18529OooO00o(Cursor cursor) {
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            return oooO00o.OooO00o(cursor);
        }
        int i = this.o0Oo0oo;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.m18523OooO00o(cursor);
    }

    private void OooO00o(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f19524OooO00o;
            if (iArr == null || iArr.length != length) {
                this.f19524OooO00o = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f19524OooO00o[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f19524OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    public Cursor OooO00o(Cursor cursor) {
        OooO00o(cursor, this.f19525OooO00o);
        return super.OooO00o(cursor);
    }

    public void OooO00o(Cursor cursor, String[] strArr, int[] iArr) {
        this.f19525OooO00o = strArr;
        this.OooO0O0 = iArr;
        OooO00o(cursor, strArr);
        super.m18525OooO00o(cursor);
    }
}
