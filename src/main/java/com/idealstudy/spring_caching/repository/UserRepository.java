package com.idealstudy.spring_caching.repository;

import com.idealstudy.spring_caching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // username으로 User를 찾기 위한 메서드
    Optional<User> findByUsername(String username);

    // username이 존재하는지 여부를 확인하는 메서드
    boolean existsByUsername(String username);
}