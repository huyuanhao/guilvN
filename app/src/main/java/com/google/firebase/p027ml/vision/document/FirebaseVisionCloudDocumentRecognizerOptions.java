package com.google.firebase.p027ml.vision.document;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions */
public class FirebaseVisionCloudDocumentRecognizerOptions {
    public final boolean zzawj;
    public final List<String> zzaxr;

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions$Builder */
    public static class Builder {
        public boolean zzawj = false;
        public List<String> zzaxr = new ArrayList();

        public FirebaseVisionCloudDocumentRecognizerOptions build() {
            return new FirebaseVisionCloudDocumentRecognizerOptions(this.zzaxr, this.zzawj);
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
    }

    public FirebaseVisionCloudDocumentRecognizerOptions(@NonNull List<String> list, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzaxr = list;
        this.zzawj = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDocumentRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions = (FirebaseVisionCloudDocumentRecognizerOptions) obj;
        return this.zzaxr.equals(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages()) && this.zzawj == firebaseVisionCloudDocumentRecognizerOptions.zzawj;
    }

    public List<String> getHintedLanguages() {
        return this.zzaxr;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaxr, Boolean.valueOf(this.zzawj));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }
}
