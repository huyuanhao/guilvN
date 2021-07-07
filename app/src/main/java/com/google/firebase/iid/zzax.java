package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzax {
    public static final long zzdf = TimeUnit.DAYS.toMillis(7);
    public final long timestamp;
    public final String zzbq;
    public final String zzdg;

    public zzax(String str, String str2, long j) {
        this.zzbq = str;
        this.zzdg = str2;
        this.timestamp = j;
    }

    public static String zza(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    public static zzax zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new zzax(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzax(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    public final boolean zzj(String str) {
        return System.currentTimeMillis() > this.timestamp + zzdf || !str.equals(this.zzdg);
    }

    public static String zza(@Nullable zzax zzax) {
        if (zzax == null) {
            return null;
        }
        return zzax.zzbq;
    }
}
