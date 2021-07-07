package com.dylanvann.fastimage;

public interface FastImageProgressListener {
    float getGranularityPercentage();

    void onProgress(String str, long j, long j2);
}
