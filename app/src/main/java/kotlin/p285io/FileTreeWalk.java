package kotlin.p285io;

import com.facebook.react.uimanager.ViewProps;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p285io.AccessDeniedException;
import kotlin.p285io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo43195d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", ViewProps.START, RNGestureHandlerModule.KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.O000OO0O */
public final class FileTreeWalk implements AbstractC7873oO0OOo00<File> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final O00O0OOO<File, Boolean> f16937OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final O00Oo000<File, IOException, C9174oooOOooO> f16938OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f16939OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FileWalkDirection f16940OooO00o;
    public final O00O0OOO<File, C9174oooOOooO> OooO0O0;

    /* renamed from: com.pd.sdk.O000OO0O$OooO00o */
    public static abstract class OooO00o extends OooO0OO {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull File file) {
            super(file);
            o0O0OO00.OooO0o(file, "rootDir");
            if (C9178oooOo000.f22632OooO00o) {
                boolean isDirectory = file.isDirectory();
                if (C9178oooOo000.f22632OooO00o && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.O000OO0O$OooO0OO */
    public static abstract class OooO0OO {
        @NotNull
        public final File OooO00o;

        public OooO0OO(@NotNull File file) {
            o0O0OO00.OooO0o(file, "root");
            this.OooO00o = file;
        }

        @NotNull
        public final File OooO00o() {
            return this.OooO00o;
        }

        @Nullable
        public abstract File OooO0O0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super java.io.File, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.O00O0OOO<? super java.io.File, com.pd.sdk.oooOOooO> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.pd.sdk.O00Oo000<? super java.io.File, ? super java.io.IOException, com.pd.sdk.oooOOooO> */
    /* JADX WARN: Multi-variable type inference failed */
    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection, O00O0OOO<? super File, Boolean> o00o0ooo, O00O0OOO<? super File, C9174oooOOooO> o00o0ooo2, O00Oo000<? super File, ? super IOException, C9174oooOOooO> o00Oo000, int i) {
        this.f16939OooO00o = file;
        this.f16940OooO00o = fileWalkDirection;
        this.f16937OooO00o = o00o0ooo;
        this.OooO0O0 = o00o0ooo2;
        this.f16938OooO00o = o00Oo000;
        this.OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, O00O0OOO o00o0ooo, O00O0OOO o00o0ooo2, O00Oo000 o00Oo000, int i, int i2, O0o0o o0o0o) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, o00o0ooo, o00o0ooo2, o00Oo000, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @NotNull
    public final FileTreeWalk OooO0O0(@NotNull O00O0OOO<? super File, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0ooo, "function");
        return new FileTreeWalk(this.f16939OooO00o, this.f16940OooO00o, this.f16937OooO00o, o00o0ooo, this.f16938OooO00o, this.OooO00o);
    }

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo43195d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/Stack;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    /* renamed from: com.pd.sdk.O000OO0O$OooO0O0 */
    public final class FileTreeWalkIterator extends AbstractC9176oooOo<File> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Stack<OooO0OO> f16941OooO00o = new Stack<>();

        /* renamed from: com.pd.sdk.O000OO0O$OooO0O0$OooO00o */
        public final class OooO00o extends OooO00o {
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ FileTreeWalkIterator f16942OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f16943OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public File[] f16944OooO00o;
            public boolean OooO0O0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(@NotNull FileTreeWalkIterator oooO0O0, File file) {
                super(file);
                o0O0OO00.OooO0o(file, "rootDir");
                this.f16942OooO00o = oooO0O0;
            }

            @Override // kotlin.p285io.FileTreeWalk.OooO0OO
            @Nullable
            public File OooO0O0() {
                if (!this.OooO0O0 && this.f16944OooO00o == null) {
                    O00O0OOO o00o0ooo = FileTreeWalk.this.f16937OooO00o;
                    if (o00o0ooo != null && !((Boolean) o00o0ooo.invoke(OooO00o())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = OooO00o().listFiles();
                    this.f16944OooO00o = listFiles;
                    if (listFiles == null) {
                        O00Oo000 o00Oo000 = FileTreeWalk.this.f16938OooO00o;
                        if (o00Oo000 != null) {
                            C9174oooOOooO oooooooo = (C9174oooOOooO) o00Oo000.invoke(OooO00o(), new AccessDeniedException(OooO00o(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.OooO0O0 = true;
                    }
                }
                File[] fileArr = this.f16944OooO00o;
                if (fileArr != null) {
                    int i = this.OooO00o;
                    if (fileArr == null) {
                        o0O0OO00.OooO0o0();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f16944OooO00o;
                        if (fileArr2 == null) {
                            o0O0OO00.OooO0o0();
                        }
                        int i2 = this.OooO00o;
                        this.OooO00o = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f16943OooO00o) {
                    this.f16943OooO00o = true;
                    return OooO00o();
                }
                O00O0OOO o00o0ooo2 = FileTreeWalk.this.OooO0O0;
                if (o00o0ooo2 != null) {
                    C9174oooOOooO oooooooo2 = (C9174oooOOooO) o00o0ooo2.invoke(OooO00o());
                }
                return null;
            }
        }

        /* renamed from: com.pd.sdk.O000OO0O$OooO0O0$OooO0O0 */
        public final class OooO0O0 extends OooO0OO {
            public final /* synthetic */ FileTreeWalkIterator OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f16945OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO0O0(@NotNull FileTreeWalkIterator oooO0O0, File file) {
                super(file);
                o0O0OO00.OooO0o(file, "rootFile");
                this.OooO00o = oooO0O0;
                if (C9178oooOo000.f22632OooO00o) {
                    boolean isFile = file.isFile();
                    if (C9178oooOo000.f22632OooO00o && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            @Override // kotlin.p285io.FileTreeWalk.OooO0OO
            @Nullable
            public File OooO0O0() {
                if (this.f16945OooO00o) {
                    return null;
                }
                this.f16945OooO00o = true;
                return OooO00o();
            }
        }

        /* renamed from: com.pd.sdk.O000OO0O$OooO0O0$OooO0OO */
        public final class OooO0OO extends OooO00o {
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ FileTreeWalkIterator f16946OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f16947OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public File[] f16948OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO0OO(@NotNull FileTreeWalkIterator oooO0O0, File file) {
                super(file);
                o0O0OO00.OooO0o(file, "rootDir");
                this.f16946OooO00o = oooO0O0;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
                if (r0.length == 0) goto L_0x008b;
             */
            @Override // kotlin.p285io.FileTreeWalk.OooO0OO
            @org.jetbrains.annotations.Nullable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File OooO0O0() {
                /*
                // Method dump skipped, instructions count: 176
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FileTreeWalk.FileTreeWalkIterator.OooO0OO.OooO0O0():java.io.File");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public FileTreeWalkIterator() {
            if (FileTreeWalk.this.f16939OooO00o.isDirectory()) {
                this.f16941OooO00o.push(OooO00o(FileTreeWalk.this.f16939OooO00o));
            } else if (FileTreeWalk.this.f16939OooO00o.isFile()) {
                this.f16941OooO00o.push(new OooO0O0(this, FileTreeWalk.this.f16939OooO00o));
            } else {
                OooO0Oo();
            }
        }

        private final OooO00o OooO00o(File file) {
            int i = O000OOO.OooO00o[FileTreeWalk.this.f16940OooO00o.ordinal()];
            if (i == 1) {
                return new OooO0OO(this, file);
            }
            if (i == 2) {
                return new OooO00o(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.p118pd.sdk.AbstractC9176oooOo
        public void OooO0OO() {
            File OooO00o2 = OooO00o();
            if (OooO00o2 != null) {
                OooO00o((Object) OooO00o2);
            } else {
                OooO0Oo();
            }
        }

        private final File OooO00o() {
            while (!this.f16941OooO00o.empty()) {
                OooO0OO peek = this.f16941OooO00o.peek();
                if (peek == null) {
                    o0O0OO00.OooO0o0();
                }
                OooO0OO oooO0OO = peek;
                File OooO0O02 = oooO0OO.OooO0O0();
                if (OooO0O02 == null) {
                    this.f16941OooO00o.pop();
                } else if (o0O0OO00.OooO00o(OooO0O02, oooO0OO.OooO00o()) || !OooO0O02.isDirectory() || this.f16941OooO00o.size() >= FileTreeWalk.this.OooO00o) {
                    return OooO0O02;
                } else {
                    this.f16941OooO00o.push(OooO00o(OooO0O02));
                }
            }
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        o0O0OO00.OooO0o(file, ViewProps.START);
        o0O0OO00.OooO0o(fileWalkDirection, RNGestureHandlerModule.KEY_DIRECTION);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i, O0o0o o0o0o) {
        this(file, (i & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }

    @NotNull
    public final FileTreeWalk OooO00o(@NotNull O00O0OOO<? super File, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0ooo, "function");
        return new FileTreeWalk(this.f16939OooO00o, this.f16940OooO00o, o00o0ooo, this.OooO0O0, this.f16938OooO00o, this.OooO00o);
    }

    @NotNull
    public final FileTreeWalk OooO00o(@NotNull O00Oo000<? super File, ? super IOException, C9174oooOOooO> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "function");
        return new FileTreeWalk(this.f16939OooO00o, this.f16940OooO00o, this.f16937OooO00o, this.OooO0O0, o00Oo000, this.OooO00o);
    }

    @NotNull
    public final FileTreeWalk OooO00o(int i) {
        if (i > 0) {
            return new FileTreeWalk(this.f16939OooO00o, this.f16940OooO00o, this.f16937OooO00o, this.OooO0O0, this.f16938OooO00o, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }
}
