package anet.channel.strategy;

import java.io.File;
import java.util.Comparator;

/* renamed from: anet.channel.strategy.n */
public final class C0205n implements Comparator<File> {
    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }
}
