package anet.channel;

public interface SessionGetCallback {
    void onSessionGetFail();

    void onSessionGetSuccess(Session session);
}
