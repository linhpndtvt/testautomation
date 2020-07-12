package object.body;

public class UpdateStorageUserPasswordObjectBody {

    String actionName;
    UpdateStorageUserPasswordActionInfoObjectBody actionInfo;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public UpdateStorageUserPasswordActionInfoObjectBody getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(UpdateStorageUserPasswordActionInfoObjectBody actionInfo) {
        this.actionInfo = actionInfo;
    }

    public UpdateStorageUserPasswordObjectBody(String actionName, UpdateStorageUserPasswordActionInfoObjectBody updateStorageUserPasswordActionInfoObjectBody) {
        this.actionName = actionName;
        this.actionInfo = updateStorageUserPasswordActionInfoObjectBody;
    }

    public UpdateStorageUserPasswordObjectBody(){
        super();
    }


}
