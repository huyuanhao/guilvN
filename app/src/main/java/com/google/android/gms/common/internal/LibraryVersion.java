package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {
    public static final GmsLogger zzel = new GmsLogger("LibraryVersion", "");
    public static LibraryVersion zzem = new LibraryVersion();
    public ConcurrentHashMap<String, String> zzen = new ConcurrentHashMap<>();

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzem;
    }

    @KeepForSdk
    public String getVersion(@NonNull String str) {
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzen.containsKey(str)) {
            return this.zzen.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                GmsLogger gmsLogger = zzel;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                gmsLogger.mo10810v("LibraryVersion", sb.toString());
            } else {
                GmsLogger gmsLogger2 = zzel;
                String valueOf = String.valueOf(str);
                gmsLogger2.mo10803e("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            GmsLogger gmsLogger3 = zzel;
            String valueOf2 = String.valueOf(str);
            gmsLogger3.mo10804e("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            zzel.mo10801d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        this.zzen.put(str, str2);
        return str2;
    }
}
