package org.cmkj.juanworld.analysis.common.utils;

import java.time.LocalDate;
import java.util.Date;

/**
 * 日期工具类
 * author keanu.liu
 */
public class DateUtils {

    /**
     * 获取当前日期 0点
     * @return
     */
    public static Date nowDate (){
        return  new Date(LocalDate.now().getYear(),LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
    }
}
