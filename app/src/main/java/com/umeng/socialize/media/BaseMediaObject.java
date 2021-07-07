package com.umeng.socialize.media;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseMediaObject implements UMediaObject {

    /* renamed from: a */
    public String f10740a = "";

    /* renamed from: b */
    public String f10741b = "";

    /* renamed from: c */
    public Map<String, Object> f10742c = new HashMap();

    /* renamed from: d */
    public String f10743d = "";

    /* renamed from: e */
    public UMImage f10744e;
    public String mText = null;

    public BaseMediaObject() {
    }

    public String getDescription() {
        return this.f10743d;
    }

    public UMImage getThumbImage() {
        return this.f10744e;
    }

    public String getTitle() {
        return this.f10741b;
    }

    public Map<String, Object> getmExtra() {
        return this.f10742c;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public boolean isUrlMedia() {
        return !TextUtils.isEmpty(this.f10740a);
    }

    public void setDescription(String str) {
        this.f10743d = str;
    }

    public void setThumb(UMImage uMImage) {
        this.f10744e = uMImage;
    }

    public void setTitle(String str) {
        this.f10741b = str;
    }

    public void setmExtra(String str, Object obj) {
        this.f10742c.put(str, obj);
    }

    public String toString() {
        return "BaseMediaObject [media_url=" + this.f10740a + ", qzone_title=" + this.f10741b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public String toUrl() {
        return this.f10740a;
    }

    public BaseMediaObject(String str) {
        this.f10740a = str;
    }

    public BaseMediaObject(Parcel parcel) {
        if (parcel != null) {
            this.f10740a = parcel.readString();
            this.f10741b = parcel.readString();
        }
    }
}
