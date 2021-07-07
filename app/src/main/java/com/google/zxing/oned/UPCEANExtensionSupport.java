package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

public final class UPCEANExtensionSupport {
    public static final int[] EXTENSION_START_PATTERN = {1, 1, 2};
    public final UPCEANExtension5Support fiveSupport = new UPCEANExtension5Support();
    public final UPCEANExtension2Support twoSupport = new UPCEANExtension2Support();

    public Result decodeRow(int i, BitArray bitArray, int i2) throws NotFoundException {
        int[] findGuardPattern = UPCEANReader.findGuardPattern(bitArray, i2, false, EXTENSION_START_PATTERN);
        try {
            return this.fiveSupport.decodeRow(i, bitArray, findGuardPattern);
        } catch (ReaderException unused) {
            return this.twoSupport.decodeRow(i, bitArray, findGuardPattern);
        }
    }
}
