package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.zxing.common.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

@Deprecated
/* renamed from: com.pd.sdk.oo0oooO0  reason: case insensitive filesystem */
public class C8782oo0oooO0 {
    public static final boolean OooO00o = true;
    public static final String OooO0O0 = "MMapWriter2";
    public static final int OooO0Oo = 1024;
    public static final int OooO0o = 1048576;
    public static final int OooO0o0 = 1048576;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f21974OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8784oo0oooo f21975OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f21976OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RandomAccessFile f21977OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21978OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MappedByteBuffer f21979OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f21980OooO0O0;
    public final int OooO0OO;

    public C8782oo0oooO0() {
        this(0, 0, 0);
    }

    private void OooO0O0(String str) {
        AbstractC8784oo0oooo oo0oooo = this.f21975OooO00o;
        if (oo0oooo != null) {
            oo0oooo.OooO0OO(OooO0O0, str);
        } else {
            Log.i(OooO0O0, str);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20424OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m20422OooO00o()) {
            m20423OooO00o();
        }
        try {
            File file = new File(str);
            this.f21978OooO00o = str;
            this.f21976OooO00o = file;
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                OooO0O0("file's parent dir is null, path=" + file.getCanonicalPath());
                return false;
            }
            if (parentFile.isDirectory() && !parentFile.exists()) {
                OooO0O0("make dir, path=" + parentFile.getCanonicalPath() + ", result=" + parentFile.mkdirs());
            }
            if (file.exists() || file.createNewFile()) {
                OooO0O0("try to open file, path=" + file.getCanonicalPath());
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                this.f21977OooO00o = randomAccessFile;
                if (randomAccessFile.length() <= 0) {
                    this.f21977OooO00o.setLength((long) this.f21974OooO00o);
                }
                this.f21979OooO00o = this.f21977OooO00o.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, (long) this.f21974OooO00o);
                int OooO00o2 = OooO00o(OooO00o());
                OooO0O0("open file success, path=" + file.getCanonicalPath() + ", offset=" + OooO00o2 + ", length=" + file.length());
                return true;
            }
            OooO0O0("can not create file, path=" + file.getCanonicalPath());
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            OooO0O0("open file error, e=" + e.getMessage());
            return true;
        }
    }

    public C8782oo0oooO0(int i, int i2, int i3) {
        this.f21974OooO00o = (i <= 0 || i <= i2) ? 8388608 : i;
        this.f21980OooO0O0 = (i2 <= 0 || i2 >= i) ? 4194304 : i2;
        this.OooO0OO = (i3 <= 0 || i3 >= i2) ? 2048 : i3;
    }

    public void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = this.f21976OooO00o;
            if (file == null || !file.exists()) {
                OooO0O0("dest file not exist reopen file");
                m20424OooO00o(this.f21978OooO00o);
            }
            if (!m20422OooO00o()) {
                OooO0O0("MMapWriter is invalid when do write");
                return;
            }
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
                int position = this.f21979OooO00o.position();
                int i2 = this.f21974OooO00o;
                if (position >= i2 - this.OooO0OO || position + length >= i2 - 1) {
                    OooO0O0("mapped buffer has nearly used up, position=" + this.f21979OooO00o.position() + C8932ooOOO0o.OooO0OO + this.f21974OooO00o + ", will add " + length + ", begin to shrink...");
                    OooO00o(position);
                }
                this.f21979OooO00o.put(bArr);
                OooO0O0("write position " + this.f21979OooO00o.position() + C8932ooOOO0o.OooO0OO + this.f21974OooO00o + ", add " + length);
                String substring = str.substring(0, length + -2);
                StringBuilder sb = new StringBuilder();
                sb.append("write content : ");
                sb.append(substring);
                OooO0O0(sb.toString());
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20423OooO00o() {
        MappedByteBuffer mappedByteBuffer = this.f21979OooO00o;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            this.f21979OooO00o.clear();
            this.f21979OooO00o = null;
        }
        C8793ooO0000.OooO00o(this.f21977OooO00o);
        OooO0O0("file close success");
    }

    private int OooO00o() {
        int i = this.f21974OooO00o - 1;
        byte[] bArr = null;
        boolean z = false;
        while (!z) {
            int position = this.f21979OooO00o.position();
            int i2 = this.f21974OooO00o;
            if (position > i2) {
                break;
            }
            int position2 = i2 - this.f21979OooO00o.position();
            if (position2 >= 1048576) {
                position2 = 1048576;
            }
            if (bArr == null || bArr.length != position2) {
                bArr = new byte[position2];
            }
            this.f21979OooO00o.get(bArr);
            int i3 = 0;
            while (true) {
                if (i3 >= bArr.length) {
                    break;
                } else if (bArr[i3] == 0) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                i = (this.f21979OooO00o.position() - bArr.length) + i3;
            }
        }
        this.f21979OooO00o.position(i);
        return i;
    }

    private int OooO00o(int i) {
        if (!m20422OooO00o()) {
            OooO0O0("MMapWriter is invalid when do shrink");
            return i;
        }
        int i2 = this.f21974OooO00o;
        int i3 = this.OooO0OO;
        if (i < i2 - i3) {
            return i;
        }
        this.f21979OooO00o.position((i2 - i3) - this.f21980OooO0O0);
        int i4 = 0;
        while (true) {
            if (!(this.f21979OooO00o.get() == 13 && this.f21979OooO00o.get() == 10) && i4 <= 1024) {
                i4++;
            }
        }
        int position = this.f21979OooO00o.position();
        int i5 = i - 1;
        this.f21979OooO00o.position(position);
        byte[] bArr = null;
        int i6 = 0;
        while (true) {
            int i7 = 1048576;
            if (position > i5) {
                break;
            }
            int i8 = (i5 - position) + 1;
            if (i8 < 1048576) {
                i7 = i8;
            }
            if (bArr == null || bArr.length != i7) {
                bArr = new byte[i7];
            }
            this.f21979OooO00o.get(bArr);
            position = this.f21979OooO00o.position();
            this.f21979OooO00o.position(i6);
            this.f21979OooO00o.put(bArr);
            i6 = this.f21979OooO00o.position();
            this.f21979OooO00o.position(position);
        }
        this.f21979OooO00o.position(i6);
        while (this.f21979OooO00o.position() <= i5) {
            int position2 = (i5 - this.f21979OooO00o.position()) + 1;
            if (position2 >= 1048576) {
                position2 = 1048576;
            }
            if (bArr == null || bArr.length != position2) {
                byte[] bArr2 = new byte[position2];
                Arrays.fill(bArr2, (byte) 0);
                bArr = bArr2;
            }
            this.f21979OooO00o.put(bArr);
        }
        this.f21979OooO00o.force();
        this.f21979OooO00o.position(i6);
        OooO0O0("shrink file success, new offset=" + this.f21979OooO00o.position());
        return this.f21979OooO00o.position();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20422OooO00o() {
        return (this.f21977OooO00o == null || this.f21979OooO00o == null) ? false : true;
    }

    public void OooO00o(AbstractC8784oo0oooo oo0oooo) {
        this.f21975OooO00o = oo0oooo;
    }
}
