package in.kodder;

import com.google.gson.annotations.SerializedName;

public class Todo {

    @SerializedName("id")
    private int id;

    @SerializedName("completed")
    private boolean completed;

    @SerializedName("title")
    private String title;

    @SerializedName("userId")
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return
                "Todo{" +
                        "id = '" + id + '\'' +
                        ",completed = '" + completed + '\'' +
                        ",title = '" + title + '\'' +
                        ",userId = '" + userId + '\'' +
                        "}";
    }
}
