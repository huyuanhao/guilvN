package com.drew.metadata.gif;

import com.drew.lang.annotations.NotNull;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.p118pd.sdk.C8016oOO00Oo;
import java.util.HashMap;

public class GifControlDirectory extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f14869OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o0 = 5;

    public enum DisposalMethod {
        NOT_SPECIFIED,
        DO_NOT_DISPOSE,
        RESTORE_TO_BACKGROUND_COLOR,
        RESTORE_TO_PREVIOUS,
        TO_BE_DEFINED,
        INVALID;

        public static DisposalMethod typeOf(int i) {
            switch (i) {
                case 0:
                    return NOT_SPECIFIED;
                case 1:
                    return DO_NOT_DISPOSE;
                case 2:
                    return RESTORE_TO_BACKGROUND_COLOR;
                case 3:
                    return RESTORE_TO_PREVIOUS;
                case 4:
                case 5:
                case 6:
                case 7:
                    return TO_BE_DEFINED;
                default:
                    return INVALID;
            }
        }

        public String toString() {
            switch (OooO00o.OooO00o[ordinal()]) {
                case 1:
                    return "Don't Dispose";
                case 2:
                    return "Invalid value";
                case 3:
                    return "Not Specified";
                case 4:
                    return "Restore to Background Color";
                case 5:
                    return "Restore to Previous";
                case 6:
                    return "To Be Defined";
                default:
                    return super.toString();
            }
        }
    }

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod[] r0 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o = r0
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.DO_NOT_DISPOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.INVALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.NOT_SPECIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.RESTORE_TO_BACKGROUND_COLOR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.RESTORE_TO_PREVIOUS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.drew.metadata.gif.GifControlDirectory.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.drew.metadata.gif.GifControlDirectory$DisposalMethod r1 = com.drew.metadata.gif.GifControlDirectory.DisposalMethod.TO_BE_DEFINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.drew.metadata.gif.GifControlDirectory.OooO00o.<clinit>():void");
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f14869OooO00o = hashMap;
        hashMap.put(1, "Delay");
        f14869OooO00o.put(2, "Disposal Method");
        f14869OooO00o.put(3, "User Input Flag");
        f14869OooO00o.put(4, "Transparent Color Flag");
        f14869OooO00o.put(5, "Transparent Color Index");
    }

    public GifControlDirectory() {
        OooO00o(new C8016oOO00Oo(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public DisposalMethod OooO00o() {
        return (DisposalMethod) m19642OooO00o(2);
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15028OooO00o() {
        return "GIF Control";
    }

    public boolean OooO0OO() {
        Boolean OooO00o2 = m19636OooO00o(4);
        return OooO00o2 != null && OooO00o2.booleanValue();
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m15029OooO00o() {
        return f14869OooO00o;
    }
}
