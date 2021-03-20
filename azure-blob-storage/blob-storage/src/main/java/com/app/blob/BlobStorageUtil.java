package com.app.blob;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

import java.util.UUID;

public class BlobStorageUtil {


    public static BlobContainerClient getBlobContainer() {
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString(BlobConstants.CONN_STRING).buildClient();
        String containerName = BlobConstants.CONTAINER_BASE_NAME + "-" + UUID.randomUUID();
        return blobServiceClient.createBlobContainer(containerName);
    }

    public static void uploadFileCreateNewBlobContainer(String fileName) {
        BlobContainerClient containerClient = getBlobContainer();
        BlobClient blobClient = containerClient.getBlobClient(fileName);
        blobClient.uploadFromFile(fileName);
    }

    public static void uploadFileInExistingContainer(String fileName, BlobContainerClient containerClient) {
        BlobClient blobClient = containerClient.getBlobClient(fileName);
        blobClient.uploadFromFile(fileName);
    }

    public static BlobContainerClient getBlobContainerByName(String containerName) {
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString(BlobConstants.CONN_STRING).buildClient();
        return blobServiceClient.getBlobContainerClient(containerName);
    }
}
