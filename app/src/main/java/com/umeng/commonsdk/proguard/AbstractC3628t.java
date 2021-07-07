package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.AbstractC3553aa;
import com.umeng.commonsdk.proguard.AbstractC3628t;
import java.io.Serializable;

/* renamed from: com.umeng.commonsdk.proguard.t */
public interface AbstractC3628t<T extends AbstractC3628t<?, ?>, F extends AbstractC3553aa> extends Serializable {
    void clear();

    AbstractC3628t<T, F> deepCopy();

    F fieldForId(int i);

    void read(AbstractC3579as asVar) throws C3636z;

    void write(AbstractC3579as asVar) throws C3636z;
}
