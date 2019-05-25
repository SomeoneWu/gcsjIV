package com.salary.bean;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 员工信息
 * @author a
 *
 */
@TableName("user_info")
public class UserInfo {
	@TableId(value = "user_id" , type = IdType.INPUT)
	private String userId;
	
	@TableField("name")
	private String name;
	
	@TableField("age")
	private Integer age;
	
	@TableField("password")
	private String password;
	
	@TableField("depart_id")
	private Integer departId;
	
	@TableField("job")
	private Integer job;
	
	@TableField("phone")
	private String phone;
	
	@TableField("sex")
	private Integer sex;
	
	@TableField("account")
	private String account;
	
	@TableField("email")
	private String email;
	
	@TableField("status")
	private Integer status;
	
	@TableField("createtime")
	private Date createTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	public Integer getJob() {
		return job;
	}

	public void setJob(Integer job) {
		this.job = job;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", name=" + name + ", age=" + age + ", password=" + password
				+ ", departId=" + departId + ", job=" + job + ", phone=" + phone + ", sex=" + sex + ", account="
				+ account + ", email=" + email + ", status=" + status + ", createTime=" + createTime + "]";
	}
	
	
}
