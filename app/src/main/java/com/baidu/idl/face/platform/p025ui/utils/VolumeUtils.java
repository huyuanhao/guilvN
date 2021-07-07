package com.baidu.idl.face.platform.p025ui.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.baidu.idl.face.platform.ui.utils.VolumeUtils */
public class VolumeUtils {
    public static final String TAG = "VolumeUtils";

    /* renamed from: com.baidu.idl.face.platform.ui.utils.VolumeUtils$VolumeCallback */
    public interface VolumeCallback {
        void volumeChanged();
    }

    /* renamed from: com.baidu.idl.face.platform.ui.utils.VolumeUtils$VolumeReceiver */
    public static class VolumeReceiver extends BroadcastReceiver {
        public VolumeCallback callback;

        public VolumeReceiver(VolumeCallback volumeCallback) {
            this.callback = volumeCallback;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && this.callback != null) {
                String str = VolumeUtils.TAG;
                this.callback.volumeChanged();
            }
        }
    }

    public static BroadcastReceiver registerVolumeReceiver(Context context, VolumeCallback volumeCallback) {
        IllegalArgumentException e;
        Exception e2;
        VolumeReceiver volumeReceiver = null;
        try {
            VolumeReceiver volumeReceiver2 = new VolumeReceiver(volumeCallback);
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                context.registerReceiver(volumeReceiver2, intentFilter);
                return volumeReceiver2;
            } catch (IllegalArgumentException e3) {
                e = e3;
                volumeReceiver = volumeReceiver2;
            } catch (Exception e4) {
                e2 = e4;
                volumeReceiver = volumeReceiver2;
                e2.printStackTrace();
                return volumeReceiver;
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
            e.printStackTrace();
            return volumeReceiver;
        } catch (Exception e6) {
            e2 = e6;
            e2.printStackTrace();
            return volumeReceiver;
        }
    }

    public static void unRegisterVolumeReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (context != null && broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
