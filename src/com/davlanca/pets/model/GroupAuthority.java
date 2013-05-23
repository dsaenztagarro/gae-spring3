package com.davlanca.pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupAuthority {

	private Long authorityId;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long groupAuthorityId;
	private Long groupId;
	/**
	 * @return the authorityId
	 */
	public Long getAuthorityId() {
		return authorityId;
	}
	/**
	 * @return the groupAuthorityId
	 */
	public Long getGroupAuthorityId() {
		return groupAuthorityId;
	}
	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * @param authorityId the authorityId to set
	 */
	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}
	/**
	 * @param groupAuthorityId the groupAuthorityId to set
	 */
	public void setGroupAuthorityId(Long groupAuthorityId) {
		this.groupAuthorityId = groupAuthorityId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

}