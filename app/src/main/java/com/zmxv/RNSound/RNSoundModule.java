package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager.OnAudioFocusChangeListener {
    public static final Object NULL = null;
    public String category;
    public ReactApplicationContext context;
    public Double focusedPlayerKey;
    public Boolean mixWithOthers = true;
    public Map<Double, MediaPlayer> playerPool = new HashMap();
    public Boolean wasPlayingBeforeFocusChange = false;

    public class OooO00o implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23555OooO00o = false;

        public OooO00o(Callback callback) {
            this.OooO00o = callback;
        }

        public synchronized void onPrepared(MediaPlayer mediaPlayer) {
            if (!this.f23555OooO00o) {
                this.f23555OooO00o = true;
                WritableMap createMap = Arguments.createMap();
                double duration = (double) mediaPlayer.getDuration();
                Double.isNaN(duration);
                createMap.putDouble("duration", duration * 0.001d);
                try {
                    this.OooO00o.invoke(RNSoundModule.NULL, createMap);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public class OooO0O0 implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23557OooO00o = false;

        public OooO0O0(Callback callback) {
            this.OooO00o = callback;
        }

        public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (this.f23557OooO00o) {
                return true;
            }
            this.f23557OooO00o = true;
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("what", i);
                createMap.putInt("extra", i2);
                this.OooO00o.invoke(createMap, RNSoundModule.NULL);
            } catch (RuntimeException unused) {
            }
            return true;
        }
    }

    public class OooO0OO implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Double f23559OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23560OooO00o = false;

        public OooO0OO(Double d, Callback callback) {
            this.f23559OooO00o = d;
            this.OooO00o = callback;
        }

        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            if (!mediaPlayer.isLooping()) {
                RNSoundModule.this.setOnPlay(false, this.f23559OooO00o);
                if (!this.f23560OooO00o) {
                    this.f23560OooO00o = true;
                    try {
                        this.OooO00o.invoke(true);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.zmxv.RNSound.RNSoundModule$OooO0Oo  reason: case insensitive filesystem */
    public class C9894OooO0Oo implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ Callback OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Double f23562OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23563OooO00o = false;

        public C9894OooO0Oo(Double d, Callback callback) {
            this.f23562OooO00o = d;
            this.OooO00o = callback;
        }

        public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            RNSoundModule.this.setOnPlay(false, this.f23562OooO00o);
            if (this.f23563OooO00o) {
                return true;
            }
            this.f23563OooO00o = true;
            try {
                this.OooO00o.invoke(true);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public RNSoundModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
        this.category = null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setOnPlay(boolean z, Double d) {
        ReactApplicationContext reactApplicationContext = this.context;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z);
        createMap.putDouble("playerKey", d.doubleValue());
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPlayChange", createMap);
    }

    public MediaPlayer createMediaPlayer(String str) {
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor openRawResourceFd = this.context.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException unused) {
                return null;
            }
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException unused2) {
                return null;
            }
        } else if (str.startsWith("asset:/")) {
            try {
                AssetFileDescriptor openFd = this.context.getAssets().openFd(str.replace("asset:/", ""));
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                return mediaPlayer;
            } catch (IOException unused3) {
                return null;
            }
        } else {
            if (new File(str).exists()) {
                mediaPlayer.setAudioStreamType(3);
                Log.i("RNSoundModule", str);
                try {
                    mediaPlayer.setDataSource(str);
                    return mediaPlayer;
                } catch (IOException unused4) {
                }
            }
            return null;
        }
    }

    @ReactMethod
    public void enable(Boolean bool) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsAndroid", true);
        return hashMap;
    }

    @ReactMethod
    public void getCurrentTime(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer == null) {
            callback.invoke(-1, false);
            return;
        }
        double currentPosition = (double) mediaPlayer.getCurrentPosition();
        Double.isNaN(currentPosition);
        callback.invoke(Double.valueOf(currentPosition * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }

    @ReactMethod
    public void getSystemVolume(Callback callback) {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            callback.invoke(NULL, Float.valueOf(((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3))));
        } catch (Exception e) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", e.getMessage());
            callback.invoke(createMap);
        }
    }

    public void onAudioFocusChange(int i) {
        MediaPlayer mediaPlayer;
        if (!this.mixWithOthers.booleanValue() && (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) != null) {
            if (i <= 0) {
                Boolean valueOf = Boolean.valueOf(mediaPlayer.isPlaying());
                this.wasPlayingBeforeFocusChange = valueOf;
                if (valueOf.booleanValue()) {
                    pause(this.focusedPlayerKey, null);
                }
            } else if (this.wasPlayingBeforeFocusChange.booleanValue()) {
                play(this.focusedPlayerKey, null);
                this.wasPlayingBeforeFocusChange = false;
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Iterator<Map.Entry<Double, MediaPlayer>> it = this.playerPool.entrySet().iterator();
        while (it.hasNext()) {
            MediaPlayer value = it.next().getValue();
            if (value != null) {
                value.reset();
                value.release();
            }
            it.remove();
        }
    }

    @ReactMethod
    public void pause(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void play(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer == null) {
            setOnPlay(false, d);
            if (callback != null) {
                callback.invoke(false);
            }
        } else if (!mediaPlayer.isPlaying()) {
            if (!this.mixWithOthers.booleanValue()) {
                ((AudioManager) this.context.getSystemService("audio")).requestAudioFocus(this, 3, 1);
                this.focusedPlayerKey = d;
            }
            mediaPlayer.setOnCompletionListener(new OooO0OO(d, callback));
            mediaPlayer.setOnErrorListener(new C9894OooO0Oo(d, callback));
            mediaPlayer.start();
            setOnPlay(true, d);
        }
    }

    @ReactMethod
    public void prepare(String str, Double d, ReadableMap readableMap, Callback callback) {
        MediaPlayer createMediaPlayer = createMediaPlayer(str);
        char c = 65535;
        if (createMediaPlayer == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", "resource not found");
            callback.invoke(createMap, NULL);
            return;
        }
        this.playerPool.put(d, createMediaPlayer);
        String str2 = this.category;
        if (str2 != null) {
            Integer num = null;
            switch (str2.hashCode()) {
                case -1803461041:
                    if (str2.equals("System")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2547280:
                    if (str2.equals("Ring")) {
                        c = 4;
                        break;
                    }
                    break;
                case 82833682:
                    if (str2.equals("Voice")) {
                        c = 3;
                        break;
                    }
                    break;
                case 772508280:
                    if (str2.equals("Ambient")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1943812667:
                    if (str2.equals("Playback")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                num = 3;
            } else if (c == 1) {
                num = 5;
            } else if (c == 2) {
                num = 1;
            } else if (c == 3) {
                num = 0;
            } else if (c != 4) {
                String.format("Unrecognised category %s", this.category);
            } else {
                num = 2;
            }
            if (num != null) {
                createMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        createMediaPlayer.setOnPreparedListener(new OooO00o(callback));
        createMediaPlayer.setOnErrorListener(new OooO0O0(callback));
        try {
            if (!readableMap.hasKey("loadSync") || !readableMap.getBoolean("loadSync")) {
                createMediaPlayer.prepareAsync();
            } else {
                createMediaPlayer.prepare();
            }
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void release(Double d) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(d);
            if (!this.mixWithOthers.booleanValue() && d == this.focusedPlayerKey) {
                ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
            }
        }
    }

    @ReactMethod
    public void reset(Double d) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @ReactMethod
    public void setCategory(String str, Boolean bool) {
        this.category = str;
        this.mixWithOthers = bool;
    }

    @ReactMethod
    public void setCurrentTime(Double d, Float f) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(f.floatValue() * 1000.0f));
        }
    }

    @ReactMethod
    public void setLooping(Double d, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(Double d, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setAudioStreamType(3);
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            if (bool.booleanValue()) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeed(Double d, Float f) {
        MediaPlayer mediaPlayer;
        if (Build.VERSION.SDK_INT >= 23 && (mediaPlayer = this.playerPool.get(d)) != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f.floatValue()));
        }
    }

    @ReactMethod
    public void setSystemVolume(Float f) {
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        audioManager.setStreamVolume(3, Math.round(((float) audioManager.getStreamMaxVolume(3)) * f.floatValue()), 0);
    }

    @ReactMethod
    public void setVolume(Double d, Float f, Float f2) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f.floatValue(), f2.floatValue());
        }
    }

    @ReactMethod
    public void stop(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers.booleanValue() && d == this.focusedPlayerKey) {
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }
}
