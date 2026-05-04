package com.example.uploadingfiles.storage;

// Storage katmanının genel runtime exception base sınıfı
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}