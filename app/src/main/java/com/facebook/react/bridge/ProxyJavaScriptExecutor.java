package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaJSExecutor;
import javax.annotation.Nullable;

@DoNotStrip
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    @Nullable
    public JavaJSExecutor mJavaJSExecutor;

    public static class Factory implements JavaScriptExecutorFactory {
        public final JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public Factory(JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public JavaScriptExecutor create() throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }

    public static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public void close() {
        JavaJSExecutor javaJSExecutor = this.mJavaJSExecutor;
        if (javaJSExecutor != null) {
            javaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "ProxyJavaScriptExecutor";
    }
}
