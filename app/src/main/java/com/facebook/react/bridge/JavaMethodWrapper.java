package com.facebook.react.bridge;

import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.SystraceMessage;
import com.p118pd.sdk.AbstractC6339ill;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class JavaMethodWrapper implements NativeModule.NativeMethod {
    public static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06526 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    public static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06461 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    public static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06559 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        @Nullable
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    public static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06482 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    public static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06537 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    public static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06493 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    public static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06504 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    public static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06548 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    public static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C064710 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }
    };
    public static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() {
        /* class com.facebook.react.bridge.JavaMethodWrapper.C06515 */

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    public static final boolean DEBUG = PrinterHolder.getPrinter().shouldDisplayLogMessage(ReactDebugOverlayTags.BRIDGE_CALLS);
    @Nullable
    public ArgumentExtractor[] mArgumentExtractors;
    @Nullable
    public Object[] mArguments;
    public boolean mArgumentsProcessed = false;
    @Nullable
    public int mJSArgumentsNeeded;
    public final Method mMethod;
    public final JavaModuleWrapper mModuleWrapper;
    public final int mParamLength;
    public final Class[] mParameterTypes;
    @Nullable
    public String mSignature;
    public String mType = BaseJavaModule.METHOD_TYPE_ASYNC;

    public static abstract class ArgumentExtractor<T> {
        public ArgumentExtractor() {
        }

        @Nullable
        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = this.mMethod.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length > 0 && parameterTypes[length - 1] == Promise.class) {
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                Assertions.assertCondition(z, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else if (cls == Dynamic.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                Assertions.assertCondition(z2, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
        }
        return sb.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) Assertions.assertNotNull(this.mArgumentExtractors)) {
            i += argumentExtractor.getJSArgumentsNeeded();
        }
        return i;
    }

    public static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return AbstractC6339ill.OooO00o;
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : 0;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            return "" + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((i + i2) - 1);
        }
        return "" + i;
    }

    public static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            SystraceMessage.Builder beginSection = SystraceMessage.beginSection(0, "processArguments");
            beginSection.arg(AbstractC7726o0ooOOoo.OooOOo0, this.mModuleWrapper.getName() + C9058ooOoOoOO.OooOO0 + this.mMethod.getName()).flush();
            try {
                this.mArgumentsProcessed = true;
                this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
                this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
                this.mArguments = new Object[this.mParameterTypes.length];
                this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
            } finally {
                SystraceMessage.endSection(0).flush();
            }
        }
    }

    public static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) Assertions.assertNotNull(this.mSignature);
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + C9058ooOoOoOO.OooOO0 + this.mMethod.getName();
        SystraceMessage.beginSection(0, "callJavaModuleMethod").arg(AbstractC7726o0ooOOoo.OooOOo0, str).flush();
        if (DEBUG) {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.BRIDGE_CALLS, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            } else if (this.mJSArgumentsNeeded == readableArray.size()) {
                int i = 0;
                for (int i2 = 0; i2 < this.mArgumentExtractors.length; i2++) {
                    try {
                        this.mArguments[i2] = this.mArgumentExtractors[i2].extractArgument(jSInstance, readableArray, i);
                        i += this.mArgumentExtractors[i2].getJSArgumentsNeeded();
                    } catch (UnexpectedNativeTypeException e) {
                        throw new NativeArgumentsParseException(e.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i, this.mArgumentExtractors[i2].getJSArgumentsNeeded()) + C3848l.f10402t, e);
                    }
                }
                try {
                    this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                } catch (IllegalArgumentException e2) {
                    throw new RuntimeException("Could not invoke " + str, e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Could not invoke " + str, e3);
                } catch (InvocationTargetException e4) {
                    if (e4.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e4.getCause());
                    }
                    throw new RuntimeException("Could not invoke " + str, e4);
                }
            } else {
                throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
            }
        } finally {
            SystraceMessage.endSection(0).flush();
        }
    }
}
