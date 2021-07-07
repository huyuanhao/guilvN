package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.p118pd.sdk.C8027oOO00oo;
import com.vivo.push.util.C4137g;
import com.vivo.push.util.C4138h;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4153w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.vivo.push.cache.c */
public abstract class AbstractC4101c<T> {
    public static final byte[] CRPYT_IV_BYTE = {34, 32, PublicSuffixDatabase.EXCEPTION_MARKER, C8027oOO00oo.OooO0OO, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 32, PublicSuffixDatabase.EXCEPTION_MARKER, PublicSuffixDatabase.EXCEPTION_MARKER, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 41, 35, 35, 32, 32};
    public static final byte[] CRPYT_KEY_BYTE = {PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, 32, 38, C8027oOO00oo.OooO0OO, PublicSuffixDatabase.EXCEPTION_MARKER, 35, 34, PublicSuffixDatabase.EXCEPTION_MARKER};
    public static int MAX_CLIENT_SAVE_LENGTH = 10000;
    public static final String TAG = "IAppManager";
    public static final Object sAppLock = new Object();
    public Set<T> mAppDatas = new HashSet();
    public Context mContext;
    public C4153w mSharePreferenceManager;

    public AbstractC4101c(Context context) {
        this.mContext = context.getApplicationContext();
        C4153w b = C4153w.m11245b();
        this.mSharePreferenceManager = b;
        b.mo41205a(this.mContext);
        loadData();
    }

    public void addData(T t) {
        synchronized (sAppLock) {
            Iterator<T> it = this.mAppDatas.iterator();
            while (it.hasNext()) {
                if (t.equals(it.next())) {
                    it.remove();
                }
            }
            this.mAppDatas.add(t);
            updateDataToSP(this.mAppDatas);
        }
    }

    public void addDatas(Set<T> set) {
        if (set != null) {
            synchronized (sAppLock) {
                Iterator<T> it = this.mAppDatas.iterator();
                while (it.hasNext()) {
                    if (set.contains(it.next())) {
                        it.remove();
                    }
                }
                this.mAppDatas.addAll(set);
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    public void clearData() {
        synchronized (sAppLock) {
            this.mAppDatas.clear();
            this.mSharePreferenceManager.mo41186c(generateStrByType());
        }
    }

    public abstract String generateStrByType();

    public boolean isEmpty() {
        Set<T> set = this.mAppDatas;
        return set == null || set.size() == 0;
    }

    public void loadData() {
        synchronized (sAppLock) {
            C4138h.m11169a(generateStrByType());
            this.mAppDatas.clear();
            String a = this.mSharePreferenceManager.mo41178a(generateStrByType());
            if (TextUtils.isEmpty(a)) {
                C4146p.m11216d(TAG, "AppManager init strApps empty.");
            } else if (a.length() > MAX_CLIENT_SAVE_LENGTH) {
                C4146p.m11216d(TAG, "sync  strApps lenght too large");
                clearData();
            } else {
                try {
                    String str = new String(C4137g.m11168a(C4137g.m11167a(CRPYT_IV_BYTE), C4137g.m11167a(CRPYT_KEY_BYTE), Base64.decode(a, 2)), "utf-8");
                    C4146p.m11216d(TAG, "AppManager init strApps : " + str);
                    Set<T> parseAppStr = parseAppStr(str);
                    if (parseAppStr != null) {
                        this.mAppDatas.addAll(parseAppStr);
                    }
                } catch (Exception e) {
                    clearData();
                    C4146p.m11216d(TAG, C4146p.m11207a(e));
                }
            }
        }
    }

    public abstract Set<T> parseAppStr(String str);

    public void removeData(T t) {
        synchronized (sAppLock) {
            boolean z = false;
            Iterator<T> it = this.mAppDatas.iterator();
            while (it.hasNext()) {
                if (t.equals(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    public void removeDatas(Set<T> set) {
        synchronized (sAppLock) {
            Iterator<T> it = this.mAppDatas.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    public abstract String toAppStr(Set<T> set);

    public String updateDataToSP(Set<T> set) {
        String appStr = toAppStr(set);
        try {
            String a = C4137g.m11167a(CRPYT_IV_BYTE);
            String a2 = C4137g.m11167a(CRPYT_KEY_BYTE);
            byte[] bytes = appStr.getBytes("utf-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(a2.getBytes("utf-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(a.getBytes("utf-8")));
            String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 2);
            if (TextUtils.isEmpty(encodeToString) || encodeToString.length() <= MAX_CLIENT_SAVE_LENGTH) {
                C4146p.m11216d(TAG, "sync  strApps: " + encodeToString);
                this.mSharePreferenceManager.mo41183a(generateStrByType(), encodeToString);
                return appStr;
            }
            C4146p.m11216d(TAG, "sync  strApps lenght too large");
            clearData();
            return null;
        } catch (Exception e) {
            C4146p.m11216d(TAG, C4146p.m11207a(e));
            clearData();
            return null;
        }
    }
}
