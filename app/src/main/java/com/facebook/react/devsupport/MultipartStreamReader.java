package com.facebook.react.devsupport;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

public class MultipartStreamReader {
    public static final String CRLF = "\r\n";
    public final String mBoundary;
    public long mLastProgressEvent;
    public final oOOO000O mSource;

    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, OOOO000 oooo000, boolean z) throws IOException;

        void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException;
    }

    public MultipartStreamReader(oOOO000O oooo000o, String str) {
        this.mSource = oooo000o;
        this.mBoundary = str;
    }

    private void emitChunk(OOOO000 oooo000, boolean z, ChunkListener chunkListener) throws IOException {
        ByteString encodeUtf8 = ByteString.encodeUtf8("\r\n\r\n");
        long OooO00o = oooo000.OooO00o(encodeUtf8);
        if (OooO00o == -1) {
            chunkListener.onChunkComplete(null, oooo000, z);
            return;
        }
        OOOO000 oooo0002 = new OOOO000();
        OOOO000 oooo0003 = new OOOO000();
        oooo000.read(oooo0002, OooO00o);
        oooo000.m16600OooO00o((long) encodeUtf8.size());
        oooo000.OooO00o((AbstractC8210oOOoO0o0) oooo0003);
        chunkListener.onChunkComplete(parseHeaders(oooo0002), oooo0003, z);
    }

    private void emitProgress(Map<String, String> map, long j, boolean z, ChunkListener chunkListener) throws IOException {
        if (map != null && chunkListener != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastProgressEvent > 16 || z) {
                this.mLastProgressEvent = currentTimeMillis;
                chunkListener.onChunkProgress(map, j, map.get("Content-Length") != null ? Long.parseLong(map.get("Content-Length")) : 0);
            }
        }
    }

    private Map<String, String> parseHeaders(OOOO000 oooo000) {
        HashMap hashMap = new HashMap();
        String[] split = oooo000.m16606OooO0O0().split("\r\n");
        for (String str : split) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR);
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    public boolean readAllParts(ChunkListener chunkListener) throws IOException {
        boolean z;
        long j;
        ByteString encodeUtf8 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "\r\n");
        ByteString encodeUtf82 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "--" + "\r\n");
        ByteString encodeUtf83 = ByteString.encodeUtf8("\r\n\r\n");
        OOOO000 oooo000 = new OOOO000();
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        Map<String, String> map = null;
        while (true) {
            long max = Math.max(j2 - ((long) encodeUtf82.size()), j3);
            long OooO00o = oooo000.OooO00o(encodeUtf8, max);
            if (OooO00o == -1) {
                OooO00o = oooo000.OooO00o(encodeUtf82, max);
                z = true;
            } else {
                z = false;
            }
            if (OooO00o == -1) {
                long OooO0o0 = oooo000.OooO0o0();
                if (map == null) {
                    long OooO00o2 = oooo000.OooO00o(encodeUtf83, max);
                    if (OooO00o2 >= 0) {
                        this.mSource.read(oooo000, OooO00o2);
                        OOOO000 oooo0002 = new OOOO000();
                        j = j3;
                        oooo000.OooO00o(oooo0002, max, OooO00o2 - max);
                        j4 = oooo0002.OooO0o0() + ((long) encodeUtf83.size());
                        map = parseHeaders(oooo0002);
                    } else {
                        j = j3;
                    }
                } else {
                    j = j3;
                    emitProgress(map, oooo000.OooO0o0() - j4, false, chunkListener);
                }
                if (this.mSource.read(oooo000, (long) 4096) <= 0) {
                    return false;
                }
                j2 = OooO0o0;
                j3 = j;
            } else {
                long j5 = OooO00o - j3;
                if (j3 > 0) {
                    OOOO000 oooo0003 = new OOOO000();
                    oooo000.m16600OooO00o(j3);
                    oooo000.read(oooo0003, j5);
                    emitProgress(map, oooo0003.OooO0o0() - j4, true, chunkListener);
                    emitChunk(oooo0003, z, chunkListener);
                    j4 = 0;
                    map = null;
                } else {
                    oooo000.m16600OooO00o(OooO00o);
                }
                if (z) {
                    return true;
                }
                j3 = (long) encodeUtf8.size();
                j2 = j3;
            }
        }
    }
}
