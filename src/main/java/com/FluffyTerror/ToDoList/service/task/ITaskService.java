package com.FluffyTerror.ToDoList.service.task;

import com.FluffyTerror.ToDoList.model.Task;

import java.util.List;

public interface ITaskService {
    Task addFolder(Task task);

    void deleteFolder(Long id);

    Task updateTask(Task task, Long id);

    List<Task> getTasks();
}
