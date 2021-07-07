package com.google.zxing.oned.rss.expanded.decoders;

public final class BlockParsedResult {
    public final DecodedInformation decodedInformation;
    public final boolean finished;

    public BlockParsedResult(boolean z) {
        this(null, z);
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public BlockParsedResult(DecodedInformation decodedInformation2, boolean z) {
        this.finished = z;
        this.decodedInformation = decodedInformation2;
    }
}
