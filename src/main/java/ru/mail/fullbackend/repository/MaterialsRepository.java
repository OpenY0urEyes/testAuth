package ru.mail.fullbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mail.fullbackend.models.Materials;

import java.util.Optional;

@Repository
public interface MaterialsRepository extends JpaRepository<Materials, Long> {

    Optional<Materials> findById(Long id);
}
