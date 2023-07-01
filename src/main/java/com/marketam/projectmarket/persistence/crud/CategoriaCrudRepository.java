package com.marketam.projectmarket.persistence.crud;

import com.marketam.projectmarket.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria,Long> {
}
