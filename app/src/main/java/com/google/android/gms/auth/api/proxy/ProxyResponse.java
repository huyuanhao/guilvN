package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyResponseCreator")
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    @SafeParcelable.Field(mo10865id = 5)
    public final byte[] body;
    @SafeParcelable.Field(mo10865id = 1)
    public final int googlePlayServicesStatusCode;
    @SafeParcelable.Field(mo10865id = 2)
    public final PendingIntent recoveryAction;
    @SafeParcelable.Field(mo10865id = 3)
    public final int statusCode;
    @SafeParcelable.VersionField(mo10871id = 1000)
    public final int versionCode;
    @SafeParcelable.Field(mo10865id = 4)
    public final Bundle zzby;

    @SafeParcelable.Constructor
    public ProxyResponse(@SafeParcelable.Param(mo10868id = 1000) int i, @SafeParcelable.Param(mo10868id = 1) int i2, @SafeParcelable.Param(mo10868id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(mo10868id = 3) int i3, @SafeParcelable.Param(mo10868id = 4) Bundle bundle, @SafeParcelable.Param(mo10868id = 5) byte[] bArr) {
        this.versionCode = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.zzby = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    public static ProxyResponse createErrorProxyResponse(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        return new ProxyResponse(1, i, pendingIntent, i2, zza(map), bArr);
    }

    public static Bundle zza(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public Map<String, String> getHeaders() {
        if (this.zzby == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.zzby.keySet()) {
            hashMap.put(str, this.zzby.getString(str));
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.googlePlayServicesStatusCode);
        SafeParcelWriter.writeParcelable(parcel, 2, this.recoveryAction, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzby, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.body, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    public ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, null, i, bundle, bArr);
    }

    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(i, zza(map), bArr);
    }
}
