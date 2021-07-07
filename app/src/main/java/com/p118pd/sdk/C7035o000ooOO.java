package com.p118pd.sdk;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000ooOO  reason: case insensitive filesystem */
public class C7035o000ooOO extends C7039o000oooo {
    public static final String OooO0OO = "TypefaceCompatApi21Impl";

    private File OooO00o(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0053, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005b, code lost:
        r4.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005e, code lost:
        throw r6;
     */
    @Override // com.p118pd.sdk.C7039o000oooo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface OooO00o(android.content.Context r4, android.os.CancellationSignal r5, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.C5039OooO0oo[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            androidx.core.provider.FontsContractCompat$OooO0oo r6 = r3.OooO00o(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.m14560OooO00o()     // Catch:{ IOException -> 0x005f }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x005f }
            java.io.File r6 = r3.OooO00o(r5)     // Catch:{ all -> 0x0051 }
            if (r6 == 0) goto L_0x002f
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x002e
            r5.close()
        L_0x002e:
            return r4
        L_0x002f:
            java.io.FileInputStream r6 = new java.io.FileInputStream
            java.io.FileDescriptor r7 = r5.getFileDescriptor()
            r6.<init>(r7)
            android.graphics.Typeface r4 = super.OooO00o(r4, r6)     // Catch:{ all -> 0x0045 }
            r6.close()
            if (r5 == 0) goto L_0x0044
            r5.close()
        L_0x0044:
            return r4
        L_0x0045:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x0050:
            throw r7
        L_0x0051:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r6 = move-exception
            if (r5 == 0) goto L_0x005e
            r5.close()     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r4.addSuppressed(r5)
        L_0x005e:
            throw r6
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7035o000ooOO.OooO00o(android.content.Context, android.os.CancellationSignal, androidx.core.provider.FontsContractCompat$OooO0oo[], int):android.graphics.Typeface");
    }
}
