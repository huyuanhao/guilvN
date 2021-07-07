package com.p118pd.sdk;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o00ooo0o  reason: case insensitive filesystem */
public class C7241o00ooo0o {

    /* renamed from: com.pd.sdk.o00ooo0o$OooO00o */
    public static class OooO00o extends VolumeProvider {
        public final /* synthetic */ OooO0O0 OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2, int i3, OooO0O0 oooO0O0) {
            super(i, i2, i3);
            this.OooO00o = oooO0O0;
        }

        public void onAdjustVolume(int i) {
            this.OooO00o.OooO0O0(i);
        }

        public void onSetVolumeTo(int i) {
            this.OooO00o.OooO00o(i);
        }
    }

    /* renamed from: com.pd.sdk.o00ooo0o$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(int i);

        void OooO0O0(int i);
    }

    public static Object OooO00o(int i, int i2, int i3, OooO0O0 oooO0O0) {
        return new OooO00o(i, i2, i3, oooO0O0);
    }

    public static void OooO00o(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
