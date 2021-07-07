package com.facebook.react.modules.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SystemClock;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.p118pd.sdk.C1IlLiL1;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7486o0OoO0oO;
import javax.annotation.Nullable;

@ReactModule(name = LocationModule.NAME)
@SuppressLint({"MissingPermission"})
public class LocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "LocationObserver";
    public static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    public final LocationListener mLocationListener = new LocationListener() {
        /* class com.facebook.react.modules.location.LocationModule.C07651 */

        public void onLocationChanged(Location location) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) LocationModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                LocationModule locationModule = LocationModule.this;
                int i2 = PositionError.POSITION_UNAVAILABLE;
                locationModule.emitError(i2, "Provider " + str + " is out of service.");
            } else if (i == 1) {
                LocationModule locationModule2 = LocationModule.this;
                int i3 = PositionError.TIMEOUT;
                locationModule2.emitError(i3, "Provider " + str + " is temporarily unavailable.");
            }
        }
    };
    @Nullable
    public String mWatchedProvider;

    public static class LocationOptions {
        public final float distanceFilter;
        public final boolean highAccuracy;
        public final double maximumAge;
        public final long timeout;

        public LocationOptions(long j, double d, boolean z, float f) {
            this.timeout = j;
            this.maximumAge = d;
            this.highAccuracy = z;
            this.distanceFilter = f;
        }

        public static LocationOptions fromReactMap(ReadableMap readableMap) {
            return new LocationOptions(readableMap.hasKey(C7486o0OoO0oO.f20312OooO0Oo) ? (long) readableMap.getDouble(C7486o0OoO0oO.f20312OooO0Oo) : Long.MAX_VALUE, readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY, readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy"), readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : 100.0f);
        }
    }

    public static class SingleUpdateRequest {
        public static final int TWO_MINUTES = 120000;
        public final Callback mError;
        public final Handler mHandler;
        public final LocationListener mLocationListener;
        public final LocationManager mLocationManager;
        public Location mOldLocation;
        public final String mProvider;
        public final Callback mSuccess;
        public final long mTimeout;
        public final Runnable mTimeoutRunnable;
        public boolean mTriggered;

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean isBetterLocation(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > C1IlLiL1.f22762OooO0O0;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (!z3 || z4) {
                return z3 && !z6 && isSameProvider;
            }
            return true;
        }

        private boolean isSameProvider(String str, String str2) {
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }

        public void invoke(Location location) {
            this.mOldLocation = location;
            this.mLocationManager.requestLocationUpdates(this.mProvider, 100, 1.0f, this.mLocationListener);
            this.mHandler.postDelayed(this.mTimeoutRunnable, this.mTimeout);
        }

        public SingleUpdateRequest(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.mHandler = new Handler();
            this.mTimeoutRunnable = new Runnable() {
                /* class com.facebook.react.modules.location.LocationModule.SingleUpdateRequest.RunnableC07661 */

                public void run() {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered) {
                            SingleUpdateRequest.this.mError.invoke(PositionError.buildError(PositionError.TIMEOUT, "Location request timed out"));
                            SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                            FLog.m885i(ReactConstants.TAG, "LocationModule: Location request timed out");
                            SingleUpdateRequest.this.mTriggered = true;
                        }
                    }
                }
            };
            this.mLocationListener = new LocationListener() {
                /* class com.facebook.react.modules.location.LocationModule.SingleUpdateRequest.C07672 */

                public void onLocationChanged(Location location) {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered && SingleUpdateRequest.this.isBetterLocation(location, SingleUpdateRequest.this.mOldLocation)) {
                            SingleUpdateRequest.this.mSuccess.invoke(LocationModule.locationToMap(location));
                            SingleUpdateRequest.this.mHandler.removeCallbacks(SingleUpdateRequest.this.mTimeoutRunnable);
                            SingleUpdateRequest.this.mTriggered = true;
                            SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                        }
                        SingleUpdateRequest.this.mOldLocation = location;
                    }
                }

                public void onProviderDisabled(String str) {
                }

                public void onProviderEnabled(String str) {
                }

                public void onStatusChanged(String str, int i, Bundle bundle) {
                }
            };
            this.mLocationManager = locationManager;
            this.mProvider = str;
            this.mTimeout = j;
            this.mSuccess = callback;
            this.mError = callback2;
        }
    }

    public LocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void emitError(int i, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", PositionError.buildError(i, str));
    }

    @Nullable
    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = "network";
        String str2 = z ? "gps" : str;
        if (!locationManager.isProviderEnabled(str2)) {
            if (!str2.equals("gps")) {
                str = "gps";
            }
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
            str2 = str;
        }
        int OooO00o = C7009o000OoOo.OooO00o((Context) getReactApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        if (!str2.equals("gps") || OooO00o == 0) {
            return str2;
        }
        return null;
    }

    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", (double) location.getAccuracy());
        createMap2.putDouble("heading", (double) location.getBearing());
        createMap2.putDouble("speed", (double) location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", (double) location.getTime());
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putBoolean("mocked", location.isFromMockProvider());
        }
        return createMap;
    }

    public static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
            if (validProvider == null) {
                callback2.invoke(PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || ((double) (SystemClock.currentTimeMillis() - lastKnownLocation.getTime())) >= fromReactMap.maximumAge) {
                new SingleUpdateRequest(locationManager, validProvider, fromReactMap.timeout, callback, callback2).invoke(lastKnownLocation);
                return;
            }
            callback.invoke(locationToMap(lastKnownLocation));
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!"gps".equals(this.mWatchedProvider)) {
            LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
                String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
                if (validProvider == null) {
                    emitError(PositionError.POSITION_UNAVAILABLE, "No location provider available.");
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    locationManager.removeUpdates(this.mLocationListener);
                    locationManager.requestLocationUpdates(validProvider, 1000, fromReactMap.distanceFilter, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e) {
                throwLocationPermissionMissing(e);
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
