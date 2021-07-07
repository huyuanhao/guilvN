package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {
    public final Rect OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TypedValue f13762OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f13763OooO00o;
    public TypedValue OooO0O0;
    public TypedValue OooO0OO;
    public TypedValue OooO0Oo;
    public TypedValue OooO0o;
    public TypedValue OooO0o0;

    public interface OooO00o {
        void OooO00o();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new TypedValue();
        }
        return this.OooO0o0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.OooO0o == null) {
            this.OooO0o = new TypedValue();
        }
        return this.OooO0o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new TypedValue();
        }
        return this.OooO0OO;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new TypedValue();
        }
        return this.OooO0Oo;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f13762OooO00o == null) {
            this.f13762OooO00o = new TypedValue();
        }
        return this.f13762OooO00o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new TypedValue();
        }
        return this.OooO0O0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o oooO00o = this.f13763OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o oooO00o = this.f13763OooO00o;
        if (oooO00o != null) {
            oooO00o.onDetachedFromWindow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(OooO00o oooO00o) {
        this.f13763OooO00o = oooO00o;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(int i, int i2, int i3, int i4) {
        this.OooO00o.set(i, i2, i3, i4);
        if (ViewCompat.m14612OooOOO((View) this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO00o = new Rect();
    }
}
