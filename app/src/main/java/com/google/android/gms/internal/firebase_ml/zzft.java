package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8932ooOOO0o;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

public final class zzft extends zzev {
    public Object data;

    public zzft(Object obj) {
        super(zzfu.MEDIA_TYPE);
        this.data = zzks.checkNotNull(obj);
    }

    public static boolean zza(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !zzhf.isNull(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String zzaq = zzie.zzaq(obj instanceof Enum ? zzhl.zza((Enum) obj).getName() : obj.toString());
            if (zzaq.length() != 0) {
                writer.write(C8932ooOOO0o.OooO0Oo);
                writer.write(zzaq);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, zzeu()));
        boolean z = true;
        for (Map.Entry<String, Object> entry : zzhf.zzf(this.data).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String zzaq = zzie.zzaq(entry.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object obj : zzia.zzi(value)) {
                        z = zza(z, bufferedWriter, zzaq, obj);
                    }
                } else {
                    z = zza(z, bufferedWriter, zzaq, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
