package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    public T zamf;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // java.util.Iterator, com.google.android.gms.common.data.DataBufferIterator
    public T next() {
        if (hasNext()) {
            int i = this.zalk + 1;
            this.zalk = i;
            if (i == 0) {
                T t = this.zalj.get(0);
                this.zamf = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.zamf.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                this.zamf.zag(i);
            }
            return this.zamf;
        }
        int i2 = this.zalk;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
