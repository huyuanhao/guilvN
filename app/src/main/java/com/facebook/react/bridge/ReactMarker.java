package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@DoNotStrip
public class ReactMarker {
    public static final List<MarkerListener> sListeners = new ArrayList();

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i);
    }

    @DoNotStrip
    public static void addListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            if (!sListeners.contains(markerListener)) {
                sListeners.add(markerListener);
            }
        }
    }

    @DoNotStrip
    public static void clearMarkerListeners() {
        synchronized (sListeners) {
            sListeners.clear();
        }
    }

    @DoNotStrip
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @DoNotStrip
    public static void removeListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            sListeners.remove(markerListener);
        }
    }

    @DoNotStrip
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @DoNotStrip
    public static void logMarker(String str, @Nullable String str2) {
        logMarker(str, str2, 0);
    }

    @DoNotStrip
    public static void logMarker(String str, @Nullable String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i) {
        synchronized (sListeners) {
            for (MarkerListener markerListener : sListeners) {
                markerListener.logMarker(reactMarkerConstants, str, i);
            }
        }
    }
}
