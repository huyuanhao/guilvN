package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.IL1L丨l  reason: invalid class name */
public class IL1Ll {

    /* renamed from: com.pd.sdk.IL1L丨l$OooO */
    public static class OooO extends OooO0O0 {
        public OooO() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o(int i) {
            super(new C9529LlLLI(1024, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new C9529LlLLI((C9529LlLLI) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0O0 */
    public static class OooO0O0 extends Ll1lii implements Cloneable {
        public OooO0O0(int i) {
            super(new C9529LlLLI(256, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new C9529LlLLI((C9529LlLLI) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0OO */
    public static class OooO0OO extends Ll1lii implements Cloneable {
        public OooO0OO(int i) {
            super(new C9529LlLLI(512, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new C9529LlLLI((C9529LlLLI) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0Oo  reason: case insensitive filesystem */
    public static class C5248OooO0Oo extends OooO00o {
        public C5248OooO0Oo() {
            super(1024);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0o */
    public static class OooO0o extends OooO00o {
        public OooO0o() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0o0  reason: case insensitive filesystem */
    public static class C5249OooO0o0 extends OooO00o {
        public C5249OooO0o0() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0oO  reason: case insensitive filesystem */
    public static class C5250OooO0oO extends OooO0O0 {
        public C5250OooO0oO() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooO0oo  reason: case insensitive filesystem */
    public static class C5251OooO0oo extends OooO0O0 {
        public C5251OooO0oo() {
            super(160);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOO0 */
    public static class OooOO0 extends OooO0O0 {
        public OooOO0() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOO0O */
    public static class OooOO0O extends OooO0OO {
        public OooOO0O() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOO0o  reason: case insensitive filesystem */
    public static class C5252OooOO0o extends OooO0OO {
        public C5252OooOO0o() {
            super(160);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOO */
    public static class OooOOO extends OooO0OO {
        public OooOOO() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOO0 */
    public static class OooOOO0 extends OooO0OO {
        public OooOOO0() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOOO */
    public static class OooOOOO extends OooO0OO {
        public OooOOOO() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOOo  reason: case insensitive filesystem */
    public static class C5253OooOOOo extends OooO0OO {
        public C5253OooOOOo() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOo  reason: case insensitive filesystem */
    public static class C5254OooOOo extends C5597L11llL {
        public C5254OooOOo() {
            super("HMACSkein-1024-384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOo0  reason: case insensitive filesystem */
    public static class C5255OooOOo0 extends C5597L11llL {
        public C5255OooOOo0() {
            super("HMACSkein-1024-1024", 1024, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOOoo  reason: case insensitive filesystem */
    public static class C5256OooOOoo extends C5597L11llL {
        public C5256OooOOoo() {
            super("HMACSkein-1024-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOo */
    public static class OooOo extends C5597L11llL {
        public OooOo() {
            super("HMACSkein-512-128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOo0  reason: case insensitive filesystem */
    public static class C5257OooOo0 extends C5597L11llL {
        public C5257OooOo0() {
            super("HMACSkein-256-160", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOo00 */
    public static class OooOo00 extends C5597L11llL {
        public OooOo00() {
            super("HMACSkein-256-128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOo0O  reason: case insensitive filesystem */
    public static class C5258OooOo0O extends C5597L11llL {
        public C5258OooOo0O() {
            super("HMACSkein-256-224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOo0o  reason: case insensitive filesystem */
    public static class C5259OooOo0o extends C5597L11llL {
        public C5259OooOo0o() {
            super("HMACSkein-256-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOoO  reason: case insensitive filesystem */
    public static class C5260OooOoO extends C5597L11llL {
        public C5260OooOoO() {
            super("HMACSkein-512-224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOoO0  reason: case insensitive filesystem */
    public static class C5261OooOoO0 extends C5597L11llL {
        public C5261OooOoO0() {
            super("HMACSkein-512-160", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOoOO  reason: case insensitive filesystem */
    public static class C5262OooOoOO extends C5597L11llL {
        public C5262OooOoOO() {
            super("HMACSkein-512-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOoo  reason: case insensitive filesystem */
    public static class C5263OooOoo extends C5597L11llL {
        public C5263OooOoo() {
            super("HMACSkein-512-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOoo0  reason: case insensitive filesystem */
    public static class C5264OooOoo0 extends C5597L11llL {
        public C5264OooOoo0() {
            super("HMACSkein-512-384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOooO  reason: case insensitive filesystem */
    public static class C5265OooOooO extends C9680lII1i {
        public C5265OooOooO() {
            super(new C6383iLl1(new C9529LlLLI(1024, 1024)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooOooo  reason: case insensitive filesystem */
    public static class C5266OooOooo extends C9680lII1i {
        public C5266OooOooo() {
            super(new C6383iLl1(new C9529LlLLI(1024, 384)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo  reason: case insensitive filesystem */
    public static class C5267Oooo extends C9680lII1i {
        public C5267Oooo() {
            super(new C6383iLl1(new C9529LlLLI(512, 512)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0 */
    public static class Oooo0 extends C9680lII1i {
        public Oooo0() {
            super(new C6383iLl1(new C9529LlLLI(256, C7967oO0oOo00.Ooooo0o)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo000 */
    public static class Oooo000 extends C9680lII1i {
        public Oooo000() {
            super(new C6383iLl1(new C9529LlLLI(1024, 512)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo00O  reason: case insensitive filesystem */
    public static class C5268Oooo00O extends C9680lII1i {
        public C5268Oooo00O() {
            super(new C6383iLl1(new C9529LlLLI(256, 128)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo00o  reason: case insensitive filesystem */
    public static class C5269Oooo00o extends C9680lII1i {
        public C5269Oooo00o() {
            super(new C6383iLl1(new C9529LlLLI(256, 160)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0O0  reason: case insensitive filesystem */
    public static class C5270Oooo0O0 extends C9680lII1i {
        public C5270Oooo0O0() {
            super(new C6383iLl1(new C9529LlLLI(256, 256)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0OO  reason: case insensitive filesystem */
    public static class C5271Oooo0OO extends C9680lII1i {
        public C5271Oooo0OO() {
            super(new C6383iLl1(new C9529LlLLI(512, 128)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0o  reason: case insensitive filesystem */
    public static class C5272Oooo0o extends C9680lII1i {
        public C5272Oooo0o() {
            super(new C6383iLl1(new C9529LlLLI(512, C7967oO0oOo00.Ooooo0o)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0o0  reason: case insensitive filesystem */
    public static class C5273Oooo0o0 extends C9680lII1i {
        public C5273Oooo0o0() {
            super(new C6383iLl1(new C9529LlLLI(512, 160)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0oO  reason: case insensitive filesystem */
    public static class C5274Oooo0oO extends C9680lII1i {
        public C5274Oooo0oO() {
            super(new C6383iLl1(new C9529LlLLI(512, 256)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooo0oo  reason: case insensitive filesystem */
    public static class C5275Oooo0oo extends C9680lII1i {
        public C5275Oooo0oo() {
            super(new C6383iLl1(new C9529LlLLI(512, 384)));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooO  reason: case insensitive filesystem */
    public static class C5276OoooO extends C5597L11llL {
        public C5276OoooO() {
            super("Skein-MAC-1024-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooO0  reason: case insensitive filesystem */
    public static class C5277OoooO0 extends C5597L11llL {
        public C5277OoooO0() {
            super("Skein-MAC-1024-1024", 1024, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooO00  reason: case insensitive filesystem */
    public static class C5278OoooO00 extends AbstractC6146iIIi1 {
        public static final String OooO00o = IL1Ll.class.getName();

        private void OooO00o(l1I1L r6, int i, int i2) {
            String str = "Skein-MAC-" + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2;
            r6.addAlgorithm("Mac." + str, OooO00o + "$SkeinMac_" + i + "_" + i2);
            r6.addAlgorithm("Alg.Alias.Mac.Skein-MAC" + i + C8932ooOOO0o.OooO0OO + i2, str);
            StringBuilder sb = new StringBuilder();
            sb.append("KeyGenerator.");
            sb.append(str);
            r6.addAlgorithm(sb.toString(), OooO00o + "$SkeinMacKeyGenerator_" + i + "_" + i2);
            r6.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i + C8932ooOOO0o.OooO0OO + i2, str);
        }

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("MessageDigest.Skein-256-128", OooO00o + "$Digest_256_128");
            r6.addAlgorithm("MessageDigest.Skein-256-160", OooO00o + "$Digest_256_160");
            r6.addAlgorithm("MessageDigest.Skein-256-224", OooO00o + "$Digest_256_224");
            r6.addAlgorithm("MessageDigest.Skein-256-256", OooO00o + "$Digest_256_256");
            r6.addAlgorithm("MessageDigest.Skein-512-128", OooO00o + "$Digest_512_128");
            r6.addAlgorithm("MessageDigest.Skein-512-160", OooO00o + "$Digest_512_160");
            r6.addAlgorithm("MessageDigest.Skein-512-224", OooO00o + "$Digest_512_224");
            r6.addAlgorithm("MessageDigest.Skein-512-256", OooO00o + "$Digest_512_256");
            r6.addAlgorithm("MessageDigest.Skein-512-384", OooO00o + "$Digest_512_384");
            r6.addAlgorithm("MessageDigest.Skein-512-512", OooO00o + "$Digest_512_512");
            r6.addAlgorithm("MessageDigest.Skein-1024-384", OooO00o + "$Digest_1024_384");
            r6.addAlgorithm("MessageDigest.Skein-1024-512", OooO00o + "$Digest_1024_512");
            r6.addAlgorithm("MessageDigest.Skein-1024-1024", OooO00o + "$Digest_1024_1024");
            OooO00o(r6, "Skein-256-128", OooO00o + "$HashMac_256_128", OooO00o + "$HMacKeyGenerator_256_128");
            OooO00o(r6, "Skein-256-160", OooO00o + "$HashMac_256_160", OooO00o + "$HMacKeyGenerator_256_160");
            OooO00o(r6, "Skein-256-224", OooO00o + "$HashMac_256_224", OooO00o + "$HMacKeyGenerator_256_224");
            OooO00o(r6, "Skein-256-256", OooO00o + "$HashMac_256_256", OooO00o + "$HMacKeyGenerator_256_256");
            OooO00o(r6, "Skein-512-128", OooO00o + "$HashMac_512_128", OooO00o + "$HMacKeyGenerator_512_128");
            OooO00o(r6, "Skein-512-160", OooO00o + "$HashMac_512_160", OooO00o + "$HMacKeyGenerator_512_160");
            OooO00o(r6, "Skein-512-224", OooO00o + "$HashMac_512_224", OooO00o + "$HMacKeyGenerator_512_224");
            OooO00o(r6, "Skein-512-256", OooO00o + "$HashMac_512_256", OooO00o + "$HMacKeyGenerator_512_256");
            OooO00o(r6, "Skein-512-384", OooO00o + "$HashMac_512_384", OooO00o + "$HMacKeyGenerator_512_384");
            OooO00o(r6, "Skein-512-512", OooO00o + "$HashMac_512_512", OooO00o + "$HMacKeyGenerator_512_512");
            OooO00o(r6, "Skein-1024-384", OooO00o + "$HashMac_1024_384", OooO00o + "$HMacKeyGenerator_1024_384");
            OooO00o(r6, "Skein-1024-512", OooO00o + "$HashMac_1024_512", OooO00o + "$HMacKeyGenerator_1024_512");
            OooO00o(r6, "Skein-1024-1024", OooO00o + "$HashMac_1024_1024", OooO00o + "$HMacKeyGenerator_1024_1024");
            OooO00o(r6, 256, 128);
            OooO00o(r6, 256, 160);
            OooO00o(r6, 256, C7967oO0oOo00.Ooooo0o);
            OooO00o(r6, 256, 256);
            OooO00o(r6, 512, 128);
            OooO00o(r6, 512, 160);
            OooO00o(r6, 512, C7967oO0oOo00.Ooooo0o);
            OooO00o(r6, 512, 256);
            OooO00o(r6, 512, 384);
            OooO00o(r6, 512, 512);
            OooO00o(r6, 1024, 384);
            OooO00o(r6, 1024, 512);
            OooO00o(r6, 1024, 1024);
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooO0O  reason: case insensitive filesystem */
    public static class C5279OoooO0O extends C5597L11llL {
        public C5279OoooO0O() {
            super("Skein-MAC-1024-384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOO0  reason: case insensitive filesystem */
    public static class C5280OoooOO0 extends C5597L11llL {
        public C5280OoooOO0() {
            super("Skein-MAC-256-128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOOO  reason: case insensitive filesystem */
    public static class C5281OoooOOO extends C5597L11llL {
        public C5281OoooOOO() {
            super("Skein-MAC-256-224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOOo  reason: case insensitive filesystem */
    public static class C5282OoooOOo extends C5597L11llL {
        public C5282OoooOOo() {
            super("Skein-MAC-256-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOo0  reason: case insensitive filesystem */
    public static class C5283OoooOo0 extends C5597L11llL {
        public C5283OoooOo0() {
            super("Skein-MAC-512-128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOoO  reason: case insensitive filesystem */
    public static class C5284OoooOoO extends C5597L11llL {
        public C5284OoooOoO() {
            super("Skein-MAC-512-160", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooOoo  reason: case insensitive filesystem */
    public static class C5285OoooOoo extends C5597L11llL {
        public C5285OoooOoo() {
            super("Skein-MAC-512-224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Ooooo00  reason: case insensitive filesystem */
    public static class C5286Ooooo00 extends C5597L11llL {
        public C5286Ooooo00() {
            super("Skein-MAC-512-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Ooooo0o  reason: case insensitive filesystem */
    public static class C5287Ooooo0o extends C5597L11llL {
        public C5287Ooooo0o() {
            super("Skein-MAC-512-384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooooO0  reason: case insensitive filesystem */
    public static class C5288OooooO0 extends C5597L11llL {
        public C5288OooooO0() {
            super("Skein-MAC-512-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooooOO  reason: case insensitive filesystem */
    public static class C5289OooooOO extends C9680lII1i {
        public C5289OooooOO() {
            super(new IILLI(1024, 1024));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OooooOo  reason: case insensitive filesystem */
    public static class C5290OooooOo extends C9680lII1i {
        public C5290OooooOo() {
            super(new IILLI(1024, 384));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooooo  reason: case insensitive filesystem */
    public static class C5291Oooooo extends C9680lII1i {
        public C5291Oooooo() {
            super(new IILLI(256, 128));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Oooooo0  reason: case insensitive filesystem */
    public static class C5292Oooooo0 extends C9680lII1i {
        public C5292Oooooo0() {
            super(new IILLI(1024, 512));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$OoooooO  reason: case insensitive filesystem */
    public static class C5293OoooooO extends C9680lII1i {
        public C5293OoooooO() {
            super(new IILLI(256, 160));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$Ooooooo  reason: case insensitive filesystem */
    public static class C5294Ooooooo extends C9680lII1i {
        public C5294Ooooooo() {
            super(new IILLI(256, C7967oO0oOo00.Ooooo0o));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o000oOoO */
    public static class o000oOoO extends C5597L11llL {
        public o000oOoO() {
            super("Skein-MAC-256-160", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o00O0O */
    public static class o00O0O extends C9680lII1i {
        public o00O0O() {
            super(new IILLI(512, 160));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o00Oo0 */
    public static class o00Oo0 extends C9680lII1i {
        public o00Oo0() {
            super(new IILLI(512, C7967oO0oOo00.Ooooo0o));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o00Ooo */
    public static class o00Ooo extends C9680lII1i {
        public o00Ooo() {
            super(new IILLI(512, 256));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o00o0O  reason: case insensitive filesystem */
    public static class C5295o00o0O extends C9680lII1i {
        public C5295o00o0O() {
            super(new IILLI(512, 384));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o00ooo  reason: case insensitive filesystem */
    public static class C5296o00ooo extends C9680lII1i {
        public C5296o00ooo() {
            super(new IILLI(512, 512));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$o0OoOo0 */
    public static class o0OoOo0 extends C9680lII1i {
        public o0OoOo0() {
            super(new IILLI(256, 256));
        }
    }

    /* renamed from: com.pd.sdk.IL1L丨l$ooOO  reason: case insensitive filesystem */
    public static class C5297ooOO extends C9680lII1i {
        public C5297ooOO() {
            super(new IILLI(512, 128));
        }
    }
}
