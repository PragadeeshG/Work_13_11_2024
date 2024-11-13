package com.test1;

public class SrImaInclusionListValueScreen {
	private Integer recordId;
	private Integer srimaInclusionValScreenId;
	private String srimaInclusionValScreenName;
	private String srimaInclusionValScreenUrl;
	private String srimaInclusionValPageUrl;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SrImaInclusionListValueScreen() {

	}

	public SrImaInclusionListValueScreen(Integer recordId, Integer srimaInclusionValScreenId,
			String srimaInclusionValScreenName, String srimaInclusionValScreenUrl, String srimaInclusionValPageUrl,
			String actionIds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.recordId = recordId;
		this.srimaInclusionValScreenId = srimaInclusionValScreenId;
		this.srimaInclusionValScreenName = srimaInclusionValScreenName;
		this.srimaInclusionValScreenUrl = srimaInclusionValScreenUrl;
		this.srimaInclusionValPageUrl = srimaInclusionValPageUrl;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getSrimaInclusionValScreenId() {
		return srimaInclusionValScreenId;
	}

	public void setSrimaInclusionValScreenId(Integer srimaInclusionValScreenId) {
		this.srimaInclusionValScreenId = srimaInclusionValScreenId;
	}

	public String getSrimaInclusionValScreenName() {
		return srimaInclusionValScreenName;
	}

	public void setSrimaInclusionValScreenName(String srimaInclusionValScreenName) {
		this.srimaInclusionValScreenName = srimaInclusionValScreenName;
	}

	public String getSrimaInclusionValScreenUrl() {
		return srimaInclusionValScreenUrl;
	}

	public void setSrimaInclusionValScreenUrl(String srimaInclusionValScreenUrl) {
		this.srimaInclusionValScreenUrl = srimaInclusionValScreenUrl;
	}

	public String getSrimaInclusionValPageUrl() {
		return srimaInclusionValPageUrl;
	}

	public void setSrimaInclusionValPageUrl(String srimaInclusionValPageUrl) {
		this.srimaInclusionValPageUrl = srimaInclusionValPageUrl;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
