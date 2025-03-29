package com.FluffyTerror.ToDoList.request;

import lombok.Data;

@Data
public class UpdateTaskRequest {
    private String text;

    private boolean status;
}
