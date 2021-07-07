package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p118pd.sdk.C7522o0Ooo0o;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DataFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "DataFetchProducer";

    public DataFetchProducer(PooledByteBufferFactory pooledByteBufferFactory) {
        super(CallerThreadExecutor.getInstance(), pooledByteBufferFactory);
    }

    @VisibleForTesting
    public static byte[] getData(String str) {
        Preconditions.checkArgument(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (isBase64(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        return Uri.decode(substring).getBytes();
    }

    @VisibleForTesting
    public static boolean isBase64(String str) {
        if (!str.contains(C7522o0Ooo0o.OooO0O0)) {
            return false;
        }
        String[] split = str.split(C7522o0Ooo0o.OooO0O0);
        return split[split.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        byte[] data = getData(imageRequest.getSourceUri().toString());
        return getByteBufferBackedEncodedImage(new ByteArrayInputStream(data), data.length);
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public String getProducerName() {
        return PRODUCER_NAME;
    }
}
