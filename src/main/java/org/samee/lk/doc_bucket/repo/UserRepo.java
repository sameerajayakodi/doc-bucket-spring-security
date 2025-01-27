package org.samee.lk.doc_bucket.repo;

import org.samee.lk.doc_bucket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    boolean existsByUsername(String username);
}
