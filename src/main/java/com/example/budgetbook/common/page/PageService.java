package com.example.budgetbook.common.page;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.stream.Stream;

@Service
@Slf4j
@RequiredArgsConstructor
public class PageService {

    private final Page[] pagesToRegister;

    private final HashMap<Integer, Page> registeredPages = new HashMap<>();

    @PostConstruct
    private void registerPages() {
        log.info("Start Register Pages");

        var invalidPage = Stream.of(pagesToRegister).filter(page -> !page.validateConfiguration()).findAny();
        if (invalidPage.isPresent()) {
            throw new IllegalStateException("Failed to validate page configuration: " + invalidPage.get().getInternalName());
        }

        Stream.of(pagesToRegister)
                .forEach(this::registerPage);
        log.info("Registered {} Pages", registeredPages.size());
    }

    private void registerPage(Page page) {
        registeredPages.put(page.getId(), page);
        log.info(page.getInternalName());
    }
}
