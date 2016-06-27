package com.gray.mocker.domain;

import java.util.HashSet;
import java.util.Set;

import com.bricks.lang.BaseDomain;
import com.gray.mocker.domain.enums.DataType;

/**
 * @author bricks <long1795@gmail.com>
 */
public class Parameter extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private String memo;

	private String validatePattern;

	private Action action;

	private DataType dataType;

	private Set<Parameter> parameters;

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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getValidatePattern() {
		return validatePattern;
	}

	public void setValidatePattern(String validatePattern) {
		this.validatePattern = validatePattern;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public Set<Parameter> getParameters() {
		return parameters;
	}

	public void addParameter(final Parameter parameter) {
		if (this.parameters == null) {
			this.parameters = new HashSet<>();
		}
		this.parameters.add(parameter);
	}

	public void setParameters(Set<Parameter> parameters) {
		this.parameters = parameters;
	}
}
