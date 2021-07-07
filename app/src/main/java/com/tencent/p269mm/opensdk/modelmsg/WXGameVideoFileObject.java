package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject */
public class WXGameVideoFileObject implements WXMediaMessage.IMediaObject {
    public static final int FILE_SIZE_LIMIT = 31457280;
    public static final String TAG = "MicroMsg.SDK.WXGameVideoFileObject";
    public static final int URL_LENGTH_LIMIT = 10240;
    public String filePath;
    public String thumbUrl;
    public String videoUrl;

    public WXGameVideoFileObject() {
        this.filePath = null;
        this.videoUrl = null;
        this.thumbUrl = null;
    }

    public WXGameVideoFileObject(String str, String str2, String str3) {
        this.filePath = str;
        this.videoUrl = str2;
        this.thumbUrl = str3;
    }

    private int getFileSize(String str) {
        return C3392d.getFileSize(str);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2 = this.filePath;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, filePath is null";
        } else if (getFileSize(this.filePath) > 31457280) {
            str = "checkArgs fail, video file size is too large";
        } else {
            String str3 = this.videoUrl;
            if (str3 == null || str3.length() <= 10240) {
                String str4 = this.thumbUrl;
                if (str4 == null || str4.length() <= 10240) {
                    return true;
                }
                str = "checkArgs fail, thumbUrl is too long";
            } else {
                str = "checkArgs fail, videoUrl is too long";
            }
        }
        Log.m8651e(TAG, str);
        return false;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxvideofileobject_filePath", this.filePath);
        bundle.putString("_wxvideofileobject_cdnUrl", this.videoUrl);
        bundle.putString("_wxvideofileobject_thumbUrl", this.thumbUrl);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 39;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.filePath = bundle.getString("_wxvideofileobject_filePath");
        this.videoUrl = bundle.getString("_wxvideofileobject_cdnUrl");
        this.thumbUrl = bundle.getString("_wxvideofileobject_thumbUrl");
    }
}
