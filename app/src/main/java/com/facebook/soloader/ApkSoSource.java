package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.ExtractFromZipSoSource;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

public class ApkSoSource extends ExtractFromZipSoSource {
    public static final byte APK_SO_SOURCE_SIGNATURE_VERSION = 2;
    public static final byte LIBS_DIR_DOESNT_EXIST = 1;
    public static final byte LIBS_DIR_DONT_CARE = 0;
    public static final byte LIBS_DIR_SNAPSHOT = 2;
    public static final int PREFER_ANDROID_LIBS_DIRECTORY = 1;
    public static final String TAG = "ApkSoSource";
    public final int mFlags;

    public class ApkUnpacker extends ExtractFromZipSoSource.ZipUnpacker {
        public final int mFlags;
        public File mLibDir;

        public ApkUnpacker(ExtractFromZipSoSource extractFromZipSoSource) throws IOException {
            super(extractFromZipSoSource);
            this.mLibDir = new File(ApkSoSource.this.mContext.getApplicationInfo().nativeLibraryDir);
            this.mFlags = ApkSoSource.this.mFlags;
        }

        @Override // com.facebook.soloader.ExtractFromZipSoSource.ZipUnpacker
        public boolean shouldExtract(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(ApkSoSource.this.mCorruptedLib)) {
                ApkSoSource.this.mCorruptedLib = null;
                String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.mFlags & 1) == 0) {
                String str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.mLibDir, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        String str3 = "not allowing consideration of " + name + ": deferring to libdir";
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public ApkSoSource(Context context, String str, int i) {
        this(context, new File(context.getApplicationInfo().sourceDir), str, i);
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public byte[] getDepsBlock() throws IOException {
        File canonicalFile = this.mZipFileName.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.getAppVersionCode(this.mContext));
            if ((this.mFlags & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.mContext.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.ExtractFromZipSoSource, com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ApkUnpacker(this);
    }

    public ApkSoSource(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.mFlags = i;
    }
}
