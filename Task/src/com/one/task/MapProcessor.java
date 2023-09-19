package com.one.task;

import java.util.Map;

@FunctionalInterface

public interface MapProcessor {
    Object process(Map<Object, Object> map);
}
