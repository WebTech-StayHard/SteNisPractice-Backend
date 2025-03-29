package com.FluffyTerror.ToDoList.request;

import com.FluffyTerror.ToDoList.model.Task;
import lombok.Data;

@Data
public class UpdateFolderRequest {
    private String color;
    private String label;
    private Task tasks;
}
