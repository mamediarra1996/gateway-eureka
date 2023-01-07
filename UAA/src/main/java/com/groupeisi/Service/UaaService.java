package com.groupeisi.Service;

import com.groupeisi.Entity.Uaa;
import com.groupeisi.Repository.UaaRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UaaService {

    private UaaRepo uaaRepo;

    public Optional<Uaa> getUaa(Long id) {
        return uaaRepo.findById(id);
    }

    public List<Uaa> getAll() {
        return uaaRepo.findAll();
    }
}
