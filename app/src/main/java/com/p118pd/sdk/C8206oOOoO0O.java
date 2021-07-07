package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.oOOoO0O  reason: case insensitive filesystem */
public class C8206oOOoO0O implements AbstractC8203oOOo0oOo {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f21331OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f21332OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8344oOoOOOo f21333OooO00o = new C8344oOoOOOo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21334OooO00o = new C8349oOoOOo00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<AbstractC8194oOOo0OoO> f21335OooO00o;
    public C8349oOoOOo00 OooO0O0 = new C8349oOoOOo00();

    public C8206oOOoO0O(Context context, int i) {
        this.OooO00o = context;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21332OooO00o = context.getResources().getDrawable(i, null);
        } else {
            this.f21332OooO00o = context.getResources().getDrawable(i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public void OooO00o(Entry entry, C8246oOOoo0oO ooooo0oo) {
    }

    public void OooO00o(C8349oOoOOo00 oooooo00) {
        this.f21334OooO00o = oooooo00;
        if (oooooo00 == null) {
            this.f21334OooO00o = new C8349oOoOOo00();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 getOffset() {
        return this.f21334OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19894OooO00o(float f, float f2) {
        C8349oOoOOo00 oooooo00 = this.f21334OooO00o;
        oooooo00.f21456OooO00o = f;
        oooooo00.OooO0O0 = f2;
    }

    public void OooO00o(C8344oOoOOOo ooooooo) {
        this.f21333OooO00o = ooooooo;
        if (ooooooo == null) {
            this.f21333OooO00o = new C8344oOoOOOo();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8344oOoOOOo m19893OooO00o() {
        return this.f21333OooO00o;
    }

    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo) {
        this.f21335OooO00o = new WeakReference<>(oooo0ooo);
    }

    public AbstractC8194oOOo0OoO OooO00o() {
        WeakReference<AbstractC8194oOOo0OoO> weakReference = this.f21335OooO00o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 OooO00o(float f, float f2) {
        Drawable drawable;
        Drawable drawable2;
        C8349oOoOOo00 offset = getOffset();
        C8349oOoOOo00 oooooo00 = this.OooO0O0;
        oooooo00.f21456OooO00o = offset.f21456OooO00o;
        oooooo00.OooO0O0 = offset.OooO0O0;
        AbstractC8194oOOo0OoO OooO00o2 = OooO00o();
        C8344oOoOOOo ooooooo = this.f21333OooO00o;
        float f3 = ooooooo.f21450OooO00o;
        float f4 = ooooooo.OooO0O0;
        if (f3 == 0.0f && (drawable2 = this.f21332OooO00o) != null) {
            f3 = (float) drawable2.getIntrinsicWidth();
        }
        if (f4 == 0.0f && (drawable = this.f21332OooO00o) != null) {
            f4 = (float) drawable.getIntrinsicHeight();
        }
        C8349oOoOOo00 oooooo002 = this.OooO0O0;
        float f5 = oooooo002.f21456OooO00o;
        if (f + f5 < 0.0f) {
            oooooo002.f21456OooO00o = -f;
        } else if (OooO00o2 != null && f + f3 + f5 > ((float) OooO00o2.getWidth())) {
            this.OooO0O0.f21456OooO00o = (((float) OooO00o2.getWidth()) - f) - f3;
        }
        C8349oOoOOo00 oooooo003 = this.OooO0O0;
        float f6 = oooooo003.OooO0O0;
        if (f2 + f6 < 0.0f) {
            oooooo003.OooO0O0 = -f2;
        } else if (OooO00o2 != null && f2 + f4 + f6 > ((float) OooO00o2.getHeight())) {
            this.OooO0O0.OooO0O0 = (((float) OooO00o2.getHeight()) - f2) - f4;
        }
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public void OooO00o(Canvas canvas, float f, float f2) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f21332OooO00o != null) {
            C8349oOoOOo00 OooO00o2 = OooO00o(f, f2);
            C8344oOoOOOo ooooooo = this.f21333OooO00o;
            float f3 = ooooooo.f21450OooO00o;
            float f4 = ooooooo.OooO0O0;
            if (f3 == 0.0f && (drawable2 = this.f21332OooO00o) != null) {
                f3 = (float) drawable2.getIntrinsicWidth();
            }
            if (f4 == 0.0f && (drawable = this.f21332OooO00o) != null) {
                f4 = (float) drawable.getIntrinsicHeight();
            }
            this.f21332OooO00o.copyBounds(this.f21331OooO00o);
            Drawable drawable3 = this.f21332OooO00o;
            Rect rect = this.f21331OooO00o;
            int i = rect.left;
            int i2 = rect.top;
            drawable3.setBounds(i, i2, ((int) f3) + i, ((int) f4) + i2);
            int save = canvas.save();
            canvas.translate(f + OooO00o2.f21456OooO00o, f2 + OooO00o2.OooO0O0);
            this.f21332OooO00o.draw(canvas);
            canvas.restoreToCount(save);
            this.f21332OooO00o.setBounds(this.f21331OooO00o);
        }
    }
}
