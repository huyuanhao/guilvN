package com.p118pd.sdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* renamed from: com.pd.sdk.o0O0Oo  reason: case insensitive filesystem */
public class C7312o0O0Oo extends ViewGroup {
    public static final int[] OooO00o = {16842804, 16842901, 16842904, 16842927};
    public static final int[] OooO0O0 = {16843660};
    public static final float OooO0o0 = 0.6f;
    public static final int o0Oo0oo = 16;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f20036OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewPager f20037OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20038OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<AbstractC7314o0O0Oo0O> f20039OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f20040OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20041OooO0O0;
    public TextView OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f20042OooO0OO;
    public float OooO0Oo;
    public int o00oO0O;
    public int o0OOO0o;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.o0O0Oo$OooO00o */
    public class OooO00o extends DataSetObserver implements ViewPager.OooO, ViewPager.AbstractC5086OooO0oo {
        public int o00oO0O;

        public OooO00o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC5086OooO0oo
        public void OooO00o(ViewPager viewPager, AbstractC7314o0O0Oo0O o0o0oo0o, AbstractC7314o0O0Oo0O o0o0oo0o2) {
            C7312o0O0Oo.this.OooO00o(o0o0oo0o, o0o0oo0o2);
        }

        public void onChanged() {
            C7312o0O0Oo o0o0oo = C7312o0O0Oo.this;
            o0o0oo.OooO00o(o0o0oo.f20037OooO00o.getCurrentItem(), C7312o0O0Oo.this.f20037OooO00o.getAdapter());
            float f = C7312o0O0Oo.this.OooO0Oo;
            if (f < 0.0f) {
                f = 0.0f;
            }
            C7312o0O0Oo o0o0oo2 = C7312o0O0Oo.this;
            o0o0oo2.OooO00o(o0o0oo2.f20037OooO00o.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrollStateChanged(int i) {
            this.o00oO0O = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            C7312o0O0Oo.this.OooO00o(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageSelected(int i) {
            if (this.o00oO0O == 0) {
                C7312o0O0Oo o0o0oo = C7312o0O0Oo.this;
                o0o0oo.OooO00o(o0o0oo.f20037OooO00o.getCurrentItem(), C7312o0O0Oo.this.f20037OooO00o.getAdapter());
                float f = C7312o0O0Oo.this.OooO0Oo;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                C7312o0O0Oo o0o0oo2 = C7312o0O0Oo.this;
                o0o0oo2.OooO00o(o0o0oo2.f20037OooO00o.getCurrentItem(), f, true);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O0Oo$OooO0O0 */
    public static class OooO0O0 extends SingleLineTransformationMethod {
        public Locale OooO00o;

        public OooO0O0(Context context) {
            this.OooO00o = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.OooO00o);
            }
            return null;
        }
    }

    public C7312o0O0Oo(@NonNull Context context) {
        this(context, null);
    }

    public static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new OooO0O0(textView.getContext()));
    }

    public void OooO00o(int i, float f) {
        this.f20036OooO00o.setTextSize(i, f);
        this.f20040OooO0O0.setTextSize(i, f);
        this.OooO0OO.setTextSize(i, f);
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.o0ooOO0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            AbstractC7314o0O0Oo0O adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f20038OooO00o);
            viewPager.addOnAdapterChangeListener(this.f20038OooO00o);
            this.f20037OooO00o = viewPager;
            WeakReference<AbstractC7314o0O0Oo0O> weakReference = this.f20039OooO00o;
            OooO00o(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f20037OooO00o;
        if (viewPager != null) {
            OooO00o(viewPager.getAdapter(), (AbstractC7314o0O0Oo0O) null);
            this.f20037OooO00o.setInternalPageChangeListener(null);
            this.f20037OooO00o.removeOnAdapterChangeListener(this.f20038OooO00o);
            this.f20037OooO00o = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f20037OooO00o != null) {
            float f = this.OooO0Oo;
            if (f < 0.0f) {
                f = 0.0f;
            }
            OooO00o(this.o00oO0O, f, true);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f20036OooO00o.measure(childMeasureSpec2, childMeasureSpec);
            this.f20040OooO0O0.measure(childMeasureSpec2, childMeasureSpec);
            this.OooO0OO.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f20040OooO0O0.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f20040OooO0O0.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f20041OooO0O0) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.o0ooOOo = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.o0ooOoO = i;
        int i2 = (i << 24) | (this.o0OOO0o & 16777215);
        this.f20036OooO00o.setTextColor(i2);
        this.OooO0OO.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.o0OOO0o = i;
        this.f20040OooO0O0.setTextColor(i);
        int i2 = (this.o0ooOoO << 24) | (this.o0OOO0o & 16777215);
        this.f20036OooO00o.setTextColor(i2);
        this.OooO0OO.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.o0ooOO0 = i;
        requestLayout();
    }

    public C7312o0O0Oo(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o00oO0O = -1;
        this.OooO0Oo = -1.0f;
        this.f20038OooO00o = new OooO00o();
        TextView textView = new TextView(context);
        this.f20036OooO00o = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f20040OooO0O0 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.OooO0OO = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.OooO0o0(this.f20036OooO00o, resourceId);
            TextViewCompat.OooO0o0(this.f20040OooO0O0, resourceId);
            TextViewCompat.OooO0o0(this.OooO0OO, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            OooO00o(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f20036OooO00o.setTextColor(color);
            this.f20040OooO0O0.setTextColor(color);
            this.OooO0OO.setTextColor(color);
        }
        this.o0ooOOo = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.o0OOO0o = this.f20040OooO0O0.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f20036OooO00o.setEllipsize(TextUtils.TruncateAt.END);
        this.f20040OooO0O0.setEllipsize(TextUtils.TruncateAt.END);
        this.OooO0OO.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, OooO0O0);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f20036OooO00o);
            setSingleLineAllCaps(this.f20040OooO0O0);
            setSingleLineAllCaps(this.OooO0OO);
        } else {
            this.f20036OooO00o.setSingleLine();
            this.f20040OooO0O0.setSingleLine();
            this.OooO0OO.setSingleLine();
        }
        this.o0ooOO0 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void OooO00o(int i, AbstractC7314o0O0Oo0O o0o0oo0o) {
        int count = o0o0oo0o != null ? o0o0oo0o.getCount() : 0;
        this.f20041OooO0O0 = true;
        CharSequence charSequence = null;
        this.f20036OooO00o.setText((i < 1 || o0o0oo0o == null) ? null : o0o0oo0o.getPageTitle(i - 1));
        this.f20040OooO0O0.setText((o0o0oo0o == null || i >= count) ? null : o0o0oo0o.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && o0o0oo0o != null) {
            charSequence = o0o0oo0o.getPageTitle(i2);
        }
        this.OooO0OO.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f20036OooO00o.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f20040OooO0O0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.OooO0OO.measure(makeMeasureSpec, makeMeasureSpec2);
        this.o00oO0O = i;
        if (!this.f20042OooO0OO) {
            OooO00o(i, this.OooO0Oo, false);
        }
        this.f20041OooO0O0 = false;
    }

    public void OooO00o(AbstractC7314o0O0Oo0O o0o0oo0o, AbstractC7314o0O0Oo0O o0o0oo0o2) {
        if (o0o0oo0o != null) {
            o0o0oo0o.unregisterDataSetObserver(this.f20038OooO00o);
            this.f20039OooO00o = null;
        }
        if (o0o0oo0o2 != null) {
            o0o0oo0o2.registerDataSetObserver(this.f20038OooO00o);
            this.f20039OooO00o = new WeakReference<>(o0o0oo0o2);
        }
        ViewPager viewPager = this.f20037OooO00o;
        if (viewPager != null) {
            this.o00oO0O = -1;
            this.OooO0Oo = -1.0f;
            OooO00o(viewPager.getCurrentItem(), o0o0oo0o2);
            requestLayout();
        }
    }

    public void OooO00o(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.o00oO0O) {
            OooO00o(i, this.f20037OooO00o.getAdapter());
        } else if (!z && f == this.OooO0Oo) {
            return;
        }
        this.f20042OooO0OO = true;
        int measuredWidth = this.f20036OooO00o.getMeasuredWidth();
        int measuredWidth2 = this.f20040OooO0O0.getMeasuredWidth();
        int measuredWidth3 = this.OooO0OO.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (((float) i8) * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f20036OooO00o.getBaseline();
        int baseline2 = this.f20040OooO0O0.getBaseline();
        int baseline3 = this.OooO0OO.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f20036OooO00o.getMeasuredHeight() + i11, this.f20040OooO0O0.getMeasuredHeight() + i12), this.OooO0OO.getMeasuredHeight() + i13);
        int i14 = this.o0ooOOo & 112;
        if (i14 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i14 != 80) {
            i4 = i11 + paddingTop;
            i2 = i12 + paddingTop;
            i3 = paddingTop + i13;
            TextView textView = this.f20040OooO0O0;
            textView.layout(i9, i2, i10, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i9 - this.o0ooOO0) - measuredWidth);
            TextView textView2 = this.f20036OooO00o;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.o0ooOO0);
            TextView textView3 = this.OooO0OO;
            textView3.layout(max3, i3, max3 + measuredWidth3, textView3.getMeasuredHeight() + i3);
            this.OooO0Oo = f;
            this.f20042OooO0OO = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i11 + i5;
        i2 = i12 + i5;
        i3 = i5 + i13;
        TextView textView4 = this.f20040OooO0O0;
        textView4.layout(i9, i2, i10, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i9 - this.o0ooOO0) - measuredWidth);
        TextView textView22 = this.f20036OooO00o;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.o0ooOO0);
        TextView textView32 = this.OooO0OO;
        textView32.layout(max32, i3, max32 + measuredWidth3, textView32.getMeasuredHeight() + i3);
        this.OooO0Oo = f;
        this.f20042OooO0OO = false;
    }
}
