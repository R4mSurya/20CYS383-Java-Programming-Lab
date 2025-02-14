package com.amrita.jpl.cys21060.endsem;

import com.amrita.jpl.cys21060.endsem.File;
import com.amrita.jpl.cys21060.endsem.FileManager;

import java.util.ArrayList;
import java.util.Iterator;

public class FileManagerImpl implements FileManager {
    private ArrayList<File> files;

    public FileManagerImpl() {
        files = new ArrayList<>();
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void deleteFile(String fileName) {
        Iterator<File> it = files.iterator();
        while(it.hasNext()) {
            File f = it.next();
            if(f.getFileName().equals(fileName)) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public void displayAllFiles() {
        for (File f : files) {
            f.displayFileDetails();
        }
    }
}
