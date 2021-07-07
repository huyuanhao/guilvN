package com.google.firebase.p027ml.vision.text;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zziz;

/* renamed from: com.google.firebase.ml.vision.text.RecognizedLanguage */
public class RecognizedLanguage {
    public final String languageCode;

    public RecognizedLanguage(@Nullable String str) {
        this.languageCode = str;
    }

    @Nullable
    public static RecognizedLanguage zza(@Nullable zziz zziz) {
        if (zziz == null || zziz.getLanguageCode() == null || zziz.getLanguageCode().isEmpty()) {
            return null;
        }
        return new RecognizedLanguage(zziz.getLanguageCode());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognizedLanguage)) {
            return false;
        }
        RecognizedLanguage recognizedLanguage = (RecognizedLanguage) obj;
        String str = this.languageCode;
        if (str == null) {
            return recognizedLanguage.languageCode == null;
        }
        return str.equals(recognizedLanguage.languageCode);
    }

    @Nullable
    public String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        return Objects.hashCode(this.languageCode);
    }
}
