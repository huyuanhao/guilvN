package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    public static Clock zae = DefaultClock.getInstance();
    @SafeParcelable.Field(getter = "getId", mo10865id = 2)
    public String mId;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int versionCode;
    @SafeParcelable.Field(getter = "getIdToken", mo10865id = 3)
    public String zaf;
    @SafeParcelable.Field(getter = "getEmail", mo10865id = 4)
    public String zag;
    @SafeParcelable.Field(getter = "getDisplayName", mo10865id = 5)
    public String zah;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo10865id = 6)
    public Uri zai;
    @SafeParcelable.Field(getter = "getServerAuthCode", mo10865id = 7)
    public String zaj;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo10865id = 8)
    public long zak;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", mo10865id = 9)
    public String zal;
    @SafeParcelable.Field(mo10865id = 10)
    public List<Scope> zam;
    @SafeParcelable.Field(getter = "getGivenName", mo10865id = 11)
    public String zan;
    @SafeParcelable.Field(getter = "getFamilyName", mo10865id = 12)
    public String zao;
    public Set<Scope> zap = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) String str2, @SafeParcelable.Param(mo10868id = 4) String str3, @SafeParcelable.Param(mo10868id = 5) String str4, @SafeParcelable.Param(mo10868id = 6) Uri uri, @SafeParcelable.Param(mo10868id = 7) String str5, @SafeParcelable.Param(mo10868id = 8) long j, @SafeParcelable.Param(mo10868id = 9) String str6, @SafeParcelable.Param(mo10868id = 10) List<Scope> list, @SafeParcelable.Param(mo10868id = 11) String str7, @SafeParcelable.Param(mo10868id = 12) String str8) {
        this.versionCode = i;
        this.mId = str;
        this.zaf = str2;
        this.zag = str3;
        this.zah = str4;
        this.zai = uri;
        this.zaj = str5;
        this.zak = j;
        this.zal = str6;
        this.zam = list;
        this.zan = str7;
        this.zao = str8;
    }

    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        Account account = new Account("<<default account>>", "com.google");
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, new HashSet());
    }

    @Nullable
    public static GoogleSignInAccount zaa(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount zaa = zaa(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        zaa.zaj = jSONObject.optString("serverAuthCode", null);
        return zaa;
    }

    private final JSONObject zad() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            if (getPhotoUrl() != null) {
                jSONObject.put("photoUrl", getPhotoUrl().toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zak);
            jSONObject.put("obfuscatedIdentifier", this.zal);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.zam.toArray(new Scope[this.zam.size()]);
            Arrays.sort(scopeArr, zaa.zaq);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zal.equals(this.zal) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    @Nullable
    public Account getAccount() {
        if (this.zag == null) {
            return null;
        }
        return new Account(this.zag, "com.google");
    }

    @Nullable
    public String getDisplayName() {
        return this.zah;
    }

    @Nullable
    public String getEmail() {
        return this.zag;
    }

    @Nullable
    public String getFamilyName() {
        return this.zao;
    }

    @Nullable
    public String getGivenName() {
        return this.zan;
    }

    @NonNull
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zam);
    }

    @Nullable
    public String getId() {
        return this.mId;
    }

    @Nullable
    public String getIdToken() {
        return this.zaf;
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.zai;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zam);
        hashSet.addAll(this.zap);
        return hashSet;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.zaj;
    }

    public int hashCode() {
        return ((this.zal.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    @KeepForSdk
    public boolean isExpired() {
        return zae.currentTimeMillis() / 1000 >= this.zak - 300;
    }

    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zap, scopeArr);
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zak);
        SafeParcelWriter.writeString(parcel, 9, this.zal, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zam, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final String zab() {
        return this.zal;
    }

    public final String zac() {
        JSONObject zad = zad();
        zad.remove("serverAuthCode");
        return zad.toString();
    }

    public static GoogleSignInAccount zaa(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(zae.currentTimeMillis() / 1000) : l).longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }
}
