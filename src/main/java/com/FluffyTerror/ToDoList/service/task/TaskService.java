package com.FluffyTerror.ToDoList.service.task;

import com.FluffyTerror.ToDoList.exception.ResourceNotFoundException;
import com.FluffyTerror.ToDoList.model.Task;
import com.FluffyTerror.ToDoList.repository.TaskRepository;
import com.FluffyTerror.ToDoList.request.UpdateTaskRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor//Dep Injection
public class TaskService implements ITaskService {
    private final TaskRepository taskRepository;

    @Override
    public Task addTask(Task task) {
        Task newTask = new Task();
        newTask.setText(null);
        newTask.setStatus(false);
        taskRepository.save(newTask);
        return newTask;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.findById(id).ifPresentOrElse(taskRepository::delete, () -> {
            throw new ResourceNotFoundException(String.format("Unable to find task with id: %d", id));
        });
    }

    @Override
    public Task updateTask(UpdateTaskRequest request, Long id) {
        Task oldTask = taskRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(String.format("Unable to find task with id: %d", id))
        );
        oldTask.setText(request.getText());
        oldTask.setStatus(request.isStatus());
        taskRepository.save(oldTask);
        return oldTask;

    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
