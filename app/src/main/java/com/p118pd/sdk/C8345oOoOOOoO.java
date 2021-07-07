package com.p118pd.sdk;

import android.os.Environment;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOOoO  reason: case insensitive filesystem */
public class C8345oOoOOOoO {
    public static final String OooO00o = "MPChart-FileUtils";

    public static List<Entry> OooO00o(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split("#");
                if (split.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(split[0]), (float) Integer.parseInt(split[1])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = Float.parseFloat(split[i]);
                    }
                    arrayList.add(new BarEntry((float) Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
        } catch (IOException e) {
            e.toString();
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[SYNTHETIC, Splitter:B:30:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.github.mikephil.charting.data.Entry> OooO0O0(android.content.res.AssetManager r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8345oOoOOOoO.OooO0O0(android.content.res.AssetManager, java.lang.String):java.util.List");
    }

    public static void OooO00o(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.toString();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry entry : list) {
                bufferedWriter.append((CharSequence) (entry.OooO00o() + "#" + entry.OooO0O0()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e2) {
            e2.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[SYNTHETIC, Splitter:B:23:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.github.mikephil.charting.data.BarEntry> OooO00o(android.content.res.AssetManager r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8345oOoOOOoO.OooO00o(android.content.res.AssetManager, java.lang.String):java.util.List");
    }
}
