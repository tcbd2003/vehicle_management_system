package cn.tangcco.entity;

/* rolesId int(11) NOT NULL
 rolesName varchar(200) NOT NULL*/
public class Roles {
    private Integer rolesId;
    private String rolesName;

    public Roles() {
    }

    public Roles(Integer rolesId, String rolesName) {
        this.rolesId = rolesId;
        this.rolesName = rolesName;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "rolesId=" + rolesId +
                ", rolesName='" + rolesName + '\'' +
                '}';
    }
}
