package com.baidu.idl.face.platform.utils;

public class ImageExif {
    public static final String TAG = "CameraExif";

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        if (r3 <= 8) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        r8 = pack(r11, r1, 4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
        if (r8 == 1229531648) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        if (r8 == 1296891946) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r8 != 1229531648) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        r4 = pack(r11, r1 + 4, 4, r8) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (r4 < 10) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0084, code lost:
        if (r4 <= r3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0087, code lost:
        r1 = r1 + r4;
        r3 = r3 - r4;
        r4 = pack(r11, r1 - 2, 2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008f, code lost:
        r9 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
        if (r4 <= 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0095, code lost:
        if (r3 < 12) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (pack(r11, r1, 2, r8) != 274) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        r11 = pack(r11, r1 + 8, 2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a4, code lost:
        if (r11 == 1) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        if (r11 == 3) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00aa, code lost:
        if (r11 == 6) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ac, code lost:
        if (r11 == 8) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ae, code lost:
        android.util.Log.i(com.baidu.idl.face.platform.utils.ImageExif.TAG, "Unsupported orientation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b3, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b4, code lost:
        return 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b7, code lost:
        return 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ba, code lost:
        return 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bd, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00be, code lost:
        r1 = r1 + 12;
        r3 = r3 - 12;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c4, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c5, code lost:
        android.util.Log.i(com.baidu.idl.face.platform.utils.ImageExif.TAG, "Orientation not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getOrientation(byte[] r11) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.ImageExif.getOrientation(byte[]):int");
    }

    public static int pack(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            if (i >= 0 && bArr != null && i < bArr.length) {
                i4 = (i4 << 8) | (bArr[i] & 255);
            }
            i += i3;
            i2 = i5;
        }
    }
}
