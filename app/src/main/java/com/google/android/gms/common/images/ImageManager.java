package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import com.megvii.apo.PhoneFingerManager;
import com.p118pd.sdk.C6980o000O000;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    public static final Object zamg = new Object();
    public static HashSet<Uri> zamh = new HashSet<>();
    public static ImageManager zami;
    public final Context mContext;
    public final Handler mHandler = new zal(Looper.getMainLooper());
    public final ExecutorService zamj = Executors.newFixedThreadPool(4);
    public final zaa zamk = null;
    public final zak zaml = new zak();
    public final Map<zaa, ImageReceiver> zamm = new HashMap();
    public final Map<Uri, ImageReceiver> zamn = new HashMap();
    public final Map<Uri, Long> zamo = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        public final Uri mUri;
        public final ArrayList<zaa> zamp = new ArrayList<>();

        public ImageReceiver(Uri uri) {
            super(new zal(Looper.getMainLooper()));
            this.mUri = uri;
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.zamj.execute(new zab(this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public final void zab(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zamp.add(zaa);
        }

        public final void zac(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zamp.remove(zaa);
        }

        public final void zace() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.putExtra(Constants.EXTRA_URI, this.mUri);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    public static final class zaa extends C6980o000O000<zab, Bitmap> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.C6980o000O000
        public final /* synthetic */ void entryRemoved(boolean z, zab zab, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, zab, bitmap, bitmap2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.C6980o000O000
        public final /* synthetic */ int sizeOf(zab zab, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return bitmap2.getHeight() * bitmap2.getRowBytes();
        }
    }

    public final class zab implements Runnable {
        public final Uri mUri;
        public final ParcelFileDescriptor zamr;

        public zab(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.zamr = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.zamr;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    String valueOf = String.valueOf(this.mUri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    sb.toString();
                    z2 = true;
                }
                try {
                    this.zamr.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new zad(this.mUri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
                String valueOf2 = String.valueOf(this.mUri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                sb2.toString();
            }
        }
    }

    public final class zac implements Runnable {
        public final zaa zams;

        public zac(zaa zaa) {
            this.zams = zaa;
        }

        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zamm.get(this.zams);
            if (imageReceiver != null) {
                ImageManager.this.zamm.remove(this.zams);
                imageReceiver.zac(this.zams);
            }
            zaa zaa = this.zams;
            zab zab = zaa.zamu;
            if (zab.uri == null) {
                zaa.zaa(ImageManager.this.mContext, ImageManager.this.zaml, true);
                return;
            }
            Bitmap zaa2 = ImageManager.this.zaa((ImageManager) zab);
            if (zaa2 != null) {
                this.zams.zaa(ImageManager.this.mContext, zaa2, true);
                return;
            }
            Long l = (Long) ImageManager.this.zamo.get(zab.uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < PhoneFingerManager.PER_HOUR_MILLISECOND) {
                    this.zams.zaa(ImageManager.this.mContext, ImageManager.this.zaml, true);
                    return;
                }
                ImageManager.this.zamo.remove(zab.uri);
            }
            this.zams.zaa(ImageManager.this.mContext, ImageManager.this.zaml);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.zamn.get(zab.uri);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(zab.uri);
                ImageManager.this.zamn.put(zab.uri, imageReceiver2);
            }
            imageReceiver2.zab(this.zams);
            if (!(this.zams instanceof zad)) {
                ImageManager.this.zamm.put(this.zams, imageReceiver2);
            }
            synchronized (ImageManager.zamg) {
                if (!ImageManager.zamh.contains(zab.uri)) {
                    ImageManager.zamh.add(zab.uri);
                    imageReceiver2.zace();
                }
            }
        }
    }

    public final class zad implements Runnable {
        public final Bitmap mBitmap;
        public final Uri mUri;
        public final CountDownLatch zadq;
        public boolean zamt;

        public zad(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.mBitmap = bitmap;
            this.zamt = z;
            this.zadq = countDownLatch;
        }

        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.zamk != null) {
                if (this.zamt) {
                    ImageManager.this.zamk.evictAll();
                    System.gc();
                    this.zamt = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.zamk.put(new zab(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zamn.remove(this.mUri);
            if (imageReceiver != null) {
                ArrayList arrayList = imageReceiver.zamp;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zaa zaa = (zaa) arrayList.get(i);
                    if (z) {
                        zaa.zaa(ImageManager.this.mContext, this.mBitmap, false);
                    } else {
                        ImageManager.this.zamo.put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                        zaa.zaa(ImageManager.this.mContext, ImageManager.this.zaml, false);
                    }
                    if (!(zaa instanceof zad)) {
                        ImageManager.this.zamm.remove(zaa);
                    }
                }
            }
            this.zadq.countDown();
            synchronized (ImageManager.zamg) {
                ImageManager.zamh.remove(this.mUri);
            }
        }
    }

    public ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
    }

    public static ImageManager create(Context context) {
        if (zami == null) {
            zami = new ImageManager(context, false);
        }
        return zami;
    }

    private final void zaa(zaa zaa2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zac(zaa2).run();
    }

    public final void loadImage(ImageView imageView, Uri uri) {
        zaa(new zac(imageView, uri));
    }

    public final void loadImage(ImageView imageView, int i) {
        zaa(new zac(imageView, i));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final Bitmap zaa(zab zab2) {
        zaa zaa2 = this.zamk;
        if (zaa2 == null) {
            return null;
        }
        return (Bitmap) zaa2.get(zab2);
    }

    public final void loadImage(ImageView imageView, Uri uri, int i) {
        zac zac2 = new zac(imageView, uri);
        zac2.zamw = i;
        zaa(zac2);
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaa(new zad(onImageLoadedListener, uri));
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        zad zad2 = new zad(onImageLoadedListener, uri);
        zad2.zamw = i;
        zaa(zad2);
    }
}
