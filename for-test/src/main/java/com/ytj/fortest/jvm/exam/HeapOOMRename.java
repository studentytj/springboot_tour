package com.ytj.fortest.jvm.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * Program Args：hi a b c d
 */
public class HeapOOMRename {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
