package cn.tangcco.entity;

/*   id int(11) NOT NULL主键
   areaid char(6) NOT NULL区县编码
   Areas varchar(40) NOT NULL区县名称
   cityid char(6) NOT NULL所属城市编码*/
public class Areas {
    private Integer id;
    private String areaid;
    private String areas;
    private String cityid;

    public Areas() {
    }

    public Areas(Integer id, String areaid, String areas, String cityid) {
        this.id = id;
        this.areaid = areaid;
        this.areas = areas;
        this.cityid = cityid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "id=" + id +
                ", areaid='" + areaid + '\'' +
                ", Areas='" + areas + '\'' +
                ", cityid='" + cityid + '\'' +
                '}';
    }
}
