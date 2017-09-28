package com.lssdeveloper.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lssdeveloper.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
