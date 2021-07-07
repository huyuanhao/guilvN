package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4312cd;

/* renamed from: com.xiaomi.push.bx */
public class C4304bx extends C4306bz {
    public C4304bx(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    /* renamed from: a */
    public static C4304bx m11859a(Context context, String str, int i) {
        AbstractC4163b.m11304b("delete  messages when db size is too bigger");
        String a = C4312cd.m11921a(context).m11924a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rowDataId in (select ");
        sb.append("rowDataId from " + a);
        sb.append(" order by createTimeStamp asc");
        sb.append(" limit ?)");
        return new C4304bx(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    /* renamed from: a */
    private void m11860a(long j) {
        String[] strArr = ((C4312cd.C4316d) this).f11499a;
        if (strArr != null && strArr.length > 0) {
            strArr[0] = String.valueOf(j);
        }
    }

    @Override // com.xiaomi.push.C4312cd.AbstractRunnableC4313a
    /* renamed from: a */
    public void mo41543a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a = C4323cj.m11953a(m11931a());
            long j = C4302bv.f11464a;
            if (a > j) {
                double d = (double) (a - j);
                Double.isNaN(d);
                double d2 = (double) j;
                Double.isNaN(d2);
                double d3 = (double) longValue;
                Double.isNaN(d3);
                long j2 = (long) (((d * 1.2d) / d2) * d3);
                m11860a(j2);
                C4298br a2 = C4298br.m11843a(context);
                a2.mo41536a("begin delete " + j2 + "noUpload messages , because db size is " + a + "B");
                super.mo41543a(context, obj);
                return;
            }
            AbstractC4163b.m11304b("db size is suitable");
        }
    }
}
