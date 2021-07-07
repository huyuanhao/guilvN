package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;

public class UpdateLayoutMountItem implements MountItem {
    public final int mHeight;
    public final int mReactTag;
    public final int mWidth;

    /* renamed from: mX */
    public final int f975mX;

    /* renamed from: mY */
    public final int f976mY;

    public UpdateLayoutMountItem(int i, int i2, int i3, int i4, int i5) {
        this.mReactTag = i;
        this.f975mX = i2;
        this.f976mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.updateLayout(this.mReactTag, this.f975mX, this.f976mY, this.mWidth, this.mHeight);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getX() {
        return this.f975mX;
    }

    public int getY() {
        return this.f976mY;
    }

    public String toString() {
        return "UpdateLayoutMountItem [" + this.mReactTag + "] - x: " + this.f975mX + " - y: " + this.f976mY + " - height: " + this.mHeight + " - width: " + this.mWidth;
    }
}
