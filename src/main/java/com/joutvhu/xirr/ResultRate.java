package com.joutvhu.xirr;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ResultRate {
    final double value;
    final double epsilon;
    final int attempts;
    final boolean completed;
}
