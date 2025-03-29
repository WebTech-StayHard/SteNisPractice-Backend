package com.FluffyTerror.ToDoList.service.folder;

import com.FluffyTerror.ToDoList.model.Folder;
import com.FluffyTerror.ToDoList.request.AddFolderRequest;
import com.FluffyTerror.ToDoList.request.UpdateFolderRequest;

import java.util.List;

public class FolderService implements IFolderService {



    @Override
    public Folder addFolder(AddFolderRequest request) {
        return null;
    }

    @Override
    public void deleteFolder(Long id) {

    }

    @Override
    public Folder updateFolder(UpdateFolderRequest request, Long id) {
        return null;
    }


    @Override
    public List<Folder> getFolders() {
        return List.of();
    }
}
