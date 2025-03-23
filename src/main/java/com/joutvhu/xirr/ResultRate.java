package com.joutvhu.xirr;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ResultRate {
    /**
     * The calculated IRR value.
     */
    final double value;

    /**
     * The difference between the last two calculated values, indicating the precision of the result.
     */
    final double epsilon;

    /**
     * A flag indicating whether the calculation was successfully completed within the desired precision.
     */
    final boolean completed;
}
