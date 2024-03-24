package vin.lucas.hellospring.domain.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vin.lucas.hellospring.domain.greeting.entity.Greeting;

@Repository
public interface DatabaseRepository extends JpaRepository<Greeting, Long> {
}
