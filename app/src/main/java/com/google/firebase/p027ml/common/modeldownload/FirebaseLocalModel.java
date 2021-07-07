package com.google.firebase.p027ml.common.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel */
public class FirebaseLocalModel {
    public final String zzaqg;
    public final String zzart;
    public final String zzaru;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel$Builder */
    public static class Builder {
        public final String zzaqg;
        public String zzart = null;
        public String zzarv = null;

        public Builder(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model name can not be empty");
            this.zzaqg = str;
        }

        public FirebaseLocalModel build() {
            Preconditions.checkArgument((this.zzart != null && this.zzarv == null) || (this.zzart == null && this.zzarv != null), "Please set either filePath or assetFilePath.");
            return new FirebaseLocalModel(this.zzaqg, this.zzart, this.zzarv);
        }

        public Builder setAssetFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            Preconditions.checkArgument(this.zzart == null, "A local model source is either from local file or for asset, you can not set both.");
            this.zzarv = str;
            return this;
        }

        public Builder setFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            Preconditions.checkArgument(this.zzarv == null, "A local model source is either from local file or for asset, you can not set both.");
            this.zzart = str;
            return this;
        }
    }

    public FirebaseLocalModel(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.zzaqg = str;
        this.zzart = str2;
        this.zzaru = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseLocalModel)) {
            return false;
        }
        FirebaseLocalModel firebaseLocalModel = (FirebaseLocalModel) obj;
        return Objects.equal(this.zzaqg, firebaseLocalModel.zzaqg) && Objects.equal(this.zzart, firebaseLocalModel.zzart) && Objects.equal(this.zzaru, firebaseLocalModel.zzaru);
    }

    @Nullable
    public String getAssetFilePath() {
        return this.zzaru;
    }

    @Nullable
    public String getFilePath() {
        return this.zzart;
    }

    public String getModelName() {
        return this.zzaqg;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaqg, this.zzart, this.zzaru);
    }

    public final zzmd.zzo zzmh() {
        zzmd.zzu.zzb zzb;
        zzmd.zzo.zza zzjq = zzmd.zzo.zzjq();
        zzmd.zzu.zza zzkg = zzmd.zzu.zzkg();
        String str = this.zzart;
        if (str == null) {
            str = this.zzaru;
        }
        zzmd.zzu.zza zzbf = zzkg.zzbf(str);
        if (this.zzart != null) {
            zzb = zzmd.zzu.zzb.LOCAL;
        } else if (this.zzaru != null) {
            zzb = zzmd.zzu.zzb.APP_ASSET;
        } else {
            zzb = zzmd.zzu.zzb.SOURCE_UNKNOWN;
        }
        return (zzmd.zzo) ((zzue) zzjq.zzb(zzbf.zzb(zzb)).zzrj());
    }
}
