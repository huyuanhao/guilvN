package anetwork.channel.stat;

import com.p118pd.sdk.C7372o0OO0o0;
import java.util.LinkedHashMap;
import java.util.Map;

public class NetworkStatCache$1 extends LinkedHashMap<String, String> {
    public final /* synthetic */ C7372o0OO0o0 this$0;

    public NetworkStatCache$1(C7372o0OO0o0 o0oo0o0) {
        this.this$0 = o0oo0o0;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 100;
    }
}
