package com.gray.mocker.domain;

import java.util.HashSet;
import java.util.Set;

import com.bricks.lang.BaseDomain;
import com.gray.mocker.domain.enums.Protocol;

/**
 * @author bricks <long1795@gmail.com>
 */
public class Action extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private Page page;

	private Protocol protocol;

	private String url;

	private Set<Parameter> requestParameters;

	private boolean responseArray = false;

	private Set<Parameter> responseParameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<Parameter> getRequestParameters() {
		return requestParameters;
	}

	public void addRequestParameter(final Parameter parameter) {
		if (this.requestParameters == null) {
			this.requestParameters = new HashSet<>();
		}
		this.requestParameters.add(parameter);
	}

	public void setRequestParameters(Set<Parameter> requestParameters) {
		this.requestParameters = requestParameters;
	}

	public boolean isResponseArray() {
		return responseArray;
	}

	public void setResponseArray(boolean responseArray) {
		this.responseArray = responseArray;
	}

	public Set<Parameter> getResponseParameters() {
		return responseParameters;
	}

	public void addResponseParameter(final Parameter parameter) {
		if (this.responseParameters == null) {
			this.responseParameters = new HashSet<>();
		}
		this.responseParameters.add(parameter);
	}

	public void setResponseParameters(Set<Parameter> responseParameters) {
		this.responseParameters = responseParameters;
	}
}
