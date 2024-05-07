package com.example.budgetbook.user.domain;

import com.example.budgetbook.user.domain.mapper.UserMapper;
import com.example.budgetbook.user.domain.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Optional<User> findById(UUID id) {
        log.info("Find user by id: {}", id);
        var userEntity = userRepository.findById(id);
        var userResponse = userEntity.map(userMapper::toUser);
        log.info("Found user by id: {}", userResponse);
        return userResponse;
    }

    public List<User> findAll(Pageable pageable) {
        log.info("Find all users: {}", pageable);

        var userListResponse = StreamSupport.stream(userRepository.findAll(pageable).spliterator(), false)
                .map(userMapper::toUser)
                .toList();
        log.info("Found all users: {}", userListResponse);
        return userListResponse;
    }

    public User save(User user) {
        log.info("Save user: {}", user);
        var userEntity = userRepository.save(userMapper.toUserEntity(user));
        var userResponse = userMapper.toUser(userEntity);
        log.info("Saved user: {}", userResponse);
        return userResponse;
    }

    public void deleteById(UUID id) {
        log.info("Delete user by id: {}", id);
        userRepository.deleteById(id);
        log.info("Deleted user by id: {}", id);
    }
}
