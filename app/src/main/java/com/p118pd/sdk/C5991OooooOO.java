package com.p118pd.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.widget.TextViewCompat;

/* renamed from: com.pd.sdk.OooooOO  reason: case insensitive filesystem */
public class C5991OooooOO extends CheckedTextView {
    public static final int[] OooO00o = {16843016};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7718o0ooOO0 f17294OooO00o;

    public C5991OooooOO(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C7718o0ooOO0 o0oooo0 = this.f17294OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19361OooO00o();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5997OoooooO.OooO00o(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO00o((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7718o0ooOO0 o0oooo0 = this.f17294OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(context, i);
        }
    }

    public C5991OooooOO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C5991OooooOO(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.f17294OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
        this.f17294OooO00o.m19361OooO00o();
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(getContext(), attributeSet, OooO00o, i, 0);
        setCheckMarkDrawable(OooO00o2.m18162OooO00o(0));
        OooO00o2.m18167OooO00o();
    }
}
