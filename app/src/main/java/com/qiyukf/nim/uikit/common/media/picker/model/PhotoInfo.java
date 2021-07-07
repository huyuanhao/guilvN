package com.qiyukf.nim.uikit.common.media.picker.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
public class PhotoInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public String absolutePath;
    public boolean choose = false;
    public String filePath;
    public int imageId;
    public long size;
    public String uriStr;

    public boolean equals(Object obj) {
        return (obj instanceof PhotoInfo) && ((PhotoInfo) obj).imageId == this.imageId;
    }

    public String getAbsolutePath() {
        return this.absolutePath;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getImageId() {
        return this.imageId;
    }

    public long getSize() {
        return this.size;
    }

    public Uri getUri() {
        if (TextUtils.isEmpty(this.uriStr)) {
            return null;
        }
        return Uri.parse(this.uriStr);
    }

    public String getUriStr() {
        return this.uriStr;
    }

    public boolean isChoose() {
        return this.choose;
    }

    public void setAbsolutePath(String str) {
        this.absolutePath = str;
    }

    public void setChoose(boolean z) {
        this.choose = z;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setImageId(int i) {
        this.imageId = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUriStr(String str) {
        this.uriStr = str;
    }
}
