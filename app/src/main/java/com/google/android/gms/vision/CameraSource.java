package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RequiresPermission;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class CameraSource {
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;
    public int facing;
    public int rotation;
    public Context zze;
    public final Object zzf;
    @GuardedBy("cameraLock")
    public Camera zzg;
    public Size zzh;
    public float zzi;
    public int zzj;
    public int zzk;
    public boolean zzl;
    public SurfaceTexture zzm;
    public boolean zzn;
    public Thread zzo;
    public zzb zzp;
    public Map<byte[], ByteBuffer> zzq;

    public static class Builder {
        public final Detector<?> zzr;
        public CameraSource zzs;

        public Builder(Context context, Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.zzs = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (detector != null) {
                this.zzr = detector;
                cameraSource.zze = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzs;
            cameraSource.getClass();
            cameraSource.zzp = new zzb(this.zzr);
            return this.zzs;
        }

        public Builder setAutoFocusEnabled(boolean z) {
            this.zzs.zzl = z;
            return this;
        }

        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.zzs.facing = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid camera: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                this.zzs.zzi = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            this.zzs.zzj = i;
            this.zzs.zzk = i2;
            return this;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    public class zza implements Camera.PreviewCallback {
        public zza() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzp.zza(bArr, camera);
        }
    }

    public class zzb implements Runnable {
        public final Object lock = new Object();
        public Detector<?> zzr;
        public long zzu = SystemClock.elapsedRealtime();
        public boolean zzv = true;
        public long zzw;
        public int zzx = 0;
        public ByteBuffer zzy;

        public zzb(Detector<?> detector) {
            this.zzr = detector;
        }

        @SuppressLint({"Assert"})
        public final void release() {
            this.zzr.release();
            this.zzr = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r6.zzr.receiveFrame(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
            r6.zzt.zzg.addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            throw r0;
         */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.zzb.run():void");
        }

        public final void setActive(boolean z) {
            synchronized (this.lock) {
                this.zzv = z;
                this.lock.notifyAll();
            }
        }

        public final void zza(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                if (this.zzy != null) {
                    camera.addCallbackBuffer(this.zzy.array());
                    this.zzy = null;
                }
                if (CameraSource.this.zzq.containsKey(bArr)) {
                    this.zzw = SystemClock.elapsedRealtime() - this.zzu;
                    this.zzx++;
                    this.zzy = (ByteBuffer) CameraSource.this.zzq.get(bArr);
                    this.lock.notifyAll();
                }
            }
        }
    }

    public class zzc implements Camera.PictureCallback {
        public PictureCallback zzz;

        public zzc() {
        }

        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zzz;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzf) {
                if (CameraSource.this.zzg != null) {
                    CameraSource.this.zzg.startPreview();
                }
            }
        }
    }

    public static class zzd implements Camera.ShutterCallback {
        public ShutterCallback zzaa;

        public zzd() {
        }

        public final void onShutter() {
            ShutterCallback shutterCallback = this.zzaa;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    @VisibleForTesting
    public static class zze {
        public Size zzab;
        public Size zzac;

        public zze(Camera.Size size, @Nullable Camera.Size size2) {
            this.zzab = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzac = new Size(size2.width, size2.height);
            }
        }

        public final Size zzb() {
            return this.zzab;
        }

        @Nullable
        public final Size zzc() {
            return this.zzac;
        }
    }

    public CameraSource() {
        this.zzf = new Object();
        this.facing = 0;
        this.zzi = 30.0f;
        this.zzj = 1024;
        this.zzk = 768;
        this.zzl = false;
        this.zzq = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    private final Camera zza() throws IOException {
        int i;
        int i2;
        int i3 = this.facing;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= Camera.getNumberOfCameras()) {
                i5 = -1;
                break;
            }
            Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i3) {
                break;
            }
            i5++;
        }
        if (i5 != -1) {
            Camera open = Camera.open(i5);
            int i6 = this.zzj;
            int i7 = this.zzk;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                float f = ((float) size.width) / ((float) size.height);
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Camera.Size next = it.next();
                    if (Math.abs(f - (((float) next.width) / ((float) next.height))) < 0.01f) {
                        arrayList.add(new zze(size, next));
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                for (Camera.Size size2 : supportedPreviewSizes) {
                    arrayList.add(new zze(size2, null));
                }
            }
            int size3 = arrayList.size();
            int i8 = Integer.MAX_VALUE;
            zze zze2 = null;
            int i9 = 0;
            int i10 = Integer.MAX_VALUE;
            while (i9 < size3) {
                Object obj = arrayList.get(i9);
                i9++;
                zze zze3 = (zze) obj;
                Size zzb2 = zze3.zzb();
                int abs = Math.abs(zzb2.getWidth() - i6) + Math.abs(zzb2.getHeight() - i7);
                if (abs < i10) {
                    zze2 = zze3;
                    i10 = abs;
                }
            }
            if (zze2 != null) {
                Size zzc2 = zze2.zzc();
                this.zzh = zze2.zzb();
                int i11 = (int) (this.zzi * 1000.0f);
                int[] iArr = null;
                for (int[] iArr2 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i11 - iArr2[0]) + Math.abs(i11 - iArr2[1]);
                    if (abs2 < i8) {
                        iArr = iArr2;
                        i8 = abs2;
                    }
                }
                if (iArr != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (zzc2 != null) {
                        parameters2.setPictureSize(zzc2.getWidth(), zzc2.getHeight());
                    }
                    parameters2.setPreviewSize(this.zzh.getWidth(), this.zzh.getHeight());
                    parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation2 = ((WindowManager) this.zze.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation2 != 0) {
                        if (rotation2 == 1) {
                            i4 = 90;
                        } else if (rotation2 == 2) {
                            i4 = 180;
                        } else if (rotation2 != 3) {
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Bad rotation value: ");
                            sb.append(rotation2);
                            sb.toString();
                        } else {
                            i4 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i5, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i2 = (cameraInfo2.orientation + i4) % 360;
                        i = (360 - i2) % 360;
                    } else {
                        i2 = ((cameraInfo2.orientation - i4) + 360) % 360;
                        i = i2;
                    }
                    this.rotation = i2 / 90;
                    open.setDisplayOrientation(i);
                    parameters2.setRotation(i2);
                    if (this.zzl) {
                        if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                            parameters2.setFocusMode("continuous-video");
                        } else {
                            Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new zza());
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    public int getCameraFacing() {
        return this.facing;
    }

    public Size getPreviewSize() {
        return this.zzh;
    }

    public void release() {
        synchronized (this.zzf) {
            stop();
            this.zzp.release();
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() throws IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            SurfaceTexture surfaceTexture = new SurfaceTexture(100);
            this.zzm = surfaceTexture;
            this.zzg.setPreviewTexture(surfaceTexture);
            this.zzn = true;
            this.zzg.startPreview();
            Thread thread = new Thread(this.zzp);
            this.zzo = thread;
            thread.setName("gms.vision.CameraSource");
            this.zzp.setActive(true);
            this.zzo.start();
            return this;
        }
    }

    public void stop() {
        synchronized (this.zzf) {
            this.zzp.setActive(false);
            if (this.zzo != null) {
                try {
                    this.zzo.join();
                } catch (InterruptedException unused) {
                }
                this.zzo = null;
            }
            if (this.zzg != null) {
                this.zzg.stopPreview();
                this.zzg.setPreviewCallbackWithBuffer(null);
                try {
                    if (this.zzn) {
                        this.zzg.setPreviewTexture(null);
                    } else {
                        this.zzg.setPreviewDisplay(null);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    sb.toString();
                }
                this.zzg.release();
                this.zzg = null;
            }
            this.zzq.clear();
        }
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                zzd zzd2 = new zzd();
                zzd2.zzaa = shutterCallback;
                zzc zzc2 = new zzc();
                zzc2.zzz = pictureCallback;
                this.zzg.takePicture(zzd2, null, null, zzc2);
            }
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            Camera zza2 = zza();
            this.zzg = zza2;
            zza2.setPreviewDisplay(surfaceHolder);
            this.zzg.startPreview();
            this.zzo = new Thread(this.zzp);
            this.zzp.setActive(true);
            this.zzo.start();
            this.zzn = false;
            return this;
        }
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] zza(Size size) {
        double height = (double) ((long) (size.getHeight() * size.getWidth() * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(height);
        byte[] bArr = new byte[(((int) Math.ceil(height / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.zzq.put(bArr, wrap);
        return bArr;
    }
}
