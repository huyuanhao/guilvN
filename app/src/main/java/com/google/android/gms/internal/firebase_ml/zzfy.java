package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzfy extends zzfq {
    public final int responseCode;
    public final String responseMessage;
    public final HttpURLConnection zzvy;
    public final ArrayList<String> zzvz = new ArrayList<>();
    public final ArrayList<String> zzwa = new ArrayList<>();

    public zzfy(HttpURLConnection httpURLConnection) throws IOException {
        this.zzvy = httpURLConnection;
        int responseCode2 = httpURLConnection.getResponseCode();
        this.responseCode = responseCode2 == -1 ? 0 : responseCode2;
        this.responseMessage = httpURLConnection.getResponseMessage();
        ArrayList<String> arrayList = this.zzvz;
        ArrayList<String> arrayList2 = this.zzwa;
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final void disconnect() {
        this.zzvy.disconnect();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final InputStream getContent() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.zzvy.getInputStream();
        } catch (IOException unused) {
            inputStream = this.zzvy.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new zzfz(this, inputStream);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String getContentEncoding() {
        return this.zzvy.getContentEncoding();
    }

    public final long getContentLength() {
        String headerField = this.zzvy.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String getContentType() {
        return this.zzvy.getHeaderField("Content-Type");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String getReasonPhrase() {
        return this.responseMessage;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final int getStatusCode() {
        return this.responseCode;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String zzab(int i) {
        return this.zzvz.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String zzac(int i) {
        return this.zzwa.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final String zzfp() {
        String headerField = this.zzvy.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfq
    public final int zzfq() {
        return this.zzvz.size();
    }
}
