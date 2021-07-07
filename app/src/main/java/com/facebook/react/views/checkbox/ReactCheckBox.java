package com.facebook.react.views.checkbox;

import android.content.Context;
import com.p118pd.sdk.C5990OooooO0;

public class ReactCheckBox extends C5990OooooO0 {
    public boolean mAllowChange = true;

    public ReactCheckBox(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        if (this.mAllowChange) {
            this.mAllowChange = false;
            super.setChecked(z);
        }
    }

    public void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.mAllowChange = true;
    }
}
