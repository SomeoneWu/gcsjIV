package com.salary.bean;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 部门信息
 * @author a
 *
 */
@TableName("depart_info")
public class DepartInfo {
	@TableId(value = "depart_id" , type = IdType.INPUT)
	private Integer departId ;
	
	@TableField("depart_name")
	private String departName;
	
	@TableField("depart_desc")
	private String departDesc;
	
	@TableField("createtime")
	private Date createTime;

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartDesc() {
		return departDesc;
	}

	public void setDepartDesc(String departDesc) {
		this.departDesc = departDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "DepartInfo [departId=" + departId + ", departName=" + departName + ", departDesc=" + departDesc
				+ ", createTime=" + createTime + "]";
	}
	
	
}
