package cn.tangcco.entity;

/* adminId int(11) NOT NULL管理员表
 workNumber varchar(200) NOT NULL工号
 adminName varchar(200) NOT NULL管理员姓名
 rolesId varchar(200) NOT NULL角色ID
 password varchar(200) NOT NULL登录密码
 email varchar(200) NOT NULL邮箱
 phone varchar(200) NOT NULL手机号码
 gender varchar(200) NOT NULL性别
 age varchar(200) NOT NULL年龄
 IDcardNo varchar(200) NOT NULL身份证号码
 addressId varchar(800) NOT NULL住址表ID
 ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class administrators {
    private Integer adminId;
    private String workNumber;
    private String adminName;
    private String rolesId;
    private String password;
    private String email;
    private String phone;
    private String gender;
    private String age;
    private String IDcardNo;
    private String addressId;
    private String ds;

    public administrators() {
    }

    public administrators(Integer adminId, String workNumber, String adminName, String rolesId, String password, String email, String phone, String gender, String age, String IDcardNo, String addressId, String ds) {
        this.adminId = adminId;
        this.workNumber = workNumber;
        this.adminName = adminName;
        this.rolesId = rolesId;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.IDcardNo = IDcardNo;
        this.addressId = addressId;
        this.ds = ds;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getRolesId() {
        return rolesId;
    }

    public void setRolesId(String rolesId) {
        this.rolesId = rolesId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIDcardNo() {
        return IDcardNo;
    }

    public void setIDcardNo(String IDcardNo) {
        this.IDcardNo = IDcardNo;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "administrators{" +
                "adminId=" + adminId +
                ", workNumber='" + workNumber + '\'' +
                ", adminName='" + adminName + '\'' +
                ", rolesId='" + rolesId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", IDcardNo='" + IDcardNo + '\'' +
                ", addressId='" + addressId + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
