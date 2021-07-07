package com.xiaomi.push;

import java.util.Comparator;
import org.apache.http.NameValuePair;

/* renamed from: com.xiaomi.push.cu */
public final class C4334cu implements Comparator<NameValuePair> {
    /* renamed from: a */
    public int compare(NameValuePair nameValuePair, NameValuePair nameValuePair2) {
        return nameValuePair.getName().compareTo(nameValuePair2.getName());
    }
}
