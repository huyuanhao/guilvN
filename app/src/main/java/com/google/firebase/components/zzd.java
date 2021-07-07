package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzd implements zze<Context> {
    public zzd() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.firebase.components.zze
    public final /* synthetic */ List zza(Context context) {
        Bundle zza = zza(context);
        if (zza == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : zza.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(zza.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }

    public /* synthetic */ zzd(byte b) {
        this();
    }

    public static Bundle zza(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128)) == null) {
                return null;
            }
            return serviceInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
