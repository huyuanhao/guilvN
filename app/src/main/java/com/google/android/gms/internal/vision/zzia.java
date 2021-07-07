package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzia extends zzhz<FieldDescriptorType, Object> {
    public zzia(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final void zzci() {
        if (!isImmutable()) {
            for (int i = 0; i < zzgu(); i++) {
                Map.Entry zzbp = zzbp(i);
                if (((zzfr) zzbp.getKey()).zzeu()) {
                    zzbp.setValue(Collections.unmodifiableList((List) zzbp.getValue()));
                }
            }
            for (Map.Entry entry : zzgv()) {
                if (((zzfr) entry.getKey()).zzeu()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzci();
    }
}
