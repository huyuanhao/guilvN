package com.p118pd.sdk;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.o00o0OO  reason: case insensitive filesystem */
public class C7159o00o0OO extends AbstractC7158o00o0O0O {
    public File OooO00o;

    public C7159o00o0OO(@Nullable AbstractC7158o00o0O0O o00o0o0o, File file) {
        super(o00o0o0o);
        this.OooO00o = file;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    public AbstractC7158o00o0O0O OooO00o(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + C9058ooOoOoOO.OooOO0 + extensionFromMimeType;
        }
        File file = new File(this.OooO00o, str2);
        try {
            file.createNewFile();
            return new C7159o00o0OO(this, file);
        } catch (IOException e) {
            String str3 = "Failed to createFile: " + e;
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18577OooO0O0() {
        if (this.OooO00o.isDirectory()) {
            return null;
        }
        return OooO00o(this.OooO00o.getName());
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0OO() {
        OooO00o(this.OooO00o);
        return this.OooO00o.delete();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0Oo() {
        return this.OooO00o.exists();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o() {
        return this.OooO00o.isFile();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o0() {
        return this.OooO00o.isDirectory();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0oO() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO0O0() {
        return this.OooO00o.length();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18578OooO0O0() {
        return this.OooO00o.canWrite();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7158o00o0O0O m18572OooO00o(String str) {
        File file = new File(this.OooO00o, str);
        if (file.isDirectory() || file.mkdir()) {
            return new C7159o00o0OO(this, file);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Uri m18571OooO00o() {
        return Uri.fromFile(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18573OooO00o() {
        return this.OooO00o.getName();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO00o() {
        return this.OooO00o.lastModified();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18574OooO00o() {
        return this.OooO00o.canRead();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7158o00o0O0O[] m18576OooO00o() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.OooO00o.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new C7159o00o0OO(this, file));
            }
        }
        return (AbstractC7158o00o0O0O[]) arrayList.toArray(new AbstractC7158o00o0O0O[arrayList.size()]);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18575OooO00o(String str) {
        File file = new File(this.OooO00o.getParentFile(), str);
        if (!this.OooO00o.renameTo(file)) {
            return false;
        }
        this.OooO00o = file;
        return true;
    }

    public static String OooO00o(String str) {
        String mimeTypeFromExtension;
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase())) == null) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static boolean OooO00o(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= OooO00o(file2);
                }
                if (!file2.delete()) {
                    String str = "Failed to delete " + file2;
                    z = false;
                }
            }
        }
        return z;
    }
}
