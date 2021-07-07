package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.AbstractC3701d;
import com.xiaomi.mipush.sdk.Constants;

public class Defcon implements AbstractC3701d {
    public static final int LEVEL_0 = 0;
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;
    public static final long MILLIS_24_HOURS = 86400000;
    public static final long MILLIS_4_HOURS = 14400000;
    public static final long MILLIS_8_HOURS = 28800000;
    public static Defcon instanse;
    public int mLevel = 0;

    public static synchronized Defcon getService(Context context) {
        Defcon defcon;
        synchronized (Defcon.class) {
            if (instanse == null) {
                instanse = new Defcon();
                instanse.setLevel(Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", "0")).intValue());
            }
            defcon = instanse;
        }
        return defcon;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public long getReqInterval() {
        int i = this.mLevel;
        if (i == 1) {
            return MILLIS_4_HOURS;
        }
        if (i != 2) {
            return i != 3 ? 0 : 86400000;
        }
        return MILLIS_8_HOURS;
    }

    public long getRetryInterval() {
        if (this.mLevel == 0) {
            return 0;
        }
        return Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    public boolean isOpen() {
        return this.mLevel != 0;
    }

    @Override // com.umeng.commonsdk.statistics.internal.AbstractC3701d
    public void onImprintChanged(ImprintHandler.C3671a aVar) {
        setLevel(Integer.valueOf(aVar.mo39233a("defcon", String.valueOf(0))).intValue());
    }

    public void setLevel(int i) {
        if (i >= 0 && i <= 3) {
            this.mLevel = i;
        }
    }
}
