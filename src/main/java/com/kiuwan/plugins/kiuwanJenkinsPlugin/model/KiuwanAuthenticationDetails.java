package com.kiuwan.plugins.kiuwanJenkinsPlugin.model;

public enum KiuwanAuthenticationDetails implements KiuwanModelObject {
	// "false" and "true" values for password and token options
	// must be kept to keep backwards compatibility

	PASSWORD("Kiuwan username/password authentication", "true"), 
	TOKEN("Kiuwan username/token authentication", "false");

	private String displayName;
	private String value;

	private KiuwanAuthenticationDetails(String displayName, String value) {
		this.displayName = displayName;
		this.value = value;
	}

	public static KiuwanAuthenticationDetails valueFrom(String value) {
		KiuwanAuthenticationDetails matchingKiuwanAuthenticationDetails = null;
		for (KiuwanAuthenticationDetails authenticationDetails : KiuwanAuthenticationDetails.values()) {
			if (authenticationDetails.getValue().equals(value)) {
				matchingKiuwanAuthenticationDetails = authenticationDetails;
				break;
			}
		}
		return matchingKiuwanAuthenticationDetails;
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}

	@Override
	public String getValue() {
		return value;
	}

}
