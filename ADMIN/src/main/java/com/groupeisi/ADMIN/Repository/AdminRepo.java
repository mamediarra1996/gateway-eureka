package com.groupeisi.ADMIN.Repository;

import com.groupeisi.ADMIN.Entity.Admin;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {

}
