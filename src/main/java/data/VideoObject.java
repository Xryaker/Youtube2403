package data;

public class VideoObject {
    String watchUrl,img,fileName;

    public String getWatchUrl() {
        return watchUrl;
    }

    public String getImg() {
        return img;
    }

    public String getFileName() {
        return fileName;
    }

    public VideoObject(String watchUrl, String img, String fileName) {
        this.watchUrl = watchUrl;
        this.img = img;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "VideoObject{" +
                "watchUrl='" + watchUrl + '\'' +
                ", img='" + img + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
