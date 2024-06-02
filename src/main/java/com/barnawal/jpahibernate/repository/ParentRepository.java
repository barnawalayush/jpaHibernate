package com.barnawal.jpahibernate.repository;

import com.barnawal.jpahibernate.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
