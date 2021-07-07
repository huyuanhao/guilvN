package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.pd.sdk.o00ooooO  reason: case insensitive filesystem */
public final class C7248o00ooooO {
    public static final int OooO = 1;
    public static final String OooO00o = "PrintHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19786OooO00o;
    public static final boolean OooO0O0;
    public static final int OooO0Oo = 3500;
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    @SuppressLint({"InlinedApi"})
    public static final int OooO0oO = 1;
    @SuppressLint({"InlinedApi"})
    public static final int OooO0oo = 2;
    public static final int OooOO0 = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19787OooO00o = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19788OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BitmapFactory.Options f19789OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f19790OooO00o = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f19791OooO0O0 = 2;
    public int OooO0OO = 1;

    /* renamed from: com.pd.sdk.o00ooooO$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o();
    }

    @RequiresApi(19)
    /* renamed from: com.pd.sdk.o00ooooO$OooO0OO */
    public class OooO0OO extends PrintDocumentAdapter {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Bitmap f19798OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PrintAttributes f19799OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f19800OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19802OooO00o;

        public OooO0OO(String str, int i, Bitmap bitmap, OooO0O0 oooO0O0) {
            this.f19802OooO00o = str;
            this.OooO00o = i;
            this.f19798OooO00o = bitmap;
            this.f19800OooO00o = oooO0O0;
        }

        public void onFinish() {
            OooO0O0 oooO0O0 = this.f19800OooO00o;
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f19799OooO00o = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f19802OooO00o).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C7248o00ooooO.this.OooO00o(this.f19799OooO00o, this.OooO00o, this.f19798OooO00o, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @RequiresApi(19)
    /* renamed from: com.pd.sdk.o00ooooO$OooO0Oo  reason: case insensitive filesystem */
    public class C7249OooO0Oo extends PrintDocumentAdapter {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f19803OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Uri f19804OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AsyncTask<Uri, Boolean, Bitmap> f19805OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PrintAttributes f19806OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f19807OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19809OooO00o;

        /* renamed from: com.pd.sdk.o00ooooO$OooO0Oo$OooO00o */
        public class OooO00o extends AsyncTask<Uri, Boolean, Bitmap> {
            public final /* synthetic */ CancellationSignal OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ PrintAttributes f19810OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f19811OooO00o;
            public final /* synthetic */ PrintAttributes OooO0O0;

            /* renamed from: com.pd.sdk.o00ooooO$OooO0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4956OooO00o implements CancellationSignal.OnCancelListener {
                public C4956OooO00o() {
                }

                public void onCancel() {
                    C7249OooO0Oo.this.OooO00o();
                    OooO00o.this.cancel(false);
                }
            }

            public OooO00o(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.OooO00o = cancellationSignal;
                this.f19810OooO00o = printAttributes;
                this.OooO0O0 = printAttributes2;
                this.f19811OooO00o = layoutResultCallback;
            }

            /* renamed from: OooO00o */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    return C7248o00ooooO.this.OooO00o(C7249OooO0Oo.this.f19804OooO00o);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* renamed from: OooO0O0 */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!C7248o00ooooO.f19786OooO00o || C7248o00ooooO.this.OooO0OO == 0)) {
                    synchronized (this) {
                        mediaSize = C7249OooO0Oo.this.f19806OooO00o.getMediaSize();
                    }
                    if (!(mediaSize == null || mediaSize.isPortrait() == C7248o00ooooO.OooO00o(bitmap))) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C7249OooO0Oo.this.f19803OooO00o = bitmap;
                if (bitmap != null) {
                    this.f19811OooO00o.onLayoutFinished(new PrintDocumentInfo.Builder(C7249OooO0Oo.this.f19809OooO00o).setContentType(1).setPageCount(1).build(), true ^ this.f19810OooO00o.equals(this.OooO0O0));
                } else {
                    this.f19811OooO00o.onLayoutFailed(null);
                }
                C7249OooO0Oo.this.f19805OooO00o = null;
            }

            public void onPreExecute() {
                this.OooO00o.setOnCancelListener(new C4956OooO00o());
            }

            /* renamed from: OooO00o */
            public void onCancelled(Bitmap bitmap) {
                this.f19811OooO00o.onLayoutCancelled();
                C7249OooO0Oo.this.f19805OooO00o = null;
            }
        }

