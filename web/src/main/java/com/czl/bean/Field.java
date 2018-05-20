package com.czl.bean;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "field")
public class Field {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "fieldUid", length = 36)
    private String ID;//ID
    private String seedName;// 种子
    private String location;// 地点
    private String fertilizerName;// 化肥名字
    private String fertilizerDosage;// 化肥用量
    private String pesticideName;// 农药名称
    private String pesticideDosage;// 农药用量
    private String pH;// pH
    private String waterQuality;// 水质

    @Temporal(TemporalType.DATE)
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }

    public String getFertilizerDosage() {
        return fertilizerDosage;
    }

    public void setFertilizerDosage(String fertilizerDosage) {
        this.fertilizerDosage = fertilizerDosage;
    }

    public String getPesticideName() {
        return pesticideName;
    }

    public void setPesticideName(String pesticideName) {
        this.pesticideName = pesticideName;
    }

    public String getPesticideDosage() {
        return pesticideDosage;
    }

    public void setPesticideDosage(String pesticideDosage) {
        this.pesticideDosage = pesticideDosage;
    }

    public String getpH() {
        return pH;
    }

    public void setpH(String pH) {
        this.pH = pH;
    }

    public String getWaterQuality() {
        return waterQuality;
    }

    public void setWaterQuality(String waterQuality) {
        this.waterQuality = waterQuality;
    }
}
