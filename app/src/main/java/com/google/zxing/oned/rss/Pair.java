package com.google.zxing.oned.rss;

public final class Pair extends DataCharacter {
    public int count;
    public final FinderPattern finderPattern;

    public Pair(int i, int i2, FinderPattern finderPattern2) {
        super(i, i2);
        this.finderPattern = finderPattern2;
    }

    public int getCount() {
        return this.count;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public void incrementCount() {
        this.count++;
    }
}
