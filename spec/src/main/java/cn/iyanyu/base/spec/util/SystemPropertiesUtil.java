package cn.iyanyu.base.spec.util;

import cn.iyanyu.base.spec.enumeration.EnvType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class SystemPropertiesUtil {

    private static final Map<String, String> CACHE;
    private static final EnvType DEFAULT_APS_ENV_TYPE;

    static {
        DEFAULT_APS_ENV_TYPE = EnvType.PROD;
        CACHE = new ConcurrentHashMap<>(16);
        CACHE.putAll(getProperties("app", false));
    }

    private static Map<String, String> getProperties(String prefix, boolean filterPrefix) {
        validateKey(prefix);
        String trimPrefix = prefix.trim();
        return System.getProperties().stringPropertyNames().stream().filter((key) -> key.startsWith(trimPrefix)).collect(Collectors.toMap((key) -> filterPrefix ? key.substring(trimPrefix.length()) : key, System::getProperty));
    }

    public static String getProperty(String key, String defaultValue) {
        validateKey(key);
        return CACHE.computeIfAbsent(key, (k) -> System.getProperty(k, defaultValue));
    }

    private static void validateKey(String key) {
        if (key == null || key.trim().isEmpty()) {
            throw new IllegalArgumentException("Key must not be empty");
        }
    }

    public static String getApplicationName() {
        return getProperty("app.applicationName");
    }

    public static String getEnvId() {
        return getProperty("app.envId", "unknown");
    }

    public static String getProperty(String key) {
        return getProperty(key, (String)null);
    }
}
