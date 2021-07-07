package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class zznl {
    public static final GmsLogger zzaoz = new GmsLogger("LibraryVersion", "");
    public static zznl zzapa = new zznl();
    public ConcurrentHashMap<String, String> zzapb = new ConcurrentHashMap<>();

    public static zznl zzll() {
        return zzapa;
    }

    public final String getVersion(@NonNull String str) {
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzapb.containsKey(str)) {
            return this.zzapb.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = zznl.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                GmsLogger gmsLogger = zzaoz;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                gmsLogger.mo10810v("LibraryVersion", sb.toString());
            } else {
                GmsLogger gmsLogger2 = zzaoz;
                String valueOf = String.valueOf(str);
                gmsLogger2.mo10803e("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            GmsLogger gmsLogger3 = zzaoz;
            String valueOf2 = String.valueOf(str);
            gmsLogger3.mo10804e("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            zzaoz.mo10801d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        this.zzapb.put(str, str2);
        return str2;
    }
}
