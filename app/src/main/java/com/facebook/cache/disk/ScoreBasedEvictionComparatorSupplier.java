package com.facebook.cache.disk;

import com.facebook.cache.disk.DiskStorage;
import com.facebook.common.internal.VisibleForTesting;

public class ScoreBasedEvictionComparatorSupplier implements EntryEvictionComparatorSupplier {
    public final float mAgeWeight;
    public final float mSizeWeight;

    public ScoreBasedEvictionComparatorSupplier(float f, float f2) {
        this.mAgeWeight = f;
        this.mSizeWeight = f2;
    }

    @VisibleForTesting
    public float calculateScore(DiskStorage.Entry entry, long j) {
        return (this.mAgeWeight * ((float) (j - entry.getTimestamp()))) + (this.mSizeWeight * ((float) entry.getSize()));
    }

    @Override // com.facebook.cache.disk.EntryEvictionComparatorSupplier
    public EntryEvictionComparator get() {
        return new EntryEvictionComparator() {
            /* class com.facebook.cache.disk.ScoreBasedEvictionComparatorSupplier.C04611 */
            public long now = System.currentTimeMillis();

            public int compare(DiskStorage.Entry entry, DiskStorage.Entry entry2) {
                float calculateScore = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry, this.now);
                float calculateScore2 = ScoreBasedEvictionComparatorSupplier.this.calculateScore(entry2, this.now);
                if (calculateScore < calculateScore2) {
                    return 1;
                }
                return calculateScore2 == calculateScore ? 0 : -1;
            }
        };
    }
}
