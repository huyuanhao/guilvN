package com.p118pd.sdk;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* renamed from: com.pd.sdk.OooO0oO  reason: case insensitive filesystem */
public class C5935OooO0oO implements AdapterView.OnItemSelectedListener {
    public final ActionBar.OooO0OO OooO00o;

    public C5935OooO0oO(ActionBar.OooO0OO oooO0OO) {
        this.OooO00o = oooO0OO;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ActionBar.OooO0OO oooO0OO = this.OooO00o;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
