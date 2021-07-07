package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zze;
import com.google.android.gms.internal.vision.zzg;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;

public final class BarcodeDetector extends Detector<Barcode> {
    public final zzg zzbl;

    public static class Builder {
        public zze zzbm = new zze();
        public Context zze;

        public Builder(Context context) {
            this.zze = context;
        }

        public BarcodeDetector build() {
            return new BarcodeDetector(new zzg(this.zze, this.zzbm));
        }

        public Builder setBarcodeFormats(int i) {
            this.zzbm.zzbn = i;
            return this;
        }
    }

    public BarcodeDetector() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // com.google.android.gms.vision.Detector
    public final SparseArray<Barcode> detect(Frame frame) {
        Barcode[] barcodeArr;
        if (frame != null) {
            zzn zzc = zzn.zzc(frame);
            if (frame.getBitmap() != null) {
                barcodeArr = this.zzbl.zza(frame.getBitmap(), zzc);
                if (barcodeArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                barcodeArr = this.zzbl.zza(frame.getGrayscaleImageData(), zzc);
            }
            SparseArray<Barcode> sparseArray = new SparseArray<>(barcodeArr.length);
            for (Barcode barcode : barcodeArr) {
                sparseArray.append(barcode.rawValue.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzbl.isOperational();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zzbl.zzp();
    }

    public BarcodeDetector(zzg zzg) {
        this.zzbl = zzg;
    }
}
