package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzjw {
    public static final int zzadq = 11;
    public static final int zzadr = 12;
    public static final int zzads = 16;
    public static final int zzadt = 26;
    public static final long[] zzadu = new long[0];
    public static final float[] zzadv = new float[0];
    public static final double[] zzadw = new double[0];
    public static final boolean[] zzadx = new boolean[0];
    public static final String[] zzady = new String[0];
    public static final byte[][] zzadz = new byte[0][];
    public static final byte[] zzaea = new byte[0];
    public static final int[] zzzb = new int[0];

    public static final int zzb(zzjk zzjk, int i) throws IOException {
        int position = zzjk.getPosition();
        zzjk.zzal(i);
        int i2 = 1;
        while (zzjk.zzdq() == i) {
            zzjk.zzal(i);
            i2++;
        }
        zzjk.zzw(position, i);
        return i2;
    }
}
