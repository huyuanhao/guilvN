package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.text.TextInlineImageSpan;
import javax.annotation.Nullable;

public class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {
    @Nullable
    public final Object mCallerContext;
    @Nullable
    public Drawable mDrawable;
    public final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    public final DraweeHolder<GenericDraweeHierarchy> mDraweeHolder;
    public ReadableMap mHeaders;
    public int mHeight;
    @Nullable
    public TextView mTextView;
    public int mTintColor;
    public Uri mUri;
    public int mWidth;

    public FrescoBasedReactTextInlineImageSpan(Resources resources, int i, int i2, int i3, @Nullable Uri uri, ReadableMap readableMap, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj) {
        this.mDraweeHolder = new DraweeHolder<>(GenericDraweeHierarchyBuilder.newInstance(resources).build());
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
        this.mTintColor = i3;
        this.mUri = uri == null ? Uri.EMPTY : uri;
        this.mHeaders = readableMap;
        this.mWidth = (int) PixelUtil.toPixelFromDIP((float) i2);
        this.mHeight = (int) PixelUtil.toPixelFromDIP((float) i);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.mDrawable == null) {
            this.mDraweeHolder.setController(this.mDraweeControllerBuilder.reset().setOldController(this.mDraweeHolder.getController()).setCallerContext(this.mCallerContext).setImageRequest(ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.newBuilderWithSource(this.mUri), this.mHeaders)).build());
            this.mDraweeControllerBuilder.reset();
            Drawable topLevelDrawable = this.mDraweeHolder.getTopLevelDrawable();
            this.mDrawable = topLevelDrawable;
            topLevelDrawable.setBounds(0, 0, this.mWidth, this.mHeight);
            int i6 = this.mTintColor;
            if (i6 != 0) {
                this.mDrawable.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.mDrawable.setCallback(this.mTextView);
        }
        canvas.save();
        canvas.translate(f, (float) (((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.mDrawable.getBounds().bottom - this.mDrawable.getBounds().top) / 2)));
        this.mDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    @Nullable
    public Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public int getHeight() {
        return this.mHeight;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.mHeight;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.mWidth;
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public void onAttachedToWindow() {
        this.mDraweeHolder.onAttach();
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public void onDetachedFromWindow() {
        this.mDraweeHolder.onDetach();
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public void onFinishTemporaryDetach() {
        this.mDraweeHolder.onAttach();
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public void onStartTemporaryDetach() {
        this.mDraweeHolder.onDetach();
    }

    @Override // com.facebook.react.views.text.TextInlineImageSpan
    public void setTextView(TextView textView) {
        this.mTextView = textView;
    }
}
