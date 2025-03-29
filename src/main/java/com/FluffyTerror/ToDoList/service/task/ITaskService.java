package com.FluffyTerror.ToDoList.service.task;

import com.FluffyTerror.ToDoList.model.Task;
import com.FluffyTerror.ToDoList.request.UpdateTaskRequest;

import java.util.List;

public interface ITaskService {
    Task addTask(Task task);

    void deleteTask(Long id);

    Task updateTask(UpdateTaskRequest request, Long id);

    List<Task> getTasks();
}
