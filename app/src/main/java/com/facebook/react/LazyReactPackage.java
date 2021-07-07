package com.facebook.react;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.SystraceMessage;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class LazyReactPackage implements ReactPackage {
    public static ReactModuleInfoProvider getReactModuleInfoProviderViaReflection(LazyReactPackage lazyReactPackage) {
        try {
            Class<?> cls = Class.forName(lazyReactPackage.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls != null) {
                try {
                    return (ReactModuleInfoProvider) cls.newInstance();
                } catch (InstantiationException e) {
                    throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + lazyReactPackage.getClass(), e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + lazyReactPackage.getClass(), e2);
                }
            } else {
                throw new RuntimeException("ReactModuleInfoProvider class for " + lazyReactPackage.getClass().getCanonicalName() + " not found.");
            }
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() {
                /* class com.facebook.react.LazyReactPackage.C05841 */

                @Override // com.facebook.react.module.model.ReactModuleInfoProvider
                public Map<String, ReactModuleInfo> getReactModuleInfos() {
                    return Collections.emptyMap();
                }
            };
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.react.ReactPackage
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            SystraceMessage.beginSection(0, "createNativeModule").arg(C3617o.f9375d, moduleSpec.getType()).flush();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                SystraceMessage.endSection(0).flush();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                SystraceMessage.endSection(0).flush();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : viewManagers) {
            arrayList.add((ViewManager) moduleSpec.getProvider().get());
        }
        return arrayList;
    }

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        final Map<String, ReactModuleInfo> reactModuleInfos = getReactModuleInfoProvider().getReactModuleInfos();
        final List<ModuleSpec> nativeModules = getNativeModules(reactApplicationContext);
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.LazyReactPackage.C05852 */

            @Override // java.lang.Iterable
            @NonNull
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.LazyReactPackage.C05852.C05861 */
                    public int position = 0;

                    public boolean hasNext() {
                        return this.position < nativeModules.size();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }

                    /* JADX INFO: finally extract failed */
                    @Override // java.util.Iterator
                    public ModuleHolder next() {
                        List list = nativeModules;
                        int i = this.position;
                        this.position = i + 1;
                        ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                        String name = moduleSpec.getName();
                        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) reactModuleInfos.get(name);
                        if (reactModuleInfo != null) {
                            return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                        }
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                        try {
                            NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            return new ModuleHolder(nativeModule);
                        } catch (Throwable th) {
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            throw th;
                        }
                    }
                };
            }
        };
    }

    public abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
