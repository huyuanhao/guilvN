package org.android.spdy;

import android.os.Handler;
import android.os.HandlerThread;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.ProtectedPointer;

public final class SpdySession {
    public static volatile int count;
    public SpdyAgent agent;
    public String authority;
    public AtomicBoolean closed = new AtomicBoolean();
    public String domain;
    public Handler handler;
    public Intenalcb intenalcb;
    public Object lock = new Object();
    public int mode;
    public ProtectedPointer pptr4sessionNativePtr;
    public int pubkey_seqnum = 0;
    public volatile int refcount = 1;
    public SessionCb sessionCallBack = null;
    public boolean sessionClearedFromSessionMgr = false;
    public volatile long sessionNativePtr;
    public NetSparseArray<SpdyStreamContext> spdyStream = null;
    public int streamcount = 1;
    public HandlerThread thread;
    public Object userData = null;

    public SpdySession(long j, SpdyAgent spdyAgent, String str, String str2, SessionCb sessionCb, int i, int i2, Object obj) {
        this.sessionNativePtr = j;
        ProtectedPointer protectedPointer = new ProtectedPointer(this);
        this.pptr4sessionNativePtr = protectedPointer;
        protectedPointer.setHow2close(new ProtectedPointer.ProtectedPointerOnClose() {
            /* class org.android.spdy.SpdySession.C48281 */

            @Override // org.android.spdy.ProtectedPointer.ProtectedPointerOnClose
            public void close(Object obj) {
                SpdySession spdySession = (SpdySession) obj;
                spdySession.NotifyNotInvokeAnyMoreN(spdySession.sessionNativePtr);
                spdySession.setSessionNativePtr(0);
            }
        });
        this.agent = spdyAgent;
        this.authority = str;
        this.intenalcb = new SpdySessionCallBack();
        this.domain = str2;
        this.spdyStream = new NetSparseArray<>(5);
        this.sessionCallBack = sessionCb;
        this.pubkey_seqnum = i2;
        this.mode = i;
        this.userData = obj;
        this.closed.set(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native int NotifyNotInvokeAnyMoreN(long j);

    private int closeprivate() {
        synchronized (this.lock) {
            if (!this.sessionClearedFromSessionMgr) {
                this.agent.clearSpdySession(this.authority, this.domain, this.mode);
                this.sessionClearedFromSessionMgr = true;
            }
        }
        synchronized (this.lock) {
            SpdyStreamContext[] allStreamCb = getAllStreamCb();
            if (allStreamCb != null) {
                for (SpdyStreamContext spdyStreamContext : allStreamCb) {
                    spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyStreamCloseCallback] unfinished stm=" + spdyStreamContext.streamId);
                    spdyStreamContext.callBack.spdyStreamCloseCallback(this, (long) spdyStreamContext.streamId, TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS, spdyStreamContext.streamContext, null);
                }
            }
            this.spdyStream.clear();
        }
        return 0;
    }

    private String getAuthority() {
        return this.authority;
    }

    private native int sendCustomControlFrameN(long j, int i, int i2, int i3, int i4, byte[] bArr);

    private native int sendHeadersN(long j, int i, String[] strArr, boolean z);

    private native int setOptionN(long j, int i, int i2);

    private native int streamCloseN(long j, int i, int i2);

    private native int streamSendDataN(long j, int i, byte[] bArr, int i2, int i3, boolean z);

    private native int submitBioPingN(long j);

    private native int submitPingN(long j);

    private native int submitRequestN(long j, String str, byte b, String[] strArr, byte[] bArr, boolean z, int i, int i2, int i3);

    public int cleanUp() {
        spduLog.Logd("tnet-jni", "[SpdySession.cleanUp] - ");
        if (this.closed.getAndSet(true)) {
            return 0;
        }
        this.agent.removeSession(this);
        return closeprivate();
    }

    public void clearAllStreamCb() {
        spduLog.Logd("tnet-jni", "[SpdySession.clearAllStreamCb] - ");
        synchronized (this.lock) {
            this.spdyStream.clear();
        }
    }

    public int closeInternal() {
        if (!this.closed.getAndSet(true)) {
            return closeprivate();
        }
        return 0;
    }

    public int closeSession() {
        int i;
        spduLog.Logd("tnet-jni", "[SpdySession.closeSession] - ");
        synchronized (this.lock) {
            i = 0;
            if (!this.sessionClearedFromSessionMgr) {
                spduLog.Logd("tnet-jni", "[SpdySession.closeSession] - " + this.authority);
                this.agent.clearSpdySession(this.authority, this.domain, this.mode);
                this.sessionClearedFromSessionMgr = true;
                if (this.pptr4sessionNativePtr.enter()) {
                    try {
                        int closeSession = this.agent.closeSession(this.sessionNativePtr);
                        this.pptr4sessionNativePtr.exit();
                        i = closeSession;
                    } catch (UnsatisfiedLinkError e) {
                        e.printStackTrace();
                        this.pptr4sessionNativePtr.exit();
                    } catch (Throwable th) {
                        this.pptr4sessionNativePtr.exit();
                        throw th;
                    }
                } else {
                    i = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
                }
            }
        }
        return i;
    }

    public SpdyStreamContext[] getAllStreamCb() {
        SpdyStreamContext[] spdyStreamContextArr;
        synchronized (this.lock) {
            int size = this.spdyStream.size();
            if (size > 0) {
                spdyStreamContextArr = new SpdyStreamContext[size];
                this.spdyStream.toArray(spdyStreamContextArr);
            } else {
                spdyStreamContextArr = null;
            }
        }
        return spdyStreamContextArr;
    }

    public String getDomain() {
        return this.domain;
    }

    public Handler getMsgHandler() {
        return this.handler;
    }

    public int getRefCount() {
        return this.refcount;
    }

    public long getSessionNativePtr() {
        return this.sessionNativePtr;
    }

    public SpdyAgent getSpdyAgent() {
        return this.agent;
    }

    public SpdyStreamContext getSpdyStream(int i) {
        SpdyStreamContext spdyStreamContext;
        if (i <= 0) {
            return null;
        }
        synchronized (this.lock) {
            spdyStreamContext = this.spdyStream.get(i);
        }
        return spdyStreamContext;
    }

    public Object getUserData() {
        return this.userData;
    }

    public void increRefCount() {
        this.refcount++;
    }

    public int putSpdyStreamCtx(SpdyStreamContext spdyStreamContext) {
        int i;
        synchronized (this.lock) {
            i = this.streamcount;
            this.streamcount = i + 1;
            this.spdyStream.put(i, spdyStreamContext);
        }
        return i;
    }

    public void releasePptr() {
        this.pptr4sessionNativePtr.release();
    }

    public void removeSpdyStream(int i) {
        if (i > 0) {
            synchronized (this.lock) {
                this.spdyStream.remove(i);
            }
        }
    }

    public int sendCustomControlFrame(int i, int i2, int i3, int i4, byte[] bArr) throws SpdyErrorException {
        int i5;
        sessionIsOpen();
        if (bArr != null && bArr.length <= 0) {
            bArr = null;
        }
        spduLog.Logi("tnet-jni", "[sendCustomControlFrame] - type: " + i2);
        if (this.pptr4sessionNativePtr.enter()) {
            i5 = sendCustomControlFrameN(this.sessionNativePtr, i, i2, i3, i4, bArr);
            this.pptr4sessionNativePtr.exit();
        } else {
            i5 = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        if (i5 == 0) {
            return i5;
        }
        throw new SpdyErrorException("sendCustomControlFrame error: " + i5, i5);
    }

    public void sessionIsOpen() {
        if (this.closed.get()) {
            throw new SpdyErrorException("session is already closed: -1104", (int) TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        }
    }

    public int setOption(int i, int i2) throws SpdyErrorException {
        int i3;
        sessionIsOpen();
        if (this.pptr4sessionNativePtr.enter()) {
            i3 = setOptionN(this.sessionNativePtr, i, i2);
            this.pptr4sessionNativePtr.exit();
        } else {
            i3 = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        if (i3 == 0) {
            return i3;
        }
        throw new SpdyErrorException("setOption error: " + i3, i3);
    }

    public void setSessionNativePtr(long j) {
        this.sessionNativePtr = j;
    }

    public int streamReset(long j, int i) throws SpdyErrorException {
        int i2;
        sessionIsOpen();
        spduLog.Logd("tnet-jni", "[SpdySession.streamReset] - ");
        if (this.pptr4sessionNativePtr.enter()) {
            i2 = streamCloseN(this.sessionNativePtr, (int) j, i);
            this.pptr4sessionNativePtr.exit();
        } else {
            i2 = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        if (i2 == 0) {
            return i2;
        }
        throw new SpdyErrorException("streamReset error: " + i2, i2);
    }

    @Deprecated
    public int submitBioPing() throws SpdyErrorException {
        int i;
        sessionIsOpen();
        if (this.pptr4sessionNativePtr.enter()) {
            i = submitBioPingN(this.sessionNativePtr);
            this.pptr4sessionNativePtr.exit();
        } else {
            i = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        if (i == 0) {
            return i;
        }
        throw new SpdyErrorException("submitBioPing error: " + i, i);
    }

    public int submitPing() throws SpdyErrorException {
        int i;
        sessionIsOpen();
        if (this.pptr4sessionNativePtr.enter()) {
            i = submitPingN(this.sessionNativePtr);
            this.pptr4sessionNativePtr.exit();
        } else {
            i = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        if (i == 0) {
            return i;
        }
        throw new SpdyErrorException("submitPing error: " + i, i);
    }

    public int submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Spdycb spdycb) throws SpdyErrorException {
        SpdyStreamContext spdyStreamContext;
        String str;
        int i;
        if (spdyRequest == null || obj == null || spdyRequest.getAuthority() == null) {
            throw new SpdyErrorException("submitRequest error: -1102", (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
        sessionIsOpen();
        byte[] dataproviderToByteArray = SpdyAgent.dataproviderToByteArray(spdyRequest, spdyDataProvider);
        if (dataproviderToByteArray != null && dataproviderToByteArray.length <= 0) {
            dataproviderToByteArray = null;
        }
        boolean z = spdyDataProvider != null ? spdyDataProvider.finished : true;
        SpdyStreamContext spdyStreamContext2 = new SpdyStreamContext(obj, spdycb);
        int putSpdyStreamCtx = putSpdyStreamCtx(spdyStreamContext2);
        String[] mapToByteArray = SpdyAgent.mapToByteArray(spdyRequest.getHeaders());
        spduLog.Logi("tnet-jni", "index=" + putSpdyStreamCtx + GlideException.OooO00o.o0ooOoO + "starttime=" + System.currentTimeMillis());
        if (this.pptr4sessionNativePtr.enter()) {
            spdyStreamContext = spdyStreamContext2;
            str = "tnet-jni";
            i = submitRequestN(this.sessionNativePtr, spdyRequest.getUrlPath(), (byte) spdyRequest.getPriority(), mapToByteArray, dataproviderToByteArray, z, putSpdyStreamCtx, spdyRequest.getRequestTimeoutMs(), spdyRequest.getRequestRdTimeoutMs());
            this.pptr4sessionNativePtr.exit();
        } else {
            spdyStreamContext = spdyStreamContext2;
            str = "tnet-jni";
            i = TnetStatusCode.EASY_REASON_CONN_NOT_EXISTS;
        }
        spduLog.Logi(str, "index=" + putSpdyStreamCtx + GlideException.OooO00o.o0ooOoO + " calltime=" + System.currentTimeMillis());
        if (i >= 0) {
            spdyStreamContext.streamId = i;
            return i;
        }
        removeSpdyStream(putSpdyStreamCtx);
        throw new SpdyErrorException("submitRequest error: " + i, i);
    }
}
