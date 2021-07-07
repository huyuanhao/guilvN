package anet.channel.heartbeat;

import anet.channel.Session;

public interface IHeartbeat {
    void reSchedule();

    void start(Session session);

    void stop();
}
