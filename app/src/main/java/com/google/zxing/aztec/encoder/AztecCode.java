package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

public final class AztecCode {
    public int codeWords;
    public boolean compact;
    public int layers;
    public BitMatrix matrix;
    public int size;

    public int getCodeWords() {
        return this.codeWords;
    }

    public int getLayers() {
        return this.layers;
    }

    public BitMatrix getMatrix() {
        return this.matrix;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isCompact() {
        return this.compact;
    }

    public void setCodeWords(int i) {
        this.codeWords = i;
    }

    public void setCompact(boolean z) {
        this.compact = z;
    }

    public void setLayers(int i) {
        this.layers = i;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.matrix = bitMatrix;
    }

    public void setSize(int i) {
        this.size = i;
    }
}
