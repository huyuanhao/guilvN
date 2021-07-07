package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.II丨丨1  reason: invalid class name and case insensitive filesystem */
public class C5244II1 {
    public Set OooO;
    public Set OooO00o = new HashSet();
    public Set OooO0O0 = new HashSet();
    public Set OooO0OO = new HashSet();
    public Set OooO0Oo = new HashSet();
    public Set OooO0o;
    public Set OooO0o0 = new HashSet();
    public Set OooO0oO;
    public Set OooO0oo;
    public Set OooOO0;

    private int OooO00o(Collection collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            i += obj instanceof byte[] ? C9586iIILl.OooO00o((byte[]) obj) : obj.hashCode();
        }
        return i;
    }

    public static int OooO00o(byte[] bArr, byte[] bArr2) {
        if (C9586iIILl.m21627OooO00o(bArr, bArr2)) {
            return 0;
        }
        return C9586iIILl.m21627OooO00o(m15456OooO0O0(bArr, bArr2), bArr) ? 1 : -1;
    }

    private String OooO00o(ILI ili) {
        return L1iI1.OooO00o(ili.m15483OooO0O0()).OooO00o();
    }

    public static String OooO00o(String str) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        return substring3.indexOf(47) != -1 ? substring3.substring(0, substring3.indexOf(47)) : substring3;
    }

    private String OooO00o(Set set) {
        String str = "" + "[";
        Iterator it = set.iterator();
        while (it.hasNext()) {
            str = str + OooO00o((byte[]) it.next()) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        return str + "]";
    }

    private String OooO00o(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length / 2; i++) {
            str = str + Integer.toString(bArr[i] & 255) + C9058ooOoOoOO.OooOO0;
        }
        String str2 = str.substring(0, str.length() - 1) + C8932ooOOO0o.OooO0OO;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            str2 = str2 + Integer.toString(bArr[length] & 255) + C9058ooOoOoOO.OooOO0;
        }
        return str2.substring(0, str2.length() - 1);
    }

    private Set OooO00o(Set set, I11li1 i11li1) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                I11li1 i11li12 = (I11li1) it.next();
                if (OooO00o(i11li1, i11li12)) {
                    hashSet.add(i11li12);
                } else {
                    if (!OooO00o(i11li12, i11li1)) {
                        hashSet.add(i11li12);
                    }
                    hashSet.add(i11li1);
                }
            }
            return hashSet;
        } else if (i11li1 == null) {
            return set;
        } else {
            set.add(i11li1);
            return set;
        }
    }

    private Set OooO00o(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) ((C9603iL1) it.next()).OooO00o().m15483OooO0O0().OooO0O0());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    I11li1 i11li1 = (I11li1) it2.next();
                    if (OooO00o(OooO00o2, i11li1)) {
                        hashSet.add(OooO00o2);
                    } else if (OooO00o(i11li1, OooO00o2)) {
                        hashSet.add(i11li1);
                    }
                }
            } else if (OooO00o2 != null) {
                hashSet.add(OooO00o2);
            }
        }
        return hashSet;
    }

    private Set OooO00o(Set set, byte[] bArr) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.addAll(OooO0O0((byte[]) it.next(), bArr));
            }
            return hashSet;
        } else if (bArr == null) {
            return set;
        } else {
            set.add(bArr);
            return set;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Set m15449OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] OooO00o2 = m15454OooO00o(bArr, bArr2);
        byte[] bArr3 = OooO00o2[0];
        byte[] bArr4 = OooO00o2[1];
        byte[] bArr5 = OooO00o2[2];
        byte[] bArr6 = OooO00o2[3];
        byte[][] OooO00o3 = OooO00o(bArr3, bArr4, bArr5, bArr6);
        return OooO00o(m15456OooO0O0(OooO00o3[0], OooO00o3[2]), OooO0OO(OooO00o3[1], OooO00o3[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(m15453OooO00o(OooO0Oo(OooO00o3[0], OooO00o3[2]), OooO0Oo(bArr4, bArr6)));
    }

    private void OooO00o(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (!OooO0OO(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else {
            if (str.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (str2.indexOf(64) != -1) {
                    if (!OooO0OO(str2.substring(str.indexOf(64) + 1), str)) {
                        return;
                    }
                } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                    if (!OooO0OO(str, str2) && !str.equalsIgnoreCase(str2)) {
                        if (!OooO0OO(str2, str)) {
                            return;
                        }
                    }
                } else if (!OooO0OO(str2, str)) {
                    return;
                }
            } else if (str2.indexOf(64) != -1) {
                if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    return;
                }
            } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (!OooO0OO(str, str2)) {
                    return;
                }
            } else if (!str.equalsIgnoreCase(str2)) {
                return;
            }
            set.add(str2);
            return;
        }
        set.add(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15450OooO00o(Set set, I11li1 i11li1) throws PKIXNameConstraintValidatorException {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (OooO00o(i11li1, (I11li1) it.next())) {
                    throw new PKIXNameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(java.util.Set r3, java.lang.String r4) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        /*
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Iterator r3 = r3.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r2.OooO0OO(r4, r0)
            if (r1 != 0) goto L_0x0024
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException r3 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r4 = "DNS is from an excluded subtree."
            r3.<init>(r4)
            throw r3
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5244II1.OooO00o(java.util.Set, java.lang.String):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15451OooO00o(Set set, byte[] bArr) throws PKIXNameConstraintValidatorException {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (m15452OooO00o(bArr, (byte[]) it.next())) {
                    throw new PKIXNameConstraintValidatorException("IP is from an excluded subtree.");
                }
            }
        }
    }

    public static boolean OooO00o(I11li1 i11li1, I11li1 i11li12) {
        if (i11li12.size() < 1 || i11li12.size() > i11li1.size()) {
            return false;
        }
        for (int size = i11li12.size() - 1; size >= 0; size--) {
            if (!i11li12.OooO00o(size).equals(i11li1.OooO00o(size))) {
                return false;
            }
        }
        return true;
    }

    private boolean OooO00o(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : C9586iIILl.m21627OooO00o((byte[]) obj, (byte[]) obj2);
    }

    private boolean OooO00o(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            return str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1));
        }
        if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (OooO0OO(substring, str2)) {
            return true;
        }
    }

    private boolean OooO00o(Collection collection, Collection collection2) {
        boolean z;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (OooO00o(obj, it.next())) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m15452OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return C9586iIILl.m21627OooO00o(bArr4, bArr5);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[] m15453OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[(length * 2)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[][] m15454OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private byte[][] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr5[i] = (byte) (bArr[i] & bArr2[i]);
            bArr6[i] = (byte) ((bArr[i] & bArr2[i]) | (bArr2[i] ^ -1));
            bArr7[i] = (byte) (bArr3[i] & bArr4[i]);
            bArr8[i] = (byte) ((bArr3[i] & bArr4[i]) | (bArr4[i] ^ -1));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private Set OooO0O0(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                OooO0OO((String) it.next(), str, hashSet);
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    private Set OooO0O0(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String OooO00o2 = OooO00o(((C9603iL1) it.next()).OooO00o());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (OooO0OO(str, OooO00o2)) {
                        hashSet.add(str);
                    } else if (OooO0OO(OooO00o2, str)) {
                        hashSet.add(OooO00o2);
                    }
                }
            } else if (OooO00o2 != null) {
                hashSet.add(OooO00o2);
            }
        }
        return hashSet;
    }

    private Set OooO0O0(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean OooO00o2 = C9586iIILl.m21627OooO00o(bArr, bArr2);
        hashSet.add(bArr);
        if (!OooO00o2) {
            hashSet.add(bArr2);
        }
        return hashSet;
    }

    private void OooO0O0(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (!OooO0OO(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else {
            if (str.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (str2.indexOf(64) != -1) {
                    if (!OooO0OO(str2.substring(str.indexOf(64) + 1), str)) {
                        return;
                    }
                } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                    if (!OooO0OO(str, str2) && !str.equalsIgnoreCase(str2)) {
                        if (!OooO0OO(str2, str)) {
                            return;
                        }
                    }
                } else if (!OooO0OO(str2, str)) {
                    return;
                }
            } else if (str2.indexOf(64) != -1) {
                if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    return;
                }
            } else if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
                if (!OooO0OO(str, str2)) {
                    return;
                }
            } else if (!str.equalsIgnoreCase(str2)) {
                return;
            }
            set.add(str2);
            return;
        }
        set.add(str);
    }

    private void OooO0O0(Set set, I11li1 i11li1) throws PKIXNameConstraintValidatorException {
        if (set != null) {
            if (!set.isEmpty() || i11li1.size() != 0) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (OooO00o(i11li1, (I11li1) it.next())) {
                        return;
                    }
                }
                throw new PKIXNameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m15455OooO0O0(Set set, String str) throws PKIXNameConstraintValidatorException {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (OooO00o(str, (String) it.next())) {
                    throw new PKIXNameConstraintValidatorException("Email address is from an excluded subtree.");
                }
            }
        }
    }

    private void OooO0O0(Set set, byte[] bArr) throws PKIXNameConstraintValidatorException {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (m15452OooO00o(bArr, (byte[]) it.next())) {
                    return;
                }
            }
            if (bArr.length != 0 || set.size() != 0) {
                throw new PKIXNameConstraintValidatorException("IP is not from a permitted subtree.");
            }
        }
    }

    private boolean OooO0O0(String str, String str2) {
        String OooO00o2 = OooO00o(str);
        return !str2.startsWith(C9058ooOoOoOO.OooOO0) ? OooO00o2.equalsIgnoreCase(str2) : OooO0OO(OooO00o2, str2);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static byte[] m15456OooO0O0(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) > (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private Set OooO0OO(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                OooO0Oo((String) it.next(), str, hashSet);
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    private Set OooO0OO(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String OooO00o2 = OooO00o(((C9603iL1) it.next()).OooO00o());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    OooO00o(OooO00o2, (String) it2.next(), hashSet);
                }
            } else if (OooO00o2 != null) {
                hashSet.add(OooO00o2);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (OooO0OO(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (OooO0OO(r6, r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (OooO0OO(r6, r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (OooO0OO(r5, r6) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0OO(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5244II1.OooO0OO(java.lang.String, java.lang.String, java.util.Set):void");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private void m15457OooO0OO(Set set, String str) throws PKIXNameConstraintValidatorException {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (OooO0O0(str, (String) it.next())) {
                    throw new PKIXNameConstraintValidatorException("URI is from an excluded subtree.");
                }
            }
        }
    }

    private boolean OooO0OO(String str, String str2) {
        if (str2.startsWith(C9058ooOoOoOO.OooOO0)) {
            str2 = str2.substring(1);
        }
        String[] OooO00o2 = Strings.OooO00o(str2, '.');
        String[] OooO00o3 = Strings.OooO00o(str, '.');
        if (OooO00o3.length <= OooO00o2.length) {
            return false;
        }
        int length = OooO00o3.length - OooO00o2.length;
        for (int i = -1; i < OooO00o2.length; i++) {
            if (i == -1) {
                if (OooO00o3[i + length].equals("")) {
                    return false;
                }
            } else if (!OooO00o2[i].equalsIgnoreCase(OooO00o3[i + length])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] OooO0OO(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) < (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private Set OooO0Oo(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] OooO00o2 = AbstractC6804llL1ii.OooO00o(((C9603iL1) it.next()).OooO00o().m15483OooO0O0()).m17938OooO00o();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(m15449OooO00o((byte[]) it2.next(), OooO00o2));
                }
            } else if (OooO00o2 != null) {
                hashSet.add(OooO00o2);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (OooO0OO(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (OooO0OO(r6, r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (OooO0OO(r6, r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (OooO0OO(r5, r6) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0Oo(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5244II1.OooO0Oo(java.lang.String, java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0Oo(java.util.Set r4, java.lang.String r5) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Iterator r0 = r4.iterator()
        L_0x0007:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.OooO0OO(r5, r1)
            if (r2 != 0) goto L_0x001f
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0007
        L_0x001f:
            return
        L_0x0020:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x002d
            int r4 = r4.size()
            if (r4 != 0) goto L_0x002d
            return
        L_0x002d:
            org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r5 = "DNS is not from a permitted subtree."
            r4.<init>(r5)
            goto L_0x0036
        L_0x0035:
            throw r4
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5244II1.OooO0Oo(java.util.Set, java.lang.String):void");
    }

    public static byte[] OooO0Oo(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] | bArr2[i]);
        }
        return bArr3;
    }

    private void OooO0o(Set set, String str) throws PKIXNameConstraintValidatorException {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (OooO0O0(str, (String) it.next())) {
                    return;
                }
            }
            if (str.length() != 0 || set.size() != 0) {
                throw new PKIXNameConstraintValidatorException("URI is not from a permitted subtree.");
            }
        }
    }

    private Set OooO0o0(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String OooO00o2 = OooO00o(((C9603iL1) it.next()).OooO00o());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    OooO0O0((String) it2.next(), OooO00o2, hashSet);
                }
            } else if (OooO00o2 != null) {
                hashSet.add(OooO00o2);
            }
        }
        return hashSet;
    }

    private void OooO0o0(Set set, String str) throws PKIXNameConstraintValidatorException {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (OooO00o(str, (String) it.next())) {
                    return;
                }
            }
            if (str.length() != 0 || set.size() != 0) {
                throw new PKIXNameConstraintValidatorException("Subject email address is not from a permitted subtree.");
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15458OooO00o(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!OooO0OO(str2, str)) {
                    boolean OooO0OO2 = OooO0OO(str, str2);
                    hashSet.add(str2);
                    if (OooO0OO2) {
                    }
                }
                hashSet.add(str);
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    public void OooO00o(int i) {
        if (i == 1) {
            this.OooO0oo = new HashSet();
        } else if (i == 2) {
            this.OooO0oO = new HashSet();
        } else if (i == 4) {
            this.OooO0o = new HashSet();
        } else if (i == 6) {
            this.OooO = new HashSet();
        } else if (i == 7) {
            this.OooOO0 = new HashSet();
        }
    }

    public void OooO00o(I11li1 i11li1) throws PKIXNameConstraintValidatorException {
        m15450OooO00o(this.OooO00o, i11li1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15459OooO00o(ILI ili) throws PKIXNameConstraintValidatorException {
        int OooO00o2 = ili.OooO00o();
        if (OooO00o2 == 1) {
            m15455OooO0O0(this.OooO0OO, OooO00o(ili));
        } else if (OooO00o2 == 2) {
            OooO00o(this.OooO0O0, L1iI1.OooO00o(ili.m15483OooO0O0()).OooO00o());
        } else if (OooO00o2 == 4) {
            OooO00o(I11li1.OooO00o((Object) ili.m15483OooO0O0().OooO0O0()));
        } else if (OooO00o2 == 6) {
            m15457OooO0OO(this.OooO0Oo, L1iI1.OooO00o(ili.m15483OooO0O0()).OooO00o());
        } else if (OooO00o2 == 7) {
            m15451OooO00o(this.OooO0o0, AbstractC6804llL1ii.OooO00o(ili.m15483OooO0O0()).m17938OooO00o());
        }
    }

    public void OooO00o(C9603iL1 r3) {
        ILI OooO00o2 = r3.OooO00o();
        int OooO00o3 = OooO00o2.OooO00o();
        if (OooO00o3 == 1) {
            this.OooO0OO = OooO0O0(this.OooO0OO, OooO00o(OooO00o2));
        } else if (OooO00o3 == 2) {
            this.OooO0O0 = m15458OooO00o(this.OooO0O0, OooO00o(OooO00o2));
        } else if (OooO00o3 == 4) {
            this.OooO00o = OooO00o(this.OooO00o, (I11li1) OooO00o2.m15483OooO0O0().OooO0O0());
        } else if (OooO00o3 == 6) {
            this.OooO0Oo = OooO0OO(this.OooO0Oo, OooO00o(OooO00o2));
        } else if (OooO00o3 == 7) {
            this.OooO0o0 = OooO00o(this.OooO0o0, AbstractC6804llL1ii.OooO00o(OooO00o2.m15483OooO0O0()).m17938OooO00o());
        }
    }

    public void OooO00o(C9603iL1[] r6) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i != r6.length; i++) {
            C9603iL1 r2 = r6[i];
            Integer OooO00o2 = I11I.OooO00o(r2.OooO00o().OooO00o());
            if (hashMap.get(OooO00o2) == null) {
                hashMap.put(OooO00o2, new HashSet());
            }
            ((Set) hashMap.get(OooO00o2)).add(r2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 1) {
                this.OooO0oo = OooO0OO(this.OooO0oo, (Set) entry.getValue());
            } else if (intValue == 2) {
                this.OooO0oO = OooO0O0(this.OooO0oO, (Set) entry.getValue());
            } else if (intValue == 4) {
                this.OooO0o = OooO00o(this.OooO0o, (Set) entry.getValue());
            } else if (intValue == 6) {
                this.OooO = OooO0o0(this.OooO, (Set) entry.getValue());
            } else if (intValue == 7) {
                this.OooOO0 = OooO0Oo(this.OooOO0, (Set) entry.getValue());
            }
        }
    }

    public void OooO0O0(I11li1 i11li1) throws PKIXNameConstraintValidatorException {
        OooO0O0(this.OooO0o, i11li1);
    }

    public void OooO0O0(ILI ili) throws PKIXNameConstraintValidatorException {
        int OooO00o2 = ili.OooO00o();
        if (OooO00o2 == 1) {
            OooO0o0(this.OooO0oo, OooO00o(ili));
        } else if (OooO00o2 == 2) {
            OooO0Oo(this.OooO0oO, L1iI1.OooO00o(ili.m15483OooO0O0()).OooO00o());
        } else if (OooO00o2 == 4) {
            OooO0O0(I11li1.OooO00o((Object) ili.m15483OooO0O0().OooO0O0()));
        } else if (OooO00o2 == 6) {
            OooO0o(this.OooO, L1iI1.OooO00o(ili.m15483OooO0O0()).OooO00o());
        } else if (OooO00o2 == 7) {
            OooO0O0(this.OooOO0, AbstractC6804llL1ii.OooO00o(ili.m15483OooO0O0()).m17938OooO00o());
        }
    }

    public void OooO0O0(C9603iL1 r3) {
        OooO00o(new C9603iL1[]{r3});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5244II1)) {
            return false;
        }
        C5244II1 r4 = (C5244II1) obj;
        return OooO00o(r4.OooO00o, this.OooO00o) && OooO00o(r4.OooO0O0, this.OooO0O0) && OooO00o(r4.OooO0OO, this.OooO0OO) && OooO00o(r4.OooO0o0, this.OooO0o0) && OooO00o(r4.OooO0Oo, this.OooO0Oo) && OooO00o(r4.OooO0o, this.OooO0o) && OooO00o(r4.OooO0oO, this.OooO0oO) && OooO00o(r4.OooO0oo, this.OooO0oo) && OooO00o(r4.OooOO0, this.OooOO0) && OooO00o(r4.OooO, this.OooO);
    }

    public int hashCode() {
        return OooO00o((Collection) this.OooO00o) + OooO00o((Collection) this.OooO0O0) + OooO00o((Collection) this.OooO0OO) + OooO00o((Collection) this.OooO0o0) + OooO00o((Collection) this.OooO0Oo) + OooO00o((Collection) this.OooO0o) + OooO00o((Collection) this.OooO0oO) + OooO00o((Collection) this.OooO0oo) + OooO00o((Collection) this.OooOO0) + OooO00o((Collection) this.OooO);
    }

    public String toString() {
        String str = "" + "permitted:\n";
        if (this.OooO0o != null) {
            str = (str + "DN:\n") + this.OooO0o.toString() + "\n";
        }
        if (this.OooO0oO != null) {
            str = (str + "DNS:\n") + this.OooO0oO.toString() + "\n";
        }
        if (this.OooO0oo != null) {
            str = (str + "Email:\n") + this.OooO0oo.toString() + "\n";
        }
        if (this.OooO != null) {
            str = (str + "URI:\n") + this.OooO.toString() + "\n";
        }
        if (this.OooOO0 != null) {
            str = (str + "IP:\n") + OooO00o(this.OooOO0) + "\n";
        }
        String str2 = str + "excluded:\n";
        if (!this.OooO00o.isEmpty()) {
            str2 = (str2 + "DN:\n") + this.OooO00o.toString() + "\n";
        }
        if (!this.OooO0O0.isEmpty()) {
            str2 = (str2 + "DNS:\n") + this.OooO0O0.toString() + "\n";
        }
        if (!this.OooO0OO.isEmpty()) {
            str2 = (str2 + "Email:\n") + this.OooO0OO.toString() + "\n";
        }
        if (!this.OooO0Oo.isEmpty()) {
            str2 = (str2 + "URI:\n") + this.OooO0Oo.toString() + "\n";
        }
        if (this.OooO0o0.isEmpty()) {
            return str2;
        }
        return (str2 + "IP:\n") + OooO00o(this.OooO0o0) + "\n";
    }
}
