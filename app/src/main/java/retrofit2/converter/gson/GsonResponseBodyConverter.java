package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

public final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    public final TypeAdapter<T> adapter;
    public final Gson gson;

    public GsonResponseBodyConverter(Gson gson2, TypeAdapter<T> typeAdapter) {
        this.gson = gson2;
        this.adapter = typeAdapter;
    }

    public T convert(ResponseBody responseBody) throws IOException {
        try {
            return this.adapter.read(this.gson.newJsonReader(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }
}
