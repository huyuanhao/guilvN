package com.tencent.bugly.beta;

import com.tencent.bugly.proguard.C3368u;
import com.tencent.bugly.proguard.C3369v;
import com.tencent.bugly.proguard.C3372y;

public class UpgradeInfo {
    public String apkMd5;
    public String apkUrl;
    public long fileSize;

    /* renamed from: id */
    public String f7328id = "";
    public String imageUrl;
    public String newFeature = "";
    public long popInterval = 0;
    public int popTimes = 0;
    public long publishTime = 0;
    public int publishType = 0;
    public String title = "";
    public int updateType;
    public int upgradeType = 1;
    public int versionCode;
    public String versionName = "";

    public UpgradeInfo(C3372y yVar) {
        if (yVar != null) {
            this.f7328id = yVar.f8303m;
            this.title = yVar.f8291a;
            this.newFeature = yVar.f8292b;
            this.publishTime = yVar.f8293c;
            this.publishType = yVar.f8294d;
            this.upgradeType = yVar.f8297g;
            this.popTimes = yVar.f8298h;
            this.popInterval = yVar.f8299i;
            C3369v vVar = yVar.f8295e;
            this.versionCode = vVar.f8263c;
            this.versionName = vVar.f8264d;
            this.apkMd5 = vVar.f8269i;
            C3368u uVar = yVar.f8296f;
            this.apkUrl = uVar.f8256b;
            this.fileSize = uVar.f8258d;
            this.imageUrl = yVar.f8302l.get("IMG_title");
            this.updateType = yVar.f8306p;
        }
    }
}
