package com.naive.utils

import java.util.Calendar;
import java.util.Date;

/**
 * @description 日期工具类
 * @className DateUtils
 * @author github.com/krscuti
 * @date: 2019-1-11 11:59
 */
public class DateUtils {

    public static final String YYYY_MM_DD = "yyyy-MM-dd";
//    private static final SimpleDateFormat datetimeFormat = new SimpleDateFormat(String s);
    /**
     * 获取当前日期 start 2018-01-01 00:00:00
     * @return
     */
    public static Date beginOfDate (){
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(Calendar.YEAR), calendar1.get(Calendar.MONTH), calendar1.get(Calendar.DAY_OF_MONTH),
                0, 0, 0);
        Date beginOfDate = calendar1.getTime();
        return calendar1.getTime();
    }
    /**
     * 获取当前日期 end 2018-01-01 23:59:59
     * @return
     */
    public static Date endOfDate (){
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
                23, 59, 59);
        Date endOfDate = calendar2.getTime();
        return endOfDate;
    }
}
