package com.groupeisi.Repository;

import com.groupeisi.Entity.Uaa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UaaRepo extends JpaRepository<Uaa,Long> {
}
