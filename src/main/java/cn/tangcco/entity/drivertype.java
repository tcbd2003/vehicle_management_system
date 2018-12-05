package cn.tangcco.entity;

/* dtId int(11) NOT NULL
 dtName varchar(200) NOT NULL准驾类型名
 describe varchar(600) NOT NULL类型描述
 ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class drivertype {
    private Integer dtId;
    private String dtName;
    private String describe;
    private String ds;

    public drivertype() {
    }

    public drivertype(Integer dtId, String dtName, String describe, String ds) {
        this.dtId = dtId;
        this.dtName = dtName;
        this.describe = describe;
        this.ds = ds;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName;
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

    @Override
    public String toString() {
        return "drivertype{" +
                "dtId=" + dtId +
                ", dtName='" + dtName + '\'' +
                ", describe='" + describe + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
