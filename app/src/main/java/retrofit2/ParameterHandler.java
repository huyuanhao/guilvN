package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class ParameterHandler<T> {

    public static final class Body<T> extends ParameterHandler<T> {
        public final Converter<T, RequestBody> converter;

        public Body(Converter<T, RequestBody> converter2) {
            this.converter = converter2;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    public static final class Field<T> extends ParameterHandler<T> {
        public final boolean encoded;
        public final String name;
        public final Converter<T, String> valueConverter;

        public Field(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addFormField(this.name, convert, this.encoded);
            }
        }
    }

    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        public final boolean encoded;
        public final Converter<T, String> valueConverter;

        public FieldMap(Converter<T, String> converter, boolean z) {
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(key, convert, this.encoded);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + ((Object) value) + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    public static final class Header<T> extends ParameterHandler<T> {
        public final String name;
        public final Converter<T, String> valueConverter;

        public Header(String str, Converter<T, String> converter) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addHeader(this.name, convert);
            }
        }
    }

    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        public final Converter<T, String> valueConverter;

        public HeaderMap(Converter<T, String> converter) {
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(key, this.valueConverter.convert(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    public static final class Part<T> extends ParameterHandler<T> {
        public final Converter<T, RequestBody> converter;
        public final Headers headers;

        public Part(Headers headers2, Converter<T, RequestBody> converter2) {
            this.headers = headers2;
            this.converter = converter2;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.headers, this.converter.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        public final String transferEncoding;
        public final Converter<T, RequestBody> valueConverter;

        public PartMap(Converter<T, RequestBody> converter, String str) {
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(Headers.m14261of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    public static final class Path<T> extends ParameterHandler<T> {
        public final boolean encoded;
        public final String name;
        public final Converter<T, String> valueConverter;

        public Path(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.name + "\" value must not be null.");
        }
    }

    public static final class Query<T> extends ParameterHandler<T> {
        public final boolean encoded;
        public final String name;
        public final Converter<T, String> valueConverter;

        public Query(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addQueryParam(this.name, convert, this.encoded);
            }
        }
    }

    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        public final boolean encoded;
        public final Converter<T, String> valueConverter;

        public QueryMap(Converter<T, String> converter, boolean z) {
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(key, convert, this.encoded);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + ((Object) value) + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    public static final class QueryName<T> extends ParameterHandler<T> {
        public final boolean encoded;
        public final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
            }
        }
    }

    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        public static final RawPart INSTANCE = new RawPart();

        public void apply(RequestBuilder requestBuilder, @Nullable MultipartBody.Part part) throws IOException {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    public static final class RelativeUrl extends ParameterHandler<Object> {
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
            Utils.checkNotNull(obj, "@Url parameter is null.");
            requestBuilder.setRelativeUrl(obj);
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException;

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* class retrofit2.ParameterHandler.C48782 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: retrofit2.ParameterHandler */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* class retrofit2.ParameterHandler.C48771 */

            @Override // retrofit2.ParameterHandler
            public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                apply(requestBuilder, (Iterable) ((Iterable) obj));
            }

            public void apply(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T t : iterable) {
                        ParameterHandler.this.apply(requestBuilder, t);
                    }
                }
            }
        };
    }
}
