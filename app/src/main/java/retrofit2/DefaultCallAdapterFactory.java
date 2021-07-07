package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;

public final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    public static final CallAdapter.Factory INSTANCE = new DefaultCallAdapterFactory();

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        final Type callResponseType = Utils.getCallResponseType(type);
        return new CallAdapter<Object, Call<?>>() {
            /* class retrofit2.DefaultCallAdapterFactory.C48701 */

            /* Return type fixed from 'retrofit2.Call<java.lang.Object>' to match base method */
            @Override // retrofit2.CallAdapter
            public Call<?> adapt(Call<Object> call) {
                return call;
            }

            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return callResponseType;
            }
        };
    }
}
