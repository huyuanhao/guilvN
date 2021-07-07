package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.facebook.react.views.text.FontMetricsUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.pd.sdk.oO0O0OOO */
public class oO0O0OOO implements AbstractC7650o0oOoOoO<ByteBuffer, C7796oO00OO> {
    public static final String OooO00o = "BufferGifDecoder";
    public static final OooO00o OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final OooO0O0 f20897OooO0O0 = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20898OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oO00OO0O f20899OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20900OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<ImageHeaderParser> f20902OooO00o;

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO0O0OOO$OooO00o */
    public static class OooO00o {
        public GifDecoder OooO00o(GifDecoder.OooO00o oooO00o, C7635o0oOo0O o0ooo0o, ByteBuffer byteBuffer, int i) {
            return new C7639o0oOo0o(oooO00o, o0ooo0o, byteBuffer, i);
        }
    }

    public oO0O0OOO(Context context) {
        this(context, ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19235OooO00o().OooO00o(), ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19238OooO00o(), ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19237OooO00o());
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO0O0OOO$OooO0O0 */
    public static class OooO0O0 {
        public final Queue<C7637o0oOo0OO> OooO00o = oO0O0O00.m19524OooO00o(0);

        public synchronized C7637o0oOo0OO OooO00o(ByteBuffer byteBuffer) {
            C7637o0oOo0OO poll;
            poll = this.OooO00o.poll();
            if (poll == null) {
                poll = new C7637o0oOo0OO();
            }
            return poll.OooO00o(byteBuffer);
        }

        public synchronized void OooO00o(C7637o0oOo0OO o0ooo0oo) {
            o0ooo0oo.m19281OooO00o();
            this.OooO00o.offer(o0ooo0oo);
        }
    }

    public boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        return !((Boolean) o0ooooo.OooO00o(C7958oO0oOOO0.OooO0O0)).booleanValue() && C7645o0oOoOO0.OooO00o(this.f20902OooO00o, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public oO0O0OOO(Context context, List<ImageHeaderParser> list, AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7707o0ooO00O o0ooo00o) {
        this(context, list, o0ooo0oo, o0ooo00o, f20897OooO0O0, OooO0O0);
    }

    @VisibleForTesting
    public oO0O0OOO(Context context, List<ImageHeaderParser> list, AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7707o0ooO00O o0ooo00o, OooO0O0 oooO0O0, OooO00o oooO00o) {
        this.f20898OooO00o = context.getApplicationContext();
        this.f20902OooO00o = list;
        this.f20900OooO00o = oooO00o;
        this.f20899OooO00o = new oO00OO0O(o0ooo0oo, o0ooo00o);
        this.f20901OooO00o = oooO0O0;
    }

    public oO00OOOo OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        C7637o0oOo0OO OooO00o2 = this.f20901OooO00o.OooO00o(byteBuffer);
        try {
            return OooO00o(byteBuffer, i, i2, OooO00o2, o0ooooo);
        } finally {
            this.f20901OooO00o.OooO00o(OooO00o2);
        }
    }

    @Nullable
    private oO00OOOo OooO00o(ByteBuffer byteBuffer, int i, int i2, C7637o0oOo0OO o0ooo0oo, C7648o0oOoOo o0ooooo) {
        long OooO00o2 = C7843oO0O00o.OooO00o();
        try {
            C7635o0oOo0O OooO00o3 = o0ooo0oo.m19280OooO00o();
            if (OooO00o3.OooO0O0() > 0) {
                if (OooO00o3.OooO0OO() == 0) {
                    Bitmap.Config config = o0ooooo.OooO00o(C7958oO0oOOO0.OooO00o) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    GifDecoder OooO00o4 = this.f20900OooO00o.OooO00o(this.f20899OooO00o, OooO00o3, byteBuffer, OooO00o(OooO00o3, i, i2));
                    OooO00o4.OooO00o(config);
                    OooO00o4.m14989OooO0O0();
                    Bitmap OooO00o5 = OooO00o4.m14986OooO00o();
                    if (OooO00o5 == null) {
                        if (Log.isLoggable(OooO00o, 2)) {
                            String str = "Decoded GIF from stream in " + C7843oO0O00o.OooO00o(OooO00o2);
                        }
                        return null;
                    }
                    oO00OOOo oo00oooo = new oO00OOOo(new C7796oO00OO(this.f20898OooO00o, OooO00o4, C7892oO0Oo0oo.OooO00o(), i, i2, OooO00o5));
                    if (Log.isLoggable(OooO00o, 2)) {
                        String str2 = "Decoded GIF from stream in " + C7843oO0O00o.OooO00o(OooO00o2);
                    }
                    return oo00oooo;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(OooO00o, 2)) {
                String str3 = "Decoded GIF from stream in " + C7843oO0O00o.OooO00o(OooO00o2);
            }
        }
    }

    public static int OooO00o(C7635o0oOo0O o0ooo0o, int i, int i2) {
        int i3;
        int min = Math.min(o0ooo0o.OooO00o() / i2, o0ooo0o.OooO0Oo() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable(OooO00o, 2) && max > 1) {
            String str = "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i2 + "], actual dimens: [" + o0ooo0o.OooO0Oo() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + o0ooo0o.OooO00o() + "]";
        }
        return max;
    }
}
