package com.lazarev.owllibrary.data.repository;

import com.lazarev.owllibrary.data.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BooksEntity, Integer> {
}
