package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o0O0ooO  reason: case insensitive filesystem */
public class C7353o0O0ooO extends AbstractC7209o00oOoo {
    public C7353o0O0ooO(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // com.p118pd.sdk.AbstractC7209o00oOoo
    public void OooO00o(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7209o00oOoo
    public boolean OooO0O0() {
        Bitmap bitmap = ((AbstractC7209o00oOoo) this).f19698OooO00o;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // com.p118pd.sdk.AbstractC7209o00oOoo
    public void OooO0OO(boolean z) {
        Bitmap bitmap = ((AbstractC7209o00oOoo) this).f19698OooO00o;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }

    public void getOutline(Outline outline) {
        m18694OooO00o();
        outline.setRoundRect(((AbstractC7209o00oOoo) this).f19702OooO00o, OooO00o());
    }
}
