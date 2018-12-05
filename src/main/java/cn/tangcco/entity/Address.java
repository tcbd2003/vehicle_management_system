package cn.tangcco.entity;


/*addressId int(11) NOT NULL
adminId int(200) NOT NULL管理员ID
driverId int(200) NOT NULL司机ID
provinceId varchar(200) NOT NULL省级单位ID
cityId varchar(200) NOT NULL市级单位ID
areaId varchar(200) NOT NULL地区单位ID
detail varchar(800) NOT NULL详细地址*/
public class Address {
    private Integer addressId;
    private Integer adminId;
    private Integer driverId;
    private String provinceId;
    private String cityId;
    private String areaId;
    private String detail;

    public Address() {
    }

    public Address(Integer addressId, Integer adminId, Integer driverId, String provinceId, String cityId, String areaId, String detail) {
        this.addressId = addressId;
        this.adminId = adminId;
        this.driverId = driverId;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.areaId = areaId;
        this.detail = detail;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", adminId=" + adminId +
                ", driverId=" + driverId +
                ", provinceId='" + provinceId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", areaId='" + areaId + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
