package com.google.zxing.datamatrix.encoder;

public interface Encoder {
    void encode(EncoderContext encoderContext);

    int getEncodingMode();
}
