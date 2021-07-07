package com.p118pd.sdk;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C7236o00ooOoo;

@RequiresApi(28)
/* renamed from: com.pd.sdk.o00ooo0  reason: case insensitive filesystem */
public class C7238o00ooo0 extends C7239o00ooo00 {
    public MediaSessionManager OooO00o;

    public C7238o00ooo0(Context context) {
        super(context);
        this.OooO00o = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // com.p118pd.sdk.C7240o00ooo0O, com.p118pd.sdk.C7239o00ooo00, com.p118pd.sdk.C7236o00ooOoo.OooO00o
    public boolean OooO00o(C7236o00ooOoo.OooO0OO oooO0OO) {
        if (oooO0OO instanceof OooO00o) {
            return this.OooO00o.isTrustedForMediaControl(((OooO00o) oooO0OO).OooO00o);
        }
        return false;
    }

    /* renamed from: com.pd.sdk.o00ooo0$OooO00o */
    public static final class OooO00o implements C7236o00ooOoo.OooO0OO {
        public final MediaSessionManager.RemoteUserInfo OooO00o;

        public OooO00o(String str, int i, int i2) {
            this.OooO00o = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public int OooO00o() {
            return this.OooO00o.getUid();
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public int OooO0O0() {
            return this.OooO00o.getPid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            return this.OooO00o.equals(((OooO00o) obj).OooO00o);
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public String getPackageName() {
            return this.OooO00o.getPackageName();
        }

        public int hashCode() {
            return C7080o00OO0.OooO00o(this.OooO00o);
        }

        public OooO00o(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.OooO00o = remoteUserInfo;
        }
    }
}
