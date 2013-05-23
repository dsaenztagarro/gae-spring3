package com.davlanca.pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserGroup {

	private Long groupId;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userGroupId;
	private Long userId;
	
	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * @return the userGroupId
	 */
	public Long getUserGroupId() {
		return userGroupId;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * @param userGroupId the userGroupId to set
	 */
	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}


}