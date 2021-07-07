package org.android.spdy;

import org.android.spdy.ProtectedPointer;

public class ProtectedPointerTest {

    public static class Data {

        /* renamed from: i */
        public int f13480i = 0;

        public void destroy() {
            System.out.println("destroy");
            this.f13480i = 1;
        }

        public void work() {
            System.out.println("work");
            if (this.f13480i == 1) {
                System.exit(-1);
            }
        }
    }

    public static void main(String[] strArr) {
        for (int i = 0; i < 1; i++) {
            ProtectedPointer protectedPointer = new ProtectedPointer(new Data());
            protectedPointer.setHow2close(new ProtectedPointer.ProtectedPointerOnClose() {
                /* class org.android.spdy.ProtectedPointerTest.C48273 */

                @Override // org.android.spdy.ProtectedPointer.ProtectedPointerOnClose
                public void close(Object obj) {
                    ((Data) obj).destroy();
                }
            });
            test_close_with_work(protectedPointer);
        }
    }

    public static void test_close_anywhere1(ProtectedPointer protectedPointer) {
        if (protectedPointer.enter()) {
            protectedPointer.release();
            ((Data) protectedPointer.getData()).work();
            protectedPointer.exit();
        }
    }

    public static void test_close_with_work(final ProtectedPointer protectedPointer) {
        Thread thread = new Thread(new Runnable() {
            /* class org.android.spdy.ProtectedPointerTest.RunnableC48251 */

            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (protectedPointer.enter()) {
                        ((Data) protectedPointer.getData()).work();
                        protectedPointer.exit();
                    } else {
                        System.out.println("the data has been destroy");
                    }
                }
            }
        });
        new Thread(new Runnable() {
            /* class org.android.spdy.ProtectedPointerTest.RunnableC48262 */

            public void run() {
                protectedPointer.release();
            }
        }).run();
        thread.run();
    }

    public static void test_sequece(ProtectedPointer protectedPointer) {
        protectedPointer.release();
    }
}
