package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@DoNotStrip
public class JavaModuleWrapper {
    public final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    public final JSInstance mJSInstance;
    public final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    public final ModuleHolder mModuleHolder;

    @DoNotStrip
    public class MethodDescriptor {
        @DoNotStrip
        public Method method;
        @DoNotStrip
        public String name;
        @DoNotStrip
        public String signature;
        @DoNotStrip
        public String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @DoNotStrip
    private void findMethods() {
        Systrace.beginSection(0, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    String type = javaMethodWrapper.getType();
                    methodDescriptor.type = type;
                    if (type == BaseJavaModule.METHOD_TYPE_SYNC) {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        Systrace.endSection(0);
    }

    @DoNotStrip
    @Nullable
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        SystraceMessage.beginSection(0, "JavaModuleWrapper.getConstants").arg("moduleName", name).flush();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        Systrace.beginSection(0, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        Systrace.endSection(0);
        Systrace.beginSection(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            SystraceMessage.endSection(0).flush();
        }
    }

    @DoNotStrip
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @DoNotStrip
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @DoNotStrip
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @DoNotStrip
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
