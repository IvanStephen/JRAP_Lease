package com.jingrui.jrap.finance.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "afd_bank")
public class Bank extends BaseDTO {

     public static final String FIELD_BANK_ID = "bankId";
     public static final String FIELD_BANK_CODE = "bankCode";
     public static final String FIELD_SHORT_NAME = "shortName";
     public static final String FIELD_FULL_NAME = "fullName";
     public static final String FIELD_PAY_BANK_NUMBER = "payBankNumber";
     public static final String FIELD_PROVINCE = "province";
     public static final String FIELD_CITY = "city";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long bankId;

     @Length(max = 30)
     private String bankCode; //银行CODE

     @Length(max = 60)
     private String shortName; //银行简称

     @Length(max = 200)
     private String fullName; //银行全称

     @NotEmpty
     @Length(max = 50)
     private String payBankNumber; //支付联行号

     @Length(max = 150)
     private String province; //省份

     @Length(max = 150)
     private String city; //城市

     @Length(max = 2147483647)
     private String remark; //备注说明

     @Length(max = 1)
     private String enabledFlag; //启用标识

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setBankId(Long bankId){
         this.bankId = bankId;
     }

     public Long getBankId(){
         return bankId;
     }

     public void setBankCode(String bankCode){
         this.bankCode = bankCode;
     }

     public String getBankCode(){
         return bankCode;
     }

     public void setShortName(String shortName){
         this.shortName = shortName;
     }

     public String getShortName(){
         return shortName;
     }

     public void setFullName(String fullName){
         this.fullName = fullName;
     }

     public String getFullName(){
         return fullName;
     }

     public void setPayBankNumber(String payBankNumber){
         this.payBankNumber = payBankNumber;
     }

     public String getPayBankNumber(){
         return payBankNumber;
     }

     public void setProvince(String province){
         this.province = province;
     }

     public String getProvince(){
         return province;
     }

     public void setCity(String city){
         this.city = city;
     }

     public String getCity(){
         return city;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
     }

     public void setEnabledFlag(String enabledFlag){
         this.enabledFlag = enabledFlag;
     }

     public String getEnabledFlag(){
         return enabledFlag;
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