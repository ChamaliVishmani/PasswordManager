package com.password_manager.password_manager.service.vault;

import com.password_manager.password_manager.model.Vault;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VaultService implements IVaultService {
    @Override
    public void createNewVault(String vaultName, String password) {
//        Vault vault = new Vault()
    }
}
