package cn.tangcco.entity;

/* vdrId int(11) NOT NULL
 vehicleId int(11) NOT NULL车辆ID
 lpId int(11) NOT NULL牌照ID
 drivingState varchar(200) NOT NULL行驶状态 01:允许行驶 02:异常
 ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class vehiclepermit {
    private Integer vdrId;
    private Integer vehicleId;
    private Integer lpId;
    private String drivingState;
    private String ds;

    public vehiclepermit() {
    }

    public vehiclepermit(Integer vdrId, Integer vehicleId, Integer lpId, String drivingState, String ds) {
        this.vdrId = vdrId;
        this.vehicleId = vehicleId;
        this.lpId = lpId;
        this.drivingState = drivingState;
        this.ds = ds;
    }

    public Integer getVdrId() {
        return vdrId;
    }

    public void setVdrId(Integer vdrId) {
        this.vdrId = vdrId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getLpId() {
        return lpId;
    }

    public void setLpId(Integer lpId) {
        this.lpId = lpId;
    }

    public String getDrivingState() {
        return drivingState;
    }

    public void setDrivingState(String drivingState) {
        this.drivingState = drivingState;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "vehiclepermit{" +
                "vdrId=" + vdrId +
                ", vehicleId=" + vehicleId +
                ", lpId=" + lpId +
                ", drivingState='" + drivingState + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
