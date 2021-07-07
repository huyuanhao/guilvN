package com.p118pd.sdk;

import com.bumptech.glide.load.engine.GlideException;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨丨丨丨I丨1  reason: invalid class name and case insensitive filesystem */
public class C9878I1 {
    public static final int OooO00o = 32;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23489OooO00o = "    ";

    public static String OooO00o(Object obj) {
        return OooO00o(obj, false);
    }

    public static String OooO00o(Object obj, boolean z) {
        AbstractC6122iIlLiL OooO0O0;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof AbstractC6122iIlLiL) {
            OooO0O0 = (AbstractC6122iIlLiL) obj;
        } else if (obj instanceof AbstractC6854lLi1LL) {
            OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
        } else {
            return "unknown object type " + obj.toString();
        }
        OooO00o("", z, OooO0O0, stringBuffer);
        return stringBuffer.toString();
    }

    public static String OooO00o(String str, String str2, boolean z, AbstractC6122iIlLiL iillil, String str3) {
        AbstractC8947ooOOOOo0 OooO00o2 = AbstractC8947ooOOOOo0.OooO00o((Object) iillil);
        StringBuffer stringBuffer = new StringBuffer();
        if (OooO00o2.OooO00o()) {
            try {
                I11li1 OooO00o3 = I11li1.OooO00o((Object) OooO00o2.OooO00o(16));
                stringBuffer.append(str2 + str + " ApplicationSpecific[" + OooO00o2.OooO0OO() + "]" + str3);
                Enumeration OooO00o4 = OooO00o3.m15236OooO00o();
                while (OooO00o4.hasMoreElements()) {
                    OooO00o(str2 + f23489OooO00o, z, (AbstractC6122iIlLiL) OooO00o4.nextElement(), stringBuffer);
                }
            } catch (IOException e) {
                stringBuffer.append(e);
            }
            return stringBuffer.toString();
        }
        return str2 + str + " ApplicationSpecific[" + OooO00o2.OooO0OO() + "] (" + Strings.OooO00o(C6472l1l1l.OooO0O0(OooO00o2.m20621OooO00o())) + C3848l.f10402t + str3;
    }

    public static String OooO00o(String str, byte[] bArr) {
        String OooO00o2;
        String OooO00o3 = Strings.m22984OooO00o();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + f23489OooO00o;
        stringBuffer.append(OooO00o3);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.OooO00o(C6472l1l1l.m17609OooO00o(bArr, i, 32)));
                stringBuffer.append(f23489OooO00o);
                OooO00o2 = OooO00o(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.OooO00o(C6472l1l1l.m17609OooO00o(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append(GlideException.OooO00o.o0ooOoO);
                }
                stringBuffer.append(f23489OooO00o);
                OooO00o2 = OooO00o(bArr, i, bArr.length - i);
            }
            stringBuffer.append(OooO00o2);
            stringBuffer.append(OooO00o3);
        }
        return stringBuffer.toString();
    }

    public static String OooO00o(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    public static void OooO00o(String str, boolean z, AbstractC6122iIlLiL iillil, StringBuffer stringBuffer) {
        String str2;
        StringBuilder sb;
        BigInteger OooO00o2;
        String str3;
        String OooO0O0;
        StringBuilder sb2;
        int i;
        String OooO00o3 = Strings.m22984OooO00o();
        if (iillil instanceof I11li1) {
            Enumeration OooO00o4 = ((I11li1) iillil).m15236OooO00o();
            String str4 = str + f23489OooO00o;
            stringBuffer.append(str);
            stringBuffer.append(iillil instanceof C6351ill ? "BER Sequence" : iillil instanceof C5707LiL1 ? "DER Sequence" : "Sequence");
            while (true) {
                stringBuffer.append(OooO00o3);
                while (OooO00o4.hasMoreElements()) {
                    Object nextElement = OooO00o4.nextElement();
                    if (nextElement == null || nextElement.equals(C6452l1Lll.OooO00o)) {
                        stringBuffer.append(str4);
                        stringBuffer.append("NULL");
                    } else {
                        OooO00o(str4, z, nextElement instanceof AbstractC6122iIlLiL ? (AbstractC6122iIlLiL) nextElement : ((AbstractC6854lLi1LL) nextElement).OooO0O0(), stringBuffer);
                    }
                }
                return;
            }
        }
        if (iillil instanceof AbstractC5903LlLLL) {
            String str5 = str + f23489OooO00o;
            stringBuffer.append(str);
            stringBuffer.append(iillil instanceof C6881lliiI1 ? "BER Tagged [" : "Tagged [");
            AbstractC5903LlLLL r7 = (AbstractC5903LlLLL) iillil;
            stringBuffer.append(Integer.toString(r7.OooO00o()));
            stringBuffer.append(']');
            if (!r7.OooO0O0()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(OooO00o3);
            if (r7.isEmpty()) {
                stringBuffer.append(str5);
                stringBuffer.append("EMPTY");
            } else {
                OooO00o(str5, z, r7.OooO0o(), stringBuffer);
                return;
            }
        } else if (iillil instanceof I11L) {
            Enumeration OooO00o5 = ((I11L) iillil).m15215OooO00o();
            String str6 = str + f23489OooO00o;
            stringBuffer.append(str);
            stringBuffer.append(iillil instanceof C5781LlIl ? "BER Set" : "DER Set");
            while (true) {
                stringBuffer.append(OooO00o3);
                while (OooO00o5.hasMoreElements()) {
                    Object nextElement2 = OooO00o5.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(str6);
                        stringBuffer.append("NULL");
                    } else {
                        OooO00o(str6, z, nextElement2 instanceof AbstractC6122iIlLiL ? (AbstractC6122iIlLiL) nextElement2 : ((AbstractC6854lLi1LL) nextElement2).OooO0O0(), stringBuffer);
                    }
                }
                return;
            }
        } else {
            if (iillil instanceof AbstractC6804llL1ii) {
                AbstractC6804llL1ii r1 = (AbstractC6804llL1ii) iillil;
                if (iillil instanceof C5837L1l) {
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("BER Constructed Octet String[");
                    i = r1.m17938OooO00o().length;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("DER Octet String[");
                    i = r1.m17938OooO00o().length;
                }
                sb2.append(i);
                sb2.append("] ");
                stringBuffer.append(sb2.toString());
                if (z) {
                    str2 = OooO00o(str, r1.m17938OooO00o());
                }
            } else {
                if (iillil instanceof LlLI1) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("ObjectIdentifier(");
                    sb.append(((LlLI1) iillil).m16387OooO0O0());
                } else if (iillil instanceof C5514IL) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("Boolean(");
                    sb.append(((C5514IL) iillil).m15792OooO0O0());
                } else {
                    if (iillil instanceof C6513lIiI) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("Integer(");
                        OooO00o2 = ((C6513lIiI) iillil).m17647OooO0O0();
                    } else if (iillil instanceof iIilII1) {
                        iIilII1 iiilii1 = (iIilII1) iillil;
                        stringBuffer.append(str + "DER Bit String[" + iiilii1.m15475OooO00o().length + ", " + iiilii1.OooO0OO() + "] ");
                        if (z) {
                            str2 = OooO00o(str, iiilii1.m15475OooO00o());
                        }
                    } else {
                        if (iillil instanceof L1iI1) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("IA5String(");
                            OooO0O0 = ((L1iI1) iillil).OooO00o();
                        } else if (iillil instanceof LII) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("UTF8String(");
                            OooO0O0 = ((LII) iillil).OooO00o();
                        } else if (iillil instanceof LI11) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("PrintableString(");
                            OooO0O0 = ((LI11) iillil).OooO00o();
                        } else if (iillil instanceof C1695li) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("VisibleString(");
                            OooO0O0 = ((C1695li) iillil).OooO00o();
                        } else if (iillil instanceof C6901li11) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("BMPString(");
                            OooO0O0 = ((C6901li11) iillil).OooO00o();
                        } else if (iillil instanceof C17021) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("T61String(");
                            OooO0O0 = ((C17021) iillil).OooO00o();
                        } else if (iillil instanceof C9578i11i) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("GraphicString(");
                            OooO0O0 = ((C9578i11i) iillil).OooO00o();
                        } else if (iillil instanceof C6478lI1I1) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("VideotexString(");
                            OooO0O0 = ((C6478lI1I1) iillil).OooO00o();
                        } else if (iillil instanceof LL1IL) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("UTCTime(");
                            OooO0O0 = ((LL1IL) iillil).OooO0OO();
                        } else if (iillil instanceof C9623il) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("GeneralizedTime(");
                            OooO0O0 = ((C9623il) iillil).m21686OooO0O0();
                        } else {
                            if (iillil instanceof L111) {
                                str3 = AbstractC5533IiL.OooO0OO;
                            } else if (iillil instanceof ILLIi) {
                                str3 = AbstractC5533IiL.OooO00o;
                            } else if (iillil instanceof C5841L11I) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("DER Enumerated(");
                                OooO00o2 = ((C5841L11I) iillil).OooO00o();
                            } else if (iillil instanceof C1687iI) {
                                C1687iI iIVar = (C1687iI) iillil;
                                stringBuffer.append(str + "External " + OooO00o3);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(f23489OooO00o);
                                String sb4 = sb3.toString();
                                if (iIVar.OooO00o() != null) {
                                    stringBuffer.append(sb4 + "Direct Reference: " + iIVar.OooO00o().m16387OooO0O0() + OooO00o3);
                                }
                                if (iIVar.m16927OooO00o() != null) {
                                    stringBuffer.append(sb4 + "Indirect Reference: " + iIVar.m16927OooO00o().toString() + OooO00o3);
                                }
                                if (iIVar.OooO0o() != null) {
                                    OooO00o(sb4, z, iIVar.OooO0o(), stringBuffer);
                                }
                                stringBuffer.append(sb4 + "Encoding: " + iIVar.OooO0OO() + OooO00o3);
                                OooO00o(sb4, z, iIVar.OooO0oO(), stringBuffer);
                                return;
                            } else {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append(iillil.toString());
                                sb.append(OooO00o3);
                                str2 = sb.toString();
                            }
                            str2 = OooO00o(str3, str, z, iillil, OooO00o3);
                        }
                        sb.append(OooO0O0);
                        sb.append(") ");
                        sb.append(OooO00o3);
                        str2 = sb.toString();
                    }
                    sb.append(OooO00o2);
                }
                sb.append(C3848l.f10402t);
                sb.append(OooO00o3);
                str2 = sb.toString();
            }
            stringBuffer.append(str2);
            return;
        }
        stringBuffer.append(OooO00o3);
    }
}
