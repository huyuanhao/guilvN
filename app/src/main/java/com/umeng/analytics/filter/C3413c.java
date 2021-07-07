package com.umeng.analytics.filter;

import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;

/* renamed from: com.umeng.analytics.filter.c */
public class C3413c implements UMImprintChangeCallback, UMImprintPreProcessCallback {
    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
    public boolean onPreProcessImprintKey(String str, String str2) {
        return false;
    }
}
