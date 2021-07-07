package com.tencent.bugly.beta.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC3357m;
import com.tencent.bugly.proguard.C3311ah;
import com.tencent.bugly.proguard.C3343bg;

public class BetaUploadStrategy implements Parcelable, Parcelable.Creator<BetaUploadStrategy> {
    public static final Parcelable.Creator<BetaUploadStrategy> CREATOR = new BetaUploadStrategy();

    /* renamed from: a */
    public C3343bg f7481a;

    /* renamed from: b */
    public long f7482b;

    public BetaUploadStrategy() {
        C3343bg bgVar = new C3343bg();
        this.f7481a = bgVar;
        bgVar.f8164b = true;
        bgVar.f8165c = true;
        if (C3226e.f7357E.f7374Q) {
            String str = StrategyBean.f7709b;
            bgVar.f8166d = str;
            bgVar.f8167e = str;
        } else {
            bgVar.f8166d = "http://android.bugly.qq.com/rqd/async";
            bgVar.f8167e = "http://android.bugly.qq.com/rqd/async";
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f7481a.f8170h = currentTimeMillis;
        this.f7482b = currentTimeMillis;
    }

    /* renamed from: a */
    public BetaUploadStrategy createFromParcel(Parcel parcel) {
        return new BetaUploadStrategy(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(C3311ah.m8286a((AbstractC3357m) this.f7481a));
        parcel.writeLong(this.f7482b);
    }

    /* renamed from: a */
    public BetaUploadStrategy[] newArray(int i) {
        return new BetaUploadStrategy[i];
    }

    public BetaUploadStrategy(Parcel parcel) {
        this.f7481a = (C3343bg) C3311ah.m8285a(parcel.createByteArray(), C3343bg.class);
        this.f7482b = parcel.readLong();
    }
}
