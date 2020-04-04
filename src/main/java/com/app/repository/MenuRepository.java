package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entity.Menu;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {



}
