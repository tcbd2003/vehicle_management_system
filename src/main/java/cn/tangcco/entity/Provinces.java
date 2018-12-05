package cn.tangcco.entity;

/* id int(11) NOT NULL
 provinceid int(11) NOT NULL
 province varchar(100) NOT NULL*/
public class Provinces {
    private Integer id;
    private Integer provinceid;
    private String province;

    public Provinces() {
    }

    public Provinces(Integer id, Integer provinceid, String province) {
        this.id = id;
        this.provinceid = provinceid;
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Provinces{" +
                "id=" + id +
                ", provinceid=" + provinceid +
                ", province='" + province + '\'' +
                '}';
    }
}
