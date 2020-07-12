package object.response;

public class GetStorageUserInfoSubObject {
    String userId;
    Integer userIdMapping;
    String userName;
    String password;
    String regionId;
    String regionName;
    String storageEndPointUrl;
    String s3StorageURl;
    String authEndPointUrl;
    String publicAuthEndPointUrl;
    Integer status;
    String statusName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserIdMapping() {
        return userIdMapping;
    }

    public void setUserIdMapping(Integer userIdMapping) {
        this.userIdMapping = userIdMapping;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStorageEndPointUrl() {
        return storageEndPointUrl;
    }

    public void setStorageEndPointUrl(String storageEndPointUrl) {
        this.storageEndPointUrl = storageEndPointUrl;
    }

    public String getS3StorageURl() {
        return s3StorageURl;
    }

    public void setS3StorageURl(String s3StorageURl) {
        this.s3StorageURl = s3StorageURl;
    }

    public String getAuthEndPointUrl() {
        return authEndPointUrl;
    }

    public void setAuthEndPointUrl(String authEndPointUrl) {
        this.authEndPointUrl = authEndPointUrl;
    }

    public String getPublicAuthEndPointUrl() {
        return publicAuthEndPointUrl;
    }

    public void setPublicAuthEndPointUrl(String publicAuthEndPointUrl) {
        this.publicAuthEndPointUrl = publicAuthEndPointUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public GetStorageUserInfoSubObject(){
        super();
    }

    public GetStorageUserInfoSubObject(String userId, Integer userIdMapping, String userName, String password, String regionId, String regionName, String storageEndPointUrl, String s3StorageURl, String authEndPointUrl, String publicAuthEndPointUrl, Integer status, String statusName) {
        this.userId = userId;
        this.userIdMapping = userIdMapping;
        this.userName = userName;
        this.password = password;
        this.regionId = regionId;
        this.regionName = regionName;
        this.storageEndPointUrl = storageEndPointUrl;
        this.s3StorageURl = s3StorageURl;
        this.authEndPointUrl = authEndPointUrl;
        this.publicAuthEndPointUrl = publicAuthEndPointUrl;
        this.status = status;
        this.statusName = statusName;
    }
}
