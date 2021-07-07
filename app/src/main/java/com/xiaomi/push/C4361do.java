package com.xiaomi.push;

import android.content.Context;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.xiaomi.push.do */
public class C4361do implements LoggerInterface {

    /* renamed from: a */
    public static C4256al f11619a = new C4256al(true);

    /* renamed from: a */
    public static String f11620a = "/MiPushLog";

    /* renamed from: a */
    public static final SimpleDateFormat f11621a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a */
    public static List<Pair<String, Throwable>> f11622a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public Context f11623a;

    /* renamed from: b */
    public String f11624b;

    /* renamed from: c */
    public String f11625c = "";

    public C4361do(Context context) {
        this.f11623a = context;
        if (context.getApplicationContext() != null) {
            this.f11623a = context.getApplicationContext();
        }
        this.f11624b = this.f11623a.getPackageName();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|(1:18)|19|(10:20|21|22|23|(6:27|28|(2:30|93)(1:94)|31|25|24)|92|32|(3:34|(1:38)|39)|(2:41|42)|(2:47|48))|49|50|97) */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0124 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139 A[SYNTHETIC, Splitter:B:63:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014d A[SYNTHETIC, Splitter:B:73:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0155 A[SYNTHETIC, Splitter:B:81:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12114a() {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4361do.m12114a():void");
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th) {
        f11622a.add(new Pair<>(String.format("%1$s %2$s %3$s ", f11621a.format(new Date()), this.f11624b, str), th));
        f11619a.mo41483a(new C4362dp(this));
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.f11624b = str;
    }
}
