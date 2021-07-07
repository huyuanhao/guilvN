package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.dh */
public class C4351dh {
    /* renamed from: a */
    public static int m12076a(Context context, int i) {
        int a = C4473gz.m12839a(context);
        if (-1 == a) {
            return -1;
        }
        return (i * (a == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a */
    public static int m12077a(EnumC4494ho hoVar) {
        return C4415fc.m12502a(hoVar.mo42005a());
    }

    /* renamed from: a */
    public static int m12078a(AbstractC4532iz izVar, EnumC4494ho hoVar) {
        int a;
        switch (C4352di.f11585a[hoVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return C4415fc.m12502a(hoVar.mo42005a());
            case 11:
                a = C4415fc.m12502a(hoVar.mo42005a());
                if (izVar != null) {
                    try {
                        if (izVar instanceof C4512if) {
                            String str = ((C4512if) izVar).f12621d;
                            if (!TextUtils.isEmpty(str) && C4415fc.m12503a(C4415fc.m12510a(str)) != -1) {
                                a = C4415fc.m12503a(C4415fc.m12510a(str));
                                break;
                            }
                        } else if (izVar instanceof C4520in) {
                            String str2 = ((C4520in) izVar).f12728d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (C4415fc.m12503a(C4415fc.m12510a(str2)) != -1) {
                                    a = C4415fc.m12503a(C4415fc.m12510a(str2));
                                }
                                if (EnumC4504hy.UploadTinyData.equals(C4415fc.m12510a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        AbstractC4163b.m11306d("PERF_ERROR : parse Notification type error");
                        return a;
                    }
                }
                break;
            case 12:
                a = C4415fc.m12502a(hoVar.mo42005a());
                if (izVar != null) {
                    try {
                        if (izVar instanceof C4516ij) {
                            String a2 = ((C4516ij) izVar).mo42256a();
                            if (!TextUtils.isEmpty(a2) && EnumC4423fi.m12550a(a2) != -1) {
                                a = EnumC4423fi.m12550a(a2);
                                break;
                            }
                        } else if (izVar instanceof C4515ii) {
                            String a3 = ((C4515ii) izVar).mo42234a();
                            if (!TextUtils.isEmpty(a3) && EnumC4423fi.m12550a(a3) != -1) {
                                return EnumC4423fi.m12550a(a3);
                            }
                        }
                    } catch (Exception unused2) {
                        AbstractC4163b.m11306d("PERF_ERROR : parse Command type error");
                        break;
                    }
                }
                break;
            default:
                return -1;
        }
        return a;
    }

    /* renamed from: a */
    public static void m12079a(String str, Context context, int i, int i2) {
        if (i > 0 && i2 > 0) {
            int a = m12076a(context, i2);
            if (i != C4415fc.m12503a(EnumC4504hy.UploadTinyData)) {
                C4417fd.m12519a(context.getApplicationContext()).mo41808a(str, i, 1, (long) a);
            }
        }
    }

    /* renamed from: a */
    public static void m12080a(String str, Context context, C4517ik ikVar, int i) {
        EnumC4494ho a;
        if (context != null && ikVar != null && (a = ikVar.mo42273a()) != null) {
            int a2 = m12077a(a);
            if (i <= 0) {
                byte[] a3 = C4531iy.m13590a(ikVar);
                i = a3 != null ? a3.length : 0;
            }
            m12079a(str, context, a2, i);
        }
    }

    /* renamed from: a */
    public static void m12081a(String str, Context context, AbstractC4532iz izVar, EnumC4494ho hoVar, int i) {
        m12079a(str, context, m12078a(izVar, hoVar), i);
    }

    /* renamed from: a */
    public static void m12082a(String str, Context context, byte[] bArr) {
        if (context != null && bArr != null && bArr.length > 0) {
            C4517ik ikVar = new C4517ik();
            try {
                C4531iy.m13589a(ikVar, bArr);
                m12080a(str, context, ikVar, bArr.length);
            } catch (C4542je unused) {
                AbstractC4163b.m11301a("fail to convert bytes to container");
            }
        }
    }
}
