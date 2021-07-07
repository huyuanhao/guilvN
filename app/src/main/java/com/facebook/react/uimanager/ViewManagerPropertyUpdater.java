package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewManagersPropertyCache;
import java.util.HashMap;
import java.util.Map;

public class ViewManagerPropertyUpdater {
    public static final Map<Class<?>, ShadowNodeSetter<?>> SHADOW_NODE_SETTER_MAP = new HashMap();
    public static final String TAG = "ViewManagerPropertyUpdater";
    public static final Map<Class<?>, ViewManagerSetter<?, ?>> VIEW_MANAGER_SETTER_MAP = new HashMap();

    public static class FallbackShadowNodeSetter<T extends ReactShadowNode> implements ShadowNodeSetter<T> {
        public final Map<String, ViewManagersPropertyCache.PropSetter> mPropSetters;

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> map) {
            for (ViewManagersPropertyCache.PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ShadowNodeSetter
        public void setProperty(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
            ViewManagersPropertyCache.PropSetter propSetter = this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateShadowNodeProp(reactShadowNode, reactStylesDiffMap);
            }
        }

        public FallbackShadowNodeSetter(Class<? extends ReactShadowNode> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForShadowNodeClass(cls);
        }
    }

    public static class FallbackViewManagerSetter<T extends ViewManager, V extends View> implements ViewManagerSetter<T, V> {
        public final Map<String, ViewManagersPropertyCache.PropSetter> mPropSetters;

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.Settable
        public void getProperties(Map<String, String> map) {
            for (ViewManagersPropertyCache.PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater.ViewManagerSetter
        public void setProperty(T t, V v, String str, ReactStylesDiffMap reactStylesDiffMap) {
            ViewManagersPropertyCache.PropSetter propSetter = this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateViewProp(t, v, reactStylesDiffMap);
            }
        }

        public FallbackViewManagerSetter(Class<? extends ViewManager> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForViewManagerClass(cls);
        }
    }

    public interface Settable {
        void getProperties(Map<String, String> map);
    }

    public interface ShadowNodeSetter<T extends ReactShadowNode> extends Settable {
        void setProperty(T t, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public interface ViewManagerSetter<T extends ViewManager, V extends View> extends Settable {
        void setProperty(T t, V v, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public static void clear() {
        ViewManagersPropertyCache.clear();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    public static <T> T findGeneratedSetter(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            FLog.m913w(TAG, "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    public static <T extends ViewManager, V extends View> ViewManagerSetter<T, V> findManagerSetter(Class<? extends ViewManager> cls) {
        FallbackViewManagerSetter fallbackViewManagerSetter = (ViewManagerSetter<T, V>) VIEW_MANAGER_SETTER_MAP.get(cls);
        if (fallbackViewManagerSetter == null) {
            fallbackViewManagerSetter = (ViewManagerSetter) findGeneratedSetter(cls);
            if (fallbackViewManagerSetter == null) {
                fallbackViewManagerSetter = new FallbackViewManagerSetter(cls);
            }
            VIEW_MANAGER_SETTER_MAP.put(cls, fallbackViewManagerSetter);
        }
        return fallbackViewManagerSetter;
    }

    public static <T extends ReactShadowNode> ShadowNodeSetter<T> findNodeSetter(Class<? extends ReactShadowNode> cls) {
        FallbackShadowNodeSetter fallbackShadowNodeSetter = (ShadowNodeSetter<T>) SHADOW_NODE_SETTER_MAP.get(cls);
        if (fallbackShadowNodeSetter == null) {
            fallbackShadowNodeSetter = (ShadowNodeSetter) findGeneratedSetter(cls);
            if (fallbackShadowNodeSetter == null) {
                fallbackShadowNodeSetter = new FallbackShadowNodeSetter(cls);
            }
            SHADOW_NODE_SETTER_MAP.put(cls, fallbackShadowNodeSetter);
        }
        return fallbackShadowNodeSetter;
    }

    public static Map<String, String> getNativeProps(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap hashMap = new HashMap();
        findManagerSetter(cls).getProperties(hashMap);
        findNodeSetter(cls2).getProperties(hashMap);
        return hashMap;
    }

    public static <T extends ViewManager, V extends View> void updateProps(T t, V v, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerSetter findManagerSetter = findManagerSetter(t.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findManagerSetter.setProperty(t, v, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }

    public static <T extends ReactShadowNode> void updateProps(T t, ReactStylesDiffMap reactStylesDiffMap) {
        ShadowNodeSetter findNodeSetter = findNodeSetter(t.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findNodeSetter.setProperty(t, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }
}
