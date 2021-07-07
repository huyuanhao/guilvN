package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.CallAdapter;

public final class ExecutorCallAdapterFactory extends CallAdapter.Factory {
    public final Executor callbackExecutor;

    public static final class ExecutorCallbackCall<T> implements Call<T> {
        public final Executor callbackExecutor;
        public final Call<T> delegate;

        public ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(final Callback<T> callback) {
            Utils.checkNotNull(callback, "callback == null");
            this.delegate.enqueue(new Callback<T>() {
                /* class retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.C48721 */

                @Override // retrofit2.Callback
                public void onFailure(Call<T> call, final Throwable th) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new Runnable() {
                        /* class retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.C48721.RunnableC48742 */

                        public void run() {
                            C48721 r0 = C48721.this;
                            callback.onFailure(ExecutorCallbackCall.this, th);
                        }
                    });
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<T> call, final Response<T> response) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new Runnable() {
                        /* class retrofit2.ExecutorCallAdapterFactory.ExecutorCallbackCall.C48721.RunnableC48731 */

                        public void run() {
                            if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                                C48721 r0 = C48721.this;
                                callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                                return;
                            }
                            C48721 r02 = C48721.this;
                            callback.onResponse(ExecutorCallbackCall.this, response);
                        }
                    });
                }
            });
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.delegate.request();
        }

        @Override // java.lang.Object, retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }
    }

    public ExecutorCallAdapterFactory(Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        final Type callResponseType = Utils.getCallResponseType(type);
        return new CallAdapter<Object, Call<?>>() {
            /* class retrofit2.ExecutorCallAdapterFactory.C48711 */

            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return callResponseType;
            }

            /* Return type fixed from 'retrofit2.Call<java.lang.Object>' to match base method */
            @Override // retrofit2.CallAdapter
            public Call<?> adapt(Call<Object> call) {
                return new ExecutorCallbackCall(ExecutorCallAdapterFactory.this.callbackExecutor, call);
            }
        };
    }
}
