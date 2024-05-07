package com.example.budgetbook.common.page.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class UIComponent {
    private final int id;
    private final String name;

    public abstract boolean validateConfiguration(String prefix);

    public String getInternalName() {
        return String.format("%s(%d)", getName(), getId());
    }
}
