package com.example.budgetbook.user.api;

import com.example.api.UsersApiDelegate;
import com.example.model.UserDetailsListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsersApiDelegateImpl implements UsersApiDelegate {

    @Override
    public ResponseEntity<UserDetailsListDto> getUser(String userID) {
        return ResponseEntity.ok(null);

    }
}
