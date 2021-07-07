package com.facebook.imageformat;

import com.facebook.react.modules.netinfo.NetInfoModule;
import javax.annotation.Nullable;

public class ImageFormat {
    public static final ImageFormat UNKNOWN = new ImageFormat(NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED, null);
    public final String mFileExtension;
    public final String mName;

    public interface FormatChecker {
        @Nullable
        ImageFormat determineFormat(byte[] bArr, int i);

        int getHeaderSize();
    }

    public ImageFormat(String str, @Nullable String str2) {
        this.mName = str;
        this.mFileExtension = str2;
    }

    @Nullable
    public String getFileExtension() {
        return this.mFileExtension;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return getName();
    }
}
