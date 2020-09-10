package com.ytj.fortest.jvm.exam;

public class JavaVMStackSOF {
    private int stackLengh = 1;

    public void stackLeak() {
        stackLengh++;
        stackLeak();
    }

    private void dontStop() {
        while (true) {

        }
    }

    public void stackThread() {
        while (true) {
            Thread t = new Thread(() -> dontStop());
            t.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

//        try {
//            oom.stackLeak();
//        } catch (Throwable throwable) {
//            System.out.println("stack length: " + oom.stackLengh) ;
//            throw throwable;
//        }

        // 测试建立多个线程
        oom.stackThread();

    }

}
