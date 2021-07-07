package com.p118pd.sdk;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: com.pd.sdk.l1Il  reason: case insensitive filesystem */
public class C6443l1Il {

    /* renamed from: com.pd.sdk.l1Il$OooO00o */
    public static class OooO00o implements PrivilegedAction {
        public final /* synthetic */ String OooO00o;

        public OooO00o(String str) {
            this.OooO00o = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.OooO00o);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class OooO00o(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new OooO00o(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
