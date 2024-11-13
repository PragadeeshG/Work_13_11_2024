package com.test1;

public class SrImaInclusionListValueCategory {
	private String srimaInclusionValueCatCode;
	private String srimaInclusionValueCatName;
	private String srimaInclusionValueCatDescription;
	private String srimaInclusionValueCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public SrImaInclusionListValueCategory() {

	}

	public SrImaInclusionListValueCategory(String srimaInclusionValueCatCode, String srimaInclusionValueCatName,
			String srimaInclusionValueCatDescription, String srimaInclusionValueCatDefinition, long authorizerId,
			String owner, String psIds, long serviceNameId, String creationDate, String modifiedDate) {
		super();
		this.srimaInclusionValueCatCode = srimaInclusionValueCatCode;
		this.srimaInclusionValueCatName = srimaInclusionValueCatName;
		this.srimaInclusionValueCatDescription = srimaInclusionValueCatDescription;
		this.srimaInclusionValueCatDefinition = srimaInclusionValueCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getSrimaInclusionValueCatCode() {
		return srimaInclusionValueCatCode;
	}

	public void setSrimaInclusionValueCatCode(String srimaInclusionValueCatCode) {
		this.srimaInclusionValueCatCode = srimaInclusionValueCatCode;
	}

	public String getSrimaInclusionValueCatName() {
		return srimaInclusionValueCatName;
	}

	public void setSrimaInclusionValueCatName(String srimaInclusionValueCatName) {
		this.srimaInclusionValueCatName = srimaInclusionValueCatName;
	}

	public String getSrimaInclusionValueCatDescription() {
		return srimaInclusionValueCatDescription;
	}

	public void setSrimaInclusionValueCatDescription(String srimaInclusionValueCatDescription) {
		this.srimaInclusionValueCatDescription = srimaInclusionValueCatDescription;
	}

	public String getSrimaInclusionValueCatDefinition() {
		return srimaInclusionValueCatDefinition;
	}

	public void setSrimaInclusionValueCatDefinition(String srimaInclusionValueCatDefinition) {
		this.srimaInclusionValueCatDefinition = srimaInclusionValueCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
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

}
