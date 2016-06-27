package com.gray.mocker.domain;

import java.util.HashSet;
import java.util.Set;

import com.bricks.lang.BaseDomain;

/**
 * @author bricks <long1795@gmail.com>
 */
public class Project extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private Set<Long> userIds;

	private Set<Module> modules;

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

	public Set<Long> getUserIds() {
		return userIds;
	}

	public void addUserId(final Long userId) {
		if (this.userIds == null) {
			this.userIds = new HashSet<>();
		}
		this.userIds.add(userId);
	}

	public void setUserIds(Set<Long> userIds) {
		this.userIds = userIds;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void addModule(final Module module) {
		if (this.modules == null) {
			this.modules = new HashSet<>();
		}
		this.modules.add(module);
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}
}
