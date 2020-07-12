package object.body;

public class UpdateStorageUserPasswordActionInfoObjectBody {

    String oldPass;
    String newPass;
    String confirmNewPass;

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getConfirmNewPass() {
        return confirmNewPass;
    }

    public void setConfirmNewPass(String confirmNewPass) {
        this.confirmNewPass = confirmNewPass;
    }

    public UpdateStorageUserPasswordActionInfoObjectBody(String oldPass, String newPass, String confirmNewPass) {
        this.oldPass = oldPass;
        this.newPass = newPass;
        this.confirmNewPass = confirmNewPass;
    }

    public UpdateStorageUserPasswordActionInfoObjectBody(){
        super();
    }
}
