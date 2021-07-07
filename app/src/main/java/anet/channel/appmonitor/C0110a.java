package anet.channel.appmonitor;

import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.p118pd.sdk.C7348o0O0oo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.appmonitor.a */
public class C0110a implements IAppMonitor {

    /* renamed from: a */
    public static boolean f103a;

    /* renamed from: b */
    public static Map<Class<?>, List<Field>> f104b = new ConcurrentHashMap();

    /* renamed from: c */
    public static Map<Class<?>, List<Field>> f105c = new ConcurrentHashMap();

    /* renamed from: d */
    public static Map<Field, String> f106d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Random f107e = new Random();

    /* renamed from: f */
    public static Set<Class<?>> f108f = Collections.newSetFromMap(new ConcurrentHashMap());

    public C0110a() {
        try {
            Class.forName("com.alibaba.mtl.appmonitor.AppMonitor");
            f103a = true;
        } catch (Exception unused) {
            f103a = false;
        }
    }

    /* renamed from: a */
    public synchronized void mo3410a(Class<?> cls) {
        if (cls != null) {
            if (f103a) {
                try {
                    if (!f108f.contains(cls)) {
                        Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                        if (monitor != null) {
                            Field[] fields = cls.getFields();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            DimensionSet create = DimensionSet.create();
                            MeasureSet create2 = MeasureSet.create();
                            for (Field field : fields) {
                                Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                                if (dimension != null) {
                                    field.setAccessible(true);
                                    arrayList.add(field);
                                    String name = dimension.name().equals("") ? field.getName() : dimension.name();
                                    f106d.put(field, name);
                                    create.addDimension(name);
                                } else {
                                    Measure measure = (Measure) field.getAnnotation(Measure.class);
                                    if (measure != null) {
                                        field.setAccessible(true);
                                        arrayList2.add(field);
                                        String name2 = measure.name().equals("") ? field.getName() : measure.name();
                                        f106d.put(field, name2);
                                        if (measure.max() != Double.MAX_VALUE) {
                                            create2.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name2, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                                        } else {
                                            create2.addMeasure(name2);
                                        }
                                    }
                                }
                            }
                            f104b.put(cls, arrayList);
                            f105c.put(cls, arrayList2);
                            AppMonitor.register(monitor.module(), monitor.monitorPoint(), create2, create);
                            f108f.add(cls);
                        }
                    }
                } catch (Exception e) {
                    ALog.m288e("awcn.DefaultAppMonitor", "register fail", null, e, new Object[0]);
                }
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        if (f103a && alarmObject != null && !TextUtils.isEmpty(alarmObject.module) && !TextUtils.isEmpty(alarmObject.modulePoint)) {
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
            }
            if (!alarmObject.isSuccess) {
                AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
            } else {
                AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        if (f103a && countObject != null && !TextUtils.isEmpty(countObject.module) && !TextUtils.isEmpty(countObject.modulePoint)) {
            if (ALog.isPrintLog(2)) {
                ALog.m290i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
            }
            AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        if (f103a && statObject != null) {
            Class<?> cls = statObject.getClass();
            Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
            if (monitor != null) {
                if (!f108f.contains(cls)) {
                    mo3410a(cls);
                }
                if (statObject.beforeCommit()) {
                    if (monitor.monitorPoint().equals("network")) {
                        int OooO0O0 = C7348o0O0oo.OooO0O0();
                        if (OooO0O0 > 10000 || OooO0O0 < 0) {
                            OooO0O0 = 10000;
                        }
                        if (OooO0O0 != 10000 && f107e.nextInt(10000) >= OooO0O0) {
                            return;
                        }
                    }
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        MeasureValueSet create2 = MeasureValueSet.create();
                        List<Field> list = f104b.get(cls);
                        HashMap hashMap = ALog.isPrintLog(1) ? new HashMap() : null;
                        if (list != null) {
                            for (Field field : list) {
                                Object obj = field.get(statObject);
                                create.setValue(f106d.get(field), obj == null ? "" : obj.toString());
                            }
                            for (Field field2 : f105c.get(cls)) {
                                Double valueOf = Double.valueOf(field2.getDouble(statObject));
                                create2.setValue(f106d.get(field2), valueOf.doubleValue());
                                if (hashMap != null) {
                                    hashMap.put(f106d.get(field2), valueOf);
                                }
                            }
                        }
                        AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), create, create2);
                        if (ALog.isPrintLog(1)) {
                            ALog.m287d("awcn.DefaultAppMonitor", "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", create.getMap().toString(), "\nMeasures", hashMap.toString());
                        }
                    } catch (Throwable th) {
                        ALog.m288e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register() {
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register(Class<?> cls) {
    }
}
