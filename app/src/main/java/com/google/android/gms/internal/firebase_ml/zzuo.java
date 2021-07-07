package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzuo extends IOException {
    public zzvo zzbph = null;

    public zzuo(String str) {
        super(str);
    }

    public static zzuo zzrm() {
        return new zzuo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzuo zzrn() {
        return new zzuo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzuo zzro() {
        return new zzuo("Protocol message contained an invalid tag (zero).");
    }

    public static zzup zzrp() {
        return new zzup("Protocol message tag had invalid wire type.");
    }

    public static zzuo zzrq() {
        return new zzuo("Failed to parse the message.");
    }

    public static zzuo zzrr() {
        return new zzuo("Protocol message had invalid UTF-8.");
    }

    public final zzuo zzg(zzvo zzvo) {
        this.zzbph = zzvo;
        return this;
    }
}
