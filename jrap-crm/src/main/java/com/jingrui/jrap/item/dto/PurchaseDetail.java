package com.jingrui.jrap.item.dto;

/**Auto Generated By Jrap Code Generator**/

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.JoinColumn;
import com.jingrui.jrap.mybatis.common.query.JoinOn;
import com.jingrui.jrap.mybatis.common.query.JoinTable;
import com.jingrui.jrap.mybatis.common.query.Where;
import com.jingrui.jrap.product.dto.ItemModel;
import com.jingrui.jrap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.persistence.criteria.JoinType;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "afd_purchase_detail")
public class PurchaseDetail extends BaseDTO {

     public static final String FIELD_DETAIL_ID = "detailId";
     public static final String FIELD_PURCHASE_ID = "purchaseId";
     public static final String FIELD_MODEL_ID = "modelId";
     public static final String FIELD_GUIDE_PRICE = "guidePrice";
     public static final String FIELD_INVOICE_PRICE = "invoicePrice";
     public static final String FIELD_UNIT_PRICE = "unitPrice";
     public static final String FIELD_ITEM_NUMBER = "itemNumber";
     public static final String FIELD_PURCHASE_COST = "purchaseCost";
     public static final String FIELD_TRAFFIC_INSURANCE = "trafficInsurance";
     public static final String FIELD_COMMERCIAL_INSURANCE = "commercialInsurance";
     public static final String FIELD_DEED_FAX = "deedFax";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @GeneratedValue
     @OrderBy("desc")
     private Long detailId;

     @Where
     private Long purchaseId; //采购ID

     @Where
     @JoinTable(name = "modelJoin", target = ItemModel.class, type = JoinType.LEFT, on = {@JoinOn(joinField = ItemModel.FIELD_MODEL_ID)})
     private Long modelId; //租赁物模型ID

     @Transient
     @JoinColumn(joinName = "modelJoin", field = ItemModel.FIELD_MODEL)
     private String model; // 租赁物型号

     @Where
     private Long guidePrice; //指导价

     @Where
     private Long invoicePrice; //开票价

     @Where
     private Long unitPrice; //单价

     @Where
     private Long itemNumber; //数量

     @Where
     private Long purchaseCost; //购置税

     @Where
     private Long trafficInsurance; //交强险

     @Where
     private Long commercialInsurance; //商业险

     @Where
     private Long deedFax; //契税

     @Where
     @Length(max = 200)
     private String remark; //备注

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;

     @Transient
     private String remainNumber; // 剩余数量

    public String getRemainNumber() {
        return remainNumber;
    }

    public void setRemainNumber(String remainNumber) {
        this.remainNumber = remainNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDetailId(Long detailId){
         this.detailId = detailId;
     }

     public Long getDetailId(){
         return detailId;
     }

     public void setPurchaseId(Long purchaseId){
         this.purchaseId = purchaseId;
     }

     public Long getPurchaseId(){
         return purchaseId;
     }

     public void setModelId(Long modelId){
         this.modelId = modelId;
     }

     public Long getModelId(){
         return modelId;
     }

     public void setGuidePrice(Long guidePrice){
         this.guidePrice = guidePrice;
     }

     public Long getGuidePrice(){
         return guidePrice;
     }

     public void setInvoicePrice(Long invoicePrice){
         this.invoicePrice = invoicePrice;
     }

     public Long getInvoicePrice(){
         return invoicePrice;
     }

     public void setUnitPrice(Long unitPrice){
         this.unitPrice = unitPrice;
     }

     public Long getUnitPrice(){
         return unitPrice;
     }

     public void setItemNumber(Long itemNumber){
         this.itemNumber = itemNumber;
     }

     public Long getItemNumber(){
         return itemNumber;
     }

     public void setPurchaseCost(Long purchaseCost){
         this.purchaseCost = purchaseCost;
     }

     public Long getPurchaseCost(){
         return purchaseCost;
     }

     public void setTrafficInsurance(Long trafficInsurance){
         this.trafficInsurance = trafficInsurance;
     }

     public Long getTrafficInsurance(){
         return trafficInsurance;
     }

     public void setCommercialInsurance(Long commercialInsurance){
         this.commercialInsurance = commercialInsurance;
     }

     public Long getCommercialInsurance(){
         return commercialInsurance;
     }

     public void setDeedFax(Long deedFax){
         this.deedFax = deedFax;
     }

     public Long getDeedFax(){
         return deedFax;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
     }

     public void setProgramApplicationId(Long programApplicationId){
         this.programApplicationId = programApplicationId;
     }

     public Long getProgramApplicationId(){
         return programApplicationId;
     }

     public void setProgramUpdateDate(Date programUpdateDate){
         this.programUpdateDate = programUpdateDate;
     }

     public Date getProgramUpdateDate(){
         return programUpdateDate;
     }

     }