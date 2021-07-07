package com.umeng.socialize.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.umeng.social.tool.UMImageMark;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.p275b.p276a.C3913a;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class UMImage extends BaseMediaObject {
    public static int BINARY_IMAGE = 5;
    public static int BITMAP_IMAGE = 4;
    public static int FILE_IMAGE = 1;
    public static int MAX_HEIGHT = 1024;
    public static int MAX_WIDTH = 768;
    public static int RES_IMAGE = 3;
    public static int URL_IMAGE = 2;
    public Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
    public CompressStyle compressStyle = CompressStyle.SCALE;

    /* renamed from: f */
    public ConfiguredConvertor f10759f = null;

    /* renamed from: g */
    public UMImage f10760g;

    /* renamed from: h */
    public UMImageMark f10761h;

    /* renamed from: i */
    public int f10762i = 0;
    public boolean isLoadImgByCompress = true;

    /* renamed from: j */
    public boolean f10763j;

    public class BinaryConvertor extends ConfiguredConvertor {

        /* renamed from: b */
        public byte[] f10765b;

        public BinaryConvertor(byte[] bArr) {
            this.f10765b = bArr;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
            return this.f10765b;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public Bitmap asBitmap() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10767a(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public File asFile() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10776b(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public String asUrl() {
            return null;
        }
    }

    public class BitmapConvertor extends ConfiguredConvertor {

        /* renamed from: b */
        public Bitmap f10767b;

        public BitmapConvertor(Bitmap bitmap) {
            this.f10767b = bitmap;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
            return C3913a.m10770a(this.f10767b, UMImage.this.compressFormat);
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public Bitmap asBitmap() {
            return this.f10767b;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public File asFile() {
            byte[] a = C3913a.m10770a(this.f10767b, UMImage.this.compressFormat);
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10776b(a);
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public String asUrl() {
            return null;
        }
    }

    public enum CompressStyle {
        SCALE,
        QUALITY
    }

    public static abstract class ConfiguredConvertor implements IImageConvertor {
    }

    public class FileConvertor extends ConfiguredConvertor {

        /* renamed from: b */
        public File f10770b;

        public FileConvertor(File file) {
            this.f10770b = file;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
            return C3913a.m10772a(this.f10770b, UMImage.this.compressFormat);
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public Bitmap asBitmap() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10767a(UMImage.this.asBinImage());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public File asFile() {
            return this.f10770b;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public String asUrl() {
            return null;
        }
    }

    public interface IImageConvertor {
        byte[] asBinary();

        Bitmap asBitmap();

        File asFile();

        String asUrl();
    }

    public class ResConvertor extends ConfiguredConvertor {

        /* renamed from: b */
        public Context f10772b;

        /* renamed from: c */
        public int f10773c = 0;

        public ResConvertor(Context context, int i) {
            this.f10772b = context;
            this.f10773c = i;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
            Context context = this.f10772b;
            int i = this.f10773c;
            UMImage uMImage = UMImage.this;
            return C3913a.m10769a(context, i, uMImage.isLoadImgByCompress, uMImage.compressFormat);
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public Bitmap asBitmap() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10767a(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public File asFile() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10776b(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public String asUrl() {
            return null;
        }
    }

    public class UrlConvertor extends ConfiguredConvertor {

        /* renamed from: b */
        public String f10775b = null;

        public UrlConvertor(String str) {
            this.f10775b = str;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public byte[] asBinary() {
            return C3913a.m10773a(this.f10775b);
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public Bitmap asBitmap() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10767a(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public File asFile() {
            if (SocializeUtils.assertBinaryInvalid(asBinary())) {
                return C3913a.m10776b(asBinary());
            }
            return null;
        }

        @Override // com.umeng.socialize.media.UMImage.IImageConvertor
        public String asUrl() {
            return this.f10775b;
        }
    }

    public UMImage(Context context, File file) {
        m10811a(context, file);
    }

    /* renamed from: a */
    private float m10806a(float f, float f2, float f3, float f4) {
        if (f <= f4 && f2 <= f4) {
            return -1.0f;
        }
        float f5 = f / f3;
        float f6 = f2 / f4;
        return f5 > f6 ? f5 : f6;
    }

    /* renamed from: a */
    private void m10811a(Context context, Object obj) {
        m10812a(context, obj, null);
    }

    /* renamed from: b */
    private void m10814b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Exception e) {
                SLog.error(e);
            }
        }
    }

    public byte[] asBinImage() {
        ConfiguredConvertor configuredConvertor = this.f10759f;
        if (configuredConvertor == null) {
            return null;
        }
        return configuredConvertor.asBinary();
    }

    public Bitmap asBitmap() {
        ConfiguredConvertor configuredConvertor = this.f10759f;
        if (configuredConvertor == null) {
            return null;
        }
        return configuredConvertor.asBitmap();
    }

    public File asFileImage() {
        ConfiguredConvertor configuredConvertor = this.f10759f;
        if (configuredConvertor == null) {
            return null;
        }
        return configuredConvertor.asFile();
    }

    public String asUrlImage() {
        ConfiguredConvertor configuredConvertor = this.f10759f;
        if (configuredConvertor == null) {
            return null;
        }
        return configuredConvertor.asUrl();
    }

    public int getImageStyle() {
        return this.f10762i;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.IMAGE;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public UMImage getThumbImage() {
        return this.f10760g;
    }

    public boolean isHasWaterMark() {
        return this.f10763j;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public void setThumb(UMImage uMImage) {
        this.f10760g = uMImage;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
        return asBinImage();
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final Map<String, Object> toUrlExtraParams() {
        HashMap hashMap = new HashMap();
        if (isUrlMedia()) {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f10740a);
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m10812a(Context context, Object obj, UMImageMark uMImageMark) {
        if (uMImageMark != null) {
            this.f10763j = true;
            this.f10761h = uMImageMark;
            uMImageMark.setContext(context);
        }
        if (ContextUtil.getContext() == null) {
            ContextUtil.setContext(context.getApplicationContext());
        }
        if (obj instanceof File) {
            this.f10762i = FILE_IMAGE;
            this.f10759f = new FileConvertor((File) obj);
        } else if (obj instanceof String) {
            this.f10762i = URL_IMAGE;
            this.f10759f = new UrlConvertor((String) obj);
        } else {
            Bitmap bitmap = null;
            if (obj instanceof Integer) {
                this.f10762i = RES_IMAGE;
                if (isHasWaterMark()) {
                    bitmap = m10807a(context, ((Integer) obj).intValue());
                }
                if (bitmap != null) {
                    this.f10759f = new BitmapConvertor(bitmap);
                } else {
                    this.f10759f = new ResConvertor(context.getApplicationContext(), ((Integer) obj).intValue());
                }
            } else if (obj instanceof byte[]) {
                this.f10762i = BINARY_IMAGE;
                if (isHasWaterMark()) {
                    bitmap = m10810a((byte[]) obj);
                }
                if (bitmap != null) {
                    this.f10759f = new BitmapConvertor(bitmap);
                } else {
                    this.f10759f = new BinaryConvertor((byte[]) obj);
                }
            } else if (obj instanceof Bitmap) {
                this.f10762i = BITMAP_IMAGE;
                if (isHasWaterMark()) {
                    bitmap = m10809a((Bitmap) obj, true);
                }
                if (bitmap == null) {
                    bitmap = (Bitmap) obj;
                }
                this.f10759f = new BitmapConvertor(bitmap);
            } else if (obj != null) {
                SLog.m10856E(UmengText.IMAGE.UNKNOW_UMIMAGE + obj.getClass().getSimpleName());
            } else {
                SLog.m10856E(UmengText.IMAGE.UNKNOW_UMIMAGE + "null");
            }
        }
    }

    public UMImage(Context context, String str) {
        super(str);
        m10811a((Context) new WeakReference(context).get(), str);
    }

    public UMImage(Context context, int i) {
        m10811a(context, Integer.valueOf(i));
    }

    public UMImage(Context context, byte[] bArr) {
        m10811a(context, bArr);
    }

    public UMImage(Context context, Bitmap bitmap) {
        m10811a(context, bitmap);
    }

    /* renamed from: a */
    private Bitmap m10809a(Bitmap bitmap, boolean z) {
        if (this.f10761h == null) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        if (z) {
            try {
                bitmap = m10808a(bitmap);
            } catch (Exception e) {
                SLog.error(e);
                return null;
            }
        }
        return this.f10761h.compound(bitmap);
    }

    public UMImage(Context context, Bitmap bitmap, UMImageMark uMImageMark) {
        m10812a(context, bitmap, uMImageMark);
    }

    /* renamed from: a */
    private Bitmap m10807a(Context context, int i) {
        Throwable th;
        Exception e;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (i == 0 || context == null || this.f10761h == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            inputStream = context.getResources().openRawResource(i);
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                m10813a(inputStream);
                int a = (int) m10806a((float) options.outWidth, (float) options.outHeight, (float) MAX_WIDTH, (float) MAX_HEIGHT);
                if (a > 0) {
                    options.inSampleSize = a;
                }
                options.inJustDecodeBounds = false;
                InputStream openRawResource = context.getResources().openRawResource(i);
                Bitmap a2 = m10809a(BitmapFactory.decodeStream(openRawResource, null, options), false);
                m10813a(openRawResource);
                return a2;
            } catch (Exception e2) {
                e = e2;
                try {
                    SLog.error(e);
                    m10813a(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    m10813a(inputStream2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            SLog.error(e);
            m10813a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m10813a(inputStream2);
            throw th;
        }
    }

    public UMImage(Context context, int i, UMImageMark uMImageMark) {
        m10812a(context, Integer.valueOf(i), uMImageMark);
    }

    public UMImage(Context context, byte[] bArr, UMImageMark uMImageMark) {
        m10812a(context, bArr, uMImageMark);
    }

    /* renamed from: a */
    private void m10813a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                SLog.error(e);
            }
        }
    }

    /* renamed from: a */
    private Bitmap m10810a(byte[] bArr) {
        if (!(bArr == null || this.f10761h == null)) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int a = (int) m10806a((float) options.outWidth, (float) options.outHeight, (float) MAX_WIDTH, (float) MAX_HEIGHT);
                if (a > 0) {
                    options.inSampleSize = a;
                }
                options.inJustDecodeBounds = false;
                return m10809a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), false);
            } catch (Exception e) {
                SLog.error(e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m10808a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float a = m10806a((float) width, (float) height, (float) MAX_WIDTH, (float) MAX_HEIGHT);
        if (a < 0.0f) {
            return bitmap;
        }
        float f = 1.0f / a;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        m10814b(bitmap);
        return createBitmap;
    }
}
