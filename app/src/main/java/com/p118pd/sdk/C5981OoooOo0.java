package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: com.pd.sdk.OoooOo0  reason: case insensitive filesystem */
public class C5981OoooOo0 extends Drawable {
    public final ActionBarContainer OooO00o;

    public C5981OoooOo0(ActionBarContainer actionBarContainer) {
        this.OooO00o = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.f13704OooO0OO) {
            Drawable drawable = actionBarContainer.OooO0OO;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.OooO00o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.OooO00o;
        Drawable drawable3 = actionBarContainer2.OooO0O0;
        if (drawable3 != null && actionBarContainer2.OooO0Oo) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.f13704OooO0OO) {
            Drawable drawable = actionBarContainer.OooO0OO;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.OooO00o;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
