package com.facebook.react;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

public abstract class TurboReactPackage implements ReactPackage {

    public class ModuleHolderProvider implements Provider<NativeModule> {
        public final String mName;
        public final ReactApplicationContext mReactContext;

        public ModuleHolderProvider(String str, ReactApplicationContext reactApplicationContext) {
            this.mName = str;
            this.mReactContext = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        public NativeModule get() {
            return TurboReactPackage.this.getModule(this.mName, this.mReactContext);
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
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

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator<Map.Entry<String, ReactModuleInfo>> it = getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator();
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.TurboReactPackage.C06061 */

            @Override // java.lang.Iterable
            @NonNull
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.TurboReactPackage.C06061.C06071 */

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }

                    @Override // java.util.Iterator
                    public ModuleHolder next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        C06061 r4 = C06061.this;
                        return new ModuleHolder((ReactModuleInfo) entry.getValue(), new ModuleHolderProvider((String) entry.getKey(), reactApplicationContext));
                    }
                };
            }
        };
    }

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
