package org.sid.costumerservice.repository;

import org.sid.costumerservice.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Costumer,Long> {
}
