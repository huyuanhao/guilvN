package org.android.spdy;

import android.content.Context;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8318oOo0oooo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class SpdyAgent {
    public static final int ACCS_ONLINE_SERVER = 1;
    public static final int ACCS_TEST_SERVER = 0;
    public static final boolean HAVE_CLOSE = false;
    public static final int KB32 = 32768;
    public static final int KB8 = 8192;
    public static final int MAX_SPDY_SESSION_COUNT = 50;
    public static final int MB5 = 5242880;
    public static final int MODE_QUIC = 256;
    public static final int SPDY_CUSTOM_CONTROL_FRAME_RECV = 4106;
    public static final int SPDY_DATA_CHUNK_RECV = 4097;
    public static final int SPDY_DATA_RECV = 4098;
    public static final int SPDY_DATA_SEND = 4099;
    public static final int SPDY_PING_RECV = 4101;
    public static final int SPDY_REQUEST_RECV = 4102;
    public static final int SPDY_SESSION_CLOSE = 4103;
    public static final int SPDY_SESSION_CREATE = 4096;
    public static final int SPDY_SESSION_FAILED_ERROR = 4105;
    public static final int SPDY_STREAM_CLOSE = 4100;
    public static final int SPDY_STREAM_RESPONSE_RECV = 4104;
    public static final String TNET_SO_VERSION = "tnet-3.1.14";
    public static Object domainHashLock = new Object();
    public static HashMap<String, Integer> domainHashMap = new HashMap<>();
    public static volatile boolean enableDebug;
    public static volatile boolean enableTimeGaurd;
    public static volatile SpdyAgent gSingleInstance = null;
    public static volatile boolean loadSucc = false;
    public static Object lock = new Object();

    /* renamed from: r */
    public static final Lock f13481r;
    public static final ReentrantReadWriteLock rwLock;
    public static int totalDomain = 0;

    /* renamed from: w */
    public static final Lock f13482w = rwLock.writeLock();
    public AccsSSLCallback accsSSLCallback;
    public long agentNativePtr;
    public AtomicBoolean closed = new AtomicBoolean();
    public String proxyPassword = null;
    public String proxyUsername = null;
    public HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    public LinkedList<SpdySession> sessionQueue = new LinkedList<>();

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        f13481r = reentrantReadWriteLock.readLock();
    }

    public SpdyAgent(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback2) throws UnsatisfiedLinkError {
        try {
            SoInstallMgrSdk.init(context);
            loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            this.agentNativePtr = initAgent(spdyVersion.getInt(), spdySessionKind.getint(), SslVersion.SLIGHT_VERSION_V1.getint());
            this.accsSSLCallback = accsSSLCallback2;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        this.closed.set(false);
    }

    public static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 255) < 32 || (bArr[i] & 255) > 126) {
                bArr[i] = 63;
            }
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if ((bArr2[i2] & 255) < 32 || (bArr2[i2] & 255) > 126) {
                bArr2[i2] = 63;
            }
        }
    }

    private void agentIsOpen() {
        if (!this.closed.get()) {
            checkLoadSo();
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", (int) TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i) {
        spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.bioPingRecvCallback(spdySession, i);
        }
    }

    private void checkLoadSo() throws SpdyErrorException {
        if (!loadSucc) {
            try {
                synchronized (lock) {
                    if (!loadSucc) {
                        loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
                        this.agentNativePtr = initAgent(0, 0, 0);
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            return;
        }
        if (!loadSucc) {
            throw new SpdyErrorException("TNET_JNI_ERR_LOAD_SO_FAIL", (int) TnetStatusCode.TNET_JNI_ERR_LOAD_SO_FAIL);
        }
    }

    public static boolean checkLoadSucc() {
        return loadSucc;
    }

    private native int closeSessionN(long j);

    public static int configIpStackMode(int i) {
        spduLog.Logi("tnet-jni", "[configIpStackMode] - " + i);
        return configIpStackModeN(i);
    }

    public static native int configIpStackModeN(int i);

    private native int configLogFileN(String str, int i, int i2);

    private native int configLogFileN(String str, int i, int i2, int i3);

    public static void crashReporter(int i) {
    }

    private native long createSessionN(long j, SpdySession spdySession, int i, byte[] bArr, char c, byte[] bArr2, char c2, byte[] bArr3, byte[] bArr4, Object obj, int i2, int i3, int i4, byte[] bArr5);

    public static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        byte[] bArr;
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String mapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        if (mapBodyToString != null) {
            bArr = mapBodyToString.getBytes();
        } else {
            bArr = spdyDataProvider.data;
        }
        if (bArr == null || bArr.length < 5242880) {
            return bArr;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + bArr.length, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int freeAgent(long j);

    private int getDomainHashIndex(String str) {
        Integer num;
        synchronized (domainHashLock) {
            num = domainHashMap.get(str);
            if (num == null) {
                HashMap<String, Integer> hashMap = domainHashMap;
                int i = totalDomain + 1;
                totalDomain = i;
                hashMap.put(str, Integer.valueOf(i));
                num = Integer.valueOf(totalDomain);
            }
        }
        return num.intValue();
    }

    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) throws UnsatisfiedLinkError, SpdyErrorException {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, null);
                }
            }
        }
        return gSingleInstance;
    }

    private void getPerformance(SpdySession spdySession, SslPermData sslPermData) {
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[getSSLMeta] - session is null");
            return null;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.getSSLMeta(spdySession);
        }
        spduLog.Logi("tnet-jni", "[getSSLMeta] - session.intenalcb is null");
        return null;
    }

    private byte[] getSSLPublicKey(int i, byte[] bArr) {
        AccsSSLCallback accsSSLCallback2 = this.accsSSLCallback;
        if (accsSSLCallback2 != null) {
            return accsSSLCallback2.getSSLPublicKey(i, bArr);
        }
        spduLog.Logd("tnet-jni", "[getSSLPublicKey] - accsSSLCallback is null.");
        return null;
    }

    private native long getSession(long j, byte[] bArr, char c);

    public static void headJudge(Map<String, String> map) {
        if (map != null) {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InvlidCharJudge(key.getBytes(), value.getBytes());
                i += key.length() + 1 + value.length();
                securityCheck(i, value.length());
            }
        }
    }

    private native long initAgent(int i, int i2, int i3);

    @Deprecated
    public static void inspect(String str) {
    }

    private native void logFileCloseN();

    private native void logFileFlushN();

    public static String mapBodyToString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            return null;
        }
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append(C7490o0OoOO0o.OooO00o);
            sb.append(value);
            sb.append(C8318oOo0oooo.OooO0OO);
            i += key.length() + 1 + value.length();
            tableListJudge(i);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String[] mapToByteArray(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[(map.size() * 2)];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr;
    }

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[putSSLMeta] - session is null");
            return -1;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Logi("tnet-jni", "[putSSLMeta] - session.intenalcb is null");
        return -1;
    }

    public static void securityCheck(int i, int i2) {
        if (i >= 32768) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        } else if (i2 >= 8192) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:value=" + i2, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    private native int setConTimeout(long j, int i);

    private native int setSessionKind(long j, int i);

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        }
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        }
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, int i, SpdyByteArray spdyByteArray, int i2) {
        spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - ");
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, i2);
        }
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - ");
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataRecvCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        long j = 4294967295L & ((long) i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataSendCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i, Object obj) {
        spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyPingRecvCallback(spdySession, (long) i, obj);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i, int i2) {
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyRequestRecvCallback(spdySession, j, i2);
        }
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - errorCode = " + i);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session is null");
        } else {
            try {
                if (spdySession.intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session.intenalcb is null");
                } else {
                    spdySession.intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
                }
            } finally {
                spdySession.cleanUp();
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session.intenalcb is null");
        } else {
            intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
        }
    }

    private void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        spduLog.Logi("tnet-jni", "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session is null");
        } else {
            try {
                if (spdySession.intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session.intenalcb is null");
                } else {
                    spdySession.intenalcb.spdySessionFailedError(spdySession, i, obj);
                }
            } finally {
                spdySession.cleanUp();
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session is null");
            return;
        }
        try {
            if (spdySession.intenalcb == null) {
                spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session.intenalcb is null");
            } else {
                spdySession.intenalcb.spdySessionOnWritable(spdySession, obj, i);
            }
        } catch (Throwable th) {
            spduLog.Loge("tnet-jni", "[spdySessionOnWritable] - exception:" + th);
        }
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i, int i2, int i3, SuperviseData superviseData) {
        spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - ");
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyStreamCloseCallback(spdySession, j, i2, i3, superviseData);
        }
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i, String[] strArr, int i2) {
        spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - ");
        Map<String, List<String>> stringArrayToMap = stringArrayToMap(strArr);
        long j = ((long) i) & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session.intenalcb is null");
        } else {
            intenalcb.spdyOnStreamResponse(spdySession, j, stringArrayToMap, i2);
        }
    }

    public static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap(5);
        int i = 0;
        while (true) {
            int i2 = i + 2;
            if (i2 <= strArr.length) {
                if (strArr[i] == null) {
                    break;
                }
                int i3 = i + 1;
                if (strArr[i3] == null) {
                    break;
                }
                List list = (List) hashMap.get(strArr[i]);
                if (list == null) {
                    list = new ArrayList(1);
                    hashMap.put(strArr[i], list);
                }
                list.add(strArr[i3]);
                i = i2;
            } else {
                return hashMap;
            }
        }
        return null;
    }

    public static void tableListJudge(int i) {
        if (i >= 5242880) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    public void clearSpdySession(String str, String str2, int i) {
        if (str != null) {
            f13482w.lock();
            if (str != null) {
                try {
                    HashMap<String, SpdySession> hashMap = this.sessionMgr;
                    hashMap.remove(str + str2 + i);
                } catch (Throwable th) {
                    f13482w.unlock();
                    throw th;
                }
            }
            f13482w.unlock();
        }
    }

    public void close() {
    }

    public int closeSession(long j) {
        return closeSessionN(j);
    }

    public int configLogFile(String str, int i, int i2) {
        if (loadSucc) {
            return configLogFileN(str, i, i2);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, int i) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, null, i, 0);
    }

    public HashMap<String, SpdySession> getAllSession() {
        return this.sessionMgr;
    }

    public void logFileClose() {
        if (loadSucc) {
            logFileFlushN();
            logFileCloseN();
        }
    }

    public void logFileFlush() {
        if (loadSucc) {
            logFileFlushN();
        }
    }

    public void removeSession(SpdySession spdySession) {
        f13482w.lock();
        try {
            this.sessionQueue.remove(spdySession);
        } finally {
            f13482w.unlock();
        }
    }

    public void setAccsSslCallback(AccsSSLCallback accsSSLCallback2) {
        spduLog.Logi("tnet-jni", "[setAccsSslCallback] - " + accsSSLCallback2.getClass());
        this.accsSSLCallback = accsSSLCallback2;
    }

    @Deprecated
    public int setConnectTimeOut(int i) {
        agentIsOpen();
        try {
            return setConTimeout(this.agentNativePtr, i);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void setProxyUsernamePassword(String str, String str2) {
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    @Deprecated
    public int setSessionKind(SpdySessionKind spdySessionKind) {
        agentIsOpen();
        try {
            return setSessionKind(this.agentNativePtr, spdySessionKind.getint());
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, 0, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    @Deprecated
    public void switchAccsServer(int i) {
    }

    public int configLogFile(String str, int i, int i2, int i3) {
        if (loadSucc) {
            return configLogFileN(str, i, i2, i3);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, int i) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, null, i, 0);
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, sslCertcb, i, 0);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, i2, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    public SpdySession createSession(SessionInfo sessionInfo) throws SpdyErrorException {
        return createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), null, sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost());
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i, i2, -1);
    }

    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i, int i2) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i, i2);
    }

    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2, int i3) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i, i2, i3, null);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i);
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback2) throws UnsatisfiedLinkError, SpdyErrorException {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, accsSSLCallback2);
                }
            }
        }
        return gSingleInstance;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.android.spdy.SpdySession createSession(java.lang.String r24, java.lang.String r25, java.lang.Object r26, org.android.spdy.SessionCb r27, org.android.spdy.SslCertcb r28, int r29, int r30, int r31, java.lang.String r32) throws org.android.spdy.SpdyErrorException {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.createSession(java.lang.String, java.lang.String, java.lang.Object, org.android.spdy.SessionCb, org.android.spdy.SslCertcb, int, int, int, java.lang.String):org.android.spdy.SpdySession");
    }
}
