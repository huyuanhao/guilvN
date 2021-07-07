package com.huawei.updatesdk.service.deamon.download;

import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.download.AbstractC1306b;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.support.p081a.C1365a;
import com.huawei.updatesdk.support.p082b.C1366a;
import com.huawei.updatesdk.support.p082b.C1368b;

/* renamed from: com.huawei.updatesdk.service.deamon.download.b */
public class C1338b extends AbstractC1306b {

    /* renamed from: a */
    public static final String f1593a = (C1365a.m2024a() + ".DownloadDiskSpacePolicy");

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1306b
    /* renamed from: a */
    public AbstractC1306b.C1307a mo15946a(DownloadTask downloadTask) {
        AbstractC1306b.C1307a aVar = new AbstractC1306b.C1307a();
        aVar.mo15951a(false);
        C1366a a = C1368b.m2035a();
        if (a != null && !TextUtils.isEmpty(a.mo16194a())) {
            aVar.mo15950a(a.mo16194a());
            aVar.mo15949a(a.mo16198b());
            if (mo16147a(downloadTask, aVar, 0, false)) {
                aVar.mo15951a(true);
            }
        }
        if (!aVar.mo15952a()) {
            mo15947a(downloadTask, aVar);
        }
        return aVar;
    }

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1306b
    /* renamed from: a */
    public void mo15947a(DownloadTask downloadTask, AbstractC1306b.C1307a aVar) {
        C1278a.m1584d("DownloadDiskSpacePolicy", "onSpaceNotEnough");
    }

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1306b
    /* renamed from: a */
    public void mo15948a(DownloadTask downloadTask, String str) {
        C1278a.m1584d("DownloadDiskSpacePolicy", "onWriteEnd");
    }

    /* renamed from: a */
    public boolean mo16146a(long j, long j2) {
        return j + 5242880 <= j2;
    }

    /* renamed from: a */
    public boolean mo16147a(DownloadTask downloadTask, AbstractC1306b.C1307a aVar, long j, boolean z) {
        return mo16146a(downloadTask.mo15996r() - downloadTask.mo15997s(), aVar.mo15953b() + j);
    }
}
