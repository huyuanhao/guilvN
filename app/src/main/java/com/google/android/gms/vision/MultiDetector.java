package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import java.util.ArrayList;
import java.util.List;

public class MultiDetector extends Detector<Object> {
    public List<Detector<? extends Object>> zzax;

    public static class Builder {
        public MultiDetector zzay = new MultiDetector();

        public Builder add(Detector<? extends Object> detector) {
            this.zzay.zzax.add(detector);
            return this;
        }

        public MultiDetector build() {
            if (this.zzay.zzax.size() != 0) {
                return this.zzay;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }

    public MultiDetector() {
        this.zzax = new ArrayList();
    }

    @Override // com.google.android.gms.vision.Detector
    public SparseArray<Object> detect(Frame frame) {
        SparseArray<Object> sparseArray = new SparseArray<>();
        for (Detector<? extends Object> detector : this.zzax) {
            SparseArray<? extends Object> detect = detector.detect(frame);
            int i = 0;
            while (true) {
                if (i < detect.size()) {
                    int keyAt = detect.keyAt(i);
                    if (sparseArray.get(keyAt) == null) {
                        sparseArray.append(keyAt, detect.valueAt(i));
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(104);
                        sb.append("Detection ID overlap for id = ");
                        sb.append(keyAt);
                        sb.append("  This means that one of the detectors is not using global IDs.");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public boolean isOperational() {
        for (Detector<? extends Object> detector : this.zzax) {
            if (!detector.isOperational()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.vision.Detector
    public void receiveFrame(Frame frame) {
        for (Detector<? extends Object> detector : this.zzax) {
            detector.receiveFrame(frame);
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public void release() {
        for (Detector<? extends Object> detector : this.zzax) {
            detector.release();
        }
        this.zzax.clear();
    }

    @Override // com.google.android.gms.vision.Detector
    public void setProcessor(Detector.Processor<Object> processor) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }
}
