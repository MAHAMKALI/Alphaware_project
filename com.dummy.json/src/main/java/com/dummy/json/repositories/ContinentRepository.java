package com.dummy.json.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dummy.json.Entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, String> {
}
