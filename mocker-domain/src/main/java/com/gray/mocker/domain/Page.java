package com.gray.mocker.domain;

import java.util.HashSet;
import java.util.Set;

import com.bricks.lang.BaseDomain;

/**
 * @author bricks <long1795@gmail.com>
 */
public class Page extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private Module module;

	private Set<Action> actions;

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

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public void addAction(final Action action) {
		if (this.actions == null) {
			this.actions = new HashSet<>();
		}
		this.actions.add(action);
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}
}
