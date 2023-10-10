package com.truper.demo.repository;

import com.truper.demo.repository.entity.ShoppingList;
import com.truper.demo.repository.entity.ShoppingListDetail;
import com.truper.demo.repository.entity.ShoppingListDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepository extends JpaRepository<ShoppingList, Long> {

}
