package com.huawei.updatesdk.fileprovider;

import android.net.Uri;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.fileprovider.b */
public class C1272b implements AbstractC1271a {

    /* renamed from: a */
    public final String f1415a;

    /* renamed from: b */
    public final HashMap<String, File> f1416b = new HashMap<>();

    public C1272b(String str) {
        this.f1415a = str;
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC1271a
    /* renamed from: a */
    public Uri mo15875a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.f1416b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith(C8932ooOOO0o.OooO0OO);
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                return new Uri.Builder().scheme("content").authority(this.f1415a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, C8932ooOOO0o.OooO0OO)).build();
            }
            throw new IllegalArgumentException("wisedist: Failed to find configured root that contains");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for wisedist");
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC1271a
    /* renamed from: a */
    public File mo15876a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = this.f1416b.get(decode);
        if (file != null) {
            try {
                File canonicalFile = new File(file, decode2).getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("wisedist: Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("wisedist: Failed to resolve canonical path for");
            }
        } else {
            throw new IllegalArgumentException("wisedist: Unable to find configured root for");
        }
    }

    @Override // com.huawei.updatesdk.fileprovider.AbstractC1271a
    /* renamed from: a */
    public void mo15877a(String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f1416b.put(str, file.getCanonicalFile());
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for root");
            }
        } else {
            throw new IllegalArgumentException("wisedist Name must not be empty");
        }
    }
}
