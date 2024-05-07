package com.example.budgetbook.common.page.ui.field;

import com.example.budgetbook.common.page.ui.UIComponent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class UIField extends UIComponent {
    private final UIFieldConfiguration configuration;

    public UIField(int id, String name, UIFieldConfiguration configuration) {
        super(id, name);
        this.configuration = configuration;
    }
    
    @Override
    public boolean validateConfiguration(String prefix) {
        return true;
    }
}
