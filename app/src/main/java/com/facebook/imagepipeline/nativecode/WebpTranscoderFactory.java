package com.facebook.imagepipeline.nativecode;

public class WebpTranscoderFactory {
    public static WebpTranscoder sWebpTranscoder;
    public static boolean sWebpTranscoderPresent;

    static {
        try {
            sWebpTranscoder = (WebpTranscoder) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            sWebpTranscoderPresent = true;
        } catch (Throwable unused) {
            sWebpTranscoderPresent = false;
        }
    }

    public static WebpTranscoder getWebpTranscoder() {
        return sWebpTranscoder;
    }
}
