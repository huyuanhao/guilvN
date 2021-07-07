package p284io.realm.react;

import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p283fi.iki.elonen.NanoHTTPD;

/* renamed from: io.realm.react.RealmReactModule */
public class RealmReactModule extends ReactContextBaseJavaModule {
    public static final int DEFAULT_PORT = 8083;
    public static boolean sentAnalytics;
    public final AssetManager assetManager;
    public AndroidWebServer webServer;
    public Handler worker;
    public HandlerThread workerThread;

    static {
        SoLoader.loadLibrary("realmreact");
    }

    public RealmReactModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.assetManager = reactApplicationContext.getResources().getAssets();
        try {
            setDefaultRealmFileDirectory(reactApplicationContext.getFilesDir().getCanonicalPath(), this.assetManager);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private native void clearContextInjectedFlag();

    private List<String> getIPAddresses() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.isLoopback()) {
                    if (nextElement.isUp()) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                                if (!nextElement2.isAnyLocalAddress()) {
                                    arrayList.add(nextElement2.getHostAddress());
                                }
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private native boolean isContextInjected();

    public static boolean isRunningOnEmulator() {
        return Build.FINGERPRINT.contains("vbox") || Build.FINGERPRINT.contains("generic");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native String processChromeDebugCommand(String str, String str2);

    private native void setDefaultRealmFileDirectory(String str, AssetManager assetManager2);

    private native long setupChromeDebugModeRealmJsContext();

    private void startWebServer() {
        setupChromeDebugModeRealmJsContext();
        startWorker();
        AndroidWebServer androidWebServer = new AndroidWebServer(DEFAULT_PORT, getReactApplicationContext());
        this.webServer = androidWebServer;
        try {
            androidWebServer.start();
            Log.i("Realm", "Starting the debugging WebServer, Host: " + this.webServer.getHostname() + " Port: " + this.webServer.getListeningPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startWorker() {
        HandlerThread handlerThread = new HandlerThread("MyHandlerThread");
        this.workerThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.workerThread.getLooper());
        this.worker = handler;
        handler.postDelayed(new Runnable() {
            /* class p284io.realm.react.RealmReactModule.RunnableC47381 */

            public void run() {
                if (!RealmReactModule.this.tryRunTask()) {
                    RealmReactModule.this.worker.postDelayed(this, 10);
                }
            }
        }, 10);
    }

    private void stopWebServer() {
        if (this.webServer != null) {
            Log.i("Realm", "Stopping the webserver");
            this.webServer.stop();
        }
        HandlerThread handlerThread = this.workerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.workerThread = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native boolean tryRunTask();

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        List<String> list;
        if (isContextInjected()) {
            return Collections.emptyMap();
        }
        startWebServer();
        if (isRunningOnEmulator()) {
            list = Arrays.asList(AndroidInfoHelpers.DEVICE_LOCALHOST);
        } else {
            list = getIPAddresses();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("debugHosts", list);
        hashMap.put("debugPort", Integer.valueOf((int) DEFAULT_PORT));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Realm";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        clearContextInjectedFlag();
        stopWebServer();
    }

    /* renamed from: io.realm.react.RealmReactModule$AndroidWebServer */
    public class AndroidWebServer extends NanoHTTPD {
        public ReactApplicationContext reactApplicationContext;

        public AndroidWebServer(int i, ReactApplicationContext reactApplicationContext2) {
            super(i);
            this.reactApplicationContext = reactApplicationContext2;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD
        public NanoHTTPD.Response serve(NanoHTTPD.AbstractC9899OooOO0o oooOO0o) {
            String OooO00o = oooOO0o.m22093OooO00o();
            HashMap hashMap = new HashMap();
            try {
                oooOO0o.OooO00o(hashMap);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NanoHTTPD.ResponseException e2) {
                e2.printStackTrace();
            }
            String str = (String) hashMap.get("postData");
            if (str == null) {
                NanoHTTPD.Response newFixedLengthResponse = NanoHTTPD.newFixedLengthResponse("");
                newFixedLengthResponse.OooO00o("Access-Control-Allow-Origin", "http://localhost:8081");
                return newFixedLengthResponse;
            }
            NanoHTTPD.Response newFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(RealmReactModule.this.processChromeDebugCommand(OooO00o, str));
            newFixedLengthResponse2.OooO00o("Access-Control-Allow-Origin", "http://localhost:8081");
            return newFixedLengthResponse2;
        }

        public AndroidWebServer(String str, int i, ReactApplicationContext reactApplicationContext2) {
            super(str, i);
            this.reactApplicationContext = reactApplicationContext2;
        }
    }
}
