package io.khasang.helpdesk.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock_detail")
public class StockDetail implements java.io.Serializable {

    private Integer stockId;
    private Stock stock;
    private String compName;
    private String compDesc;
    private String remark;
    private Date listedDate;

    public StockDetail() {
    }

    public StockDetail(Stock stock, String compName, String compDesc,
                       String remark, Date listedDate) {
        this.stock = stock;
        this.compName = compName;
        this.compDesc = compDesc;
        this.remark = remark;
        this.listedDate = listedDate;
    }

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "stock"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Stock getStock() {
        return this.stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Column(name = "COMP_NAME", nullable = false, length = 100)
    public String getCompName() {
        return this.compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    @Column(name = "COMP_DESC", nullable = false)
    public String getCompDesc() {
        return this.compDesc;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    @Column(name = "REMARK", nullable = false)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "LISTED_DATE", nullable = false, length = 10)
    public Date getListedDate() {
        return this.listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

}