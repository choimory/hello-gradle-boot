package com.hellogradleboot.user.repository;

import org.springframework.data.repository.Repository;

import com.hellogradleboot.user.domain.User;

public interface UserRepository extends Repository<User, Long> {

}
