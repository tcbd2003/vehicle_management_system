package cn.tangcco.entity;

/*applyId int(11) NOT NULL
name varchar(200) NOT NULL申请人姓名
phone varchar(200) NOT NULL电话号码
IDcardNo varchar(200) NOT NULL身份证号码
ds varchar(200) NOT NULL删除状态
memarks varchar(200) NOT NULL备注*/
public class Applylivense {
    private Integer applyId;
    private String name;
    private String phone;
    private String IDcardNo;
    private String ds;
    private String memarks;

    public Applylivense() {
    }

    public Applylivense(Integer applyId, String name, String phone, String IDcardNo, String ds, String memarks) {
        this.applyId = applyId;
        this.name = name;
        this.phone = phone;
        this.IDcardNo = IDcardNo;
        this.ds = ds;
        this.memarks = memarks;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIDcardNo() {
        return IDcardNo;
    }

    public void setIDcardNo(String IDcardNo) {
        this.IDcardNo = IDcardNo;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getMemarks() {
        return memarks;
    }

    public void setMemarks(String memarks) {
        this.memarks = memarks;
    }

    @Override
    public String toString() {
        return "Applylivense{" +
                "applyId=" + applyId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", IDcardNo='" + IDcardNo + '\'' +
                ", ds='" + ds + '\'' +
                ", memarks='" + memarks + '\'' +
                '}';
    }
}
