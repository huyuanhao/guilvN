package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewStubCompat extends View {
    public LayoutInflater OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f13810OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<View> f13811OooO00o;
    public int o00oO0O;
    public int o0ooOO0;

    public interface OooO00o {
        void OooO00o(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View OooO00o() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.o00oO0O != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.OooO00o;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.o00oO0O, viewGroup, false);
            int i = this.o0ooOO0;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f13811OooO00o = new WeakReference<>(inflate);
            OooO00o oooO00o = this.f13810OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.o0ooOO0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.OooO00o;
    }

    public int getLayoutResource() {
        return this.o00oO0O;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.o0ooOO0 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.OooO00o = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.o00oO0O = i;
    }

    public void setOnInflateListener(OooO00o oooO00o) {
        this.f13810OooO00o = oooO00o;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f13811OooO00o;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            OooO00o();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o00oO0O = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OoooO0, i, 0);
        this.o0ooOO0 = obtainStyledAttributes.getResourceId(C0033R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.o00oO0O = obtainStyledAttributes.getResourceId(C0033R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0033R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
