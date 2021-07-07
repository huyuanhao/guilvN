package com.baidu.idl.face.platform.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.SoundPool;
import android.util.SparseIntArray;

public final class SoundPlayer {
    public static final boolean DEBUG = false;
    public static final long LOAD_SOUND_MILLIS = 100;
    public static final int MAX_STREAMS = 5;
    public static final String TAG = "SoundPlayer";
    public static long playTime;
    public static SoundPlayer sSoundPlayer;
    public SoundPool mSoundPool = new SoundPool(5, 3, 0);
    public SparseIntArray mSoundPoolCache = new SparseIntArray();

    public SoundPlayer() {
        playTime = 0;
    }

    @SuppressLint({"NewApi"})
    public static void play(Context context, int i) {
        if (sSoundPlayer == null) {
            sSoundPlayer = new SoundPlayer();
        }
        int i2 = sSoundPlayer.mSoundPoolCache.get(i);
        if (i2 == 0) {
            final int load = sSoundPlayer.mSoundPool.load(context, i, 1);
            sSoundPlayer.mSoundPoolCache.put(i, load);
            if (APIUtils.hasFroyo()) {
                sSoundPlayer.mSoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    /* class com.baidu.idl.face.platform.utils.SoundPlayer.C04331 */

                    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                        if (i2 == 0 && load == i) {
                            try {
                                SoundPlayer.playTime = System.currentTimeMillis();
                                SoundPlayer.sSoundPlayer.mSoundPool.play(load, 1.0f, 1.0f, 5, 0, 1.0f);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
                return;
            }
            try {
                Thread.currentThread().join(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            playTime = System.currentTimeMillis();
            sSoundPlayer.mSoundPool.play(load, 1.0f, 1.0f, 5, 0, 1.0f);
            return;
        }
        try {
            sSoundPlayer.mSoundPool.play(i2, 1.0f, 1.0f, 5, 0, 1.0f);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void release() {
        SoundPlayer soundPlayer = sSoundPlayer;
        if (soundPlayer != null) {
            int size = soundPlayer.mSoundPoolCache.size();
            for (int i = 0; i < size; i++) {
                SoundPlayer soundPlayer2 = sSoundPlayer;
                soundPlayer2.mSoundPool.unload(soundPlayer2.mSoundPoolCache.valueAt(i));
            }
            sSoundPlayer.mSoundPool.release();
            SoundPlayer soundPlayer3 = sSoundPlayer;
            soundPlayer3.mSoundPool = null;
            soundPlayer3.mSoundPoolCache.clear();
            sSoundPlayer.mSoundPoolCache = null;
            sSoundPlayer = null;
        }
    }
}
