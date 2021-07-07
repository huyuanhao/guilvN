package anet.channel.strategy;

import android.content.Context;
import java.util.List;

public interface IStrategyInstance {
    void forceRefreshStrategy(String str);

    String getCNameByHost(String str);

    String getClientIp();

    List<IConnStrategy> getConnStrategyListByHost(String str);

    List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter);

    String getFormalizeUrl(String str);

    @Deprecated
    String getSchemeByHost(String str);

    String getSchemeByHost(String str, String str2);

    String getUnitByHost(String str);

    void initialize(Context context);

    void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent);

    void registerListener(IStrategyListener iStrategyListener);

    void saveData();

    void switchEnv();

    void unregisterListener(IStrategyListener iStrategyListener);
}
