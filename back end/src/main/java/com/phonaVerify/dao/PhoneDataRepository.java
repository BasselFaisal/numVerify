package com.phonaVerify.dao;

import com.phonaVerify.entity.PhoneData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface PhoneDataRepository extends JpaRepository<PhoneData, Integer> {
}
