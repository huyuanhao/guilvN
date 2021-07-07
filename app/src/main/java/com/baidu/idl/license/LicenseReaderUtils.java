package com.baidu.idl.license;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LicenseReaderUtils {
    public static final String TAG = "License-SDK";

    public static InputStream get_local_license_file_inputstream(Context context, String str) {
        if (context == null) {
            return null;
        }
        FileInputStream read_license_from_data = read_license_from_data(context, str);
        return read_license_from_data == null ? read_license_from_asset(context, str) : read_license_from_data;
    }

    public static ArrayList<String> read_license_content(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static InputStream read_license_from_asset(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getAssets().open(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            String str2 = "read_license_from_asset Exception " + e2.getMessage();
            e2.printStackTrace();
            return null;
        }
    }

    public static FileInputStream read_license_from_data(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            File dir = context.getDir(str, 0);
            if (dir != null && dir.exists()) {
                if (dir.isFile()) {
                    if (dir.length() == 0) {
                        return null;
                    }
                    return new FileInputStream(dir);
                }
            }
            return null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            String str2 = "read_license_from_data Exception " + e2.getMessage();
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007b A[SYNTHETIC, Splitter:B:47:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean write_license_content(android.content.Context r3, java.lang.String r4, java.util.ArrayList<java.lang.String> r5) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.license.LicenseReaderUtils.write_license_content(android.content.Context, java.lang.String, java.util.ArrayList):boolean");
    }
}
