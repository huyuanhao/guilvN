package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.CheckedImageButton */
public class CheckedImageButton extends ImageButton {

    /* renamed from: a */
    public boolean f3640a;

    /* renamed from: b */
    public int f3641b;

    /* renamed from: c */
    public int f3642c;

    /* renamed from: d */
    public Drawable f3643d;

    /* renamed from: e */
    public Drawable f3644e;

    /* renamed from: f */
    public int f3645f;

    /* renamed from: g */
    public int f3646g;

    /* renamed from: h */
    public int f3647h;

    /* renamed from: i */
    public int f3648i;

    public CheckedImageButton(Context context) {
        super(context);
    }

    public CheckedImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckedImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: f */
    private void m3716f(int i) {
        setBackgroundResource(i);
        setPadding(this.f3645f, this.f3646g, this.f3647h, this.f3648i);
    }

    /* renamed from: a */
    public final void mo34294a(int i) {
        this.f3645f = i;
        this.f3646g = i;
        this.f3647h = i;
        this.f3648i = i;
        setPadding(i, i, i, i);
    }

    /* renamed from: a */
    public final void mo34295a(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        this.f3643d = bitmapDrawable;
        setImageDrawable(bitmapDrawable);
    }

    /* renamed from: a */
    public final void mo34296a(boolean z) {
        this.f3640a = z;
        Drawable drawable = z ? this.f3644e : this.f3643d;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        int i = z ? this.f3642c : this.f3641b;
        if (i != 0) {
            m3716f(i);
        }
    }

    /* renamed from: a */
    public final boolean mo34297a() {
        return this.f3640a;
    }

    /* renamed from: b */
    public final void mo34298b(int i) {
        this.f3641b = i;
        m3716f(i);
    }

    /* renamed from: b */
    public final void mo34299b(Bitmap bitmap) {
        this.f3644e = new BitmapDrawable(getResources(), bitmap);
    }

    /* renamed from: c */
    public final void mo34300c(int i) {
        this.f3642c = i;
    }

    /* renamed from: d */
    public final void mo34301d(int i) {
        Drawable drawable = getResources().getDrawable(i);
        this.f3643d = drawable;
        setImageDrawable(drawable);
    }

    /* renamed from: e */
    public final void mo34302e(int i) {
        this.f3644e = getResources().getDrawable(i);
    }
}
