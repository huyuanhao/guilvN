package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;

public class Scope implements IMessageEntity {
    public final String mScopeUri;

    public Scope() {
        this.mScopeUri = null;
    }

    public boolean equeals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.mScopeUri.equals(((Scope) obj).mScopeUri);
    }

    public String getScopeUri() {
        return this.mScopeUri;
    }

    public Scope(String str) {
        this.mScopeUri = str;
    }
}
