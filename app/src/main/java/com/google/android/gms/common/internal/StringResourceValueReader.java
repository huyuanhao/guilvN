package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C0955R;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
public class StringResourceValueReader {
    public final Resources zzeu;
    public final String zzev;

    public StringResourceValueReader(Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zzeu = resources;
        this.zzev = resources.getResourcePackageName(C0955R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    public String getString(String str) {
        int identifier = this.zzeu.getIdentifier(str, "string", this.zzev);
        if (identifier == 0) {
            return null;
        }
        return this.zzeu.getString(identifier);
    }
}
