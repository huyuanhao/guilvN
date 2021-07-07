package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.security.b */
public class C0158b implements ISecurity {

    /* renamed from: a */
    public static String f259a = "awcn.DefaultSecurityGuard";

    /* renamed from: b */
    public static boolean f260b;

    /* renamed from: c */
    public static Map<String, Integer> f261c;

    /* renamed from: d */
    public String f262d = null;

    static {
        try {
            Class.forName("com.alibaba.wireless.security.open.SecurityGuardManager");
            f260b = true;
            HashMap hashMap = new HashMap();
            f261c = hashMap;
            hashMap.put(ISecurity.SIGN_ALGORITHM_HMAC_SHA1, 3);
            f261c.put(ISecurity.CIPHER_ALGORITHM_AES128, 16);
        } catch (Throwable unused) {
            f260b = false;
        }
    }

    public C0158b(String str) {
        this.f262d = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        if (!f260b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f261c.containsKey(str) || (num = f261c.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (!(instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null)) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f262d);
            }
        } catch (Throwable th) {
            ALog.m288e(f259a, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null) {
                return null;
            }
            return dynamicDataStoreComp.getByteArray(str);
        } catch (Throwable th) {
            ALog.m288e(f259a, "getBytes", null, th, new Object[0]);
            return null;
        }
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null || dynamicDataStoreComp.putByteArray(str, bArr) == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            ALog.m288e(f259a, "saveBytes", null, th, new Object[0]);
            return false;
        }
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (f260b && context != null && !TextUtils.isEmpty(str2) && f261c.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = f261c.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.f262d);
                }
            } catch (Throwable th) {
                ALog.m288e(f259a, "Securityguard sign request failed.", null, th, new Object[0]);
            }
        }
        return null;
    }
}
