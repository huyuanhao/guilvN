package com.umeng.socialize.media;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.interfaces.CompressListener;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.p275b.p276a.C3913a;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;

public class SimpleShareContent {
    public final String DEFAULT_DESCRIPTION = "这里是描述";
    public final String DEFAULT_TITLE = "这里是标题";
    public final int IMAGE_LIMIT = 491520;
    public int THUMB_LIMIT = 24576;
    public int WX_MIN_LIMIT = 131072;
    public int WX_THUMB_LIMIT = 18432;

    /* renamed from: a */
    public UMImage f10745a;

    /* renamed from: b */
    public UMImage[] f10746b;

    /* renamed from: c */
    public String f10747c;

    /* renamed from: d */
    public UMVideo f10748d;

    /* renamed from: e */
    public UMEmoji f10749e;

    /* renamed from: f */
    public UMusic f10750f;

    /* renamed from: g */
    public UMMin f10751g;

    /* renamed from: h */
    public UMWeb f10752h;

    /* renamed from: i */
    public File f10753i;

    /* renamed from: j */
    public BaseMediaObject f10754j;

    /* renamed from: k */
    public int f10755k;

    /* renamed from: l */
    public String f10756l;

    /* renamed from: m */
    public String f10757m;

    /* renamed from: n */
    public CompressListener f10758n;

    public SimpleShareContent(ShareContent shareContent) {
        this.f10747c = shareContent.mText;
        UMediaObject uMediaObject = shareContent.mMedia;
        if (uMediaObject != null && (uMediaObject instanceof UMImage)) {
            UMImage uMImage = (UMImage) uMediaObject;
            this.f10745a = uMImage;
            this.f10754j = uMImage;
            UMImage[] uMImageArr = shareContent.mMedias;
            if (uMImageArr != null && uMImageArr.length > 0) {
                this.f10746b = uMImageArr;
            }
        }
        UMediaObject uMediaObject2 = shareContent.mMedia;
        if (uMediaObject2 != null && (uMediaObject2 instanceof UMusic)) {
            UMusic uMusic = (UMusic) uMediaObject2;
            this.f10750f = uMusic;
            this.f10754j = uMusic;
        }
        UMediaObject uMediaObject3 = shareContent.mMedia;
        if (uMediaObject3 != null && (uMediaObject3 instanceof UMVideo)) {
            UMVideo uMVideo = (UMVideo) uMediaObject3;
            this.f10748d = uMVideo;
            this.f10754j = uMVideo;
        }
        UMediaObject uMediaObject4 = shareContent.mMedia;
        if (uMediaObject4 != null && (uMediaObject4 instanceof UMEmoji)) {
            UMEmoji uMEmoji = (UMEmoji) uMediaObject4;
            this.f10749e = uMEmoji;
            this.f10754j = uMEmoji;
        }
        UMediaObject uMediaObject5 = shareContent.mMedia;
        if (uMediaObject5 != null && (uMediaObject5 instanceof UMWeb)) {
            UMWeb uMWeb = (UMWeb) uMediaObject5;
            this.f10752h = uMWeb;
            this.f10754j = uMWeb;
        }
        UMediaObject uMediaObject6 = shareContent.mMedia;
        if (uMediaObject6 != null && (uMediaObject6 instanceof UMMin)) {
            this.f10751g = (UMMin) uMediaObject6;
            this.f10754j = this.f10752h;
        }
        File file = shareContent.file;
        if (file != null) {
            this.f10753i = file;
        }
        this.f10757m = shareContent.subject;
        this.f10755k = shareContent.getShareType();
        this.f10756l = m10804a();
    }

    /* renamed from: a */
    private String m10804a() {
        int i = this.f10755k;
        if (i == 1) {
            return "text";
        }
        if (i == 2) {
            return SocializeProtocolConstants.IMAGE;
        }
        if (i == 3) {
            return "textandimage";
        }
        if (i == 4) {
            return "music";
        }
        if (i == 8) {
            return "video";
        }
        if (i == 16) {
            return "web";
        }
        if (i == 32) {
            return "file";
        }
        if (i != 64) {
            return i != 128 ? "error" : "minapp";
        }
        return "emoji";
    }

    /* renamed from: b */
    private byte[] m10805b() {
        byte[] bytes = DefaultClass.getBytes();
        if (ContextUtil.getIcon() != 0 && ((bytes = C3913a.m10771a(new UMImage(ContextUtil.getContext(), ContextUtil.getIcon()), this.WX_THUMB_LIMIT)) == null || bytes.length <= 0)) {
            SLog.m10856E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        }
        return bytes;
    }

    public boolean canFileValid(UMImage uMImage) {
        return uMImage.asFileImage() != null;
    }

    public String getAssertSubject() {
        if (TextUtils.isEmpty(this.f10757m)) {
            return "umengshare";
        }
        return this.f10757m;
    }

    public BaseMediaObject getBaseMediaObject() {
        return this.f10754j;
    }

