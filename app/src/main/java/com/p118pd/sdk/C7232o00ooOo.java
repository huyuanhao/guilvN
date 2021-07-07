package com.p118pd.sdk;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C7233o00ooOo0;

@RequiresApi(23)
/* renamed from: com.pd.sdk.o00ooOo  reason: case insensitive filesystem */
public class C7232o00ooOo {

    /* renamed from: com.pd.sdk.o00ooOo$OooO00o */
    public static class OooO00o extends C7233o00ooOo0.OooO0O0 {
        public OooO00o(Context context, OooO0O0 oooO0O0) {
            super(context, oooO0O0);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((OooO0O0) this.OooO00o).OooO0O0(str, new C7233o00ooOo0.OooO0OO<>(result));
        }
    }

    /* renamed from: com.pd.sdk.o00ooOo$OooO0O0 */
    public interface OooO0O0 extends C7233o00ooOo0.AbstractC7234OooO0Oo {
        void OooO0O0(String str, C7233o00ooOo0.OooO0OO<Parcel> oooO0OO);
    }

    public static Object OooO00o(Context context, OooO0O0 oooO0O0) {
        return new OooO00o(context, oooO0O0);
    }
}
