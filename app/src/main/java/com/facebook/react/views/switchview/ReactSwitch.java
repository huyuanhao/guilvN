package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.p118pd.sdk.C6961o0000Ooo;
import javax.annotation.Nullable;

public class ReactSwitch extends C6961o0000Ooo {
    public boolean mAllowChange = true;
    @Nullable
    public Integer mTrackColorForFalse = null;
    @Nullable
    public Integer mTrackColorForTrue = null;

    public ReactSwitch(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.C6961o0000Ooo
    public void setChecked(boolean z) {
        if (this.mAllowChange && isChecked() != z) {
            this.mAllowChange = false;
            super.setChecked(z);
            setTrackColor(z);
        }
    }

    public void setColor(Drawable drawable, @Nullable Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            setTrackColor(z);
        }
        this.mAllowChange = true;
    }

    public void setThumbColor(@Nullable Integer num) {
        setColor(super.getThumbDrawable(), num);
    }

    public void setTrackColor(@Nullable Integer num) {
        setColor(super.getTrackDrawable(), num);
    }

    public void setTrackColorForFalse(@Nullable Integer num) {
        if (num != this.mTrackColorForFalse) {
            this.mTrackColorForFalse = num;
            if (!isChecked()) {
                setTrackColor(this.mTrackColorForFalse);
            }
        }
    }

    public void setTrackColorForTrue(@Nullable Integer num) {
        if (num != this.mTrackColorForTrue) {
            this.mTrackColorForTrue = num;
            if (isChecked()) {
                setTrackColor(this.mTrackColorForTrue);
            }
        }
    }

    private void setTrackColor(boolean z) {
        if (this.mTrackColorForTrue != null || this.mTrackColorForFalse != null) {
            setTrackColor(z ? this.mTrackColorForTrue : this.mTrackColorForFalse);
        }
    }
}