        public C7249OooO0Oo(String str, Uri uri, OooO0O0 oooO0O0, int i) {
            this.f19809OooO00o = str;
            this.f19804OooO00o = uri;
            this.f19807OooO00o = oooO0O0;
            this.OooO00o = i;
        }

        public void OooO00o() {
            synchronized (C7248o00ooooO.this.f19790OooO00o) {
                if (C7248o00ooooO.this.f19789OooO00o != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        C7248o00ooooO.this.f19789OooO00o.requestCancelDecode();
                    }
                    C7248o00ooooO.this.f19789OooO00o = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            OooO00o();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f19805OooO00o;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            OooO0O0 oooO0O0 = this.f19807OooO00o;
            if (oooO0O0 != null) {
                oooO0O0.OooO00o();
            }
            Bitmap bitmap = this.f19803OooO00o;
            if (bitmap != null) {
                bitmap.recycle();
                this.f19803OooO00o = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f19806OooO00o = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f19803OooO00o != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f19809OooO00o).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f19805OooO00o = new OooO00o(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C7248o00ooooO.this.OooO00o(this.f19806OooO00o, this.OooO00o, this.f19803OooO00o, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        f19786OooO00o = i < 20 || i > 23;
        if (Build.VERSION.SDK_INT != 23) {
            z = true;
        }
        OooO0O0 = z;
    }

    public C7248o00ooooO(@NonNull Context context) {
        this.f19788OooO00o = context;
    }

    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public void OooO0O0(int i) {
        this.OooO0OO = i;
    }

    public void OooO0OO(int i) {
        this.f19787OooO00o = i;
    }

    public void OooO00o(int i) {
        this.f19791OooO0O0 = i;
    }

    public int OooO0O0() {
        if (Build.VERSION.SDK_INT < 19 || this.OooO0OO != 0) {
            return this.OooO0OO;
        }
        return 1;
    }

    public int OooO0OO() {
        return this.f19787OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18726OooO00o() {
        return this.f19791OooO0O0;
    }

    public void OooO00o(@NonNull String str, @NonNull Bitmap bitmap) {
        OooO00o(str, bitmap, (OooO0O0) null);
    }

    public void OooO00o(@NonNull String str, @NonNull Bitmap bitmap, @Nullable OooO0O0 oooO0O0) {
        PrintAttributes.MediaSize mediaSize;
        if (Build.VERSION.SDK_INT >= 19 && bitmap != null) {
            PrintManager printManager = (PrintManager) this.f19788OooO00o.getSystemService("print");
            if (OooO00o(bitmap)) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            } else {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            }
            printManager.print(str, new OooO0OO(str, this.f19787OooO00o, bitmap, oooO0O0), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f19791OooO0O0).build());
        }
    }

    public void OooO00o(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        OooO00o(str, uri, (OooO0O0) null);
    }

    public void OooO00o(@NonNull String str, @NonNull Uri uri, @Nullable OooO0O0 oooO0O0) throws FileNotFoundException {
        if (Build.VERSION.SDK_INT >= 19) {
            C7249OooO0Oo oooO0Oo = new C7249OooO0Oo(str, uri, oooO0O0, this.f19787OooO00o);
            PrintManager printManager = (PrintManager) this.f19788OooO00o.getSystemService("print");
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            builder.setColorMode(this.f19791OooO0O0);
            int i = this.OooO0OO;
            if (i == 1 || i == 0) {
                builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
            } else if (i == 2) {
                builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
            }
            printManager.print(str, oooO0Oo, builder.build());
        }
    }

    public static boolean OooO00o(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    @RequiresApi(19)
    public static PrintAttributes.Builder OooO00o(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix OooO00o(int i, int i2, RectF rectF, int i3) {
        float f;
        Matrix matrix = new Matrix();
        float f2 = (float) i;
        float width = rectF.width() / f2;
        if (i3 == 2) {
            f = Math.max(width, rectF.height() / ((float) i2));
        } else {
            f = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectF.width() - (f2 * f)) / 2.0f, (rectF.height() - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* renamed from: com.pd.sdk.o00ooooO$OooO00o */
    public class OooO00o extends AsyncTask<Void, Void, Throwable> {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Bitmap f19792OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CancellationSignal f19793OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ParcelFileDescriptor f19794OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ PrintAttributes f19795OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f19796OooO00o;
        public final /* synthetic */ PrintAttributes OooO0O0;

        public OooO00o(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f19793OooO00o = cancellationSignal;
            this.f19795OooO00o = printAttributes;
            this.f19792OooO00o = bitmap;
            this.OooO0O0 = printAttributes2;
            this.OooO00o = i;
            this.f19794OooO00o = parcelFileDescriptor;
            this.f19796OooO00o = writeResultCallback;
        }

        /* renamed from: OooO00o */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f19793OooO00o.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(C7248o00ooooO.this.f19788OooO00o, this.f19795OooO00o);
                Bitmap OooO00o2 = C7248o00ooooO.OooO00o(this.f19792OooO00o, this.f19795OooO00o.getColorMode());
                if (this.f19793OooO00o.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                    if (C7248o00ooooO.OooO0O0) {
                        rectF = new RectF(startPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(C7248o00ooooO.this.f19788OooO00o, this.OooO0O0);
                        PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(startPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix OooO00o3 = C7248o00ooooO.OooO00o(OooO00o2.getWidth(), OooO00o2.getHeight(), rectF, this.OooO00o);
                    if (!C7248o00ooooO.OooO0O0) {
                        OooO00o3.postTranslate(rectF.left, rectF.top);
                        startPage.getCanvas().clipRect(rectF);
                    }
                    startPage.getCanvas().drawBitmap(OooO00o2, OooO00o3, null);
                    printedPdfDocument.finishPage(startPage);
                    if (this.f19793OooO00o.isCanceled()) {
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f19794OooO00o.getFileDescriptor()));
                    printedPdfDocument.close();
                    if (this.f19794OooO00o != null) {
                        try {
                            this.f19794OooO00o.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (OooO00o2 != this.f19792OooO00o) {
                        OooO00o2.recycle();
                    }
                    return null;
                } finally {
                    printedPdfDocument.close();
                    if (this.f19794OooO00o != null) {
                        try {
                            this.f19794OooO00o.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (OooO00o2 != this.f19792OooO00o) {
                        OooO00o2.recycle();
                    }
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* renamed from: OooO00o */
        public void onPostExecute(Throwable th) {
            if (this.f19793OooO00o.isCanceled()) {
                this.f19796OooO00o.onWriteCancelled();
            } else if (th == null) {
                this.f19796OooO00o.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f19796OooO00o.onWriteFailed(null);
            }
        }
    }

    @RequiresApi(19)
    public void OooO00o(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintAttributes printAttributes2;
        if (OooO0O0) {
            printAttributes2 = printAttributes;
        } else {
            printAttributes2 = OooO00o(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new OooO00o(cancellationSignal, printAttributes2, bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }

    public Bitmap OooO00o(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f19788OooO00o == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        OooO00o(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > 3500) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f19790OooO00o) {
                    options = new BitmapFactory.Options();
                    this.f19789OooO00o = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap OooO00o2 = OooO00o(uri, options);
                    synchronized (this.f19790OooO00o) {
                        this.f19789OooO00o = null;
                    }
                    return OooO00o2;
                } catch (Throwable th) {
                    synchronized (this.f19790OooO00o) {
                        this.f19789OooO00o = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap OooO00o(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            android.content.Context r0 = r2.f19788OooO00o
            if (r0 == 0) goto L_0x0023
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x001c }
            java.io.InputStream r3 = r0.openInputStream(r3)     // Catch:{ all -> 0x001c }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0018
            r3.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            throw r4
        L_0x0023:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7248o00ooooO.OooO00o(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap OooO00o(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
