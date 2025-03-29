package com.FluffyTerror.ToDoList.service.folder;

import com.FluffyTerror.ToDoList.exception.ResourceNotFoundException;
import com.FluffyTerror.ToDoList.model.Folder;
import com.FluffyTerror.ToDoList.model.Task;
import com.FluffyTerror.ToDoList.repository.FolderRepository;
import com.FluffyTerror.ToDoList.request.AddFolderRequest;
import com.FluffyTerror.ToDoList.request.UpdateFolderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FolderService implements IFolderService {
private final FolderRepository folderRepository;


    @Override
    public Folder addFolder(AddFolderRequest request) {
        Folder folder = new Folder();
        folder.setColor(request.getColor());
        folder.setLabel(request.getLabel());
        folderRepository.save(folder);
        return folder;
    }

    @Override
    public void deleteFolder(Long id) {
        folderRepository.findById(id).ifPresentOrElse(folderRepository::delete,()->{
            throw new ResourceNotFoundException(String.format(
                    "This folder %d, like sex - doesn't exist",id
            ));
        } );

    }

    @Override
    public Folder updateFolder(UpdateFolderRequest request, Long id) {
        Folder folder = folderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(String.format("Unable to find folder with id: %d", id))
        );
        folder.setColor(request.getColor());
        folder.setLabel(request.getLabel());
        folderRepository.save(folder);
        return folder;
    }


    @Override
    public List<Folder> getFolders() {
        return folderRepository.findAll();
    }
}
