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

/* renamed from: com.pd.sdk.oo0oooo0  reason: case insensitive filesystem */
public class C8787oo0oooo0 {
    public static final String OooO00o = "SimpleMMapWriter";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f21988OooO00o = true;
    public static final int OooO0Oo = 1024;
    public static final int OooO0o = 100;
    public static final int OooO0o0 = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f21989OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f21990OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RandomAccessFile f21991OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MappedByteBuffer f21992OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public File f21993OooO0O0;
    public int OooO0OO;

    public C8787oo0oooo0() {
        this(0, 0);
    }

    private int OooO0O0() {
        int position = this.f21992OooO00o.position();
        if (position < 4) {
            position = 4;
        }
        this.f21992OooO00o.position(0);
        this.f21992OooO00o.putInt(position);
        this.f21992OooO00o.position(position);
        return position;
    }

    private void OooO0OO() {
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        if (i >= 100 && m20425OooO00o()) {
            this.f21992OooO00o.force();
            this.OooO0OO = 0;
            OooO0O0("flush to mapped file");
        }
    }

    private void OooO0OO(String str) {
    }

    private void OooO0Oo() {
        if (!m20425OooO00o()) {
            OooO0OO("SimpleMappedByteBuffer is invalid when do flush");
        } else if (this.f21993OooO0O0 == null) {
            OooO0OO("dest file is null when do flush");
        } else {
            this.f21992OooO00o.position(0);
            int i = this.f21992OooO00o.getInt();
            if (i < 4 || i >= this.f21992OooO00o.limit()) {
                i = OooO0O0();
            }
            if (i <= 4) {
                OooO0O0("no need to flush, offset=" + i);
                return;
            }
            byte[] bArr = new byte[(i - 4)];
            this.f21992OooO00o.position(4);
            this.f21992OooO00o.get(bArr);
            C8793ooO0000.OooO00o(bArr, this.f21993OooO0O0.getAbsolutePath());
            this.f21992OooO00o.position(0);
            int OooO0O02 = OooO0O0();
            this.f21992OooO00o.force();
            this.f21992OooO00o.position(OooO0O02);
            OooO0O0("flush file success, new offset=" + OooO0O02);
        }
    }

    public boolean OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (m20425OooO00o()) {
            m20426OooO00o();
        }
        try {
            File OooO00o2 = C8793ooO0000.OooO00o(str2);
            this.f21993OooO0O0 = OooO00o2;
            if (OooO00o2 == null) {
                OooO0OO("dest file path invalid, path=" + str2);
                return false;
            }
            File OooO00o3 = C8793ooO0000.OooO00o(str);
            this.f21990OooO00o = OooO00o3;
            if (OooO00o3 == null) {
                OooO0OO("mapped file path invalid, path=" + str);
                return false;
            }
            OooO0O0("try to open mapped file, path=" + this.f21990OooO00o.getCanonicalPath());
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f21990OooO00o, "rw");
            this.f21991OooO00o = randomAccessFile;
            if (randomAccessFile.length() <= 0) {
                this.f21991OooO00o.setLength((long) this.f21989OooO00o);
            }
            this.f21992OooO00o = this.f21991OooO00o.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, (long) this.f21989OooO00o);
            this.f21992OooO00o.position(OooO00o());
            OooO0Oo();
            OooO0O0("open file success, path=" + this.f21990OooO00o.getCanonicalPath() + ", offset=" + this.f21992OooO00o.position() + ", file length=" + this.f21990OooO00o.length());
            return true;
        } catch (IOException e) {
            OooO0OO("open file error, e=" + e.getMessage());
            return true;
        }
    }

    public C8787oo0oooo0(int i, int i2) {
        this.OooO0OO = 0;
        this.f21989OooO00o = (i <= 0 || i <= i2) ? 131072 : i;
        this.OooO0O0 = (i2 <= 0 || i2 >= i) ? 65536 : i2;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20427OooO0O0() {
        if (m20425OooO00o()) {
            OooO0O0("force flush to dest file");
            OooO0Oo();
        }
    }

    private void OooO0O0(String str) {
        Log.i(OooO00o, str);
    }

    public void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!m20425OooO00o()) {
                OooO0OO("SimpleMappedByteBuffer is invalid when do write");
            } else if (this.f21990OooO00o == null) {
                OooO0OO("mapped file is null, write failed!");
            } else if (this.f21993OooO0O0 == null) {
                OooO0OO("dest file is null, write failed!");
            } else {
                try {
                    byte[] bytes = str.getBytes(StringUtils.UTF8);
                    for (int i = 0; i < bytes.length; i++) {
                        if (bytes[i] == 0) {
                            bytes[i] = 32;
                        }
                    }
                    if (bytes.length >= this.f21992OooO00o.remaining()) {
                        OooO0OO("write content is more larger than mapped buffer's remaining size, append to dest file directly, content size=" + bytes.length + ", buffer remaining=" + this.f21992OooO00o.remaining() + ", buffer limit=" + this.f21992OooO00o.limit() + ", content=" + str);
                        OooO00o(bytes);
                        return;
                    }
                    int position = this.f21992OooO00o.position();
                    try {
                        this.f21992OooO00o.put(bytes);
                        OooO0O0();
                        OooO0OO();
                        StringBuilder sb = new StringBuilder();
                        sb.append("write position from ");
                        sb.append(position);
                        sb.append(" to ");
                        sb.append(this.f21992OooO00o.position() - 1);
                        sb.append(C8932ooOOO0o.OooO0OO);
                        sb.append(this.f21992OooO00o.limit());
                        sb.append(", add ");
                        sb.append(bytes.length);
                        OooO0O0(sb.toString());
                        if (this.f21992OooO00o.position() >= this.OooO0O0) {
                            OooO0O0("mapped buffer should flush to dest file, position=" + this.f21992OooO00o.position() + C8932ooOOO0o.OooO0OO + this.f21992OooO00o.limit());
                            OooO0Oo();
                        }
                    } catch (Exception e) {
                        OooO0OO("write MappedByteBuffer error, e=" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    OooO0OO("content get bytes error! give up to write, e=" + e2.getMessage());
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20426OooO00o() {
        if (this.f21992OooO00o != null) {
            m20427OooO0O0();
            this.f21992OooO00o.clear();
            this.f21992OooO00o = null;
        }
        C8793ooO0000.OooO00o(this.f21991OooO00o);
        OooO0O0("file close success");
    }

    private void OooO00o(byte[] bArr) {
        if (bArr != null) {
            OooO0Oo();
            File file = this.f21993OooO0O0;
            if (file == null) {
                OooO0OO("dest file is null when do directly append");
                return;
            }
            boolean OooO00o2 = C8793ooO0000.OooO00o(bArr, file.getAbsolutePath());
            StringBuilder sb = new StringBuilder();
            sb.append("append to dest file directly ");
            sb.append(OooO00o2 ? "success" : C7533o0OoooO0.OooO0O0);
            OooO0O0(sb.toString());
        }
    }

    private int OooO00o() {
        this.f21992OooO00o.position(0);
        int i = this.f21992OooO00o.getInt();
        if (i < 4 || i >= this.f21992OooO00o.limit()) {
            this.f21992OooO00o.position(0);
            return OooO0O0();
        }
        this.f21992OooO00o.position(i);
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20425OooO00o() {
        return (this.f21991OooO00o == null || this.f21992OooO00o == null) ? false : true;
    }
}
