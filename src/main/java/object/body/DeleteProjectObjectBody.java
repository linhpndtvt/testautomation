package object.body;

public class DeleteProjectObjectBody {
    String regionId;
    Integer userId;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public DeleteProjectObjectBody(){
        super();
    }

    public DeleteProjectObjectBody(String regionId, Integer userId) {
        this.regionId = regionId;
        this.userId = userId;
    }

    @Override
    public String toString(){
        return "BodyDeletingProjectObject [regionId" + regionId + ", userId="
                + userId
                +  "]";
    }
}
