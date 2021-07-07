package com.p118pd.sdk;

import android.text.TextUtils;
import com.google.zxing.common.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

@Deprecated
/* renamed from: com.pd.sdk.oo0oooO  reason: case insensitive filesystem */
public class C8781oo0oooO {
    public static final int OooO = 100;
    public static final String OooO00o = "MMapWriter";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f21968OooO00o = false;
    public static final int OooO0o = 1048576;
    public static final int OooO0o0 = 1024;
    public static final int OooO0oO = 4;
    public static final int OooO0oo = 1048576;
    public static final int OooOO0 = 8388608;
    public static final int OooOO0O = 4194304;
    public static final int OooOO0o = 2048;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f21969OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8784oo0oooo f21970OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f21971OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RandomAccessFile f21972OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MappedByteBuffer f21973OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public int OooO0Oo = 0;

    public C8781oo0oooO(int i, int i2, int i3) {
        this.f21969OooO00o = (i <= 0 || i <= i2) ? 8388608 : i;
        this.OooO0O0 = (i2 <= 0 || i2 >= i) ? 4194304 : i2;
        this.OooO0OO = (i3 <= 0 || i3 >= i2) ? 2048 : i3;
    }

    private int OooO0O0() {
        int position = this.f21973OooO00o.position();
        if (position < 4) {
            position = 4;
        }
        this.f21973OooO00o.position(0);
        this.f21973OooO00o.putInt(position);
        this.f21973OooO00o.position(position);
        return position;
    }

    private void OooO0O0(String str) {
    }

    private void OooO0OO() {
        int i = this.OooO0Oo + 1;
        this.OooO0Oo = i;
        if (i >= 100 && m20418OooO00o()) {
            this.f21973OooO00o.force();
            this.OooO0Oo = 0;
            OooO0O0("MappedByteBuffer flush ");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20420OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m20418OooO00o()) {
            m20419OooO00o();
        }
        try {
            File OooO00o2 = C8793ooO0000.OooO00o(str);
            this.f21971OooO00o = OooO00o2;
            if (OooO00o2 == null) {
                OooO0O0("file path is invalid, path=" + str);
                return false;
            }
            OooO0O0("try to open file, path=" + this.f21971OooO00o.getCanonicalPath());
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f21971OooO00o, "rw");
            this.f21972OooO00o = randomAccessFile;
            if (randomAccessFile.length() <= 0) {
                this.f21972OooO00o.setLength((long) this.f21969OooO00o);
            }
            this.f21973OooO00o = this.f21972OooO00o.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, (long) this.f21969OooO00o);
            int OooO00o3 = OooO00o();
            OooO00o(OooO00o3, this.f21969OooO00o - 1);
            this.f21973OooO00o.position(OooO00o3);
            int OooO00o4 = OooO00o(OooO00o3);
            OooO0O0("open file success, path=" + this.f21971OooO00o.getCanonicalPath() + ", offset=" + OooO00o4 + ", length=" + this.f21971OooO00o.length());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            OooO0O0("open file error, e=" + e.getMessage());
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20421OooO0O0() {
        if (m20418OooO00o()) {
            this.f21973OooO00o.force();
            this.OooO0Oo = 0;
            OooO0O0("MappedByteBuffer force flush ");
        }
    }

    public void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f21971OooO00o == null) {
                OooO0O0("dest file is null, write failed");
            } else if (!m20418OooO00o()) {
                OooO0O0("MMapWriter is invalid when do write");
            } else {
                byte[] bArr = null;
                try {
                    bArr = str.getBytes(StringUtils.UTF8);
                    for (int i = 0; i < bArr.length; i++) {
                        if (bArr[i] == 0) {
                            bArr[i] = 32;
                        }
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                if (bArr != null) {
                    int length = bArr.length;
                    int position = this.f21973OooO00o.position();
                    int i2 = this.f21969OooO00o;
                    if (position >= i2 - this.OooO0OO || position + length >= i2 - 1) {
                        OooO0O0("mapped buffer has nearly used up, position=" + this.f21973OooO00o.position() + C8932ooOOO0o.OooO0OO + this.f21969OooO00o + ", will add " + length + ", begin to shrink...");
                        OooO00o(position);
                    }
                    this.f21973OooO00o.put(bArr);
                    OooO0O0();
                    OooO0OO();
                    OooO0O0("write position " + this.f21973OooO00o.position() + C8932ooOOO0o.OooO0OO + this.f21969OooO00o + ", add " + length);
                    String substring = str.substring(0, str.length() + -2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("write content : ");
                    sb.append(substring);
                    OooO0O0(sb.toString());
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20419OooO00o() {
        MappedByteBuffer mappedByteBuffer = this.f21973OooO00o;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            this.f21973OooO00o.clear();
            this.f21973OooO00o = null;
        }
        C8793ooO0000.OooO00o(this.f21972OooO00o);
        OooO0O0("file close success");
    }

    private int OooO00o(int i) {
        if (!m20418OooO00o()) {
            OooO0O0("MMapWriter is invalid when do shrink");
            return i;
        }
        int i2 = this.f21969OooO00o;
        int i3 = this.OooO0OO;
        if (i < i2 - i3) {
            return i;
        }
        int i4 = (i2 - i3) - this.OooO0O0;
        int i5 = 0;
        this.f21973OooO00o.position(i4);
        while (true) {
            if (!(this.f21973OooO00o.get() == 13 && this.f21973OooO00o.get() == 10) && i5 <= 1024) {
                i5++;
            }
        }
        int position = this.f21973OooO00o.position();
        int i6 = i - 1;
        int i7 = 4;
        this.f21973OooO00o.position(position);
        byte[] bArr = null;
        while (position <= i6) {
            int i8 = (i6 - position) + 1;
            if (i8 >= 1048576) {
                i8 = 1048576;
            }
            if (bArr == null || bArr.length != i8) {
                bArr = new byte[i8];
            }
            this.f21973OooO00o.get(bArr);
            position = this.f21973OooO00o.position();
            this.f21973OooO00o.position(i7);
            this.f21973OooO00o.put(bArr);
            i7 = this.f21973OooO00o.position();
            OooO0O0();
            this.f21973OooO00o.position(position);
        }
        OooO00o(i7, i6);
        this.f21973OooO00o.force();
        this.f21973OooO00o.position(i7);
        OooO0O0("shrink file success, new offset=" + this.f21973OooO00o.position());
        return this.f21973OooO00o.position();
    }

    private void OooO00o(int i, int i2) {
        if (i >= 4) {
            this.f21973OooO00o.position(i);
            byte[] bArr = null;
            while (this.f21973OooO00o.position() <= i2) {
                int position = (i2 - this.f21973OooO00o.position()) + 1;
                if (position >= 1048576) {
                    position = 1048576;
                }
                if (bArr == null || bArr.length != position) {
                    bArr = new byte[position];
                    Arrays.fill(bArr, (byte) 0);
                }
                this.f21973OooO00o.put(bArr);
            }
            OooO0O0("write EOF from " + i + " to " + i2);
        }
    }

    private int OooO00o() {
        this.f21973OooO00o.position(0);
        int i = this.f21973OooO00o.getInt();
        if (i < 4 || i >= this.f21969OooO00o) {
            this.f21973OooO00o.position(0);
            return OooO0O0();
        }
        this.f21973OooO00o.position(i);
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20418OooO00o() {
        return (this.f21972OooO00o == null || this.f21973OooO00o == null) ? false : true;
    }

    public void OooO00o(AbstractC8784oo0oooo oo0oooo) {
        this.f21970OooO00o = oo0oooo;
    }
}
