package com.example.budgetbook.common.page;

import com.example.budgetbook.common.page.ui.UIComponent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public abstract class Page {
    private final int id;
    private final String name;
    private final PageConfiguration configuration;

    public boolean validateConfiguration() {

        return createUIComponents().stream()
                .filter(uiComponent -> !uiComponent.validateConfiguration(getInternalName()))
                .toList().isEmpty();
    }

    public String getInternalName() {
        return String.format("%s(%d)", getName(), getId());
    }

    public abstract List<UIComponent> createUIComponents();
}
