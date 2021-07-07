package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ViewManagersPropertyCache {
    public static final Map<Class, Map<String, PropSetter>> CLASS_PROPS_CACHE = new HashMap();
    public static final Map<String, PropSetter> EMPTY_PROPS_MAP = new HashMap();

    public static class ArrayPropSetter extends PropSetter {
        public ArrayPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        @Nullable
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getArray(this.mPropName);
        }
    }

    public static class BooleanPropSetter extends PropSetter {
        public final boolean mDefaultValue;

        public BooleanPropSetter(ReactProp reactProp, Method method, boolean z) {
            super(reactProp, "boolean", method);
            this.mDefaultValue = z;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getBoolean(this.mPropName, this.mDefaultValue) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static class BoxedBooleanPropSetter extends PropSetter {
        public BoxedBooleanPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        @Nullable
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (!reactStylesDiffMap.isNull(this.mPropName)) {
                return reactStylesDiffMap.getBoolean(this.mPropName, false) ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    public static class BoxedIntPropSetter extends PropSetter {
        public BoxedIntPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "number", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        @Nullable
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (!reactStylesDiffMap.isNull(this.mPropName)) {
                return Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, 0));
            }
            return null;
        }

        public BoxedIntPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "number", method, i);
        }
    }

    public static class DynamicPropSetter extends PropSetter {
        public DynamicPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getDynamic(this.mPropName);
        }

        public DynamicPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "mixed", method, i);
        }
    }

    public static class MapPropSetter extends PropSetter {
        public MapPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        @Nullable
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getMap(this.mPropName);
        }
    }

    public static class StringPropSetter extends PropSetter {
        public StringPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        @Nullable
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getString(this.mPropName);
        }
    }

    public static void clear() {
        CLASS_PROPS_CACHE.clear();
        EMPTY_PROPS_MAP.clear();
    }

    public static PropSetter createPropSetter(ReactProp reactProp, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new DynamicPropSetter(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanPropSetter(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new IntPropSetter(reactProp, method, reactProp.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new FloatPropSetter(reactProp, method, reactProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new DoublePropSetter(reactProp, method, reactProp.defaultDouble());
        }
        if (cls == String.class) {
            return new StringPropSetter(reactProp, method);
        }
        if (cls == Boolean.class) {
            return new BoxedBooleanPropSetter(reactProp, method);
        }
        if (cls == Integer.class) {
            return new BoxedIntPropSetter(reactProp, method);
        }
        if (cls == ReadableArray.class) {
            return new ArrayPropSetter(reactProp, method);
        }
        if (cls == ReadableMap.class) {
            return new MapPropSetter(reactProp, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    public static void createPropSetters(ReactPropGroup reactPropGroup, Method method, Class<?> cls, Map<String, PropSetter> map) {
        String[] names = reactPropGroup.names();
        int i = 0;
        if (cls == Dynamic.class) {
            while (i < names.length) {
                map.put(names[i], new DynamicPropSetter(reactPropGroup, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                map.put(names[i], new IntPropSetter(reactPropGroup, method, i, reactPropGroup.defaultInt()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new FloatPropSetter(reactPropGroup, method, i, reactPropGroup.defaultFloat()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                map.put(names[i], new DoublePropSetter(reactPropGroup, method, i, reactPropGroup.defaultDouble()));
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < names.length) {
                map.put(names[i], new BoxedIntPropSetter(reactPropGroup, method, i));
                i++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    public static void extractPropSettersFromShadowNodeClassDefinition(Class<? extends ReactShadowNode> cls, Map<String, PropSetter> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes2[1], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    public static void extractPropSettersFromViewManagerClassDefinition(Class<? extends ViewManager> cls, Map<String, PropSetter> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[1]));
                } else {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes2[2], map);
                } else {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    public static Map<String, PropSetter> getNativePropSettersForShadowNodeClass(Class<? extends ReactShadowNode> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == ReactShadowNode.class) {
                return EMPTY_PROPS_MAP;
            }
        }
        Map<String, PropSetter> map = CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(getNativePropSettersForShadowNodeClass(cls.getSuperclass()));
        extractPropSettersFromShadowNodeClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }

    public static Map<String, PropSetter> getNativePropSettersForViewManagerClass(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return EMPTY_PROPS_MAP;
        }
        Map<String, PropSetter> map = CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(getNativePropSettersForViewManagerClass(cls.getSuperclass()));
        extractPropSettersFromViewManagerClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }

    public static Map<String, String> getNativePropsForView(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap hashMap = new HashMap();
        for (PropSetter propSetter : getNativePropSettersForViewManagerClass(cls).values()) {
            hashMap.put(propSetter.getPropName(), propSetter.getPropType());
        }
        for (PropSetter propSetter2 : getNativePropSettersForShadowNodeClass(cls2).values()) {
            hashMap.put(propSetter2.getPropName(), propSetter2.getPropType());
        }
        return hashMap;
    }

    public static class DoublePropSetter extends PropSetter {
        public final double mDefaultValue;

        public DoublePropSetter(ReactProp reactProp, Method method, double d) {
            super(reactProp, "number", method);
            this.mDefaultValue = d;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Double.valueOf(reactStylesDiffMap.getDouble(this.mPropName, this.mDefaultValue));
        }

        public DoublePropSetter(ReactPropGroup reactPropGroup, Method method, int i, double d) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = d;
        }
    }

    public static class FloatPropSetter extends PropSetter {
        public final float mDefaultValue;

        public FloatPropSetter(ReactProp reactProp, Method method, float f) {
            super(reactProp, "number", method);
            this.mDefaultValue = f;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Float.valueOf(reactStylesDiffMap.getFloat(this.mPropName, this.mDefaultValue));
        }

        public FloatPropSetter(ReactPropGroup reactPropGroup, Method method, int i, float f) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = f;
        }
    }

    public static class IntPropSetter extends PropSetter {
        public final int mDefaultValue;

        public IntPropSetter(ReactProp reactProp, Method method, int i) {
            super(reactProp, "number", method);
            this.mDefaultValue = i;
        }

        @Override // com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, this.mDefaultValue));
        }

        public IntPropSetter(ReactPropGroup reactPropGroup, Method method, int i, int i2) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = i2;
        }
    }

    public static abstract class PropSetter {
        public static final Object[] SHADOW_ARGS = new Object[1];
        public static final Object[] SHADOW_GROUP_ARGS = new Object[2];
        public static final Object[] VIEW_MGR_ARGS = new Object[2];
        public static final Object[] VIEW_MGR_GROUP_ARGS = new Object[3];
        @Nullable
        public final Integer mIndex;
        public final String mPropName;
        public final String mPropType;
        public final Method mSetter;

        @Nullable
        public abstract Object extractProperty(ReactStylesDiffMap reactStylesDiffMap);

        public String getPropName() {
            return this.mPropName;
        }

        public String getPropType() {
            return this.mPropType;
        }

        public void updateShadowNodeProp(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                if (this.mIndex == null) {
                    SHADOW_ARGS[0] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(reactShadowNode, SHADOW_ARGS);
                    Arrays.fill(SHADOW_ARGS, (Object) null);
                    return;
                }
                SHADOW_GROUP_ARGS[0] = this.mIndex;
                SHADOW_GROUP_ARGS[1] = extractProperty(reactStylesDiffMap);
                this.mSetter.invoke(reactShadowNode, SHADOW_GROUP_ARGS);
                Arrays.fill(SHADOW_GROUP_ARGS, (Object) null);
            } catch (Throwable th) {
                FLog.m870e(ViewManager.class, "Error while updating prop " + this.mPropName, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.mPropName + "' in shadow node of type: " + reactShadowNode.getViewClass(), th);
            }
        }

        public void updateViewProp(ViewManager viewManager, View view, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                if (this.mIndex == null) {
                    VIEW_MGR_ARGS[0] = view;
                    VIEW_MGR_ARGS[1] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(viewManager, VIEW_MGR_ARGS);
                    Arrays.fill(VIEW_MGR_ARGS, (Object) null);
                    return;
                }
                VIEW_MGR_GROUP_ARGS[0] = view;
                VIEW_MGR_GROUP_ARGS[1] = this.mIndex;
                VIEW_MGR_GROUP_ARGS[2] = extractProperty(reactStylesDiffMap);
                this.mSetter.invoke(viewManager, VIEW_MGR_GROUP_ARGS);
                Arrays.fill(VIEW_MGR_GROUP_ARGS, (Object) null);
            } catch (Throwable th) {
                FLog.m870e(ViewManager.class, "Error while updating prop " + this.mPropName, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.mPropName + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        public PropSetter(ReactProp reactProp, String str, Method method) {
            this.mPropName = reactProp.name();
            this.mPropType = !"__default_type__".equals(reactProp.customType()) ? reactProp.customType() : str;
            this.mSetter = method;
            this.mIndex = null;
        }

        public PropSetter(ReactPropGroup reactPropGroup, String str, Method method, int i) {
            this.mPropName = reactPropGroup.names()[i];
            this.mPropType = !"__default_type__".equals(reactPropGroup.customType()) ? reactPropGroup.customType() : str;
            this.mSetter = method;
            this.mIndex = Integer.valueOf(i);
        }
    }
}
