package cn.tangcco.entity;

import java.util.Date;

/*driverId int(11) NOT NULL驾驶员表
driverName varchar(200) NOT NULL驾驶员姓名
nationality varchar(200) NOT NULL国籍
gender varchar(200) NOT NULL性别
email varchar(200) NOT NULL邮箱
phone varchar(200) NOT NULL手机号码
birthday date NOT NULL出生日期
IDcardNo varchar(200) NOT NULL身份证号码
householdRegistr varchar(500) NOT NULL户籍所在地
addressId varchar(200) NOT NULL住址表ID
driverLicenseId varchar(200) NOT NULL驾驶证ID
ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class driver {
    private Integer driverId;
    private String driverName;
    private String nationality;
    private String gender;
    private String email;
    private String phone;
    private String birthday;
    private String IDcardNo;
    private String householdRegistr;
    private String addressId;
    private String driverLicenseId;
    private String ds;

    public driver() {
    }

    public driver(Integer driverId, String driverName, String nationality, String gender, String email, String phone, String birthday, String IDcardNo, String householdRegistr, String addressId, String driverLicenseId, String ds) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.nationality = nationality;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.IDcardNo = IDcardNo;
        this.householdRegistr = householdRegistr;
        this.addressId = addressId;
        this.driverLicenseId = driverLicenseId;
        this.ds = ds;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIDcardNo() {
        return IDcardNo;
    }

    public void setIDcardNo(String IDcardNo) {
        this.IDcardNo = IDcardNo;
    }

    public String getHouseholdRegistr() {
        return householdRegistr;
    }

    public void setHouseholdRegistr(String householdRegistr) {
        this.householdRegistr = householdRegistr;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public void setDriverLicenseId(String driverLicenseId) {
        this.driverLicenseId = driverLicenseId;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "driver{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", IDcardNo='" + IDcardNo + '\'' +
                ", householdRegistr='" + householdRegistr + '\'' +
                ", addressId='" + addressId + '\'' +
                ", driverLicenseId='" + driverLicenseId + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
