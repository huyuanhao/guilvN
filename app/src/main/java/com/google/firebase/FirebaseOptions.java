package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.annotations.PublicApi;

@PublicApi
public final class FirebaseOptions {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;

    @PublicApi
    public static final class Builder {
        public String zza;
        public String zzb;
        public String zzc;
        public String zzd;
        public String zze;
        public String zzf;
        public String zzg;

        @PublicApi
        public Builder() {
        }

        @PublicApi
        public final FirebaseOptions build() {
            return new FirebaseOptions(this.zzb, this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, (byte) 0);
        }

        @PublicApi
        public final Builder setApiKey(@NonNull String str) {
            this.zza = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @PublicApi
        public final Builder setApplicationId(@NonNull String str) {
            this.zzb = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @PublicApi
        public final Builder setDatabaseUrl(@Nullable String str) {
            this.zzc = str;
            return this;
        }

        @KeepForSdk
        public final Builder setGaTrackingId(@Nullable String str) {
            this.zzd = str;
            return this;
        }

        @PublicApi
        public final Builder setGcmSenderId(@Nullable String str) {
            this.zze = str;
            return this;
        }

        @PublicApi
        public final Builder setProjectId(@Nullable String str) {
            this.zzg = str;
            return this;
        }

        @PublicApi
        public final Builder setStorageBucket(@Nullable String str) {
            this.zzf = str;
            return this;
        }

        @PublicApi
        public Builder(FirebaseOptions firebaseOptions) {
            this.zzb = firebaseOptions.zzb;
            this.zza = firebaseOptions.zza;
            this.zzc = firebaseOptions.zzc;
            this.zzd = firebaseOptions.zzd;
            this.zze = firebaseOptions.zze;
            this.zzf = firebaseOptions.zzf;
            this.zzg = firebaseOptions.zzg;
        }
    }

    public /* synthetic */ FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    @PublicApi
    public static FirebaseOptions fromResource(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        if (!Objects.equal(this.zzb, firebaseOptions.zzb) || !Objects.equal(this.zza, firebaseOptions.zza) || !Objects.equal(this.zzc, firebaseOptions.zzc) || !Objects.equal(this.zzd, firebaseOptions.zzd) || !Objects.equal(this.zze, firebaseOptions.zze) || !Objects.equal(this.zzf, firebaseOptions.zzf) || !Objects.equal(this.zzg, firebaseOptions.zzg)) {
            return false;
        }
        return true;
    }

    @PublicApi
    public final String getApiKey() {
        return this.zza;
    }

    @PublicApi
    public final String getApplicationId() {
        return this.zzb;
    }

    @PublicApi
    public final String getDatabaseUrl() {
        return this.zzc;
    }

    @KeepForSdk
    public final String getGaTrackingId() {
        return this.zzd;
    }

    @PublicApi
    public final String getGcmSenderId() {
        return this.zze;
    }

    @PublicApi
    public final String getProjectId() {
        return this.zzg;
    }

    @PublicApi
    public final String getStorageBucket() {
        return this.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.zzb).add("apiKey", this.zza).add("databaseUrl", this.zzc).add("gcmSenderId", this.zze).add("storageBucket", this.zzf).add("projectId", this.zzg).toString();
    }

    public FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.zzb = str;
        this.zza = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }
}
