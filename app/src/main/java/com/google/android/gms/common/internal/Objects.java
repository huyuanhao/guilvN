package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {
        public final List<String> zzer;
        public final Object zzes;

        public ToStringHelper(Object obj) {
            this.zzes = Preconditions.checkNotNull(obj);
            this.zzer = new ArrayList();
        }

        @KeepForSdk
        public final ToStringHelper add(String str, @Nullable Object obj) {
            List<String> list = this.zzer;
            String str2 = (String) Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzes.getClass().getSimpleName());
            sb.append('{');
            int size = this.zzer.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.zzer.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
