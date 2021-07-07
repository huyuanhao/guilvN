package android.support.p000v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.session.MediaControllerCompatApi23 */
public class MediaControllerCompatApi23 {

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi23$TransportControls */
    public static class TransportControls {
        public static void playFromUri(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }
}
