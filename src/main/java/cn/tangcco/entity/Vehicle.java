package cn.tangcco.entity;

/*vehicleId int(11) NOT NULL
vehiclModle varchar(200) NOT NULL车辆型号
vtId int(11) NOT NULL车辆类型ID
frameNumber varchar(200) NOT NULL车辆出厂编号
describe varchar(500) NOT NULL车辆型号描述
ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02
remarks varchar(200) NOT NULL删除状态备注*/
public class Vehicle {
    private Integer vehicleId;
    private String vehiclModle;
    private Integer vtId;
    private String frameNumber;
    private String describe;
    private String ds;
    private String remarks;

    public Vehicle() {
    }

    public Vehicle(Integer vehicleId, String vehiclModle, Integer vtId, String frameNumber, String describe, String ds, String remarks) {
        this.vehicleId = vehicleId;
        this.vehiclModle = vehiclModle;
        this.vtId = vtId;
        this.frameNumber = frameNumber;
        this.describe = describe;
        this.ds = ds;
        this.remarks = remarks;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehiclModle() {
        return vehiclModle;
    }

    public void setVehiclModle(String vehiclModle) {
        this.vehiclModle = vehiclModle;
    }

    public Integer getVtId() {
        return vtId;
    }

    public void setVtId(Integer vtId) {
        this.vtId = vtId;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehiclModle='" + vehiclModle + '\'' +
                ", vtId=" + vtId +
                ", frameNumber='" + frameNumber + '\'' +
                ", describe='" + describe + '\'' +
                ", ds='" + ds + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
