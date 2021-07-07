package com.google.firebase.p027ml.common.modeldownload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;
import com.google.firebase.p027ml.common.modeldownload.FirebaseModelDownloadConditions;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel */
public class FirebaseRemoteModel {
    public static final Map<zza, String> zzasd = new HashMap();
    @VisibleForTesting
    public static final Map<zza, String> zzase;
    @Nullable
    public final String zzaqg;
    public String zzaqz;
    @Nullable
    public final zza zzasc;
    public final boolean zzasf;
    public final FirebaseModelDownloadConditions zzasg;
    public final FirebaseModelDownloadConditions zzash;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel$Builder */
    public static class Builder {
        @Nullable
        public final String zzaqg;
        @Nullable
        public final zza zzasc;
        public boolean zzasf = true;
        public FirebaseModelDownloadConditions zzasg = new FirebaseModelDownloadConditions.Builder().build();
        public FirebaseModelDownloadConditions zzash = new FirebaseModelDownloadConditions.Builder().build();

        public Builder(@NonNull String str) {
            this.zzaqg = str;
            this.zzasc = null;
        }

        public FirebaseRemoteModel build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(this.zzaqg), "One of cloud model name and base model cannot be empty");
            Preconditions.checkNotNull(this.zzasg, "Initial download condition cannot be null");
            Preconditions.checkNotNull(this.zzash, "Update download condition cannot be null");
            return new FirebaseRemoteModel(this.zzaqg, this.zzasf, this.zzasg, this.zzash);
        }

        public Builder enableModelUpdates(boolean z) {
            this.zzasf = z;
            return this;
        }

        public Builder setInitialDownloadConditions(@NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
            this.zzasg = firebaseModelDownloadConditions;
            return this;
        }

        public Builder setUpdatesDownloadConditions(@NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
            this.zzash = firebaseModelDownloadConditions;
            return this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        zzase = hashMap;
        hashMap.put(zza.FACE_DETECTION, "face_detector_model_m41");
        zzase.put(zza.SMART_REPLY, "smart_reply_model_m41");
        zzase.put(zza.TRANSLATE, "translate_model_m41");
        zzasd.put(zza.FACE_DETECTION, "modelHash");
        zzasd.put(zza.SMART_REPLY, "smart_reply_model_hash");
        zzasd.put(zza.TRANSLATE, "modelHash");
    }

    public FirebaseRemoteModel(@Nullable String str, @Nullable zza zza, boolean z, @NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions, @NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions2) {
        this.zzaqg = str;
        this.zzasc = zza;
        this.zzasf = z;
        this.zzasg = firebaseModelDownloadConditions;
        this.zzash = firebaseModelDownloadConditions2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseRemoteModel)) {
            return false;
        }
        FirebaseRemoteModel firebaseRemoteModel = (FirebaseRemoteModel) obj;
        return Objects.equal(this.zzaqg, firebaseRemoteModel.zzaqg) && Objects.equal(this.zzasc, firebaseRemoteModel.zzasc) && this.zzasf == firebaseRemoteModel.zzasf && this.zzasg.equals(firebaseRemoteModel.zzasg) && this.zzash.equals(firebaseRemoteModel.zzash);
    }

    public FirebaseModelDownloadConditions getInitialDownloadConditions() {
        return this.zzasg;
    }

    @Nullable
    public String getModelName() {
        return this.zzaqg;
    }

    public FirebaseModelDownloadConditions getUpdatesDownloadConditions() {
        return this.zzash;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaqg, this.zzasc, Boolean.valueOf(this.zzasf), Integer.valueOf(Objects.hashCode(this.zzasg)), Integer.valueOf(Objects.hashCode(this.zzash)));
    }

    public boolean isModelUpdatesEnabled() {
        return this.zzasf;
    }

    public final boolean zzcd(@NonNull String str) {
        zza zza = this.zzasc;
        if (zza == null) {
            return false;
        }
        return str.equals(zzasd.get(zza));
    }

    public final void zzce(@NonNull String str) {
        this.zzaqz = str;
    }

    public final zzmd.zzo zzmh() {
        zzmd.zzo.zza zzd = zzmd.zzo.zzjq().zzc(this.zzasg.zzmi()).zzd(this.zzash.zzmi());
        zzmd.zzu.zza zzb = zzmd.zzu.zzkg().zzbe(zzmj()).zzb(zzmd.zzu.zzb.CLOUD);
        String str = this.zzaqz;
        if (str == null) {
            str = "";
        }
        return (zzmd.zzo) ((zzue) zzd.zzb(zzb.zzbg(str)).zzn(this.zzasf).zzrj());
    }

    @NonNull
    public final String zzmj() {
        String str = this.zzaqg;
        if (str != null) {
            return str;
        }
        return zzase.get(this.zzasc);
    }

    public final boolean zzmk() {
        return this.zzasc != null;
    }
}
