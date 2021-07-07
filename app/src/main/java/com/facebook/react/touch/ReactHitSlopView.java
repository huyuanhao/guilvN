package com.facebook.react.touch;

import android.graphics.Rect;
import javax.annotation.Nullable;

public interface ReactHitSlopView {
    @Nullable
    Rect getHitSlopRect();
}
