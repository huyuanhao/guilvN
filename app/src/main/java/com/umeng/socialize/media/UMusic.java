package com.umeng.socialize.media;

import android.os.Parcel;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.Map;

public class UMusic extends BaseMediaObject {

    /* renamed from: f */
    public String f10783f;

    /* renamed from: g */
    public String f10784g;

    /* renamed from: h */
    public String f10785h;

    /* renamed from: i */
    public String f10786i;

    /* renamed from: j */
    public int f10787j;

    /* renamed from: k */
    public String f10788k;

    public UMusic(String str) {
        super(str);
    }

    public int getDuration() {
        return this.f10787j;
    }

    public String getH5Url() {
        return this.f10785h;
    }

    public String getHighBandDataUrl() {
        return this.f10784g;
    }

    public String getLowBandDataUrl() {
        return this.f10783f;
    }

    public String getLowBandUrl() {
        return this.f10786i;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.MUSIC;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public UMImage getThumbImage() {
        return this.f10744e;
    }

    public String getmTargetUrl() {
        return this.f10788k;
    }

    public void setDuration(int i) {
        this.f10787j = i;
    }

    public void setH5Url(String str) {
        this.f10785h = str;
    }

    public void setHighBandDataUrl(String str) {
        this.f10784g = str;
    }

    public void setLowBandDataUrl(String str) {
        this.f10783f = str;
    }

    public void setLowBandUrl(String str) {
        this.f10786i = str;
    }

    public void setmTargetUrl(String str) {
        this.f10788k = str;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public byte[] toByte() {
        UMImage uMImage = this.f10744e;
        if (uMImage != null) {
            return uMImage.toByte();
        }
        return null;
    }

    @Override // com.umeng.socialize.media.BaseMediaObject
    public String toString() {
        return "UMusic [title=" + this.f10741b + "media_url=" + this.f10740a + ", qzone_title=" + this.f10741b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final Map<String, Object> toUrlExtraParams() {
        HashMap hashMap = new HashMap();
        if (isUrlMedia()) {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f10740a);
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_TITLE, this.f10741b);
        }
        return hashMap;
    }

    public UMusic(Parcel parcel) {
        super(parcel);
    }
}
