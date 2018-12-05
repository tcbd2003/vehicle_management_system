package cn.tangcco.entity;

        /*lpId int(11) NOT NULL
        lpName varchar(200) NOT NULL牌照名称
        driverId int(11) NOT NULL驾驶员ID
        state varchar(200) NOT NULL状态
        ds varchar(200) NOT NULL删除状态 正常:01 标记删除:02*/
public class Licenseplates {
            private Integer lpId;
            private String lpName;
            private Integer driverId;
            private String state;
            private String ds;

            public Licenseplates() {
            }

            public Licenseplates(Integer lpId, String lpName, Integer driverId, String state, String ds) {
                this.lpId = lpId;
                this.lpName = lpName;
                this.driverId = driverId;
                this.state = state;
                this.ds = ds;
            }

            public Integer getLpId() {
                return lpId;
            }

            public void setLpId(Integer lpId) {
                this.lpId = lpId;
            }

            public String getLpName() {
                return lpName;
            }

            public void setLpName(String lpName) {
                this.lpName = lpName;
            }

            public Integer getDriverId() {
                return driverId;
            }

            public void setDriverId(Integer driverId) {
                this.driverId = driverId;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getDs() {
                return ds;
            }

            public void setDs(String ds) {
                this.ds = ds;
            }

            @Override
            public String toString() {
                return "Licenseplates{" +
                        "lpId=" + lpId +
                        ", lpName='" + lpName + '\'' +
                        ", driverId=" + driverId +
                        ", state='" + state + '\'' +
                        ", ds='" + ds + '\'' +
                        '}';
            }
        }
