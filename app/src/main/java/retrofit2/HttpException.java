package retrofit2;

public class HttpException extends RuntimeException {
    public final int code;
    public final String message;
    public final transient Response<?> response;

    public HttpException(Response<?> response2) {
        super(getMessage(response2));
        this.code = response2.code();
        this.message = response2.message();
        this.response = response2;
    }

    public static String getMessage(Response<?> response2) {
        Utils.checkNotNull(response2, "response == null");
        return "HTTP " + response2.code() + " " + response2.message();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public Response<?> response() {
        return this.response;
    }
}
