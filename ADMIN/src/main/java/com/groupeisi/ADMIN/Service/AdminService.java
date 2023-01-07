package com.groupeisi.ADMIN.Service;

import com.groupeisi.ADMIN.Entity.Admin;
import com.groupeisi.ADMIN.Repository.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AdminService {
    private AdminRepo adminRepo;

    public Optional<Admin> getAdmin(Long id) {
        return adminRepo.findById(id);
    }

    public List<Admin> getAll() {
        return adminRepo.findAll();
    }
}
