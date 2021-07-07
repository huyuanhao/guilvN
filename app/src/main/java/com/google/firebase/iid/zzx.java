package com.google.firebase.iid;

public final class zzx implements InstanceIdResult {
    public final String zzbp;
    public final String zzbq;

    public zzx(String str, String str2) {
        this.zzbp = str;
        this.zzbq = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.zzbp;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.zzbq;
    }
}
