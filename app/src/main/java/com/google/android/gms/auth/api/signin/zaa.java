package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final /* synthetic */ class zaa implements Comparator {
    public static final Comparator zaq = new zaa();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return GoogleSignInAccount.zaa((Scope) obj, (Scope) obj2);
    }
}
