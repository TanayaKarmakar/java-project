import com.app.blob.BlobStorageUtil;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.models.BlobContainerProperties;

import java.io.IOException;
import java.util.Map;

public class BlobTest {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/sample_prog.txt";
        //String fileName = "sample_prog.txt";

        BlobStorageUtil.uploadFileCreateNewBlobContainer(fileName);

        accessMetadata();
    }

    private static void accessMetadata() {
        String containerName = "quickstartblobs-cf34ba02-8d51-47e1-aa64-a81398a3e0ee";
        BlobContainerClient containerClient = BlobStorageUtil.getBlobContainerByName(containerName);

        BlobContainerProperties blobProperties = containerClient.getProperties();
        System.out.println("Metadata information");

        Map<String, String> metaDataMap = blobProperties.getMetadata();

        for(Map.Entry<String, String> entry: metaDataMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
