package com.axcelinno.quotecalc.quotecalc.repo;

import com.axcelinno.quotecalc.quotecalc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
