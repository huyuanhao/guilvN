package com.google.android.cameraview;

import com.p118pd.sdk.C6971o0000oO0;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SizeMap {
    public final C6971o0000oO0<AspectRatio, SortedSet<Size>> mRatios = new C6971o0000oO0<>();

    public boolean add(Size size) {
        for (AspectRatio aspectRatio : this.mRatios.keySet()) {
            if (aspectRatio.matches(size)) {
                SortedSet<Size> sortedSet = this.mRatios.get(aspectRatio);
                if (sortedSet.contains(size)) {
                    return false;
                }
                sortedSet.add(size);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(size);
        this.mRatios.put(AspectRatio.m957of(size.getWidth(), size.getHeight()), treeSet);
        return true;
    }

    public void clear() {
        this.mRatios.clear();
    }

    public boolean isEmpty() {
        return this.mRatios.isEmpty();
    }

    public Set<AspectRatio> ratios() {
        return this.mRatios.keySet();
    }

    public void remove(AspectRatio aspectRatio) {
        this.mRatios.remove(aspectRatio);
    }

    public SortedSet<Size> sizes(AspectRatio aspectRatio) {
        return this.mRatios.get(aspectRatio);
    }
}
