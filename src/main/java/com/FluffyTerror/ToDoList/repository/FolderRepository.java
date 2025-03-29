package com.FluffyTerror.ToDoList.repository;

import com.FluffyTerror.ToDoList.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
