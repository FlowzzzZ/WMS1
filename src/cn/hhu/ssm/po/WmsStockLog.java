package cn.hhu.ssm.po;

import java.util.Date;

public class WmsStockLog {
    private Integer stockLogid;

    private Integer stocksId;

    private String stockPremodifiedstate;

    private String stockModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getStockLogid() {
        return stockLogid;
    }

    public void setStockLogid(Integer stockLogid) {
        this.stockLogid = stockLogid;
    }

    public Integer getStocksId() {
        return stocksId;
    }

    public void setStocksId(Integer stocksId) {
        this.stocksId = stocksId;
    }

    public String getStockPremodifiedstate() {
        return stockPremodifiedstate;
    }

    public void setStockPremodifiedstate(String stockPremodifiedstate) {
        this.stockPremodifiedstate = stockPremodifiedstate == null ? null : stockPremodifiedstate.trim();
    }

    public String getStockModifiedstate() {
        return stockModifiedstate;
    }

    public void setStockModifiedstate(String stockModifiedstate) {
        this.stockModifiedstate = stockModifiedstate == null ? null : stockModifiedstate.trim();
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