package cn.iyanyu.base.model.api.online.datamapping;

import cn.iyanyu.base.comm.constant.ConstantManager;

public interface MappingKey {

    String globalBusinessTrackNo = mapping("globalBusinessTrackNo","globalBusinessTrackNo");
    String responseTypeCode = mapping("responseTypeCode","responseTypeCode");

    static String mapping(String key, String defaultValue) {
        return ConstantManager.get().get(key, defaultValue);
    }
}
