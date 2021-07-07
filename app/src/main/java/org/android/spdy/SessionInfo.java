package org.android.spdy;

import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;

public class SessionInfo {
    public static int INVALID_PUBLIC_SEQNUM = -1;
    public String certHost = null;
    public int connTimeoutMs;
    public String domain;
    public String host;
    public int mode;
    public int port;
    public String proxyHost;
    public int proxyPort;
    public int pubkey_seqnum;
    public SessionCb sessionCb;
    public Object sessionUserData;

    public SessionInfo(String str, int i, String str2, String str3, int i2, Object obj, SessionCb sessionCb2, int i3) {
        this.host = str;
        this.port = i;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i2;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb2;
        this.mode = i3;
        this.pubkey_seqnum = INVALID_PUBLIC_SEQNUM;
        this.connTimeoutMs = -1;
    }

    public String getAuthority() {
        if (this.proxyHost == null || this.proxyPort == 0) {
            return this.host + Constants.COLON_SEPARATOR + this.port;
        }
        return this.host + Constants.COLON_SEPARATOR + this.port + C8932ooOOO0o.OooO0OO + this.proxyHost + Constants.COLON_SEPARATOR + this.proxyPort;
    }

    public String getCertHost() {
        if (this.pubkey_seqnum != INVALID_PUBLIC_SEQNUM) {
            return null;
        }
        return this.certHost;
    }

    public int getConnectionTimeoutMs() {
        return this.connTimeoutMs;
    }

    public String getDomain() {
        return this.domain;
    }

    public int getMode() {
        return this.mode;
    }

    public int getPubKeySeqNum() {
        return this.pubkey_seqnum;
    }

    public SessionCb getSessionCb() {
        return this.sessionCb;
    }

    public Object getSessonUserData() {
        return this.sessionUserData;
    }

    public void setCertHost(String str) {
        this.certHost = str;
    }

    public void setConnectionTimeoutMs(int i) {
        this.connTimeoutMs = i;
    }

    public void setPubKeySeqNum(int i) {
        this.pubkey_seqnum = i;
    }
}
