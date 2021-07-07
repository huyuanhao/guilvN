package com.p118pd.sdk;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: com.pd.sdk.o000OoOO  reason: case insensitive filesystem */
public final class C7008o000OoOO {
    public static Cursor OooO00o(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C7056o00O0O0o o00o0o0o) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 16) {
            if (o00o0o0o != null) {
                try {
                    obj = o00o0o0o.OooO00o();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new androidx.core.p003os.OperationCanceledException();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (o00o0o0o != null) {
            o00o0o0o.OooO0O0();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
