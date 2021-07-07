package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Priority;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewProps;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.p118pd.sdk.AbstractC7684o0oo0OOo;
import com.p118pd.sdk.AbstractC8411oOoo0Oo0;
import com.p118pd.sdk.AbstractC9099ooo0Oo0;
import com.p118pd.sdk.C7765o0oooooO;
import com.p118pd.sdk.C7824oO00o0oo;
import com.p118pd.sdk.C7840oO00oooo;
import java.util.HashMap;
import java.util.Map;

public class FastImageViewConverter {
    public static final Drawable OooO00o = new ColorDrawable(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, FastImageCacheControl> f14882OooO00o = new HashMap<String, FastImageCacheControl>() {
        /* class com.dylanvann.fastimage.FastImageViewConverter.C04471 */

        {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put("web", FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    };
    public static final Map<String, Priority> OooO0O0 = new HashMap<String, Priority>() {
        /* class com.dylanvann.fastimage.FastImageViewConverter.C04482 */

        {
            put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, Priority.LOW);
            put("normal", Priority.NORMAL);
            put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, Priority.HIGH);
        }
    };
    public static final Map<String, ImageView.ScaleType> OooO0OO = new HashMap<String, ImageView.ScaleType>() {
        /* class com.dylanvann.fastimage.FastImageViewConverter.C04493 */

        {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER);
        }
    };

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.dylanvann.fastimage.FastImageCacheControl[] r0 = com.dylanvann.fastimage.FastImageCacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.dylanvann.fastimage.FastImageViewConverter.OooO00o.OooO00o = r0
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.WEB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.dylanvann.fastimage.FastImageViewConverter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.CACHE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.dylanvann.fastimage.FastImageViewConverter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dylanvann.fastimage.FastImageViewConverter.OooO00o.<clinit>():void");
        }
    }

    public static FastImageSource OooO00o(Context context, ReadableMap readableMap) {
        return new FastImageSource(context, readableMap.getString("uri"), m15039OooO00o(readableMap));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC9099ooo0Oo0 m15039OooO00o(ReadableMap readableMap) {
        AbstractC9099ooo0Oo0 ooo0oo0 = AbstractC9099ooo0Oo0.OooO0O0;
        if (!readableMap.hasKey("headers")) {
            return ooo0oo0;
        }
        ReadableMap map = readableMap.getMap("headers");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        C7765o0oooooO.OooO00o oooO00o = new C7765o0oooooO.OooO00o();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            oooO00o.OooO00o(nextKey, map.getString(nextKey));
        }
        return oooO00o.m19414OooO00o();
    }

    public static C7824oO00o0oo OooO00o(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        Boolean bool;
        Priority OooO00o2 = OooO00o(readableMap);
        FastImageCacheControl OooO00o3 = m15038OooO00o(readableMap);
        AbstractC7684o0oo0OOo o0oo0ooo = AbstractC7684o0oo0OOo.OooO0o0;
        Boolean bool2 = false;
        int i = OooO00o.OooO00o[OooO00o3.ordinal()];
        if (i == 1) {
            o0oo0ooo = AbstractC7684o0oo0OOo.OooO0O0;
            bool = true;
        } else if (i != 2) {
            bool = bool2;
        } else {
            bool2 = true;
            bool = bool2;
        }
        C7824oO00o0oo placeholder = new C7824oO00o0oo().diskCacheStrategy(o0oo0ooo).onlyRetrieveFromCache(bool2.booleanValue()).skipMemoryCache(bool.booleanValue()).priority(OooO00o2).placeholder(OooO00o);
        return fastImageSource.isResource() ? placeholder.apply(C7824oO00o0oo.signatureOf(C7840oO00oooo.m19515OooO00o(context))) : placeholder;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static FastImageCacheControl m15038OooO00o(ReadableMap readableMap) {
        return (FastImageCacheControl) OooO00o("cache", "immutable", f14882OooO00o, readableMap);
    }

    public static Priority OooO00o(ReadableMap readableMap) {
        return (Priority) OooO00o(AbstractC8411oOoo0Oo0.OooOOo, "normal", OooO0O0, readableMap);
    }

    public static ImageView.ScaleType OooO00o(String str) {
        return (ImageView.ScaleType) OooO00o(ViewProps.RESIZE_MODE, "cover", OooO0OO, str);
    }

    public static <T> T OooO00o(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t = map.get(str2);
        if (t != null) {
            return t;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    public static <T> T OooO00o(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return (T) OooO00o(str, str2, map, str3);
    }
}
