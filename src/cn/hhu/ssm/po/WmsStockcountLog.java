package cn.hhu.ssm.po;

import java.util.Date;

public class WmsStockcountLog {
    private Integer stockcountLogid;

    private Integer stockcountsId;

    private String stockcountPremodifiedstate;

    private String stockcountModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getStockcountLogid() {
        return stockcountLogid;
    }

    public void setStockcountLogid(Integer stockcountLogid) {
        this.stockcountLogid = stockcountLogid;
    }

    public Integer getStockcountsId() {
        return stockcountsId;
    }

    public void setStockcountsId(Integer stockcountsId) {
        this.stockcountsId = stockcountsId;
    }

    public String getStockcountPremodifiedstate() {
        return stockcountPremodifiedstate;
    }

    public void setStockcountPremodifiedstate(String stockcountPremodifiedstate) {
        this.stockcountPremodifiedstate = stockcountPremodifiedstate == null ? null : stockcountPremodifiedstate.trim();
    }

    public String getStockcountModifiedstate() {
        return stockcountModifiedstate;
    }

    public void setStockcountModifiedstate(String stockcountModifiedstate) {
        this.stockcountModifiedstate = stockcountModifiedstate == null ? null : stockcountModifiedstate.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getModifyman() {
        return modifyman;
    }

    public void setModifyman(String modifyman) {
        this.modifyman = modifyman == null ? null : modifyman.trim();
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
}