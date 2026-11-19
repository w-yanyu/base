package cn.iyanyu.base.comm.constant;

import cn.iyanyu.base.spec.util.SystemPropertiesUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConstantManager {
    private static final ConstantManager instance = new ConstantManager();

    private static final String CONSTANT_VALUE_MAPPINGS_CONF = "constant_mappings_extension.properties";

    private final Properties constantMappings;


    private ConstantManager() {
        String fileName = SystemPropertiesUtil.getProperty("constant_mapping_file", CONSTANT_VALUE_MAPPINGS_CONF);
        InputStream in = this.getClass().getResourceAsStream(fileName);
        if (in == null) {
            this.constantMappings = null;
        } else {
            this.constantMappings = new Properties();
            try {
                this.constantMappings.load(in);
            } catch (IOException e) {
                //
            }
        }
    }

    public static ConstantManager get() {
        return instance;
    }

    public String get(String key, String defaultValue) {
        return constantMappings == null ? defaultValue : constantMappings.getProperty(key, defaultValue);
    }
}
