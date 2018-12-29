package com.initcat.constant;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * CommUserConstant
 * @author libo
 * @package com.initcat.constant
 * @company initcat
 * @date 2018/11/27
 */
public class UserConstant {

    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateUtils.parseDate("2018-04-02", "yyyy-MM-dd"));
        Date time = calendar.getTime();
        calendar.setTime(DateUtils.parseDate("2018-12-10", "yyyy-MM-dd"));
        Date time1 = calendar.getTime();
        long l = time1.getTime() - time.getTime();
        long l1 = l / 24 / 3600 / 1000;
        System.out.println(l1);
    }

}
