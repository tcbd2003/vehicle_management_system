package cn.tangcco.entity;

/* id int(11) NOT NULL主键
cityid varchar(200) NOT NULL城市编码
city varchar(40) NOT NULL城市名称
provinceid varchar(200) NOT NULL所属省份编码*/
public class Cities {
    private Integer id;
    private String cityid;
    private String city;
    private String provinceid;

    public Cities() {
    }

    public Cities(Integer id, String cityid, String city, String provinceid) {
        this.id = id;
        this.cityid = cityid;
        this.city = city;
        this.provinceid = provinceid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", cityid='" + cityid + '\'' +
                ", city='" + city + '\'' +
                ", provinceid='" + provinceid + '\'' +
                '}';
    }
}
