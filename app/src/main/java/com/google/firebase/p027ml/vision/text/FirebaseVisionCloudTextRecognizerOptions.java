package com.google.firebase.p027ml.vision.text;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions */
public class FirebaseVisionCloudTextRecognizerOptions {
    public static final int DENSE_MODEL = 2;
    public static final int SPARSE_MODEL = 1;
    public final boolean zzawj;
    public final List<String> zzaxr;
    public final int zzazl;

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions$Builder */
    public static class Builder {
        public boolean zzawj = false;
        public List<String> zzaxr = new ArrayList();
        public int zzazl = 1;

        public FirebaseVisionCloudTextRecognizerOptions build() {
            return new FirebaseVisionCloudTextRecognizerOptions(this.zzaxr, this.zzazl, this.zzawj);
        }

        public Builder enforceCertFingerprintMatch() {
            this.zzawj = true;
            return this;
        }

        public Builder setLanguageHints(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
            this.zzaxr = list;
            Collections.sort(list);
            return this;
        }

        public Builder setModelType(int i) {
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            Preconditions.checkArgument(z, "modelType should be either SPARSE_MODEL or DENSE_MODEL");
            this.zzazl = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions$CloudTextModelType */
    public @interface CloudTextModelType {
    }

    public FirebaseVisionCloudTextRecognizerOptions(@NonNull List<String> list, int i, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzaxr = list;
        this.zzazl = i;
        this.zzawj = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudTextRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions = (FirebaseVisionCloudTextRecognizerOptions) obj;
        return this.zzaxr.equals(firebaseVisionCloudTextRecognizerOptions.getHintedLanguages()) && this.zzazl == firebaseVisionCloudTextRecognizerOptions.zzazl && this.zzawj == firebaseVisionCloudTextRecognizerOptions.zzawj;
    }

    public List<String> getHintedLanguages() {
        return this.zzaxr;
    }

    public int getModelType() {
        return this.zzazl;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaxr, Integer.valueOf(this.zzazl), Boolean.valueOf(this.zzawj));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }
}
