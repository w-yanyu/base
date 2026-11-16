package cn.iyanyu.base.comm.profile;

import java.util.Map;

public class ProfileSwitcher {
    private static ThreadLocal<ProfileSwitcher> INSTANCE_CACHE = new ThreadLocal();

    private static boolean init = false;


    private static Map<String, Object> globalProfile;

    public boolean enableJsonExNum;

    public boolean decimalToString;

    public ProfileSwitcher() {
        this.enableJsonExNum = false;
        this.decimalToString = true;
    }

    public static ProfileSwitcher get() {
        ProfileSwitcher ret = (ProfileSwitcher)INSTANCE_CACHE.get();
        if (ret == null) {
            INSTANCE_CACHE.set(ret = initGlobalProfile());
        }

        return ret;
    }

    public static void initGlobalSystemProfile(ProfileGlobalProperty globalProperty) {
        if (!init) {
            globalProfile = JacksonUtil.toMap(globalProperty);
            init = true;
        }
    }

    public static ProfileSwitcher initGlobalProfile() {
        ProfileSwitcher profileSwitcher = new ProfileSwitcher();
        if (globalProfile != null) {
            profileSwitcher.setSystemProfile(globalProfile);
        }

        return profileSwitcher;
    }

    public void setSystemProfile(Map<String, Object> systemProfileMap) {

    }

    public static void reset() {
        INSTANCE_CACHE.set((ProfileSwitcher) null);
    }

}
