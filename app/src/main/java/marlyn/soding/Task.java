package marlyn.soding;

/**
 * Created by marLyn on 4/8/2017.
 */

public class Task {

    private int mId;
    private String mContent;
    private int mImportant;
    public Task(int id, String content, int important) {
        mId = id;
        mImportant = important;
        mContent = content;
    }
    public int getId() {
        return mId;
    }
    public void setId(int id) {
        mId = id;
    }
    public int getImportant() {
        return mImportant;
    }
    public void setImportant(int important) {
        mImportant = important;
    }
    public String getContent() {
        return mContent;
    }
    public void setContent(String content) {
        mContent = content;
    }

}
