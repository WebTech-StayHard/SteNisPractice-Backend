package com.FluffyTerror.ToDoList.repository;

import com.FluffyTerror.ToDoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
