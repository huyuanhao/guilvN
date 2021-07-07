package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextBlock implements Text {
    public Point[] cornerPoints;
    public zzae[] zzev;
    public List<Line> zzew;
    public String zzex;
    public Rect zzey;

    public TextBlock(SparseArray<zzae> sparseArray) {
        this.zzev = new zzae[sparseArray.size()];
        int i = 0;
        while (true) {
            zzae[] zzaeArr = this.zzev;
            if (i < zzaeArr.length) {
                zzaeArr[i] = sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    public Rect getBoundingBox() {
        if (this.zzey == null) {
            this.zzey = zzc.zza(this);
        }
        return this.zzey;
    }

    @Override // com.google.android.gms.vision.text.Text
    public List<? extends Text> getComponents() {
        if (this.zzev.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzew == null) {
            this.zzew = new ArrayList(this.zzev.length);
            for (zzae zzae : this.zzev) {
                this.zzew.add(new Line(zzae));
            }
        }
        return this.zzew;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Point[] getCornerPoints() {
        TextBlock textBlock;
        zzae[] zzaeArr;
        TextBlock textBlock2 = this;
        if (textBlock2.cornerPoints == null) {
            char c = 0;
            if (textBlock2.zzev.length == 0) {
                textBlock2.cornerPoints = new Point[0];
            } else {
                int i = Integer.MIN_VALUE;
                int i2 = Integer.MIN_VALUE;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MAX_VALUE;
                int i5 = 0;
                while (true) {
                    zzaeArr = textBlock2.zzev;
                    if (i5 >= zzaeArr.length) {
                        break;
                    }
                    zzy zzy = zzaeArr[i5].zzfd;
                    zzy zzy2 = zzaeArr[c].zzfd;
                    double sin = Math.sin(Math.toRadians((double) zzy2.zzfb));
                    double cos = Math.cos(Math.toRadians((double) zzy2.zzfb));
                    Point[] pointArr = new Point[4];
                    pointArr[c] = new Point(zzy.left, zzy.top);
                    pointArr[c].offset(-zzy2.left, -zzy2.top);
                    double d = (double) pointArr[c].x;
                    Double.isNaN(d);
                    double d2 = (double) pointArr[c].y;
                    Double.isNaN(d2);
                    int i6 = (int) ((d * cos) + (d2 * sin));
                    double d3 = (double) (-pointArr[0].x);
                    Double.isNaN(d3);
                    double d4 = d3 * sin;
                    double d5 = (double) pointArr[0].y;
                    Double.isNaN(d5);
                    int i7 = (int) (d4 + (d5 * cos));
                    pointArr[0].x = i6;
                    pointArr[0].y = i7;
                    pointArr[1] = new Point(zzy.width + i6, i7);
                    pointArr[2] = new Point(zzy.width + i6, zzy.height + i7);
                    pointArr[3] = new Point(i6, i7 + zzy.height);
                    i2 = i2;
                    for (int i8 = 0; i8 < 4; i8++) {
                        Point point = pointArr[i8];
                        i3 = Math.min(i3, point.x);
                        i = Math.max(i, point.x);
                        i4 = Math.min(i4, point.y);
                        i2 = Math.max(i2, point.y);
                    }
                    i5++;
                    c = 0;
                    textBlock2 = this;
                }
                zzy zzy3 = zzaeArr[0].zzfd;
                int i9 = zzy3.left;
                int i10 = zzy3.top;
                double sin2 = Math.sin(Math.toRadians((double) zzy3.zzfb));
                double cos2 = Math.cos(Math.toRadians((double) zzy3.zzfb));
                Point[] pointArr2 = {new Point(i3, i4), new Point(i, i4), new Point(i, i2), new Point(i3, i2)};
                for (int i11 = 0; i11 < 4; i11++) {
                    double d6 = (double) pointArr2[i11].x;
                    Double.isNaN(d6);
                    double d7 = (double) pointArr2[i11].y;
                    Double.isNaN(d7);
                    int i12 = (int) ((d6 * cos2) - (d7 * sin2));
                    double d8 = (double) pointArr2[i11].x;
                    Double.isNaN(d8);
                    double d9 = (double) pointArr2[i11].y;
                    Double.isNaN(d9);
                    pointArr2[i11].x = i12;
                    pointArr2[i11].y = (int) ((d8 * sin2) + (d9 * cos2));
                    pointArr2[i11].offset(i9, i10);
                }
                textBlock = this;
                textBlock.cornerPoints = pointArr2;
                return textBlock.cornerPoints;
            }
        }
        textBlock = textBlock2;
        return textBlock.cornerPoints;
    }

    public String getLanguage() {
        String str = this.zzex;
        if (str != null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        zzae[] zzaeArr = this.zzev;
        for (zzae zzae : zzaeArr) {
            hashMap.put(zzae.zzex, Integer.valueOf((hashMap.containsKey(zzae.zzex) ? ((Integer) hashMap.get(zzae.zzex)).intValue() : 0) + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(hashMap.entrySet(), new zza(this))).getKey();
        this.zzex = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzex = "und";
        }
        return this.zzex;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getValue() {
        zzae[] zzaeArr = this.zzev;
        if (zzaeArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zzaeArr[0].zzfg);
        for (int i = 1; i < this.zzev.length; i++) {
            sb.append("\n");
            sb.append(this.zzev[i].zzfg);
        }
        return sb.toString();
    }
}
