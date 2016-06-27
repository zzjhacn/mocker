package com.gray.mocker.domain;

import java.util.HashSet;
import java.util.Set;

import com.bricks.lang.BaseDomain;

/**
 * @author bricks <long1795@gmail.com>
 */
public class Module extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private Project project;

	private Set<Page> pages;

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Set<Page> getPages() {
		return pages;
	}

	public void addPage(final Page page) {
		if (this.pages == null) {
			this.pages = new HashSet<>();
		}
		this.pages.add(page);
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}
}
