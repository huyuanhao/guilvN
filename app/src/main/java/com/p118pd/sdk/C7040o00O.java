package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.pd.sdk.o00O  reason: case insensitive filesystem */
public class C7040o00O {
    public final File OooO00o;
    public final File OooO0O0;

    public C7040o00O(@NonNull File file) {
        this.OooO00o = file;
        this.OooO0O0 = new File(file.getPath() + ".bak");
    }

    @NonNull
    public File OooO00o() {
        return this.OooO00o;
    }

    public void OooO0O0(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            OooO00o(fileOutputStream);
            try {
                fileOutputStream.close();
                this.OooO0O0.delete();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18309OooO00o() {
        this.OooO00o.delete();
        this.OooO0O0.delete();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public FileOutputStream m18308OooO00o() throws IOException {
        if (this.OooO00o.exists()) {
            if (this.OooO0O0.exists()) {
                this.OooO00o.delete();
            } else if (!this.OooO00o.renameTo(this.OooO0O0)) {
                String str = "Couldn't rename file " + this.OooO00o + " to backup file " + this.OooO0O0;
            }
        }
        try {
            return new FileOutputStream(this.OooO00o);
        } catch (FileNotFoundException unused) {
            if (this.OooO00o.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.OooO00o);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.OooO00o);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.OooO00o);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18310OooO00o(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            OooO00o(fileOutputStream);
            try {
                fileOutputStream.close();
                this.OooO00o.delete();
                this.OooO0O0.renameTo(this.OooO00o);
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public FileInputStream m18307OooO00o() throws FileNotFoundException {
        if (this.OooO0O0.exists()) {
            this.OooO00o.delete();
            this.OooO0O0.renameTo(this.OooO00o);
        }
        return new FileInputStream(this.OooO00o);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m18311OooO00o() throws IOException {
        FileInputStream OooO00o2 = m18307OooO00o();
        try {
            byte[] bArr = new byte[OooO00o2.available()];
            int i = 0;
            while (true) {
                int read = OooO00o2.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = OooO00o2.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            OooO00o2.close();
        }
    }

    public static boolean OooO00o(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
