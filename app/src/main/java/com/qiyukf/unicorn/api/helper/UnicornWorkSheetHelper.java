package com.qiyukf.unicorn.api.helper;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.qiyukf.nim.uikit.session.helper.C2020g;
import com.qiyukf.unicorn.api.RequestCallback;

public class UnicornWorkSheetHelper {
    public C2020g workSheetHelper;

    public UnicornWorkSheetHelper(Fragment fragment) {
        this.workSheetHelper = new C2020g(fragment);
    }

    public void onResultWorkSheet(int i, Intent intent) {
        this.workSheetHelper.mo34474a(i, intent);
    }

    public void openWorkSheetDialog(long j, String str, int i, int i2, RequestCallback<String> requestCallback) {
        this.workSheetHelper.mo34475a(j, str, i, i2, requestCallback);
    }
}
