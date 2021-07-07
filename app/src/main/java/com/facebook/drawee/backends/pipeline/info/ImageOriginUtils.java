package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.producers.NetworkFetchProducer;

public class ImageOriginUtils {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static int mapProducerNameToImageOrigin(String str) {
        char c;
        switch (str.hashCode()) {
            case -1914072202:
                if (str.equals(BitmapMemoryCacheGetProducer.PRODUCER_NAME)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1307634203:
                if (str.equals(EncodedMemoryCacheProducer.PRODUCER_NAME)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1224383234:
                if (str.equals(NetworkFetchProducer.PRODUCER_NAME)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 656304759:
                if (str.equals("DiskCacheProducer")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 957714404:
                if (str.equals(BitmapMemoryCacheProducer.PRODUCER_NAME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 3;
        }
        if (c == 2) {
            return 2;
        }
        if (c != 3) {
            return c != 4 ? -1 : 0;
        }
        return 1;
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "memory_bitmap" : "memory_encoded" : "disk" : "network";
    }
}
