package com.facebook.react;

import androidx.annotation.NonNull;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import java.util.Iterator;
import java.util.List;

public class ReactPackageHelper {
    public static Iterable<ModuleHolder> getNativeModuleIterator(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        final List<NativeModule> list;
        FLog.m861d(ReactConstants.TAG, reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (reactPackage instanceof ReactInstancePackage) {
            list = ((ReactInstancePackage) reactPackage).createNativeModules(reactApplicationContext, reactInstanceManager);
        } else {
            list = reactPackage.createNativeModules(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.ReactPackageHelper.C06041 */

            @Override // java.lang.Iterable
            @NonNull
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.ReactPackageHelper.C06041.C06051 */
                    public int position = 0;

                    public boolean hasNext() {
                        return this.position < list.size();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove methods ");
                    }

                    @Override // java.util.Iterator
                    public ModuleHolder next() {
                        List list = list;
                        int i = this.position;
                        this.position = i + 1;
                        return new ModuleHolder((NativeModule) list.get(i));
                    }
                };
            }
        };
    }
}
