package cn.hhu.ssm.po;

import java.util.Date;

public class WmsArea {
    private Integer areasId;

    private String areasNumber;

    private Integer parentstorehousesId;

    private String storehousename;

    private String areaname;

    private String areacode;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer areastype;

    private Integer functiontype;

    private String remark;

    private Float maxtemperature;

    private Float mintemperature;

    public Integer getAreasId() {
        return areasId;
    }

    public void setAreasId(Integer areasId) {
        this.areasId = areasId;
    }

    public String getAreasNumber() {
        return areasNumber;
    }

    public void setAreasNumber(String areasNumber) {
        this.areasNumber = areasNumber == null ? null : areasNumber.trim();
    }

    public Integer getParentstorehousesId() {
        return parentstorehousesId;
    }

    public void setParentstorehousesId(Integer parentstorehousesId) {
        this.parentstorehousesId = parentstorehousesId;
    }

    public String getStorehousename() {
        return storehousename;
    }

    public void setStorehousename(String storehousename) {
        this.storehousename = storehousename == null ? null : storehousename.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public Date getMakeorderdate() {
        return makeorderdate;
    }

    public void setMakeorderdate(Date makeorderdate) {
        this.makeorderdate = makeorderdate;
    }

    public Integer getMakeorderman() {
        return makeorderman;
    }

    public void setMakeorderman(Integer makeorderman) {
        this.makeorderman = makeorderman;
    }

    public Integer getAreastype() {
        return areastype;
    }

    public void setAreastype(Integer areastype) {
        this.areastype = areastype;
    }

    public Integer getFunctiontype() {
        return functiontype;
    }

    public void setFunctiontype(Integer functiontype) {
        this.functiontype = functiontype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Float getMaxtemperature() {
        return maxtemperature;
    }

    public void setMaxtemperature(Float maxtemperature) {
        this.maxtemperature = maxtemperature;
    }

    public Float getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(Float mintemperature) {
        this.mintemperature = mintemperature;
    }
}