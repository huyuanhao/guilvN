package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.net.Uri;
import com.facebook.infer.annotation.Assertions;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import javax.annotation.Nullable;

public class ImageSource {
    public boolean isResource;
    public double mSize;
    public String mSource;
    @Nullable
    public Uri mUri;

    public ImageSource(Context context, String str, double d, double d2) {
        this.mSource = str;
        this.mSize = d * d2;
        this.mUri = computeUri(context);
    }

    private Uri computeLocalUri(Context context) {
        this.isResource = true;
        return ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(context, this.mSource);
    }

    private Uri computeUri(Context context) {
        try {
            Uri parse = Uri.parse(this.mSource);
            return parse.getScheme() == null ? computeLocalUri(context) : parse;
        } catch (Exception unused) {
            return computeLocalUri(context);
        }
    }

    public double getSize() {
        return this.mSize;
    }

    public String getSource() {
        return this.mSource;
    }

    public Uri getUri() {
        return (Uri) Assertions.assertNotNull(this.mUri);
    }

    public boolean isResource() {
        return this.isResource;
    }

    public ImageSource(Context context, String str) {
        this(context, str, AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
    }
}
