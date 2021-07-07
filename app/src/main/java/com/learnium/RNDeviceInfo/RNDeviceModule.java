package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.learnium.RNDeviceInfo.resolver.DeviceIdResolver;
import com.learnium.RNDeviceInfo.resolver.DeviceTypeResolver;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8912ooOO0o0;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.MsgConstant;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

@ReactModule(name = RNDeviceModule.NAME)
public class RNDeviceModule extends ReactContextBaseJavaModule {
    public static String BATTERY_LEVEL = "batteryLevel";
    public static String BATTERY_STATE = "batteryState";
    public static final String LOG_TYPE = "DeviceInfo";
    public static String LOW_POWER_MODE = "lowPowerMode";
    public static final String NAME = "RNDeviceInfo";
    public final DeviceIdResolver deviceIdResolver;
    public final DeviceTypeResolver deviceTypeResolver;
    public RNInstallReferrerClient installReferrerClient;
    public double mLastBatteryLevel = -1.0d;
    public ReactApplicationContext reactContext;
    public BroadcastReceiver receiver;
    public String sLastBatteryState = "";

    public RNDeviceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.deviceTypeResolver = new DeviceTypeResolver(reactApplicationContext);
        this.deviceIdResolver = new DeviceIdResolver(reactApplicationContext);
        this.installReferrerClient = new RNInstallReferrerClient(reactApplicationContext.getBaseContext());
    }

    private PackageInfo getPackageInfo() throws Exception {
        return getReactApplicationContext().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getPowerStateFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra(C8912ooOO0o0.OooO0O0, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        int intExtra3 = intent.getIntExtra("plugged", -1);
        int intExtra4 = intent.getIntExtra("status", -1);
        float f = ((float) intExtra) / ((float) intExtra2);
        String str = intExtra3 == 0 ? "unplugged" : intExtra4 == 2 ? "charging" : intExtra4 == 5 ? "full" : "unknown";
        PowerManager powerManager = (PowerManager) getReactApplicationContext().getSystemService("power");
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = powerManager.isPowerSaveMode();
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(BATTERY_STATE, str);
        createMap.putDouble(BATTERY_LEVEL, (double) f);
        createMap.putBoolean(LOW_POWER_MODE, z);
        return createMap;
    }

    @SuppressLint({"MissingPermission"})
    private WifiInfo getWifiInfo() {
        WifiManager wifiManager = (WifiManager) getReactApplicationContext().getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(ReactContext reactContext2, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void getAndroidId(Promise promise) {
        promise.resolve(getAndroidIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getAndroidIdSync() {
        return getUniqueIdSync();
    }

    @ReactMethod
    public void getApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(getApiLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getApiLevelSync() {
        return Build.VERSION.SDK_INT;
    }

    @ReactMethod
    public void getAppCurrentMemory(Promise promise) {
        promise.resolve(Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getAppCurrentMemory(getReactApplicationContext()))));
    }

    @ReactMethod
    public void getAvailableLocationProviders(Promise promise) {
        promise.resolve(getAvailableLocationProvidersSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAvailableLocationProvidersSync() {
        LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
        WritableMap createMap = Arguments.createMap();
        try {
            for (String str : locationManager.getProviders(false)) {
                createMap.putBoolean(str, locationManager.isProviderEnabled(str));
            }
        } catch (Exception unused) {
            System.err.println("Unable to get location providers. LocationManager was null");
        }
        return createMap;
    }

    @ReactMethod
    public void getBaseOs(Promise promise) {
        promise.resolve(getBaseOsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBaseOsSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.BASE_OS : "unknown";
    }

    @ReactMethod
    public void getBatteryLevel(Promise promise) {
        promise.resolve(Double.valueOf(getBatteryLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getBatteryLevelSync() {
        WritableMap powerStateFromIntent = getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        if (powerStateFromIntent == null) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        return powerStateFromIntent.getDouble(BATTERY_LEVEL);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBiologicalInfo() {
        String biologicalInfo = JHDeviceManager.getBiologicalInfo(getReactApplicationContext());
        WritableMap createMap = Arguments.createMap();
        if ("IS_SUPPORTED".equals(biologicalInfo)) {
            createMap.putString("code", "SUCCESS");
            createMap.putString("biometryType", "TouchID");
        } else {
            createMap.putString("biometryType", "TouchID");
            createMap.putString("code", biologicalInfo);
        }
        return createMap;
    }

    @ReactMethod
    public void getBootloader(Promise promise) {
        promise.resolve(getBootloaderSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBootloaderSync() {
        return Build.BOOTLOADER;
    }

    @ReactMethod
    public void getBuildId(Promise promise) {
        promise.resolve(getBuildIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBuildIdSync() {
        return Build.ID;
    }

    @ReactMethod
    public void getCarrier(Promise promise) {
        promise.resolve(getCarrierSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCarrierSync() {
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        System.err.println("Unable to get network operator name. TelephonyManager was null");
        return "unknown";
    }

    @ReactMethod
    public void getCodename(Promise promise) {
        promise.resolve(getCodenameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCodenameSync() {
        return Build.VERSION.CODENAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String str;
        try {
            String str2 = getPackageInfo().versionName;
            str = Integer.toString(getPackageInfo().versionCode);
            getReactApplicationContext().getApplicationInfo().loadLabel(getReactApplicationContext().getPackageManager()).toString();
        } catch (Exception unused) {
            str = "unknown";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uniqueId", getUniqueIdSync());
        hashMap.put("deviceId", JHDeviceManager.getDeviceId(getReactApplicationContext()));
        hashMap.put("bundleId", getReactApplicationContext().getPackageName());
        hashMap.put("systemName", JHDeviceManager.getSystemName());
        hashMap.put("systemVersion", JHDeviceManager.getSystemVersion());
        hashMap.put("buildNumber", str);
        hashMap.put("isTablet", Boolean.valueOf(this.deviceTypeResolver.isTablet()));
        hashMap.put(Constants.KEY_PACKAGE_NAME, JHDeviceManager.getPackageName(getReactApplicationContext()));
        hashMap.put(DispatchConstants.APP_NAME, JHDeviceManager.getAppName(getReactApplicationContext()));
        hashMap.put("appVersion", JHDeviceManager.getAppVersion(getReactApplicationContext()));
        hashMap.put("brand", Build.BRAND);
        hashMap.put(Constants.KEY_MODEL, JHDeviceManager.getModel());
        hashMap.put("deviceType", this.deviceTypeResolver.getDeviceType().getValue());
        hashMap.put(C3617o.f9396y, JHDeviceManager.getResolution(getReactApplicationContext()));
        hashMap.put("statusBarHeight", Integer.valueOf(JHDeviceManager.getStatusBarHeight(getReactApplicationContext())));
        hashMap.put("density", JHDeviceManager.getDensity(getReactApplicationContext()));
        hashMap.put("biologicalInfo", getBiologicalInfo());
        hashMap.put("isRoot", Integer.valueOf(JHDeviceManager.isRoot() ? 1 : 0));
        hashMap.put("deviceVendor", JHDeviceManager.getDeviceVendor());
        hashMap.put("isRealDevice", Integer.valueOf(!JHDeviceManager.isEmulator() ? 1 : 0));
        hashMap.put("macAddress", JHDeviceManager.getMacAddress());
        hashMap.put("deviceTotalMemory", Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getDeviceTotalMemory(getReactApplicationContext()))));
        hashMap.put("appMaxAvailableMemory", Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getAppMaxAvailableMemory())));
        return hashMap;
    }

    @ReactMethod
    public void getDevice(Promise promise) {
        promise.resolve(getDeviceSync());
    }

    @ReactMethod
    public void getDeviceAvailableMemory(Promise promise) {
        promise.resolve(Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getDeviceAvailableMemory(getReactApplicationContext()))));
    }

    @ReactMethod
    public void getDeviceName(Promise promise) {
        promise.resolve(getDeviceNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceNameSync() {
        String string;
        try {
            String string2 = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "bluetooth_name");
            if (string2 != null) {
                return string2;
            }
            return (Build.VERSION.SDK_INT < 25 || (string = Settings.Global.getString(getReactApplicationContext().getContentResolver(), C3617o.f9322I)) == null) ? "unknown" : string;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceSync() {
        return Build.DEVICE;
    }

    @ReactMethod
    public void getDisplay(Promise promise) {
        promise.resolve(getDisplaySync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDisplaySync() {
        return Build.DISPLAY;
    }

    @ReactMethod
    public void getFingerprint(Promise promise) {
        promise.resolve(getFingerprintSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFingerprintSync() {
        return Build.FINGERPRINT;
    }

    @ReactMethod
    public void getFirstInstallTime(Promise promise) {
        promise.resolve(Double.valueOf(getFirstInstallTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFirstInstallTimeSync() {
        try {
            return (double) getPackageInfo().firstInstallTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getFontScale(Promise promise) {
        promise.resolve(Float.valueOf(getFontScaleSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getFontScaleSync() {
        return getReactApplicationContext().getResources().getConfiguration().fontScale;
    }

    @ReactMethod
    public void getFreeDiskStorage(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageSync() {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (Build.VERSION.SDK_INT < 18) {
                j2 = (long) statFs.getAvailableBlocks();
                j = (long) statFs.getBlockSize();
            } else {
                j2 = statFs.getAvailableBlocksLong();
                j = statFs.getBlockSizeLong();
            }
            return BigInteger.valueOf(j2).multiply(BigInteger.valueOf(j)).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getFreeMemory(Promise promise) {
        promise.resolve(Double.valueOf(JHDeviceManager.getFreeMemory()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeMemorySync() {
        return JHDeviceManager.getFreeMemory();
    }

    @ReactMethod
    public void getHardware(Promise promise) {
        promise.resolve(getHardwareSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHardwareSync() {
        return Build.HARDWARE;
    }

    @ReactMethod
    public void getHost(Promise promise) {
        promise.resolve(getHostSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHostSync() {
        return Build.HOST;
    }

    @ReactMethod
    public void getICCID(Promise promise) {
        promise.resolve(JHDeviceManager.getICCID(getReactApplicationContext()));
    }

    @ReactMethod
    public void getIMEI(Promise promise) {
        promise.resolve(JHDeviceManager.getIMEI(getReactApplicationContext()));
    }

    @ReactMethod
    public void getIMSI(Promise promise) {
        promise.resolve(JHDeviceManager.getIMSI(getReactApplicationContext()));
    }

    @ReactMethod
    public void getIncremental(Promise promise) {
        promise.resolve(getIncrementalSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIncrementalSync() {
        return Build.VERSION.INCREMENTAL;
    }

    @ReactMethod
    public void getInstallReferrer(Promise promise) {
        promise.resolve(getInstallReferrerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallReferrerSync() {
        return getReactApplicationContext().getSharedPreferences("react-native-device-info", 0).getString("installReferrer", "unknown");
    }

    @ReactMethod
    public void getInstallerPackageName(Promise promise) {
        promise.resolve(getInstallerPackageNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallerPackageNameSync() {
        String installerPackageName = getReactApplicationContext().getPackageManager().getInstallerPackageName(getReactApplicationContext().getPackageName());
        return installerPackageName == null ? "unknown" : installerPackageName;
    }

    @ReactMethod
    public void getInstanceId(Promise promise) {
        promise.resolve(getInstanceIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstanceIdSync() {
        return this.deviceIdResolver.getInstanceIdSync();
    }

    @ReactMethod
    public void getIpAddress(Promise promise) {
        promise.resolve(getIpAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIpAddressSync() {
        try {
            return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(getWifiInfo().getIpAddress()).array()).getHostAddress();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod
    public void getLastUpdateTime(Promise promise) {
        promise.resolve(Double.valueOf(getLastUpdateTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getLastUpdateTimeSync() {
        try {
            return (double) getPackageInfo().lastUpdateTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getMacAddress(Promise promise) {
        promise.resolve(getMacAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getMacAddressSync() {
        String str;
        WifiInfo wifiInfo = getWifiInfo();
        if (wifiInfo != null) {
            str = wifiInfo.getMacAddress();
        } else {
            str = "";
        }
        if (getReactApplicationContext().checkCallingOrSelfPermission(MsgConstant.PERMISSION_INTERNET) == 0) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            str = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            int length = hardwareAddress.length;
                            for (int i = 0; i < length; i++) {
                                sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                            }
                            if (sb.length() > 0) {
                                sb.deleteCharAt(sb.length() - 1);
                            }
                            str = sb.toString();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    @ReactMethod
    public void getMaxMemory(Promise promise) {
        promise.resolve(Double.valueOf(getMaxMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getMaxMemorySync() {
        return (double) Runtime.getRuntime().maxMemory();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        promise.resolve(getPhoneNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String getPhoneNumberSync() {
        if (getReactApplicationContext() == null) {
            return "unknown";
        }
        if (getReactApplicationContext().checkCallingOrSelfPermission(MsgConstant.PERMISSION_READ_PHONE_STATE) != 0 && ((Build.VERSION.SDK_INT < 23 || getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_SMS") != 0) && (Build.VERSION.SDK_INT < 26 || getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0))) {
            return "unknown";
        }
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getLine1Number();
        }
        System.err.println("Unable to getPhoneNumber. TelephonyManager was null");
        return "unknown";
    }

    @ReactMethod
    public void getPowerState(Promise promise) {
        promise.resolve(getPowerStateSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPowerStateSync() {
        return getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @ReactMethod
    public void getPreviewSdkInt(Promise promise) {
        promise.resolve(getPreviewSdkIntSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPreviewSdkIntSync() {
        return Build.VERSION.SDK_INT >= 23 ? Integer.toString(Build.VERSION.PREVIEW_SDK_INT) : "unknown";
    }

    @ReactMethod
    public void getProduct(Promise promise) {
        promise.resolve(getProductSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProductSync() {
        return Build.PRODUCT;
    }

    @ReactMethod
    public void getSecurityPatch(Promise promise) {
        promise.resolve(getSecurityPatchSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSecurityPatchSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.SECURITY_PATCH : "unknown";
    }

    @ReactMethod
    public void getSerialNumber(Promise promise) {
        promise.resolve(getSerialNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String getSerialNumberSync() {
        try {
            if (Build.VERSION.SDK_INT < 26 || getReactApplicationContext().checkCallingOrSelfPermission(MsgConstant.PERMISSION_READ_PHONE_STATE) != 0) {
                return "unknown";
            }
            return Build.getSerial();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("getSerialNumber failed, it probably should not be used: " + e.getMessage());
            return "unknown";
        }
    }

    @ReactMethod
    public void getSupported32BitAbis(Promise promise) {
        promise.resolve(getSupported32BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported32BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_32_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupported64BitAbis(Promise promise) {
        promise.resolve(getSupported64BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported64BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_64_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupportedAbis(Promise promise) {
        promise.resolve(getSupportedAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupportedAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                writableNativeArray.pushString(str);
            }
        } else {
            writableNativeArray.pushString(Build.CPU_ABI);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSystemAvailableFeatures(Promise promise) {
        promise.resolve(getSystemAvailableFeaturesSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSystemAvailableFeaturesSync() {
        FeatureInfo[] systemAvailableFeatures = getReactApplicationContext().getPackageManager().getSystemAvailableFeatures();
        WritableArray createArray = Arguments.createArray();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            String str = featureInfo.name;
            if (str != null) {
                createArray.pushString(str);
            }
        }
        return createArray;
    }

    @ReactMethod
    public void getSystemManufacturer(Promise promise) {
        promise.resolve(getSystemManufacturerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemManufacturerSync() {
        return Build.MANUFACTURER;
    }

    @ReactMethod
    public void getTags(Promise promise) {
        promise.resolve(getTagsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTagsSync() {
        return Build.TAGS;
    }

    @ReactMethod
    public void getTotalDiskCapacity(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacitySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacitySync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return BigInteger.valueOf((long) statFs.getBlockCount()).multiply(BigInteger.valueOf((long) statFs.getBlockSize())).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getTotalMemory(Promise promise) {
        promise.resolve(getTotalMemorySync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTotalMemorySync() {
        return JHDeviceManager.getAppMaxAvailableMemory();
    }

    @ReactMethod
    public void getType(Promise promise) {
        promise.resolve(getTypeSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTypeSync() {
        return Build.TYPE;
    }

    @ReactMethod
    public void getUMPN(Promise promise) {
        promise.resolve(JHDeviceManager.getUMPN(getReactApplicationContext()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getUniqueIdSync() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @ReactMethod
    public void getUsedMemory(Promise promise) {
        promise.resolve(0);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getUsedMemorySync() {
        return 0;
    }

    @ReactMethod
    public void getUserAgent(Promise promise) {
        promise.resolve(getUserAgentSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserAgentSync() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return WebSettings.getDefaultUserAgent(getReactApplicationContext());
            }
            return System.getProperty("http.agent");
        } catch (RuntimeException unused) {
            return System.getProperty("http.agent");
        }
    }

    @ReactMethod
    public void hasSystemFeature(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(hasSystemFeatureSync(str)));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasSystemFeatureSync(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        return getReactApplicationContext().getPackageManager().hasSystemFeature(str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        this.receiver = new BroadcastReceiver() {
            /* class com.learnium.RNDeviceInfo.RNDeviceModule.C14401 */

            public void onReceive(Context context, Intent intent) {
                WritableMap powerStateFromIntent = RNDeviceModule.this.getPowerStateFromIntent(intent);
                if (powerStateFromIntent != null) {
                    String string = powerStateFromIntent.getString(RNDeviceModule.BATTERY_STATE);
                    Double valueOf = Double.valueOf(powerStateFromIntent.getDouble(RNDeviceModule.BATTERY_LEVEL));
                    if (!RNDeviceModule.this.sLastBatteryState.equalsIgnoreCase(string)) {
                        RNDeviceModule rNDeviceModule = RNDeviceModule.this;
                        rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_powerStateDidChange", string);
                        RNDeviceModule.this.sLastBatteryState = string;
                    }
                    if (RNDeviceModule.this.mLastBatteryLevel != valueOf.doubleValue()) {
                        RNDeviceModule rNDeviceModule2 = RNDeviceModule.this;
                        rNDeviceModule2.sendEvent(rNDeviceModule2.getReactApplicationContext(), "RNDeviceInfo_batteryLevelDidChange", valueOf);
                        if (valueOf.doubleValue() <= 0.15d) {
                            RNDeviceModule rNDeviceModule3 = RNDeviceModule.this;
                            rNDeviceModule3.sendEvent(rNDeviceModule3.getReactApplicationContext(), "RNDeviceInfo_batteryLevelIsLow", valueOf);
                        }
                        RNDeviceModule.this.mLastBatteryLevel = valueOf.doubleValue();
                    }
                }
            }
        };
        getReactApplicationContext().registerReceiver(this.receiver, intentFilter);
    }

    @ReactMethod
    public void isAirplaneMode(Promise promise) {
        promise.resolve(Boolean.valueOf(isAirplaneModeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAirplaneModeSync() {
        if (Build.VERSION.SDK_INT < 17) {
            if (Settings.System.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
        } else if (Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isBatteryCharging(Promise promise) {
        promise.resolve(Boolean.valueOf(isBatteryChargingSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isBatteryChargingSync() {
        Intent registerReceiver = getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if ((registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : 0) == 2) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isCameraPresent(Promise promise) {
        promise.resolve(Boolean.valueOf(isCameraPresentSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isCameraPresentSync() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                if (((CameraManager) getReactApplicationContext().getSystemService("camera")).getCameraIdList().length > 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        } else if (Camera.getNumberOfCameras() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @ReactMethod
    public void isEmulator(Promise promise) {
        promise.resolve(Boolean.valueOf(isEmulatorSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public boolean isEmulatorSync() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.toLowerCase().contains("droid4x") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Build.HARDWARE.contains("vbox86") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains("simulator") || Build.BOARD.toLowerCase().contains("nox") || Build.BOOTLOADER.toLowerCase().contains("nox") || Build.HARDWARE.toLowerCase().contains("nox") || Build.PRODUCT.toLowerCase().contains("nox") || Build.SERIAL.toLowerCase().contains("nox") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"));
    }

    @ReactMethod
    public void isHeadphonesConnected(Promise promise) {
        promise.resolve(Boolean.valueOf(isHeadphonesConnectedSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isHeadphonesConnectedSync() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
    }

    @ReactMethod
    public void isLocationEnabled(Promise promise) {
        promise.resolve(Boolean.valueOf(isLocationEnabledSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isLocationEnabledSync() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            try {
                return ((LocationManager) getReactApplicationContext().getSystemService("location")).isLocationEnabled();
            } catch (Exception unused) {
                System.err.println("Unable to determine if location enabled. LocationManager was null");
                return false;
            }
        } else if (i < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "location_providers_allowed"));
        } else {
            if (Settings.Secure.getInt(getReactApplicationContext().getContentResolver(), "location_mode", 0) != 0) {
                z = true;
            }
            return z;
        }
    }

    @ReactMethod
    public void isPinOrFingerprintSet(Promise promise) {
        promise.resolve(Boolean.valueOf(isPinOrFingerprintSetSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPinOrFingerprintSetSync() {
        KeyguardManager keyguardManager = (KeyguardManager) getReactApplicationContext().getSystemService("keyguard");
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardSecure();
        }
        System.err.println("Unable to determine keyguard status. KeyguardManager was null");
        return false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        getReactApplicationContext().unregisterReceiver(this.receiver);
    }

    @ReactMethod
    public void openSystemSetting(ReadableMap readableMap, Promise promise) {
        this.reactContext.getCurrentActivity().startActivity(new Intent("android.settings.SETTINGS"));
    }

    @ReactMethod
    public void setStatusBarColor(String str, boolean z) {
        JHDeviceManager.setStatusBarColor(getCurrentActivity(), str, z);
    }

    @ReactMethod
    public void setStatusBarDarkTheme(boolean z) {
        JHDeviceManager.setStatusBarDarkTheme(this.reactContext.getCurrentActivity(), z);
    }

    @ReactMethod
    public void setTranslucentStatus(boolean z) {
        JHDeviceManager.setTranslucentStatus(this.reactContext.getCurrentActivity(), z);
    }

    @ReactMethod
    public void switchLayoutFullScreenState(boolean z) {
        JHDeviceManager.switchLayoutFullScreenState(z, this.reactContext.getCurrentActivity());
    }
}
