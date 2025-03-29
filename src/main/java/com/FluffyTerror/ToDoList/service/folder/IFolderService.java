package com.FluffyTerror.ToDoList.service.folder;

import com.FluffyTerror.ToDoList.model.Folder;
import com.FluffyTerror.ToDoList.request.AddFolderRequest;
import com.FluffyTerror.ToDoList.request.UpdateFolderRequest;

import java.util.List;

public interface IFolderService {
    Folder addFolder(AddFolderRequest request);

    void deleteFolder(Long id);

    Folder updateFolder(UpdateFolderRequest request, Long id);

    List<Folder> getFolders();

}
