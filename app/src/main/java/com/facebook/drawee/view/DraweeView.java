package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.internal.Objects;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.AspectRatioMeasure;
import javax.annotation.Nullable;

public class DraweeView<DH extends DraweeHierarchy> extends ImageView {
    public static boolean sGlobalLegacyVisibilityHandlingEnabled;
    public float mAspectRatio = 0.0f;
    public DraweeHolder<DH> mDraweeHolder;
    public boolean mInitialised = false;
    public boolean mLegacyVisibilityHandlingEnabled = false;
    public final AspectRatioMeasure.Spec mMeasureSpec = new AspectRatioMeasure.Spec();

    public DraweeView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        if (!this.mInitialised) {
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = DraweeHolder.create(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                } else {
                    return;
                }
            }
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
        }
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void doAttach() {
        this.mDraweeHolder.onAttach();
    }

    public void doDetach() {
        this.mDraweeHolder.onDetach();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    @Nullable
    public DraweeController getController() {
        return this.mDraweeHolder.getController();
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.getHierarchy();
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.getTopLevelDrawable();
    }

    public boolean hasController() {
        return this.mDraweeHolder.getController() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.hasHierarchy();
    }

    public void onAttach() {
        doAttach();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onDetach() {
        doDetach();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onMeasure(int i, int i2) {
        AspectRatioMeasure.Spec spec = this.mMeasureSpec;
        spec.width = i;
        spec.height = i2;
        AspectRatioMeasure.updateMeasureSpec(spec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AspectRatioMeasure.Spec spec2 = this.mMeasureSpec;
        super.onMeasure(spec2.width, spec2.height);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public void setAspectRatio(float f) {
        if (f != this.mAspectRatio) {
            this.mAspectRatio = f;
            requestLayout();
        }
    }

    public void setController(@Nullable DraweeController draweeController) {
        this.mDraweeHolder.setController(draweeController);
        super.setImageDrawable(this.mDraweeHolder.getTopLevelDrawable());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.setHierarchy(dh);
        super.setImageDrawable(this.mDraweeHolder.getTopLevelDrawable());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.setController(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        DraweeHolder<DH> draweeHolder = this.mDraweeHolder;
        return stringHelper.add("holder", draweeHolder != null ? draweeHolder.toString() : "<no holder set>").toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
