package cn.iyanyu.base.comm.profile;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
    prefix = "system.param.profile"
)
public class ProfileGlobalProperty implements InitializingBean {

    private boolean enableJsonExNum = false;
    private boolean decimalToString = true;

    @Override
    public void afterPropertiesSet() throws Exception {
        ProfileSwitcher.initGlobalProfile(this);
        ProfileSwitcher.reset();
    }
}