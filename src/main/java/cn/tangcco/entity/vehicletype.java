package cn.tangcco.entity;

/* vtId int(11) NOT NULL
 vtName varchar(200) NOT NULL车辆类型名称(小客车,货车)
 dtId int(11) NOT NULL准驾类型ID
 ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class vehicletype {
    private Integer vtId;
    private String vtName;
    private Integer dtId;
    private String ds;

    public vehicletype() {
    }

    public vehicletype(Integer vtId, String vtName, Integer dtId, String ds) {
        this.vtId = vtId;
        this.vtName = vtName;
        this.dtId = dtId;
        this.ds = ds;
    }

    public Integer getVtId() {
        return vtId;
    }

    public void setVtId(Integer vtId) {
        this.vtId = vtId;
    }

    public String getVtName() {
        return vtName;
    }

    public void setVtName(String vtName) {
        this.vtName = vtName;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "vehicletype{" +
                "vtId=" + vtId +
                ", vtName='" + vtName + '\'' +
                ", dtId=" + dtId +
                ", ds='" + ds + '\'' +
                '}';
    }
}
