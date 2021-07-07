package com.p118pd.sdk;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.oo0O  reason: case insensitive filesystem */
public final class C8584oo0O {
    public Object OooO00o;

    public C8584oo0O(Object obj) {
        this.OooO00o = obj;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static C8584oo0O OooO00o(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new C8584oo0O(requestDragAndDropPermissions);
    }

    public void OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions) this.OooO00o).release();
        }
    }
}
