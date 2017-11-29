/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics.date;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.HolidayCalendarId;
    

public class HolidayCalendarIdXL {
    private final ExcelAddIn xl;

    public HolidayCalendarIdXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.HolidayCalendarId.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("holidayCalendarId"),
        @ExcelArgument("other")
    })
    public HolidayCalendarId combinedWith(HolidayCalendarId holidayCalendarId, HolidayCalendarId other) {
        return holidayCalendarId.combinedWith(other);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.HolidayCalendarId.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public HolidayCalendarId of(String uniqueName) {
        return HolidayCalendarId.of(uniqueName);
    }

    @ExcelFunction(
        value = "og.HolidayCalendarId.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("holidayCalendarId")
    })
    public String toString(HolidayCalendarId holidayCalendarId) {
        return holidayCalendarId.toString();
    }
}
