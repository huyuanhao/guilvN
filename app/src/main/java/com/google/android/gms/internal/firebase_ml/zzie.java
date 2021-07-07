package com.google.android.gms.internal.firebase_ml;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class zzie {
    public static final zzif zzaah = new zzig("-_.*", true);
    public static final zzif zzaai = new zzig("-_.!~*'()@:$&,;=", false);
    public static final zzif zzaaj = new zzig("-_.!~*'()@:$&,;=+/?", false);
    public static final zzif zzaak = new zzig("-_.!~*'():$&,;=", false);
    public static final zzif zzaal = new zzig("-_.!~*'()@:$,;/?:", false);

    public static String zzaq(String str) {
        return zzaah.zzaw(str);
    }

    public static String zzar(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String zzas(String str) {
        return zzaai.zzaw(str);
    }

    public static String zzat(String str) {
        return zzaaj.zzaw(str);
    }

    public static String zzau(String str) {
        return zzaak.zzaw(str);
    }

    public static String zzav(String str) {
        return zzaal.zzaw(str);
    }
}
