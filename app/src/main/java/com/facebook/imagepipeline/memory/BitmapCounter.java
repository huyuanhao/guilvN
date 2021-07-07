package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imageutils.BitmapUtil;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public class BitmapCounter {
    @GuardedBy("this")
    public int mCount;
    public final int mMaxCount;
    public final int mMaxSize;
    @GuardedBy("this")
    public long mSize;
    public final ResourceReleaser<Bitmap> mUnpooledBitmapsReleaser;

    public BitmapCounter(int i, int i2) {
        boolean z = true;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 <= 0 ? false : z);
        this.mMaxCount = i;
        this.mMaxSize = i2;
        this.mUnpooledBitmapsReleaser = new ResourceReleaser<Bitmap>() {
            /* class com.facebook.imagepipeline.memory.BitmapCounter.C05311 */

            public void release(Bitmap bitmap) {
                try {
                    BitmapCounter.this.decrease(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }

    public List<CloseableReference<Bitmap>> associateBitmapsWithBitmapCounter(List<Bitmap> list) {
        int i = 0;
        while (i < list.size()) {
            try {
                Bitmap bitmap = list.get(i);
                if (Build.VERSION.SDK_INT < 21) {
                    Bitmaps.pinBitmap(bitmap);
                }
                if (increase(bitmap)) {
                    i++;
                } else {
                    throw new TooManyBitmapsException();
                }
            } catch (Exception e) {
                if (list != null) {
                    for (Bitmap bitmap2 : list) {
                        int i2 = i - 1;
                        if (i > 0) {
                            decrease(bitmap2);
                        }
                        bitmap2.recycle();
                        i = i2;
                    }
                }
                throw Throwables.propagate(e);
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Bitmap bitmap3 : list) {
            arrayList.add(CloseableReference.m938of(bitmap3, this.mUnpooledBitmapsReleaser));
        }
        return arrayList;
    }

    public synchronized void decrease(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        Preconditions.checkArgument(this.mCount > 0, "No bitmaps registered.");
        long j = (long) sizeInBytes;
        Preconditions.checkArgument(j <= this.mSize, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.mSize));
        this.mSize -= j;
        this.mCount--;
    }

    public synchronized int getCount() {
        return this.mCount;
    }

    public synchronized int getMaxCount() {
        return this.mMaxCount;
    }

    public synchronized int getMaxSize() {
        return this.mMaxSize;
    }

    public ResourceReleaser<Bitmap> getReleaser() {
        return this.mUnpooledBitmapsReleaser;
    }

    public synchronized long getSize() {
        return this.mSize;
    }

    public synchronized boolean increase(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        if (this.mCount < this.mMaxCount) {
            long j = (long) sizeInBytes;
            if (this.mSize + j <= ((long) this.mMaxSize)) {
                this.mCount++;
                this.mSize += j;
                return true;
            }
        }
        return false;
    }
}
