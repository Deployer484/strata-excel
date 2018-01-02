/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.swap.type;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.product.swap.type.FixedOvernightSwapConvention;
import com.opengamma.strata.product.swap.type.FixedOvernightSwapTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FixedOvernightSwapTemplateXL {
    private final ExcelAddIn xl;

    public FixedOvernightSwapTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FixedOvernightSwapTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FixedOvernightSwapTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FixedOvernightSwapTemplate.Builder builder = FixedOvernightSwapTemplate.builder();
        
        Object periodToStart = args.get("periodtostart");
        if (null != periodToStart) {
            Period value;
            try {
                value = xl.convertArgument(periodToStart, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("periodToStart could not be converted to Period", e);
            }
            builder = builder.periodToStart(value);
            usedArgs.add("periodtostart");
        }
        
        Object tenor = args.get("tenor");
        if (null != tenor) {
            Tenor value;
            try {
                value = xl.convertArgument(tenor, Tenor.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("tenor could not be converted to Tenor", e);
            }
            builder = builder.tenor(value);
            usedArgs.add("tenor");
        }
        
        Object convention = args.get("convention");
        if (null != convention) {
            FixedOvernightSwapConvention value;
            try {
                value = xl.convertArgument(convention, FixedOvernightSwapConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to FixedOvernightSwapConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.FixedOvernightSwapTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("tenor"),
        @ExcelArgument("convention")
    })
    public FixedOvernightSwapTemplate of(Tenor tenor, FixedOvernightSwapConvention convention) {
        return FixedOvernightSwapTemplate.of(tenor, convention);
    }

    @ExcelFunction(
        value = "og.FixedOvernightSwapTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fixedOvernightSwapTemplate")
    })
    public String toString(FixedOvernightSwapTemplate fixedOvernightSwapTemplate) {
        return fixedOvernightSwapTemplate.toString();
    }
}