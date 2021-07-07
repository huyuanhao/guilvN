package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView.SurfaceTextureListener {
    @Nullable
    public Integer mBackgroundColor;
    @Nullable
    public Surface mSurface;

    private void drawOutput() {
        Surface surface = this.mSurface;
        if (surface == null || !surface.isValid()) {
            markChildrenUpdatesSeen(this);
            return;
        }
        try {
            Canvas lockCanvas = this.mSurface.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.mBackgroundColor != null) {
                lockCanvas.drawColor(this.mBackgroundColor.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) getChildAt(i);
                aRTVirtualNode.draw(lockCanvas, paint, 1.0f);
                aRTVirtualNode.markUpdateSeen();
            }
            if (this.mSurface != null) {
                this.mSurface.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            FLog.m873e(ReactConstants.TAG, e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    private void markChildrenUpdatesSeen(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i);
            childAt.markUpdateSeen();
            markChildrenUpdatesSeen(childAt);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        drawOutput();
        uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mSurface = new Surface(surfaceTexture);
        drawOutput();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.mSurface = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.mBackgroundColor = num;
        markUpdated();
    }
}
