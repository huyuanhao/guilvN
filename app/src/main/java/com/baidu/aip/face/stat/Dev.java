package com.baidu.aip.face.stat;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.p118pd.sdk.C8876ooO0oOOo;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Dev {
    public static final String INSTALLATION = "INSTALLATION";
    public String brand = "";
    public boolean firstRun = false;
    public String packagename = "";
    public String sdkVersion = "2.1.0.0";
    public String sysVersion = "";
    public String uniqueID = "";

    private String generateUniquePsuedoID(Context context) {
        String str;
        String str2 = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10);
        try {
            str = Build.class.getField("SERIAL").get(null).toString();
        } catch (Exception unused) {
            str = UUID.randomUUID().toString();
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (C8876ooO0oOOo.OooO00o.equals(string)) {
            string = UUID.randomUUID().toString();
        }
        return md5(str + string + str2);
    }

    public static String md5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String readInstallationFile(java.io.File r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = "r"
            r1.<init>(r5, r2)     // Catch:{ Exception -> 0x0023 }
            long r2 = r1.length()     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            int r5 = (int) r2     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.readFully(r5)     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r0.<init>(r5)     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.close()
            goto L_0x002e
        L_0x001b:
            r5 = move-exception
            r0 = r1
            goto L_0x002f
        L_0x001e:
            r5 = move-exception
            r0 = r1
            goto L_0x0024
        L_0x0021:
            r5 = move-exception
            goto L_0x002f
        L_0x0023:
            r5 = move-exception
        L_0x0024:
            r5.printStackTrace()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x002c
            r0.close()
        L_0x002c:
            java.lang.String r0 = ""
        L_0x002e:
            return r0
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()
        L_0x0034:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.aip.face.stat.Dev.readInstallationFile(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042 A[SYNTHETIC, Splitter:B:26:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeInstallationFile(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0027 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0027 }
            java.lang.String r2 = "INSTALLATION"
            r1.<init>(r4, r2)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0027 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0027 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x0027 }
            byte[] r5 = r5.getBytes()     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x001f, all -> 0x001c }
            r4.write(r5)     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x001f, all -> 0x001c }
            r4.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003f
        L_0x001c:
            r5 = move-exception
            r0 = r4
            goto L_0x0040
        L_0x001f:
            r5 = move-exception
            r0 = r4
            goto L_0x0028
        L_0x0022:
            r5 = move-exception
            r0 = r4
            goto L_0x0032
        L_0x0025:
            r5 = move-exception
            goto L_0x0040
        L_0x0027:
            r5 = move-exception
        L_0x0028:
            r5.printStackTrace()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x003f
            r0.close()
            goto L_0x003f
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            r5.printStackTrace()
            if (r0 == 0) goto L_0x003f
            r0.close()
            goto L_0x003f
        L_0x003b:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003f:
            return
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.aip.face.stat.Dev.writeInstallationFile(android.content.Context, java.lang.String):void");
    }

    public String getBrand() {
        return this.brand;
    }

    public boolean getFirstRun() {
        return this.firstRun;
    }

    public String getPackagename() {
        return this.packagename;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSysVersion() {
        return this.sysVersion;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }

    public synchronized String getUniqueIdFromFile(Context context) {
        if (TextUtils.isEmpty(this.uniqueID)) {
            try {
                this.uniqueID = readInstallationFile(new File(context.getFilesDir(), INSTALLATION));
            } catch (IOException e) {
                e.printStackTrace();
                this.uniqueID = "uncreate";
            }
        }
        return this.uniqueID;
    }

    public void init(Context context) {
        if (context != null) {
            this.brand = Build.MODEL.replace(" ", "");
            this.sysVersion = Build.VERSION.RELEASE;
            this.packagename = context.getPackageName();
            String uniqueIdFromFile = getUniqueIdFromFile(context);
            this.uniqueID = uniqueIdFromFile;
            if (TextUtils.isEmpty(uniqueIdFromFile)) {
                this.firstRun = true;
                String generateUniquePsuedoID = generateUniquePsuedoID(context);
                this.uniqueID = generateUniquePsuedoID;
                writeInstallationFile(context, generateUniquePsuedoID);
            }
        }
    }

    public void setFirstRun(boolean z) {
        this.firstRun = z;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }
}
