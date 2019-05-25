package com.salary.bean;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 个人所得税税率
 * @author a
 *
 */
@TableName("personal_tax")
public class PersonalTax {
	@TableId(value = "tax_id" , type = IdType.AUTO)
	private Integer taxId;
	
	@TableField("tax")
	private Float tax;
	
	@TableField("desc")
	private String desc;
	/**
	 * 起始金额
	 */
	@TableField("begin")
	private Integer begin;
	/**
	 * 截止金额
	 */
	@TableField("end")
	private Integer end;
	
	@TableField("createtime")
	private Date createTime;

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "PersonalTax [taxId=" + taxId + ", tax=" + tax + ", desc=" + desc + ", begin=" + begin + ", end=" + end
				+ ", createTime=" + createTime + "]";
	}
	
	
}
