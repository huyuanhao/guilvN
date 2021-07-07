package com.umeng.analytics.filter;

import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.filter.d */
public class C3414d {

    /* renamed from: b */
    public static final String f8411b = "Ă";

    /* renamed from: a */
    public final String f8412a = "MD5";

    /* renamed from: c */
    public MessageDigest f8413c;

    /* renamed from: d */
    public Set<Object> f8414d = new HashSet();

    /* renamed from: e */
    public boolean f8415e;

    public C3414d(boolean z, String str) {
        int i = 0;
        this.f8415e = false;
        this.f8415e = z;
        try {
            this.f8413c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (str == null) {
            return;
        }
        if (z) {
            try {
                byte[] decode = Base64.decode(str.getBytes(), 0);
                while (i < decode.length / 4) {
                    int i2 = i * 4;
                    this.f8414d.add(Integer.valueOf(((decode[i2 + 0] & 255) << 24) + ((decode[i2 + 1] & 255) << 16) + ((decode[i2 + 2] & 255) << 8) + (decode[i2 + 3] & 255)));
                    i++;
                }
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        } else {
            String[] split = str.split(f8411b);
            int length = split.length;
            while (i < length) {
                this.f8414d.add(split[i]);
                i++;
            }
        }
    }

    /* renamed from: c */
    private Integer m8726c(String str) {
        try {
            this.f8413c.update(str.getBytes());
            byte[] digest = this.f8413c.digest();
            return Integer.valueOf(((digest[0] & 255) << 24) + ((digest[1] & 255) << 16) + ((digest[2] & 255) << 8) + (digest[3] & 255));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo38689a(String str) {
        if (this.f8415e) {
            return this.f8414d.contains(m8726c(str));
        }
        return this.f8414d.contains(str);
    }

    /* renamed from: b */
    public void mo38690b(String str) {
        if (this.f8415e) {
            this.f8414d.add(m8726c(str));
        } else {
            this.f8414d.add(str);
        }
    }

    public String toString() {
        if (this.f8415e) {
            byte[] bArr = new byte[(this.f8414d.size() * 4)];
            Iterator<Object> it = this.f8414d.iterator();
            int i = 0;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                int i2 = i + 1;
                bArr[i] = (byte) ((-16777216 & intValue) >> 24);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((16711680 & intValue) >> 16);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((65280 & intValue) >> 8);
                i = i4 + 1;
                bArr[i4] = (byte) (intValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f8414d) {
            if (sb.length() > 0) {
                sb.append(f8411b);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo38688a() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f8414d) {
            sb.append(obj);
            if (sb.length() > 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        System.out.println(sb.toString());
    }
}
