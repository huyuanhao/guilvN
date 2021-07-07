package com.p118pd.sdk;

import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;

/* renamed from: com.pd.sdk.oo0O00oo  reason: case insensitive filesystem */
public class C8598oo0O00oo {
    public final int OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f21711OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f21712OooO00o;
    public final int OooO0O0;
    @Nullable

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final File f21713OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public C8598oo0O00oo(@Nullable File file, @Nullable File file2, int i, int i2, int i3, int i4, boolean z) {
        this.f21711OooO00o = file;
        this.f21713OooO0O0 = file2;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.f21712OooO00o = z;
    }

    @NonNull
    public C8598oo0O00oo OooO00o(int i) {
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, this.OooO00o, i, this.OooO0OO, this.OooO0Oo, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO0O0(int i) {
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, i, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO0OO(int i) {
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, this.OooO00o, this.OooO0O0, i, this.OooO0Oo, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO0Oo(int i) {
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, this.OooO00o, this.OooO0O0, this.OooO0OO, i, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO00o(@Nullable File file) {
        return new C8598oo0O00oo(file, this.f21713OooO0O0, this.OooO00o, this.OooO0O0, MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath()).contains("gif") ? 100 : this.OooO0OO, this.OooO0Oo, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO0O0(@Nullable File file) {
        return new C8598oo0O00oo(this.f21711OooO00o, file, this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.f21712OooO00o);
    }

    @NonNull
    public C8598oo0O00oo OooO00o(@Nullable boolean z) {
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, z);
    }

    @NonNull
    public C8598oo0O00oo OooO00o(@NonNull ReadableMap readableMap) {
        boolean z;
        int i = readableMap.hasKey(ViewProps.MAX_WIDTH) ? (int) readableMap.getDouble(ViewProps.MAX_WIDTH) : 0;
        int i2 = readableMap.hasKey(ViewProps.MAX_HEIGHT) ? (int) readableMap.getDouble(ViewProps.MAX_HEIGHT) : 0;
        int i3 = readableMap.hasKey("quality") ? (int) (readableMap.getDouble("quality") * 100.0d) : 100;
        int i4 = readableMap.hasKey(BaseViewManager.PROP_ROTATION) ? (int) readableMap.getDouble(BaseViewManager.PROP_ROTATION) : 0;
        if (readableMap.hasKey("storageOptions")) {
            ReadableMap map = readableMap.getMap("storageOptions");
            if (map.hasKey("cameraRoll")) {
                z = map.getBoolean("cameraRoll");
                return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, i, i2, i3, i4, z);
            }
        }
        z = false;
        return new C8598oo0O00oo(this.f21711OooO00o, this.f21713OooO0O0, i, i2, i3, i4, z);
    }

    public boolean OooO00o(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.OooO00o;
        return ((i < i6 && i6 > 0) || this.OooO00o == 0) && ((i2 < (i4 = this.OooO0O0) && i4 > 0) || this.OooO0O0 == 0) && this.OooO0OO == 100 && ((i5 = this.OooO0Oo) == 0 || i3 == i5);
    }

    public File OooO00o() {
        File file = this.f21713OooO0O0;
        return file != null ? file : this.f21711OooO00o;
    }
}
