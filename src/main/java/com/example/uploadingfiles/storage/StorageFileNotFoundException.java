package com.example.uploadingfiles.storage;

// İstenen dosya bulunamadığında fırlatılır
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}