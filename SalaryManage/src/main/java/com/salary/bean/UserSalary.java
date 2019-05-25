package com.salary.bean;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 员工工资
 * @author a
 * 
 */
@TableName("user_salary")
public class UserSalary {
	@TableId(value = "salary_id" , type = IdType.AUTO)
	private Integer salaryId ;
	
	@TableField("tax_id")
	private Integer taxId;
	
	@TableField("user_id")
	private String userId;
	
	@TableField("date")
	private String date;
	/**
	 * 基本工资
	 */
	@TableField("salary_base")
	private Float salaryBase;
	/**
	 * 奖金
	 */
	@TableField("prize")
	private Float prize;
	/**
	 * 福利
	 */
	@TableField("welfare")
	private Float welfare;
	/**
	 * 津贴
	 */
	@TableField("allowance")
	private Float allwance;
	/**
	 * 缴税
	 */
	@TableField("tax")
	private Float tax;
	/**
	 * 扣罚
	 */
	@TableField("fine")
	private Float fine;
	/**
	 * 五险一金
	 */
	@TableField("insurance")
	private Float insurance;
	
	@TableField("createtime")
	private Date createTime;

	public Integer getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(Float salaryBase) {
		this.salaryBase = salaryBase;
	}

	public Float getPrize() {
		return prize;
	}

	public void setPrize(Float prize) {
		this.prize = prize;
	}

	public Float getWelfare() {
		return welfare;
	}

	public void setWelfare(Float welfare) {
		this.welfare = welfare;
	}

	public Float getAllwance() {
		return allwance;
	}

	public void setAllwance(Float allwance) {
		this.allwance = allwance;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public Float getFine() {
		return fine;
	}

	public void setFine(Float fine) {
		this.fine = fine;
	}

	public Float getInsurance() {
		return insurance;
	}

	public void setInsurance(Float insurance) {
		this.insurance = insurance;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserSalary [salaryId=" + salaryId + ", taxId=" + taxId + ", userId=" + userId + ", date=" + date
				+ ", salaryBase=" + salaryBase + ", prize=" + prize + ", welfare=" + welfare + ", allwance=" + allwance
				+ ", tax=" + tax + ", fine=" + fine + ", insurance=" + insurance + ", createTime=" + createTime + "]";
	}
	
	
}
