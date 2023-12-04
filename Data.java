package model;

public class Data {
    public Data(int id, String fileName, String email, String path) {
        this.id = id;
        this.fileName = fileName;
        this.email = email;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Data(int id, String fileName, String path) {
        this.id = id;
        this.fileName = fileName;
        this.path = path;
    }

    private int id;
    private String fileName;
    private String email;
    private String path;

}
