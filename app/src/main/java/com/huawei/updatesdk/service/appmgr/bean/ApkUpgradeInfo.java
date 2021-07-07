package com.huawei.updatesdk.service.appmgr.bean;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import java.io.Serializable;

public class ApkUpgradeInfo extends AbstractC1299b implements Serializable {
    public static final int APP_MUST_UPDATE = 1;
    public static final int HUAWEI_OFFICIAL_APP = 1;
    public static final int NOT_AUTOUPDATE = 0;
    public static final String TAG = "ApkUpgradeInfo";
    public static final int UPGRADE_SAME_SIGNATURE = 0;
    public static final long serialVersionUID = 136275377334431721L;
    public String detailId_;
    public int devType_ = 0;
    public String diffHash_;
    public int diffSize_;
    public String downurl_;
    public String fullDownUrl_;
    public String hash_;
    public String icon_;
    public String id_;
    public int isAutoUpdate_ = 0;
    public int isCompulsoryUpdate_ = 0;
    public String name_;
    public String newFeatures_;
    public String notRcmReason_;
    public String oldHashCode;
    public int oldVersionCode_;
    public String oldVersionName_;
    public String package_;
    public String releaseDateDesc_;
    public String releaseDate_;
    public int sameS_ = 0;
    public String sha256_;
    public int size_;
    public int state_ = 2;
    public int versionCode_;
    public String version_;

    public String getDetailId_() {
        return this.detailId_;
    }

    public int getDevType_() {
        return this.devType_;
    }

    public String getDiffHash_() {
        return this.diffHash_;
    }

    public int getDiffSize_() {
        return this.diffSize_;
    }

    public String getDownurl_() {
        return this.downurl_;
    }

    public String getFullDownUrl_() {
        return this.fullDownUrl_;
    }

    public String getHash_() {
        return this.hash_;
    }

    public String getIcon_() {
        return this.icon_;
    }

    public String getId_() {
        return this.id_;
    }

    public int getIsAutoUpdate_() {
        return this.isAutoUpdate_;
    }

    public int getIsCompulsoryUpdate_() {
        return this.isCompulsoryUpdate_;
    }

    public String getName_() {
        return this.name_;
    }

    public String getNewFeatures_() {
        return this.newFeatures_;
    }

    public String getNotRcmReason_() {
        return this.notRcmReason_;
    }

    public String getOldHashCode() {
        return this.oldHashCode;
    }

    public int getOldVersionCode_() {
        return this.oldVersionCode_;
    }

    public String getOldVersionName_() {
        return this.oldVersionName_;
    }

    public String getPackage_() {
        return this.package_;
    }

    public String getReleaseDateDesc_() {
        return this.releaseDateDesc_;
    }

    public String getReleaseDate_() {
        return this.releaseDate_;
    }

    public int getSameS_() {
        return this.sameS_;
    }

    public String getSha256_() {
        return this.sha256_;
    }

    public int getSize_() {
        return this.size_;
    }

    public int getState_() {
        return this.state_;
    }

    public int getVersionCode_() {
        return this.versionCode_;
    }

    public String getVersion_() {
        return this.version_;
    }

    public void setDetailId_(String str) {
        this.detailId_ = str;
    }

    public void setDevType_(int i) {
        this.devType_ = i;
    }

    public void setDiffHash_(String str) {
        this.diffHash_ = str;
    }

    public void setDiffSize_(int i) {
        this.diffSize_ = i;
    }

    public void setDownurl_(String str) {
        this.downurl_ = str;
    }

    public void setFullDownUrl_(String str) {
        this.fullDownUrl_ = str;
    }

    public void setHash_(String str) {
        this.hash_ = str;
    }

    public void setIcon_(String str) {
        this.icon_ = str;
    }

    public void setId_(String str) {
        this.id_ = str;
    }

    public void setIsAutoUpdate_(int i) {
        this.isAutoUpdate_ = i;
    }

    public void setIsCompulsoryUpdate_(int i) {
        this.isCompulsoryUpdate_ = i;
    }

    public void setName_(String str) {
        this.name_ = str;
    }

    public void setNewFeatures_(String str) {
        this.newFeatures_ = str;
    }

    public void setNotRcmReason_(String str) {
        this.notRcmReason_ = str;
    }

    public void setOldHashCode(String str) {
        this.oldHashCode = str;
    }

    public void setOldVersionCode_(int i) {
        this.oldVersionCode_ = i;
    }

    public void setOldVersionName_(String str) {
        this.oldVersionName_ = str;
    }

    public void setPackage_(String str) {
        this.package_ = str;
    }

    public void setReleaseDateDesc_(String str) {
        this.releaseDateDesc_ = str;
    }

    public void setReleaseDate_(String str) {
        this.releaseDate_ = str;
    }

    public void setSameS_(int i) {
        this.sameS_ = i;
    }

    public void setSha256_(String str) {
        this.sha256_ = str;
    }

    public void setSize_(int i) {
        this.size_ = i;
    }

    public void setState_(int i) {
        this.state_ = i;
    }

    public void setVersionCode_(int i) {
        this.versionCode_ = i;
    }

    public void setVersion_(String str) {
        this.version_ = str;
    }

    public String toString() {
        return ApkUpgradeInfo.class.getName() + " {\n\tid_: " + getId_() + "\n\tname_: " + getName_() + "\n\tpackage_: " + getPackage_() + "\n\tversion_: " + getVersion_() + "\n\tdiffSize_: " + getDiffSize_() + "\n\tdiffHash_: " + getDiffHash_() + "\n\toldHashCode: " + getOldHashCode() + "\n\thash_: " + getHash_() + "\n\tsameS_: " + getSameS_() + "\n\tsize_: " + getSize_() + "\n\treleaseDate_: " + getReleaseDate_() + "\n\ticon_: " + getIcon_() + "\n\toldVersionCode_: " + getOldVersionCode_() + "\n\tversionCode_: " + getVersionCode_() + "\n\tdownurl_: " + getDownurl_() + "\n\tnewFeatures_: " + getNewFeatures_() + "\n\treleaseDateDesc_: " + getReleaseDateDesc_() + "\n\tstate_: " + getState_() + "\n\tdetailId_: " + getDetailId_() + "\n\tfullDownUrl_: " + getFullDownUrl_() + "\n\tisCompulsoryUpdate_: " + getIsCompulsoryUpdate_() + "\n\tnotRcmReason_: " + getNotRcmReason_() + "\n\tdevType_: " + getDevType_() + "\n}";
    }
}
