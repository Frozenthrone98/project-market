package com.marketam.projectmarket.persistence.crud;

import com.marketam.projectmarket.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Long> {
}
