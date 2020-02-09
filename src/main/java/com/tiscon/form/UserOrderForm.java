package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.*;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {
    @NotBlank
    private String customerName;

    @NotBlank
    @Numeric
    @Size(min = 10,max = 11)
    private String tel;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Numeric
    @Size(min = 7,max = 7)
    private String oldAdNum;


    private String oldPrefectureId;
    private String oldAddress;

    @NotBlank
    @Numeric
    @Size(min = 7,max = 7)
    private String newAdNum;

    private String newPrefectureId;
    private String newAddress;

    @Numeric
    @NotBlank
    @Pattern(regexp = "|(\\d)|(\\d\\d)|[1,2,3,4,5](\\d\\d)")
    private String box;

    @Numeric
    @NotBlank
    @Pattern(regexp = "|(\\d)|(\\d\\d)|[1,2,3,4,5](\\d\\d)")
    private String bed;

    @Numeric
    @NotBlank
    @Pattern(regexp = "|(\\d)|(\\d\\d)|[1,2,3,4,5](\\d\\d)")
    private String bicycle;

    @Numeric
    @NotBlank
    @Pattern(regexp = "|(\\d)|(\\d\\d)|[1,2,3,4,5](\\d\\d)")
    private String washingMachine;

    @NotNull
    private Boolean hasWashingMachineSettingOption;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Boolean getHasWashingMachineSettingOption() {
        return hasWashingMachineSettingOption;
    }

    public void setHasWashingMachineSettingOption(Boolean hasWashingMachineSettingOption) {
        this.hasWashingMachineSettingOption = hasWashingMachineSettingOption;
    }
    public String getNewAdNum() {
        return newAdNum;
    }

    public void setNewAdNum(String newAdNum) {
        this.newAdNum = newAdNum;
    }

    public String getOldAdNum() {
        return oldAdNum;
    }

    public void setOldAdNum(String oldAdNum) {
        this.oldAdNum = oldAdNum;
    }
}
