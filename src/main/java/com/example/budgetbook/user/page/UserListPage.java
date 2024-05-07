package com.example.budgetbook.user.page;

import com.example.budgetbook.common.page.Page;
import com.example.budgetbook.common.page.PageConfiguration;
import com.example.budgetbook.common.page.PageType;
import com.example.budgetbook.common.page.ui.UIComponent;
import com.example.budgetbook.common.page.ui.field.UIField;
import com.example.budgetbook.common.page.ui.field.UIFieldConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserListPage extends Page {

    public UserListPage() {
        super(0,
                "UserList",
                PageConfiguration.builder()
                        .nameKey("user.page.list.name")
                        .type(PageType.LIST)
                        .build());
    }

    @Override
    public List<UIComponent> createUIComponents() {
        return List.of(
                new UIField(
                        0,
                        "email",
                        UIFieldConfiguration.builder()
                                .build()
                ),
                new UIField(
                        1,
                        "firstName",
                        UIFieldConfiguration.builder()
                                .build()
                ),
                new UIField(
                        2,
                        "lastName",
                        UIFieldConfiguration.builder()
                                .build()
                ));
    }
}
