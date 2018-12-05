package cn.tangcco.entity;

/*dlId int(11) NOT NULL驾驶证表
driverId int(11) NOT NULL驾驶员ID
dtId int(11) NOT NULL准驾类型ID
dateOfFirst datetime NOT NULL初次领证日期
validPeriod datetime NOT NULL驾驶证到期日期
ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02
dls varchar(200) NOT NULL驾照状态 正常:01 吊销:02
office varchar(200) NOT NULL发证机关*/
public class Driverlicense {
    private Integer dlId;
    private Integer driverId;
    private Integer dtId;
    private String dateOfFirst;
    private String validPeriod;
    private String ds;
    private String dls;
    private String office;

    public Driverlicense() {
    }

    public Driverlicense(Integer dlId, Integer driverId, Integer dtId, String dateOfFirst, String validPeriod, String ds, String dls, String office) {
        this.dlId = dlId;
        this.driverId = driverId;
        this.dtId = dtId;
        this.dateOfFirst = dateOfFirst;
        this.validPeriod = validPeriod;
        this.ds = ds;
        this.dls = dls;
        this.office = office;
    }

    public Integer getDlId() {
        return dlId;
    }

    public void setDlId(Integer dlId) {
        this.dlId = dlId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDateOfFirst() {
        return dateOfFirst;
    }

    public void setDateOfFirst(String dateOfFirst) {
        this.dateOfFirst = dateOfFirst;
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getDls() {
        return dls;
    }

    public void setDls(String dls) {
        this.dls = dls;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Driverlicense{" +
                "dlId=" + dlId +
                ", driverId=" + driverId +
                ", dtId=" + dtId +
                ", dateOfFirst='" + dateOfFirst + '\'' +
                ", validPeriod='" + validPeriod + '\'' +
                ", ds='" + ds + '\'' +
                ", dls='" + dls + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
