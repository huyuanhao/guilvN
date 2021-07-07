package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public class ARTGroupShadowNode extends ARTVirtualNode {
    @Nullable
    public RectF mClipping;

    public static RectF createClipping(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }

    @Override // com.facebook.react.views.art.ARTVirtualNode
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        if (f2 > 0.01f) {
            saveAndSetupCanvas(canvas);
            RectF rectF = this.mClipping;
            if (rectF != null) {
                float f3 = rectF.left;
                float f4 = this.mScale;
                canvas.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4, Region.Op.REPLACE);
            }
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.draw(canvas, paint, f2);
                aRTVirtualNode.markUpdateSeen();
            }
            restoreCanvas(canvas);
        }
    }

    @Override // com.facebook.react.views.art.ARTVirtualNode, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "clipping")
    public void setClipping(@Nullable ReadableArray readableArray) {
        float[] floatArray = PropHelper.toFloatArray(readableArray);
        if (floatArray != null) {
            this.mClipping = createClipping(floatArray);
            markUpdated();
        }
    }
}
