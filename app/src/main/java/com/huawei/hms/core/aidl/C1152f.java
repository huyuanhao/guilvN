package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.core.aidl.f */
public class C1152f {
    /* renamed from: b */
    private void m1123b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        mo15453a(field.getName(), field.get(iMessageEntity), bundle);
        field.setAccessible(isAccessible);
    }

    /* renamed from: a */
    public IMessageEntity mo15451a(Bundle bundle, IMessageEntity iMessageEntity) {
        if (bundle == null) {
            return iMessageEntity;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(AbstractC1143a.class)) {
                    try {
                        m1122a(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        String str = "decode, set value of the field exception, field name:" + field.getName();
                    }
                }
            }
        }
        return iMessageEntity;
    }

    /* renamed from: b */
    private boolean m1124b(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (!(obj instanceof Boolean)) {
            return false;
        } else {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* renamed from: a */
    private void m1122a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        Object a = m1121a(field, bundle);
        if (a != null) {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, a);
            field.setAccessible(isAccessible);
        }
    }

    /* renamed from: a */
    private Object m1121a(Field field, Bundle bundle) {
        String name = field.getName();
        Object obj = bundle.get(name);
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i = bundle2.getInt("_val_type_", -1);
                if (i == 1) {
                    return mo15452a(field.getGenericType(), bundle2);
                }
                if (i == 0) {
                    return mo15451a((Bundle) obj, (IMessageEntity) field.getType().newInstance());
                }
            } catch (Exception unused) {
                String str = "decode, read value of the field exception, field name: " + name;
                return null;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public List<Object> mo15452a(Type type, Bundle bundle) throws InstantiationException, IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle2 = bundle.getBundle("_next_item_"); bundle2 != null; bundle2 = bundle2.getBundle("_next_item_")) {
            Object obj = bundle2.get("_value_");
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (!(obj instanceof Bundle)) {
                continue;
            } else {
                Bundle bundle3 = (Bundle) obj;
                int i = bundle3.getInt("_val_type_", -1);
                if (i == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                } else if (i == 0) {
                    arrayList.add(mo15451a(bundle3, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                } else {
                    throw new InstantiationException("Unknown type can not be supported");
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public Bundle mo15450a(IMessageEntity iMessageEntity, Bundle bundle) {
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(AbstractC1143a.class)) {
                    try {
                        m1123b(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        String str = "encode, get value of the field exception, field name: " + field.getName();
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo15453a(String str, Object obj, Bundle bundle) {
        if (obj == null || m1124b(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof List) {
            mo15454a(str, (List) obj, bundle);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj instanceof IMessageEntity) {
            Bundle a = mo15450a((IMessageEntity) obj, new Bundle());
            a.putInt("_val_type_", 0);
            bundle.putBundle(str, a);
        } else {
            String str2 = "cannot support type, " + str;
        }
    }

    /* renamed from: a */
    public void mo15454a(String str, List list, Bundle bundle) {
        Bundle bundle2 = null;
        for (Object obj : list) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(str, bundle2);
                bundle2.putInt("_val_type_", 1);
            }
            bundle2 = m1120a("_value_", bundle2, obj);
        }
    }

    /* renamed from: a */
    private Bundle m1120a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        mo15453a(str, obj, bundle2);
        bundle.putBundle("_next_item_", bundle2);
        return bundle2;
    }
}
