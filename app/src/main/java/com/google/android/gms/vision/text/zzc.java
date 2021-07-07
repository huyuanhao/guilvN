package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzy;

public final class zzc {
    public static Rect zza(Text text) {
        Point[] cornerPoints = text.getCornerPoints();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : cornerPoints) {
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    public static Point[] zza(zzy zzy) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) zzy.zzfb));
        double cos = Math.cos(Math.toRadians((double) zzy.zzfb));
        pointArr[0] = new Point(zzy.left, zzy.top);
        double d = (double) zzy.left;
        int i = zzy.width;
        double d2 = (double) i;
        Double.isNaN(d2);
        Double.isNaN(d);
        double d3 = (double) zzy.top;
        double d4 = (double) i;
        Double.isNaN(d4);
        Double.isNaN(d3);
        pointArr[1] = new Point((int) (d + (d2 * cos)), (int) (d3 + (d4 * sin)));
        double d5 = (double) pointArr[1].x;
        int i2 = zzy.height;
        double d6 = (double) i2;
        Double.isNaN(d6);
        Double.isNaN(d5);
        int i3 = (int) (d5 - (d6 * sin));
        double d7 = (double) pointArr[1].y;
        double d8 = (double) i2;
        Double.isNaN(d8);
        Double.isNaN(d7);
        pointArr[2] = new Point(i3, (int) (d7 + (d8 * cos)));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
