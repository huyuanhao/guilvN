package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;

public class MultiProcessor<T> implements Detector.Processor<T> {
    public int zzal;
    public Factory<T> zzaz;
    public SparseArray<zza> zzba;

    public static class Builder<T> {
        public MultiProcessor<T> zzbb;

        public Builder(Factory<T> factory) {
            MultiProcessor<T> multiProcessor = new MultiProcessor<>();
            this.zzbb = multiProcessor;
            if (factory != null) {
                multiProcessor.zzaz = factory;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        public MultiProcessor<T> build() {
            return this.zzbb;
        }

        public Builder<T> setMaxGapFrames(int i) {
            if (i >= 0) {
                this.zzbb.zzal = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid max gap: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public interface Factory<T> {
        Tracker<T> create(T t);
    }

    public class zza {
        public Tracker<T> zzak;
        public int zzao;

        public zza(MultiProcessor multiProcessor) {
            this.zzao = 0;
        }

        public static /* synthetic */ int zzb(zza zza) {
            int i = zza.zzao;
            zza.zzao = i + 1;
            return i;
        }
    }

    public MultiProcessor() {
        this.zzba = new SparseArray<>();
        this.zzal = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int keyAt = detectedItems.keyAt(i);
            T valueAt = detectedItems.valueAt(i);
            if (this.zzba.get(keyAt) == null) {
                zza zza2 = new zza();
                zza2.zzak = this.zzaz.create(valueAt);
                zza2.zzak.onNewItem(keyAt, valueAt);
                this.zzba.append(keyAt, zza2);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet<Integer> hashSet = new HashSet();
        for (int i2 = 0; i2 < this.zzba.size(); i2++) {
            int keyAt2 = this.zzba.keyAt(i2);
            if (detectedItems2.get(keyAt2) == null) {
                zza valueAt2 = this.zzba.valueAt(i2);
                zza.zzb(valueAt2);
                if (valueAt2.zzao >= this.zzal) {
                    valueAt2.zzak.onDone();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    valueAt2.zzak.onMissing(detections);
                }
            }
        }
        for (Integer num : hashSet) {
            this.zzba.delete(num.intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i3 = 0; i3 < detectedItems3.size(); i3++) {
            int keyAt3 = detectedItems3.keyAt(i3);
            T valueAt3 = detectedItems3.valueAt(i3);
            zza zza3 = this.zzba.get(keyAt3);
            zza3.zzao = 0;
            zza3.zzak.onUpdate(detections, valueAt3);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i = 0; i < this.zzba.size(); i++) {
            this.zzba.valueAt(i).zzak.onDone();
        }
        this.zzba.clear();
    }
}
