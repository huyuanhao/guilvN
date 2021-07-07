package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8379oOoOoOo;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        O convert(I i);

        I convertBack(O o);

        int zacj();

        int zack();
    }

    private final <I, O> void zaa(Field<I, O> field, I i) {
        String str = field.zapu;
        O convert = field.convert(i);
        switch (field.zaps) {
            case 0:
                if (zaa(str, convert)) {
                    setIntegerInternal(field, str, convert.intValue());
                    return;
                }
                return;
            case 1:
                zaa((Field<?, ?>) field, str, (BigInteger) convert);
                return;
            case 2:
                if (zaa(str, convert)) {
                    setLongInternal(field, str, convert.longValue());
                    return;
                }
                return;
            case 3:
            default:
                int i2 = field.zaps;
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (zaa(str, convert)) {
                    zaa((Field<?, ?>) field, str, convert.doubleValue());
                    return;
                }
                return;
            case 5:
                zaa((Field<?, ?>) field, str, (BigDecimal) convert);
                return;
            case 6:
                if (zaa(str, convert)) {
                    setBooleanInternal(field, str, convert.booleanValue());
                    return;
                }
                return;
            case 7:
                setStringInternal(field, str, convert);
                return;
            case 8:
            case 9:
                if (zaa(str, convert)) {
                    setDecodedBytesInternal(field, str, (byte[]) convert);
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <O, I> I zab(Field<I, O> field, Object obj) {
        return field.zapz != null ? field.convertBack(obj) : obj;
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field<?, ?> field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @KeepForSdk
    public Object getFieldValue(Field field) {
        String str = field.zapu;
        if (field.zapw == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zapu);
        boolean z = field.zapt;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    public abstract Object getValueObject(String str);

    @KeepForSdk
    public boolean isFieldSet(Field field) {
        if (field.zaps != 11) {
            return isPrimitiveFieldSet(field.zapu);
        }
        if (field.zapt) {
            String str = field.zapu;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.zapu;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(String str);

    @KeepForSdk
    public void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zab = zab(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zab != null) {
                    switch (field.zaps) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) zab));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zab));
                            sb.append("\"");
                            continue;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zab);
                            continue;
                        default:
                            if (!field.zapr) {
                                zaa(sb, field, zab);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) zab;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaa(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                continue;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append(C7522o0Ooo0o.OooO0Oo);
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void zac(Field<ArrayList<Long>, O> field, ArrayList<Long> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zac(field, field.zapu, arrayList);
        }
    }

    public final <O> void zad(Field<ArrayList<Float>, O> field, ArrayList<Float> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zad(field, field.zapu, arrayList);
        }
    }

    public final <O> void zae(Field<ArrayList<Double>, O> field, ArrayList<Double> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zae(field, field.zapu, arrayList);
        }
    }

    public final <O> void zaf(Field<ArrayList<BigDecimal>, O> field, ArrayList<BigDecimal> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zaf(field, field.zapu, arrayList);
        }
    }

    public final <O> void zag(Field<ArrayList<Boolean>, O> field, ArrayList<Boolean> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zag(field, field.zapu, arrayList);
        }
    }

    public final <O> void zah(Field<ArrayList<String>, O> field, ArrayList<String> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            setStringsInternal(field, field.zapu, arrayList);
        }
    }

    public final <O> void zab(Field<ArrayList<BigInteger>, O> field, ArrayList<BigInteger> arrayList) {
        if (field.zapz != null) {
            zaa(field, arrayList);
        } else {
            zab(field, field.zapu, arrayList);
        }
    }

    public void zac(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public void zad(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void zae(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void zaf(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void zag(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public void zab(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();
        @SafeParcelable.VersionField(getter = "getVersionCode", mo10871id = 1)
        public final int zale;
        @SafeParcelable.Field(getter = "getTypeIn", mo10865id = 2)
        public final int zapq;
        @SafeParcelable.Field(getter = "isTypeInArray", mo10865id = 3)
        public final boolean zapr;
        @SafeParcelable.Field(getter = "getTypeOut", mo10865id = 4)
        public final int zaps;
        @SafeParcelable.Field(getter = "isTypeOutArray", mo10865id = 5)
        public final boolean zapt;
        @SafeParcelable.Field(getter = "getOutputFieldName", mo10865id = 6)
        public final String zapu;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", mo10865id = 7)
        public final int zapv;
        public final Class<? extends FastJsonResponse> zapw;
        @SafeParcelable.Field(getter = "getConcreteTypeName", mo10865id = 8)
        public final String zapx;
        public zak zapy;
        @SafeParcelable.Field(getter = "getWrappedConverter", mo10865id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public FieldConverter<I, O> zapz;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) int i2, @SafeParcelable.Param(mo10868id = 3) boolean z, @SafeParcelable.Param(mo10868id = 4) int i3, @SafeParcelable.Param(mo10868id = 5) boolean z2, @SafeParcelable.Param(mo10868id = 6) String str, @SafeParcelable.Param(mo10868id = 7) int i4, @SafeParcelable.Param(mo10868id = 8) String str2, @SafeParcelable.Param(mo10868id = 9) zaa zaa) {
            this.zale = i;
            this.zapq = i2;
            this.zapr = z;
            this.zaps = i3;
            this.zapt = z2;
            this.zapu = str;
            this.zapv = i4;
            if (str2 == null) {
                this.zapw = null;
                this.zapx = null;
            } else {
                this.zapw = SafeParcelResponse.class;
                this.zapx = str2;
            }
            if (zaa == null) {
                this.zapz = null;
            } else {
                this.zapz = (FieldConverter<I, O>) zaa.zaci();
            }
        }

        @VisibleForTesting
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @KeepForSdk
        public static Field<Double, Double> forDouble(String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @KeepForSdk
        public static Field<Float, Float> forFloat(String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @VisibleForTesting
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @KeepForSdk
        public static Field<Long, Long> forLong(String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @KeepForSdk
        public static Field<String, String> forString(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @KeepForSdk
        public static Field withConverter(String str, int i, FieldConverter<?, ?> fieldConverter, boolean z) {
            return new Field(fieldConverter.zacj(), z, fieldConverter.zack(), false, str, i, null, fieldConverter);
        }

        private final String zacm() {
            String str = this.zapx;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final zaa zaco() {
            FieldConverter<I, O> fieldConverter = this.zapz;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.zaa(fieldConverter);
        }

        public final O convert(I i) {
            return this.zapz.convert(i);
        }

        public final I convertBack(O o) {
            return this.zapz.convertBack(o);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zapv;
        }

        public String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add(C8379oOoOoOo.OooOooO, Integer.valueOf(this.zale)).add("typeIn", Integer.valueOf(this.zapq)).add("typeInArray", Boolean.valueOf(this.zapr)).add("typeOut", Integer.valueOf(this.zaps)).add("typeOutArray", Boolean.valueOf(this.zapt)).add("outputFieldName", this.zapu).add("safeParcelFieldId", Integer.valueOf(this.zapv)).add("concreteTypeName", zacm());
            Class<? extends FastJsonResponse> cls = this.zapw;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zapz;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zale);
            SafeParcelWriter.writeInt(parcel, 2, this.zapq);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zapr);
            SafeParcelWriter.writeInt(parcel, 4, this.zaps);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zapt);
            SafeParcelWriter.writeString(parcel, 6, this.zapu, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zacm(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaco(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public final void zaa(zak zak) {
            this.zapy = zak;
        }

        public final Field<I, O> zacl() {
            return new Field<>(this.zale, this.zapq, this.zapr, this.zaps, this.zapt, this.zapu, this.zapv, this.zapx, zaco());
        }

        public final boolean zacn() {
            return this.zapz != null;
        }

        public final FastJsonResponse zacp() throws InstantiationException, IllegalAccessException {
            Class<? extends FastJsonResponse> cls = this.zapw;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zapy, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zapy, this.zapx);
        }

        public final Map<String, Field<?, ?>> zacq() {
            Preconditions.checkNotNull(this.zapx);
            Preconditions.checkNotNull(this.zapy);
            return this.zapy.zai(this.zapx);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.zale = 1;
            this.zapq = i;
            this.zapr = z;
            this.zaps = i2;
            this.zapt = z2;
            this.zapu = str;
            this.zapv = i3;
            this.zapw = cls;
            if (cls == null) {
                this.zapx = null;
            } else {
                this.zapx = cls.getCanonicalName();
            }
            this.zapz = fieldConverter;
        }
    }

    public final <O> void zaa(Field<Integer, O> field, int i) {
        if (field.zapz != null) {
            zaa(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zapu, i);
        }
    }

    public final <O> void zaa(Field<ArrayList<Integer>, O> field, ArrayList<Integer> arrayList) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) arrayList);
        } else {
            zaa(field, field.zapu, arrayList);
        }
    }

    public final <O> void zaa(Field<BigInteger, O> field, BigInteger bigInteger) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) bigInteger);
        } else {
            zaa(field, field.zapu, bigInteger);
        }
    }

    public final <O> void zaa(Field<Long, O> field, long j) {
        if (field.zapz != null) {
            zaa(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zapu, j);
        }
    }

    public final <O> void zaa(Field<Float, O> field, float f) {
        if (field.zapz != null) {
            zaa(field, Float.valueOf(f));
        } else {
            zaa((Field<?, ?>) field, field.zapu, f);
        }
    }

    public final <O> void zaa(Field<Double, O> field, double d) {
        if (field.zapz != null) {
            zaa(field, Double.valueOf(d));
        } else {
            zaa(field, field.zapu, d);
        }
    }

    public final <O> void zaa(Field<BigDecimal, O> field, BigDecimal bigDecimal) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) bigDecimal);
        } else {
            zaa(field, field.zapu, bigDecimal);
        }
    }

    public final <O> void zaa(Field<Boolean, O> field, boolean z) {
        if (field.zapz != null) {
            zaa(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zapu, z);
        }
    }

    public final <O> void zaa(Field<String, O> field, String str) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) str);
        } else {
            setStringInternal(field, field.zapu, str);
        }
    }

    public final <O> void zaa(Field<byte[], O> field, byte[] bArr) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) bArr);
        } else {
            setDecodedBytesInternal(field, field.zapu, bArr);
        }
    }

    public final <O> void zaa(Field<Map<String, String>, O> field, Map<String, String> map) {
        if (field.zapz != null) {
            zaa((Field) field, (Object) map);
        } else {
            zaa(field, field.zapu, map);
        }
    }

    public void zaa(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void zaa(Field<?, ?> field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void zaa(Field<?, ?> field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void zaa(Field<?, ?> field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void zaa(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void zaa(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public static <O> boolean zaa(String str, O o) {
        if (o != null) {
            return true;
        }
        if (!Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("Output field (");
        sb.append(str);
        sb.append(") has a null value, but expected a primitive");
        sb.toString();
        return false;
    }

    public static void zaa(StringBuilder sb, Field field, Object obj) {
        int i = field.zapq;
        if (i == 11) {
            sb.append(((FastJsonResponse) field.zapw.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
