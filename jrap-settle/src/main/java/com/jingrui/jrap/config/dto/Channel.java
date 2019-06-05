package com.jingrui.jrap.config.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.Where;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.OrderBy;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "acc_channel")
public class Channel extends BaseDTO {

     public static final String FIELD_CHANNEL = "channel";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_CUSTOMER_CODE = "customerCode";
     public static final String FIELD_USER_NAME = "userName";
     public static final String FIELD_PASSWORD = "password";
     public static final String FIELD_ACCOUNT_ID = "accountId";
     public static final String FIELD_CLIENT_URL = "clientUrl";
     public static final String FIELD_CERT_PATH = "certPath";
     public static final String FIELD_PFX_PATH = "pfxPath";
     public static final String FIELD_CERT_PASSWORD = "certPassword";
     public static final String FIELD_REFER01 = "refer01";
     public static final String FIELD_REFER02 = "refer02";
     public static final String FIELD_REFER03 = "refer03";
     public static final String FIELD_REFER04 = "refer04";
     public static final String FIELD_REFER05 = "refer05";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";

     @Id
     @Where
     @NotEmpty
     @Length(max = 60)
     private String channel; //通道(主键)

     @Where
     @OrderBy("desc")
     private Long companyId; //公司FND_COMPANY_B.COMPANY_ID

     @Where
     @Length(max = 200)
     private String description; //描述

     @Where
     @Length(max = 200)
     private String customerCode; //客户号

     @Where
     @Length(max = 50)
     private String userName; //用户名

     @Where
     @Length(max = 200)
     private String password; //密码

     @Where
     private Long accountId; //本方账号

     @Where
     @Length(max = 200)
     private String clientUrl; //前置机地址

     @Where
     @Length(max = 200)
     private String certPath; //证书路径

     @Where
     @Length(max = 200)
     private String pfxPath; //私钥路径

     @Where
     @Length(max = 200)
     private String certPassword; //证书密码

     @Where
     @Length(max = 200)
     private String refer01; //参考字段01

     @Where
     @Length(max = 200)
     private String refer02; //参考字段02

     @Where
     @Length(max = 200)
     private String refer03; //参考字段03

     @Where
     @Length(max = 200)
     private String refer04; //参考字段04

     @Where
     @Length(max = 200)
     private String refer05; //参考字段05

     @Where
     @Length(max = 1)
     private String enabledFlag; //启用标识

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;


     public void setChannel(String channel){
         this.channel = channel;
     }

     public String getChannel(){
         return channel;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     public void setCustomerCode(String customerCode){
         this.customerCode = customerCode;
     }

     public String getCustomerCode(){
         return customerCode;
     }

     public void setUserName(String userName){
         this.userName = userName;
     }

     public String getUserName(){
         return userName;
     }

     public void setPassword(String password){
         this.password = password;
     }

     public String getPassword(){
         return password;
     }

     public void setAccountId(Long accountId){
         this.accountId = accountId;
     }

     public Long getAccountId(){
         return accountId;
     }

     public void setClientUrl(String clientUrl){
         this.clientUrl = clientUrl;
     }

     public String getClientUrl(){
         return clientUrl;
     }

     public void setCertPath(String certPath){
         this.certPath = certPath;
     }

     public String getCertPath(){
         return certPath;
     }

     public void setPfxPath(String pfxPath){
         this.pfxPath = pfxPath;
     }

     public String getPfxPath(){
         return pfxPath;
     }

     public void setCertPassword(String certPassword){
         this.certPassword = certPassword;
     }

     public String getCertPassword(){
         return certPassword;
     }

     public void setRefer01(String refer01){
         this.refer01 = refer01;
     }

     public String getRefer01(){
         return refer01;
     }

     public void setRefer02(String refer02){
         this.refer02 = refer02;
     }

     public String getRefer02(){
         return refer02;
     }

     public void setRefer03(String refer03){
         this.refer03 = refer03;
     }

     public String getRefer03(){
         return refer03;
     }

     public void setRefer04(String refer04){
         this.refer04 = refer04;
     }

     public String getRefer04(){
         return refer04;
     }

     public void setRefer05(String refer05){
         this.refer05 = refer05;
     }

     public String getRefer05(){
         return refer05;
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
