package cn.boommanpro.springcache.practice.util;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 */
public class StringUtils {
    public static final String EMPTY = "";
    private static Pattern linePattern = Pattern.compile("_(\\w)");

    /**
     * 判断字符串是否不为空，不为空则返回true
     *
     * @param str 源数据
     * @return Boolean
     */
    public static boolean isNotEmpty(String str) {
        if (str != null && !"".equals(str.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 判断对象或对象数组中每一个对象是否为空: 对象为null，字符序列长度为0，集合类、Map为empty
     *
     * @param obj
     * @return
     */
    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null) {
            return true;
        }

        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }

        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }

        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }

        if (obj instanceof Object[]) {
            Object[] object = (Object[]) obj;
            if (object.length == 0) {
                return true;
            }
            boolean empty = true;
            for (int i = 0; i < object.length; i++) {
                if (!isNullOrEmpty(object[i])) {
                    empty = false;
                    break;
                }
            }
            return empty;
        }
        return false;
    }

    /**
     * 下划线转驼峰
     */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
    /**
     * Object 对象转换成字符串
     * @param obj
     * @return
     */
    public static String toStringByObject(Object obj){
        return toStringByObject(obj,false,null);
    }
    /**
     * Object 对象转换成字符串，并可以根据参数去掉两端空格
     * @param obj
     * @return
     */
    public static String toStringByObject(Object obj, boolean isqdkg, String datatype){
        if(obj==null){
            return "";
        }else{
            if(isqdkg){
                return obj.toString().trim();
            }else{
                //如果有设置时间格式类型，这转换
                if(StringUtils.hasText(datatype)){
                    if(obj instanceof Timestamp){
                        return DateUtils.format((Timestamp)obj,datatype);
                    }else if(obj instanceof Date){
                        return DateUtils.format((Timestamp)obj,datatype);
                    }
                }
                return obj.toString();
            }


        }
    }
    public static boolean hasText(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        } else {
            int strLen = str.length();

            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return true;
                }
            }

            return false;
        }
    }

    public static boolean hasLength(CharSequence str) {
        return str != null && str.length() > 0;
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence)str);
    }

    public static int parseInt(Object str) {
        return parseInt(str, 0);
    }

    public static int parseInt(Object str, int defaultValue) {
        if (str == null || str.equals("")) {
            return defaultValue;
        }
        String s = str.toString().trim();
        if (!s.matches("-?\\d+")) {
            return defaultValue;
        }
        return Integer.parseInt(s);
    }

    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public  static boolean notBlank(String ... strs ){

        for (String str: strs) {
            if (isBlank(str)){
                return false;
            }

        }
        return true;
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean notNullOrEmpty(String string) {
        return !isNullOrEmpty(string);
    }

    public static boolean isNotNull(Object object)
    {
        return !isNull(object);
    }
    public static boolean isNull(Object object)
    {
        return object == null;
    }
    public static boolean isEmpty(Object[] objects)
    {
        return isNull(objects) || (objects.length == 0);
    }
    public static boolean isEmpty(String str)
    {
        return isNull(str) || EMPTY.equals(str.trim());
    }

    /**
     * 去空格
     */
    public static String trim(String str)
    {
        return (str == null ? "" : str.trim());
    }

    /**
     * 是否包含字符串
     *
     * @param str 验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inStringIgnoreCase(String str, String... strs)
    {
        if (str != null && strs != null)
        {
            for (String s : strs)
            {
                if (str.equalsIgnoreCase(trim(s)))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
