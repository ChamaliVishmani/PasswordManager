package com.password_manager.password_manager.repository;

import com.password_manager.password_manager.model.Vault;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaultRepository extends JpaRepository<Vault, Long> {

}
