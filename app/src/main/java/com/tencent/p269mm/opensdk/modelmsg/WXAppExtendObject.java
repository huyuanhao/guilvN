package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXAppExtendObject */
public class WXAppExtendObject implements WXMediaMessage.IMediaObject {
    public static final int CONTENT_LENGTH_LIMIT = 10485760;
    public static final int EXTINFO_LENGTH_LIMIT = 2048;
    public static final int PATH_LENGTH_LIMIT = 10240;
    public static final String TAG = "MicroMsg.SDK.WXAppExtendObject";
    public String extInfo;
    public byte[] fileData;
    public String filePath;

    public WXAppExtendObject() {
    }

    public WXAppExtendObject(String str, String str2) {
        this.extInfo = str;
        this.filePath = str2;
    }

    public WXAppExtendObject(String str, byte[] bArr) {
        this.extInfo = str;
        this.fileData = bArr;
    }

    private int getFileSize(String str) {
        return C3392d.getFileSize(str);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        byte[] bArr;
        String str3 = this.extInfo;
        if ((str3 == null || str3.length() == 0) && (((str2 = this.filePath) == null || str2.length() == 0) && ((bArr = this.fileData) == null || bArr.length == 0))) {
            str = "checkArgs fail, all arguments is null";
        } else {
            String str4 = this.extInfo;
            if (str4 == null || str4.length() <= 2048) {
                String str5 = this.filePath;
                if (str5 == null || str5.length() <= 10240) {
                    String str6 = this.filePath;
                    if (str6 == null || getFileSize(str6) <= 10485760) {
                        byte[] bArr2 = this.fileData;
                        if (bArr2 == null || bArr2.length <= 10485760) {
                            return true;
                        }
                        str = "checkArgs fail, fileData is too large";
                    } else {
                        str = "checkArgs fail, fileSize is too large";
                    }
                } else {
                    str = "checkArgs fail, filePath is invalid";
                }
            } else {
                str = "checkArgs fail, extInfo is invalid";
            }
        }
        Log.m8651e(TAG, str);
        return false;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxappextendobject_extInfo", this.extInfo);
        bundle.putByteArray("_wxappextendobject_fileData", this.fileData);
        bundle.putString("_wxappextendobject_filePath", this.filePath);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 7;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.extInfo = bundle.getString("_wxappextendobject_extInfo");
        this.fileData = bundle.getByteArray("_wxappextendobject_fileData");
        this.filePath = bundle.getString("_wxappextendobject_filePath");
    }
}
