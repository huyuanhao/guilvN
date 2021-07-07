package com.umeng.socialize.common;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.umeng.socialize.utils.SocializeUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueuedWork {
    public static boolean isUseThreadPool;
    public static ExecutorService mLogicExecutor = Executors.newFixedThreadPool(5);
    public static ExecutorService mNetExecutor = Executors.newFixedThreadPool(5);
    public static Handler uiHandler;

    public static abstract class DialogThread<T> extends UMAsyncTask {
        public Dialog dialog = null;

        public DialogThread(Context context) {
        }

        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            SocializeUtils.safeCloseDialog(this.dialog);
        }

        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            SocializeUtils.safeShowDialog(this.dialog);
        }
    }

    public static abstract class UMAsyncTask<Result> {
        public Runnable thread;

        public abstract Result doInBackground();

        public final UMAsyncTask<Result> execute() {
            this.thread = new Runnable() {
                /* class com.umeng.socialize.common.QueuedWork.UMAsyncTask.RunnableC39231 */

                public void run() {
                    final Object doInBackground = UMAsyncTask.this.doInBackground();
                    QueuedWork.runInMain(new Runnable() {
                        /* class com.umeng.socialize.common.QueuedWork.UMAsyncTask.RunnableC39231.RunnableC39241 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.umeng.socialize.common.QueuedWork$UMAsyncTask */
                        /* JADX WARN: Multi-variable type inference failed */
                        public void run() {
                            UMAsyncTask.this.onPostExecute(doInBackground);
                        }
                    });
                }
            };
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.common.QueuedWork.UMAsyncTask.RunnableC39252 */

                public void run() {
                    UMAsyncTask.this.onPreExecute();
                }
            });
            QueuedWork.runInBack(this.thread, false);
            return this;
        }

        public void onPostExecute(Result result) {
        }

        public void onPreExecute() {
        }
    }

    public static void runInBack(Runnable runnable, boolean z) {
        if (!isUseThreadPool) {
            new Thread(runnable).start();
        } else if (z) {
            mNetExecutor.execute(runnable);
        } else {
            mLogicExecutor.execute(runnable);
        }
    }

    public static void runInMain(Runnable runnable) {
        if (uiHandler == null) {
            uiHandler = new Handler(Looper.getMainLooper());
        }
        uiHandler.post(runnable);
    }
}
