package com.example.budgetbook.common.page;

import lombok.Builder;

@Builder
public record PageConfiguration(
        String nameKey,
        PageType type
) {
}
