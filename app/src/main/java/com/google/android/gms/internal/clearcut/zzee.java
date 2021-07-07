package com.google.android.gms.internal.clearcut;

public final class zzee {
    public final String info;
    public int position = 0;

    public zzee(String str) {
        this.info = str;
    }

    public final boolean hasNext() {
        return this.position < this.info.length();
    }

    public final int next() {
        String str = this.info;
        int i = this.position;
        this.position = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.info;
            int i4 = this.position;
            this.position = i4 + 1;
            char charAt2 = str2.charAt(i4);
            if (charAt2 < 55296) {
                return i2 | (charAt2 << i3);
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
        }
    }
}
