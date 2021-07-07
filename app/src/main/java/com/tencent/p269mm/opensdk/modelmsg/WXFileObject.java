package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXFileObject */
public class WXFileObject implements WXMediaMessage.IMediaObject {
    public static final int CONTENT_LENGTH_LIMIT = 10485760;
    public static final String TAG = "MicroMsg.SDK.WXFileObject";
    public int contentLengthLimit;
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.contentLengthLimit = 10485760;
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String str) {
        this.contentLengthLimit = 10485760;
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.contentLengthLimit = 10485760;
        this.fileData = bArr;
    }

    private int getFileSize(String str) {
        return C3392d.getFileSize(str);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        byte[] bArr = this.fileData;
        if ((bArr == null || bArr.length == 0) && ((str2 = this.filePath) == null || str2.length() == 0)) {
            str = "checkArgs fail, both arguments is null";
        } else {
            byte[] bArr2 = this.fileData;
            if (bArr2 == null || bArr2.length <= this.contentLengthLimit) {
                String str3 = this.filePath;
                if (str3 == null || getFileSize(str3) <= this.contentLengthLimit) {
                    return true;
                }
                str = "checkArgs fail, fileSize is too large";
            } else {
                str = "checkArgs fail, fileData is too large";
            }
        }
        Log.m8651e(TAG, str);
        return false;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setContentLengthLimit(int i) {
        this.contentLengthLimit = i;
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 6;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}