    public File getFile() {
        return this.f10753i;
    }

    public UMImage getImage() {
        return this.f10745a;
    }

    public byte[] getImageData(UMImage uMImage) {
        return uMImage.asBinImage();
    }

    public byte[] getImageThumb(UMImage uMImage) {
        if (uMImage.getThumbImage() == null) {
            return m10805b();
        }
        byte[] a = C3913a.m10771a(uMImage.getThumbImage(), this.WX_THUMB_LIMIT);
        if (a != null && a.length > 0) {
            return a;
        }
        SLog.m10856E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return m10805b();
    }

    public UMusic getMusic() {
        return this.f10750f;
    }

    public String getMusicTargetUrl(UMusic uMusic) {
        if (TextUtils.isEmpty(uMusic.getmTargetUrl())) {
            return uMusic.toUrl();
        }
        return uMusic.getmTargetUrl();
    }

    public String getStrStyle() {
        return this.f10756l;
    }

    public byte[] getStrictImageData(UMImage uMImage) {
        if (getUMImageScale(uMImage) <= 491520) {
            return getImageData(uMImage);
        }
        byte[] a = C3913a.m10771a(getImage(), 491520);
        if (a != null && a.length > 0) {
            return a;
        }
        SLog.m10856E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return null;
    }

    public String getSubject() {
        return this.f10757m;
    }

    public String getText() {
        return this.f10747c;
    }

    public int getUMImageScale(UMImage uMImage) {
        return C3913a.m10764a(uMImage);
    }

    public UMEmoji getUmEmoji() {
        return this.f10749e;
    }

    public UMMin getUmMin() {
        return this.f10751g;
    }

    public UMWeb getUmWeb() {
        return this.f10752h;
    }

    public UMVideo getVideo() {
        return this.f10748d;
    }

    public UMImage[] getmImages() {
        return this.f10746b;
    }

    public int getmStyle() {
        return this.f10755k;
    }

    public String objectSetDescription(BaseMediaObject baseMediaObject) {
        if (TextUtils.isEmpty(baseMediaObject.getDescription())) {
            return "这里是描述";
        }
        String description = baseMediaObject.getDescription();
        return description.length() > 1024 ? description.substring(0, 1024) : description;
    }

    public byte[] objectSetMInAppThumb(BaseMediaObject baseMediaObject) {
        if (baseMediaObject.getThumbImage() == null) {
            return DefaultClass.getBytes();
        }
        if (this.f10758n != null) {
            UMImage thumbImage = baseMediaObject.getThumbImage();
            if (thumbImage == null) {
                return DefaultClass.getBytes();
            }
            byte[] asBinImage = thumbImage.asBinImage();
            if (asBinImage == null || C3913a.m10764a(thumbImage) > this.WX_MIN_LIMIT) {
                return this.f10758n.compressThumb(asBinImage);
            }
            return asBinImage;
        }
        byte[] a = C3913a.m10774a(baseMediaObject.getThumbImage().asBinImage(), this.WX_MIN_LIMIT, Bitmap.CompressFormat.JPEG);
        if (a != null && a.length > 0) {
            return a;
        }
        SLog.m10856E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return a;
    }

    public String objectSetText(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "这里是描述";
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public byte[] objectSetThumb(BaseMediaObject baseMediaObject) {
        if (baseMediaObject.getThumbImage() == null) {
            return m10805b();
        }
        if (this.f10758n != null) {
            UMImage thumbImage = baseMediaObject.getThumbImage();
            if (thumbImage == null) {
                return DefaultClass.getBytes();
            }
            byte[] asBinImage = thumbImage.asBinImage();
            if (asBinImage == null || C3913a.m10764a(thumbImage) > this.THUMB_LIMIT) {
                return this.f10758n.compressThumb(asBinImage);
            }
            return asBinImage;
        }
        byte[] a = C3913a.m10771a(baseMediaObject.getThumbImage(), this.THUMB_LIMIT);
        if (a != null && a.length > 0) {
            return a;
        }
        SLog.m10856E(UmengText.IMAGE.SHARECONTENT_THUMB_ERROR);
        return m10805b();
    }

    public String objectSetTitle(BaseMediaObject baseMediaObject) {
        if (TextUtils.isEmpty(baseMediaObject.getTitle())) {
            return "这里是标题";
        }
        String title = baseMediaObject.getTitle();
        return title.length() > 512 ? title.substring(0, 512) : title;
    }

    public void setCompressListener(CompressListener compressListener) {
        this.f10758n = compressListener;
    }

    public void setImage(UMImage uMImage) {
        this.f10745a = uMImage;
    }

    public void setMusic(UMusic uMusic) {
        this.f10750f = uMusic;
    }

    public void setText(String str) {
        this.f10747c = str;
    }

    public void setVideo(UMVideo uMVideo) {
        this.f10748d = uMVideo;
    }

    public String subString(String str, int i) {
        return (!TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    public String objectSetText(String str) {
        return objectSetText(str, 10240);
    }
}
