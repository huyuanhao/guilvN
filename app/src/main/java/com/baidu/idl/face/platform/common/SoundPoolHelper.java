package com.baidu.idl.face.platform.common;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.utils.SoundPlayer;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.HashMap;

public class SoundPoolHelper {
    public static final String TAG = "SoundPoolHelper";
    public Context mContext;
    public volatile boolean mIsEnableSound = true;
    public volatile boolean mIsPlaying = false;
    public volatile long mPlayDuration = 0;
    public HashMap<Integer, Long> mPlayDurationMap = new HashMap<>();
    public FaceStatusEnum mPlaySoundStatusEnum;
    public volatile long mPlayTime = 0;

    public SoundPoolHelper(Context context) {
        this.mContext = context;
    }

    private long getSoundDuration(int i) {
        IllegalArgumentException e;
        long j;
        IllegalStateException e2;
        Exception e3;
        if (this.mPlayDurationMap.containsKey(Integer.valueOf(i))) {
            return this.mPlayDurationMap.get(Integer.valueOf(i)).longValue();
        }
        System.currentTimeMillis();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.mContext, Uri.parse("android.resource://" + this.mContext.getPackageName() + C8932ooOOO0o.OooO0OO + i));
            j = Long.valueOf(mediaMetadataRetriever.extractMetadata(9)).longValue() + 0;
            try {
                this.mPlayDurationMap.put(Integer.valueOf(i), Long.valueOf(j));
                return j;
            } catch (IllegalArgumentException e4) {
                e = e4;
            } catch (IllegalStateException e5) {
                e2 = e5;
                e2.printStackTrace();
                return j;
            } catch (Exception e6) {
                e3 = e6;
                e3.printStackTrace();
                return j;
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            j = 600;
            e.printStackTrace();
            return j;
        } catch (IllegalStateException e8) {
            e2 = e8;
            j = 600;
            e2.printStackTrace();
            return j;
        } catch (Exception e9) {
            e3 = e9;
            j = 600;
            e3.printStackTrace();
            return j;
        }
    }

    public boolean getEnableSound() {
        return this.mIsEnableSound;
    }

    public long getPlayDuration() {
        return this.mPlayDuration;
    }

    public boolean playSound(FaceStatusEnum faceStatusEnum) {
        this.mIsPlaying = System.currentTimeMillis() - SoundPlayer.playTime < this.mPlayDuration;
        if (this.mIsPlaying || (this.mPlaySoundStatusEnum == faceStatusEnum && System.currentTimeMillis() - this.mPlayTime < FaceEnvironment.TIME_TIPS_REPEAT)) {
            return false;
        }
        this.mIsPlaying = true;
        this.mPlaySoundStatusEnum = faceStatusEnum;
        this.mPlayDuration = 0;
        this.mPlayTime = System.currentTimeMillis();
        int soundId = FaceEnvironment.getSoundId(faceStatusEnum);
        if (soundId > 0) {
            this.mPlayDuration = getSoundDuration(soundId);
            SoundPlayer.playTime = System.currentTimeMillis();
            if (this.mIsEnableSound) {
                SoundPlayer.play(this.mContext, soundId);
            }
        }
        return this.mIsPlaying;
    }

    public void release() {
        SoundPlayer.release();
        this.mContext = null;
    }

    public void setEnableSound(boolean z) {
        this.mIsEnableSound = z;
    }
}
