package com.my.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.my.demo.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Long> {

}
