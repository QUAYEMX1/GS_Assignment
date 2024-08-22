package com.example.ToDoApplication.Repository;

import com.example.ToDoApplication.Models.ToDoApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToDoAppRepository extends JpaRepository<ToDoApp,Integer> {

    @Query("SELECT t FROM ToDoApp t ORDER BY t.createdDate DESC")
    List<ToDoApp> findAllByDescDate();
}
