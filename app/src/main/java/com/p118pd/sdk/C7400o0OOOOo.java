package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.pd.sdk.o0OOOOo  reason: case insensitive filesystem */
public class C7400o0OOOOo {
    public long OooO00o = 60000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableArray f20211OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableMap f20212OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Boolean f20213OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20214OooO00o;
    public Boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f20215OooO0O0;
    public Boolean OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f20216OooO0OO;
    public Boolean OooO0Oo = true;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public String f20217OooO0Oo;
    public Boolean OooO0o;
    public Boolean OooO0o0;

    public C7400o0OOOOo(ReadableMap readableMap) {
        boolean z = false;
        this.OooO0o0 = false;
        this.OooO0o = true;
        String str = null;
        this.f20211OooO00o = null;
        if (readableMap != null) {
            this.f20213OooO00o = Boolean.valueOf(readableMap.hasKey("fileCache") ? readableMap.getBoolean("fileCache") : false);
            this.f20214OooO00o = readableMap.hasKey("path") ? readableMap.getString("path") : null;
            this.f20215OooO0O0 = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
            this.OooO0O0 = Boolean.valueOf(readableMap.hasKey("trusty") ? readableMap.getBoolean("trusty") : false);
            if (readableMap.hasKey("addAndroidDownloads")) {
                this.f20212OooO00o = readableMap.getMap("addAndroidDownloads");
            }
            if (readableMap.hasKey("binaryContentTypes")) {
                this.f20211OooO00o = readableMap.getArray("binaryContentTypes");
            }
            String str2 = this.f20214OooO00o;
            if (str2 != null && str2.toLowerCase().contains("?append=true")) {
                this.OooO0Oo = false;
            }
            if (readableMap.hasKey("overwrite")) {
                this.OooO0Oo = Boolean.valueOf(readableMap.getBoolean("overwrite"));
            }
            if (readableMap.hasKey("followRedirect")) {
                this.OooO0o = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
            }
            this.f20216OooO0OO = readableMap.hasKey("key") ? readableMap.getString("key") : null;
            this.f20217OooO0Oo = readableMap.hasKey(AbstractC9852lIli.OooO00o) ? readableMap.getString(AbstractC9852lIli.OooO00o) : str;
            this.OooO0o0 = Boolean.valueOf(readableMap.hasKey("increment") ? readableMap.getBoolean("increment") : false);
            this.OooO0OO = Boolean.valueOf(readableMap.hasKey("auto") ? readableMap.getBoolean("auto") : z);
            if (readableMap.hasKey(C7486o0OoO0oO.f20312OooO0Oo)) {
                this.OooO00o = (long) readableMap.getInt(C7486o0OoO0oO.f20312OooO0Oo);
            }
        }
    }
}
