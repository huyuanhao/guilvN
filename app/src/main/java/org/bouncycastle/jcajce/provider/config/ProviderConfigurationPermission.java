package org.bouncycastle.jcajce.provider.config;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

public class ProviderConfigurationPermission extends BasicPermission {
    public static final int o00oO0O = 1;
    public static final String o0O0O00 = "all";
    public static final int o0OO00O = 63;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f23950o0OO00O = "acceptableeccurves";
    public static final int o0OOO0o = 16;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f23951o0OOO0o = "threadlocaldhdefaultparams";
    public static final int o0Oo0oo = 32;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f23952o0Oo0oo = "dhdefaultparams";
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 4;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f23953o0ooOOo = "threadlocalecimplicitlyca";
    public static final int o0ooOoO = 8;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f23954o0ooOoO = "ecimplicitlyca";
    public static final String oo0o0Oo = "additionalecparameters";
    public final String actions;
    public final int permissionMask;

    public ProviderConfigurationPermission(String str) {
        super(str);
        this.actions = "all";
        this.permissionMask = 63;
    }

    public ProviderConfigurationPermission(String str, String str2) {
        super(str, str2);
        this.actions = str2;
        this.permissionMask = OooO00o(str2);
    }

    private int OooO00o(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(Strings.OooO00o(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(f23953o0ooOOo)) {
                i |= 1;
            } else if (nextToken.equals(f23954o0ooOoO)) {
                i |= 2;
            } else if (nextToken.equals(f23951o0OOO0o)) {
                i |= 4;
            } else if (nextToken.equals(f23952o0Oo0oo)) {
                i |= 8;
            } else if (nextToken.equals(f23950o0OO00O)) {
                i |= 16;
            } else if (nextToken.equals(oo0o0Oo)) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProviderConfigurationPermission)) {
            return false;
        }
        ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) obj;
        return this.permissionMask == providerConfigurationPermission.permissionMask && getName().equals(providerConfigurationPermission.getName());
    }

    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.permissionMask;
        int i2 = ((ProviderConfigurationPermission) permission).permissionMask;
        return (i & i2) == i2;
    }
}
