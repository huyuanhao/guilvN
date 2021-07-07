package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.p118pd.sdk.OOOO000;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

public final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    public static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public final TypeAdapter<T> adapter;
    public final Gson gson;

    public GsonRequestBodyConverter(Gson gson2, TypeAdapter<T> typeAdapter) {
        this.gson = gson2;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        OOOO000 oooo000 = new OOOO000();
        JsonWriter newJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(oooo000.m16592OooO00o(), UTF_8));
        this.adapter.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, oooo000.m16595OooO00o());
    }
}
