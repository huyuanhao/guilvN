package com.tencent.bugly.beta.tinker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.p118pd.sdk.LL1i;
import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.util.TinkerLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Formatter;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class TinkerUtils {
    public static final int ERROR_PATCH_CONDITION_NOT_SATISFIED = -24;
    public static final int ERROR_PATCH_CRASH_LIMIT = -23;
    public static final int ERROR_PATCH_GOOGLEPLAY_CHANNEL = -20;
    public static final int ERROR_PATCH_MEMORY_LIMIT = -22;
    public static final int ERROR_PATCH_ROM_SPACE = -21;
    public static final int MIN_MEMORY_HEAP_SIZE = 45;
    public static final String PLATFORM = "platform";
    public static final String TAG = "Tinker.TinkerUtils";
    public static boolean background;

    public static class ScreenState {

        public interface IOnScreenOff {
            void onScreenOff();
        }

        public ScreenState(Context context, final IOnScreenOff iOnScreenOff) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(new BroadcastReceiver() {
                /* class com.tencent.bugly.beta.tinker.TinkerUtils.ScreenState.C32331 */

                public void onReceive(Context context, Intent intent) {
                    String action = intent == null ? "" : intent.getAction();
                    TinkerLog.i(TinkerUtils.TAG, "ScreenReceiver action [%s] ", new Object[]{action});
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        IOnScreenOff iOnScreenOff = iOnScreenOff;
                        if (iOnScreenOff != null) {
                            iOnScreenOff.onScreenOff();
                        }
                        context.unregisterReceiver(this);
                    }
                }
            }, intentFilter);
        }
    }

    public static String bytesToHexString(byte[] bArr, boolean z) {
        if (bArr == null) {
            return "";
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        Formatter formatter = new Formatter(stringBuffer);
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", Byte.valueOf(bArr[i]));
        }
        formatter.close();
        String stringBuffer2 = stringBuffer.toString();
        return z ? stringBuffer2.toUpperCase() : stringBuffer2.toLowerCase();
    }

    public static int checkForPatchRecover(long j, int i) {
        if (isGooglePlay()) {
            return -20;
        }
        if (i < 45) {
            return -22;
        }
        return !checkRomSpaceEnough(j) ? -21 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkRomSpaceEnough(long r8) {
        /*
            r0 = 0
            java.io.File r2 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x0028 }
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ Exception -> 0x0028 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0028 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0028 }
            int r2 = r3.getAvailableBlocks()     // Catch:{ Exception -> 0x0028 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x0028 }
            int r2 = r3.getBlockSize()     // Catch:{ Exception -> 0x0028 }
            long r6 = (long) r2
            long r4 = r4 * r6
            int r2 = r3.getBlockCount()     // Catch:{ Exception -> 0x0029 }
            long r6 = (long) r2     // Catch:{ Exception -> 0x0029 }
            int r2 = r3.getBlockSize()     // Catch:{ Exception -> 0x0029 }
            long r2 = (long) r2
            long r6 = r6 * r2
            goto L_0x002a
        L_0x0028:
            r4 = r0
        L_0x0029:
            r6 = r0
        L_0x002a:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            r8 = 1
            return r8
        L_0x0034:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.tinker.TinkerUtils.checkRomSpaceEnough(long):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071 A[SYNTHETIC, Splitter:B:38:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b A[SYNTHETIC, Splitter:B:43:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copy(java.io.File r5, java.io.File r6) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.tinker.TinkerUtils.copy(java.io.File, java.io.File):boolean");
    }

    public static String getExceptionCauseString(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        while (th != null) {
            try {
                if (th.getCause() == null) {
                    break;
                }
                th = th.getCause();
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                throw th2;
            }
        }
        if (th != null) {
            th.printStackTrace(printStream);
        }
        String visualString = toVisualString(byteArrayOutputStream.toString());
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return visualString;
    }

    public static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            MessageDigest.getInstance(LL1i.OooO0O0);
            return new String(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isBackground() {
        return background;
    }

    public static boolean isGooglePlay() {
        return false;
    }

    public static boolean isXposedExists(Throwable th) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (className != null && className.contains("de.robv.android.xposed.XposedBridge")) {
                return true;
            }
        }
        return false;
    }

    public static byte[] readBytes(InputStream inputStream) {
        try {
            byte[] bArr = new byte[512];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] readJarEntry(File file, String str) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (!TextUtils.isEmpty(str)) {
                        return readJarEntry(new JarFile(file), str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void rollbackPatch(Context context) {
        Tinker.with(context).rollbackPatch();
    }

    public static void setBackground(boolean z) {
        background = z;
    }

    public static String toVisualString(String str) {
        char[] charArray;
        boolean z;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= charArray.length) {
                z = false;
                break;
            } else if (charArray[i] > 127) {
                charArray[i] = 0;
                z = true;
                break;
            } else {
                i++;
            }
        }
        return z ? new String(charArray, 0, i) : str;
    }

    public static byte[] readJarEntry(JarFile jarFile, String str) {
        if (jarFile != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return readJarEntry(jarFile, jarFile.getJarEntry(str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] readJarEntry(JarFile jarFile, JarEntry jarEntry) {
        if (!(jarFile == null || jarEntry == null)) {
            try {
                return readBytes(jarFile.getInputStream(jarEntry));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
