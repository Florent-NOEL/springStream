package SpringStream.models;

public class UrlList {
    private static String urlVideoFile ="file:C:/Users/Flo/Documents/wb/videoFile";
    private static String urlImageFile="file:C:/Users/Flo/Documents/wb/imageFile";

    public static String getUrlVideoFile() {
        return urlVideoFile;
    }

    public static void setUrlVideoFile(String urlVideoFile) {
        UrlList.urlVideoFile = urlVideoFile;
    }

    public static String getUrlImageFile() {
        return urlImageFile;
    }

    public static void setUrlImageFile(String urlImageFile) {
        UrlList.urlImageFile = urlImageFile;
    }
}
