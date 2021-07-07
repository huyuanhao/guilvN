package retrofit2.adapter.rxjava;

import javax.annotation.Nullable;
import retrofit2.Response;

public final class Result<T> {
    @Nullable
    public final Throwable error;
    @Nullable
    public final Response<T> response;

    public Result(@Nullable Response<T> response2, @Nullable Throwable th) {
        this.response = response2;
        this.error = th;
    }

    public static <T> Result<T> error(Throwable th) {
        if (th != null) {
            return new Result<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> Result<T> response(Response<T> response2) {
        if (response2 != null) {
            return new Result<>(response2, null);
        }
        throw new NullPointerException("response == null");
    }

    public boolean isError() {
        return this.error != null;
    }

    public String toString() {
        if (this.error != null) {
            return "Result{isError=true, error=\"" + this.error + "\"}";
        }
        return "Result{isError=false, response=" + this.response + '}';
    }

    @Nullable
    public Throwable error() {
        return this.error;
    }

    @Nullable
    public Response<T> response() {
        return this.response;
    }
}
