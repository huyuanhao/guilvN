package com.p118pd.sdk;

import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00Ooo0  reason: case insensitive filesystem */
public final class C7132o00Ooo0 {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19478OooO00o = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String OooO0O0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String OooO0OO = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String OooO0Oo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String OooO0o = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String OooO0o0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String OooO0oO = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: com.pd.sdk.o00Ooo0$OooO00o */
    public static class OooO00o extends InputConnectionWrapper {
        public final /* synthetic */ OooO0OO OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(InputConnection inputConnection, boolean z, OooO0OO oooO0OO) {
            super(inputConnection, z);
            this.OooO00o = oooO0OO;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.OooO00o.OooO00o(C7134o00Ooo0O.OooO00o(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: com.pd.sdk.o00Ooo0$OooO0O0 */
    public static class OooO0O0 extends InputConnectionWrapper {
        public final /* synthetic */ OooO0OO OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(InputConnection inputConnection, boolean z, OooO0OO oooO0OO) {
            super(inputConnection, z);
            this.OooO00o = oooO0OO;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C7132o00Ooo0.OooO00o(str, bundle, this.OooO00o)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: com.pd.sdk.o00Ooo0$OooO0OO */
    public interface OooO0OO {
        boolean OooO00o(C7134o00Ooo0O o00ooo0o, int i, Bundle bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(@androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.NonNull android.os.Bundle r8, @androidx.annotation.NonNull com.p118pd.sdk.C7132o00Ooo0.OooO0OO r9) {
        /*
            java.lang.String r0 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r0, r7)
            r0 = 0
            if (r7 != 0) goto L_0x000a
            return r0
        L_0x000a:
            if (r8 != 0) goto L_0x000d
            return r0
        L_0x000d:
            r7 = 0
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            android.os.Parcelable r1 = r8.getParcelable(r1)     // Catch:{ all -> 0x004d }
            android.os.ResultReceiver r1 = (android.os.ResultReceiver) r1     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x004b }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x004b }
            android.content.ClipDescription r3 = (android.content.ClipDescription) r3     // Catch:{ all -> 0x004b }
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x004b }
            android.net.Uri r4 = (android.net.Uri) r4     // Catch:{ all -> 0x004b }
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            int r5 = r8.getInt(r5)     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            android.os.Parcelable r8 = r8.getParcelable(r6)     // Catch:{ all -> 0x004b }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ all -> 0x004b }
            com.pd.sdk.o00Ooo0O r6 = new com.pd.sdk.o00Ooo0O     // Catch:{ all -> 0x004b }
            r6.<init>(r2, r3, r4)     // Catch:{ all -> 0x004b }
            boolean r8 = r9.OooO00o(r6, r5, r8)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            r1.send(r8, r7)
        L_0x004a:
            return r8
        L_0x004b:
            r8 = move-exception
            goto L_0x004f
        L_0x004d:
            r8 = move-exception
            r1 = r7
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.send(r0, r7)
        L_0x0054:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7132o00Ooo0.OooO00o(java.lang.String, android.os.Bundle, com.pd.sdk.o00Ooo0$OooO0OO):boolean");
    }

    public static boolean OooO00o(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull C7134o00Ooo0O o00ooo0o, int i, @Nullable Bundle bundle) {
        boolean z;
        ClipDescription OooO00o2 = o00ooo0o.OooO00o();
        String[] OooO00o3 = C7133o00Ooo00.OooO00o(editorInfo);
        int length = OooO00o3.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (OooO00o2.hasMimeType(OooO00o3[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent((InputContentInfo) o00ooo0o.m18481OooO00o(), i, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(OooO0O0, o00ooo0o.m18480OooO00o());
        bundle2.putParcelable(OooO0OO, o00ooo0o.OooO00o());
        bundle2.putParcelable(OooO0Oo, o00ooo0o.OooO0O0());
        bundle2.putInt(OooO0o, i);
        bundle2.putParcelable(OooO0o0, bundle);
        return inputConnection.performPrivateCommand(f19478OooO00o, bundle2);
    }

    @NonNull
    public static InputConnection OooO00o(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull OooO0OO oooO0OO) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (oooO0OO == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        } else if (Build.VERSION.SDK_INT >= 25) {
            return new OooO00o(inputConnection, false, oooO0OO);
        } else {
            if (C7133o00Ooo00.OooO00o(editorInfo).length == 0) {
                return inputConnection;
            }
            return new OooO0O0(inputConnection, false, oooO0OO);
        }
    }
}
