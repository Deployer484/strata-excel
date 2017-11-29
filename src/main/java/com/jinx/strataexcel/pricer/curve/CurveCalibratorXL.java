/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.pricer.curve;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.market.curve.CurveGroupDefinition;
import com.opengamma.strata.pricer.curve.CurveCalibrator;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider;
    

public class CurveCalibratorXL {
    private final ExcelAddIn xl;

    public CurveCalibratorXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurveCalibrator.calibrate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveCalibrator"),
        @ExcelArgument("curveGroupDefn"),
        @ExcelArgument("marketData"),
        @ExcelArgument("refData")
    })
    public ImmutableRatesProvider calibrate(CurveCalibrator curveCalibrator, CurveGroupDefinition curveGroupDefn, MarketData marketData, ReferenceData refData) {
        return curveCalibrator.calibrate(curveGroupDefn, marketData, refData);
    }

    @ExcelFunction(
        value = "og.CurveCalibrator.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("toleranceAbs"),
        @ExcelArgument("toleranceRel"),
        @ExcelArgument("stepMaximum")
    })
    public CurveCalibrator of(double toleranceAbs, double toleranceRel, int stepMaximum) {
        return CurveCalibrator.of(toleranceAbs, toleranceRel, stepMaximum);
    }

    @ExcelFunction(
        value = "og.CurveCalibrator.standard",
        category = "Strata",
        isThreadSafe = true
    )
    public CurveCalibrator standard() {
        return CurveCalibrator.standard();
    }

    @ExcelFunction(
        value = "og.CurveCalibrator.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveCalibrator")
    })
    public String toString(CurveCalibrator curveCalibrator) {
        return curveCalibrator.toString();
    }
}
