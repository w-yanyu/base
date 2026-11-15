package cn.iyanyu.base.i18n;

public class MessageUtil {
    public static String getMessage(String pattern, Object... args) {
        if (pattern == null) {
            return null;
        }
        if (args == null || args.length == 0) {
            return pattern;
        }

        StringBuilder sb = new StringBuilder(pattern.length() + 50);
        int argIndex = 0;
        int i = 0;
        int len = pattern.length();

        while (i < len) {
            char c = pattern.charAt(i);

            // 处理转义 "\{}"
            if (c == '\\' && i + 1 < len && pattern.charAt(i + 1) == '{') {
                sb.append('{');
                i += 2;
                continue;
            }

            // 遇到 "{}" 且还有参数可替换
            if (c == '{' && i + 1 < len && pattern.charAt(i + 1) == '}'
                    && argIndex < args.length) {
                sb.append(args[argIndex++]);
                i += 2;
                continue;
            }

            sb.append(c);
            i++;
        }
        return sb.toString();
    }

}
