package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.views.imagehelper.ImageSource;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.AbstractC9099ooo0Oo0;
import com.p118pd.sdk.C7764o0ooooo0;
import com.p118pd.sdk.C8932ooOOO0o;
import javax.annotation.Nullable;

public class FastImageSource extends ImageSource {
    public static final String ANDROID_CONTENT_SCHEME = "content";
    public static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    public static final String DATA_SCHEME = "data";
    public static final String LOCAL_FILE_SCHEME = "file";
    public static final String LOCAL_RESOURCE_SCHEME = "res";
    public AbstractC9099ooo0Oo0 mHeaders;
    public Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return "res".equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public C7764o0ooooo0 getGlideUrl() {
        return new C7764o0ooooo0(getUri().toString(), getHeaders());
    }

    public AbstractC9099ooo0Oo0 getHeaders() {
        return this.mHeaders;
    }

    public Object getSourceForLoad() {
        if (isContentUri()) {
            return getSource();
        }
        if (isBase64Resource()) {
            return getSource();
        }
        if (isResource()) {
            return getUri();
        }
        if (isLocalFile()) {
            return getUri().toString();
        }
        return getGlideUrl();
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        return uri != null && isBase64Uri(uri);
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        return uri != null && isLocalFileUri(uri);
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    public boolean isResource() {
        Uri uri = this.mUri;
        return uri != null && isResourceUri(uri);
    }

    public FastImageSource(Context context, String str, @Nullable AbstractC9099ooo0Oo0 ooo0oo0) {
        this(context, str, AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0, ooo0oo0);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d, double d2, @Nullable AbstractC9099ooo0Oo0 ooo0oo0) {
        super(context, str, d, d2);
        this.mHeaders = ooo0oo0 == null ? AbstractC9099ooo0Oo0.OooO0O0 : ooo0oo0;
        this.mUri = super.getUri();
        if (isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        } else if (isLocalResourceUri(this.mUri)) {
            String uri = this.mUri.toString();
            this.mUri = Uri.parse(uri.replace("res:/", "android.resource://" + context.getPackageName() + C8932ooOOO0o.OooO0OO));
        }
    }
}
