package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.facebook.common.logging.FLog;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class FileIoHandler implements Runnable {
    public static final long FILE_TTL = 30000;
    public static final String TAG = JSPackagerClient.class.getSimpleName();
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public int mNextHandle = 1;
    public final Map<Integer, TtlFileInputStream> mOpenFiles = new HashMap();
    public final Map<String, RequestHandler> mRequestHandlers;

    public static class TtlFileInputStream {
        public final FileInputStream mStream;
        public long mTtl = (System.currentTimeMillis() + 30000);

        public TtlFileInputStream(String str) throws FileNotFoundException {
            this.mStream = new FileInputStream(str);
        }

        private void extendTtl() {
            this.mTtl = System.currentTimeMillis() + 30000;
        }

        public void close() throws IOException {
            this.mStream.close();
        }

        public boolean expiredTtl() {
            return System.currentTimeMillis() >= this.mTtl;
        }

        public String read(int i) throws IOException {
            extendTtl();
            byte[] bArr = new byte[i];
            return Base64.encodeToString(bArr, 0, this.mStream.read(bArr), 0);
        }
    }

    public FileIoHandler() {
        HashMap hashMap = new HashMap();
        this.mRequestHandlers = hashMap;
        hashMap.put("fopen", new RequestOnlyHandler() {
            /* class com.facebook.react.packagerconnection.FileIoHandler.C08021 */

            @Override // com.facebook.react.packagerconnection.RequestHandler, com.facebook.react.packagerconnection.RequestOnlyHandler
            public void onRequest(@Nullable Object obj, Responder responder) {
                synchronized (FileIoHandler.this.mOpenFiles) {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject != null) {
                            String optString = jSONObject.optString("mode");
                            if (optString != null) {
                                String optString2 = jSONObject.optString("filename");
                                if (optString2 == null) {
                                    throw new Exception("missing params.filename");
                                } else if (optString.equals("r")) {
                                    responder.respond(Integer.valueOf(FileIoHandler.this.addOpenFile(optString2)));
                                } else {
                                    throw new IllegalArgumentException("unsupported mode: " + optString);
                                }
                            } else {
                                throw new Exception("missing params.mode");
                            }
                        } else {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                    } catch (Exception e) {
                        responder.error(e.toString());
                    }
                }
            }
        });
        this.mRequestHandlers.put("fclose", new RequestOnlyHandler() {
            /* class com.facebook.react.packagerconnection.FileIoHandler.C08032 */

            @Override // com.facebook.react.packagerconnection.RequestHandler, com.facebook.react.packagerconnection.RequestOnlyHandler
            public void onRequest(@Nullable Object obj, Responder responder) {
                synchronized (FileIoHandler.this.mOpenFiles) {
                    try {
                        if (obj instanceof Number) {
                            TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) FileIoHandler.this.mOpenFiles.get(Integer.valueOf(((Integer) obj).intValue()));
                            if (ttlFileInputStream != null) {
                                FileIoHandler.this.mOpenFiles.remove(Integer.valueOf(((Integer) obj).intValue()));
                                ttlFileInputStream.close();
                                responder.respond("");
                            } else {
                                throw new Exception("invalid file handle, it might have timed out");
                            }
                        } else {
                            throw new Exception("params must be a file handle");
                        }
                    } catch (Exception e) {
                        responder.error(e.toString());
                    }
                }
            }
        });
        this.mRequestHandlers.put("fread", new RequestOnlyHandler() {
            /* class com.facebook.react.packagerconnection.FileIoHandler.C08043 */

            @Override // com.facebook.react.packagerconnection.RequestHandler, com.facebook.react.packagerconnection.RequestOnlyHandler
            public void onRequest(@Nullable Object obj, Responder responder) {
                synchronized (FileIoHandler.this.mOpenFiles) {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject != null) {
                            int optInt = jSONObject.optInt("file");
                            if (optInt != 0) {
                                int optInt2 = jSONObject.optInt(FileAttachment.KEY_SIZE);
                                if (optInt2 != 0) {
                                    TtlFileInputStream ttlFileInputStream = (TtlFileInputStream) FileIoHandler.this.mOpenFiles.get(Integer.valueOf(optInt));
                                    if (ttlFileInputStream != null) {
                                        responder.respond(ttlFileInputStream.read(optInt2));
                                    } else {
                                        throw new Exception("invalid file handle, it might have timed out");
                                    }
                                } else {
                                    throw new Exception("invalid or missing read size");
                                }
                            } else {
                                throw new Exception("invalid or missing file handle");
                            }
                        } else {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                    } catch (Exception e) {
                        responder.error(e.toString());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int addOpenFile(String str) throws FileNotFoundException {
        int i = this.mNextHandle;
        this.mNextHandle = i + 1;
        this.mOpenFiles.put(Integer.valueOf(i), new TtlFileInputStream(str));
        if (this.mOpenFiles.size() == 1) {
            this.mHandler.postDelayed(this, 30000);
        }
        return i;
    }

    public Map<String, RequestHandler> handlers() {
        return this.mRequestHandlers;
    }

    public void run() {
        synchronized (this.mOpenFiles) {
            Iterator<TtlFileInputStream> it = this.mOpenFiles.values().iterator();
            while (it.hasNext()) {
                TtlFileInputStream next = it.next();
                if (next.expiredTtl()) {
                    it.remove();
                    try {
                        next.close();
                    } catch (IOException e) {
                        String str = TAG;
                        FLog.m873e(str, "closing expired file failed: " + e.toString());
                    }
                }
            }
            if (!this.mOpenFiles.isEmpty()) {
                this.mHandler.postDelayed(this, 30000);
            }
        }
    }
}
