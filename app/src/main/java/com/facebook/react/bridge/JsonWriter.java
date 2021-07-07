package com.facebook.react.bridge;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;

public class JsonWriter implements Closeable {
    public final Deque<Scope> mScopes = new ArrayDeque();
    public final Writer mWriter;

    /* renamed from: com.facebook.react.bridge.JsonWriter$1 */
    public static /* synthetic */ class C06591 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$JsonWriter$Scope;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.react.bridge.JsonWriter$Scope[] r0 = com.facebook.react.bridge.JsonWriter.Scope.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.JsonWriter.C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope = r0
                com.facebook.react.bridge.JsonWriter$Scope r1 = com.facebook.react.bridge.JsonWriter.Scope.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.JsonWriter.C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.JsonWriter$Scope r1 = com.facebook.react.bridge.JsonWriter.Scope.EMPTY_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.JsonWriter.C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.JsonWriter$Scope r1 = com.facebook.react.bridge.JsonWriter.Scope.ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.react.bridge.JsonWriter.C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.JsonWriter$Scope r1 = com.facebook.react.bridge.JsonWriter.Scope.OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JsonWriter.C06591.<clinit>():void");
        }
    }

    public enum Scope {
        EMPTY_OBJECT,
        OBJECT,
        EMPTY_ARRAY,
        ARRAY
    }

    public JsonWriter(Writer writer) {
        this.mWriter = writer;
    }

    private void beforeName() throws IOException {
        Scope peek = this.mScopes.peek();
        int i = C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[peek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                replace(Scope.OBJECT);
                return;
            } else if (i != 3) {
                if (i == 4) {
                    this.mWriter.write(44);
                    return;
                }
                throw new IllegalStateException("Unknown scope: " + peek);
            }
        }
        throw new IllegalStateException("name not allowed in array");
    }

    private void beforeValue() throws IOException {
        Scope peek = this.mScopes.peek();
        int i = C06591.$SwitchMap$com$facebook$react$bridge$JsonWriter$Scope[peek.ordinal()];
        if (i == 1) {
            replace(Scope.ARRAY);
        } else if (i == 2) {
            throw new IllegalArgumentException(Scope.EMPTY_OBJECT.name());
        } else if (i == 3) {
            this.mWriter.write(44);
        } else if (i != 4) {
            throw new IllegalStateException("Unknown scope: " + peek);
        }
    }

    private void open(Scope scope, char c) throws IOException {
        this.mScopes.push(scope);
        this.mWriter.write(c);
    }

    private void replace(Scope scope) {
        this.mScopes.pop();
        this.mScopes.push(scope);
    }

    private void string(String str) throws IOException {
        this.mWriter.write(34);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.mWriter.write("\\f");
            } else if (charAt == '\r') {
                this.mWriter.write("\\r");
            } else if (charAt == '\"' || charAt == '\\') {
                this.mWriter.write(92);
                this.mWriter.write(charAt);
            } else if (charAt == 8232 || charAt == 8233) {
                this.mWriter.write(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                switch (charAt) {
                    case '\b':
                        this.mWriter.write("\\b");
                        continue;
                    case '\t':
                        this.mWriter.write("\\t");
                        continue;
                    case '\n':
                        this.mWriter.write("\\n");
                        continue;
                    default:
                        if (charAt > 31) {
                            this.mWriter.write(charAt);
                            break;
                        } else {
                            this.mWriter.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                            continue;
                        }
                }
            }
        }
        this.mWriter.write(34);
    }

    public JsonWriter beginArray() throws IOException {
        open(Scope.EMPTY_ARRAY, '[');
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        open(Scope.EMPTY_OBJECT, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mWriter.close();
    }

    public JsonWriter endArray() throws IOException {
        close(']');
        return this;
    }

    public JsonWriter endObject() throws IOException {
        close('}');
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        if (str != null) {
            beforeName();
            string(str);
            this.mWriter.write(58);
            return this;
        }
        throw new NullPointerException("name can not be null");
    }

    public JsonWriter nullValue() throws IOException {
        beforeValue();
        this.mWriter.write("null");
        return this;
    }

    public JsonWriter rawValue(String str) throws IOException {
        beforeValue();
        this.mWriter.write(str);
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        beforeValue();
        string(str);
        return this;
    }

    private void close(char c) throws IOException {
        this.mScopes.pop();
        this.mWriter.write(c);
    }

    public JsonWriter value(boolean z) throws IOException {
        beforeValue();
        this.mWriter.write(z ? "true" : "false");
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        beforeValue();
        this.mWriter.append((CharSequence) Double.toString(d));
        return this;
    }

    public JsonWriter value(long j) throws IOException {
        beforeValue();
        this.mWriter.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        beforeValue();
        this.mWriter.append((CharSequence) number.toString());
        return this;
    }
}
