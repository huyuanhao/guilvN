package com.umeng.socialize.media;

import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.HashMap;
import java.util.Map;

public class UMVideo extends BaseMediaObject {

    /* renamed from: f */
    public String f10778f;

    /* renamed from: g */
    public String f10779g;

    /* renamed from: h */
    public String f10780h;

    /* renamed from: i */
    public String f10781i;

    /* renamed from: j */
    public int f10782j;

    public UMVideo(String str) {
        super(str);
    }

    public int getDuration() {
        return this.f10782j;
    }

    public String getH5Url() {
        return this.f10781i;
    }

    public String getHighBandDataUrl() {
        return this.f10780h;
    }

    public String getLowBandDataUrl() {
        return this.f10779g;
    }

    public String getLowBandUrl() {
        return this.f10778f;
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public UMediaObject.MediaType getMediaType() {
        return UMediaObject.MediaType.VEDIO;
    }

    public void setDuration(int i) {
        this.f10782j = i;
    }

    public void setH5Url(String str) {
        this.f10781i = str;
    }

    public void setHighBandDataUrl(String str) {
        this.f10780h = str;
    }

    public void setLowBandDataUrl(String str) {
        this.f10779g = str;
    }

    public void setLowBandUrl(String str) {
        this.f10778f = str;
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
        return "UMVedio [media_url=" + this.f10740a + ", qzone_title=" + this.f10741b + ", qzone_thumb=media_url=" + this.f10740a + ", qzone_title=" + this.f10741b + ", qzone_thumb=]";
    }

    @Override // com.umeng.socialize.media.UMediaObject
    public final Map<String, Object> toUrlExtraParams() {
        HashMap hashMap = new HashMap();
        if (isUrlMedia()) {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FURL, this.f10740a);
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_FTYPE, getMediaType());
        }
        return hashMap;
    }
}
