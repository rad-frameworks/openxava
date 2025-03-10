package org.openxava.test.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.model.*;
import org.openxava.test.actions.*;
import org.openxava.test.annotations.*;

/**
 * 
 * @author Javier Paniza 
 */

@Entity
@View(name="ConfirmName", members="artistStudio; name; age; level")
@View(name="WithGroupAndSection", members="name; age [ age ]; level { level }")
@View(name="SomeMembersReadOnly", extendsView="WithGroupAndSection")
@Tab(defaultOrder="${name}") 
public class Artist extends Identifiable {
	
	@ManyToOne
	private Studio artistStudio; // Not the same name of parent entity, to test a case
	
	@Column(length=40) @Required
	@OnChange(forViews="ConfirmName", value=OnChangeArtistNameAction.class)
	@Colorful(color = "green") 
	private String name;
	
	@Max(90l)
	@ReadOnly(forViews="SomeMembersReadOnly")
	private Integer age;
	
	@DescriptionsList(descriptionProperties = "id, description")
	@ManyToOne(fetch = FetchType.LAZY)
	@ReadOnly(forViews="SomeMembersReadOnly") 
	private ActingLevel level; 
		
	public Studio getArtistStudio() {
		return artistStudio;
	}

	public void setArtistStudio(Studio artistStudio) {
		this.artistStudio = artistStudio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Colorful(color = "pink") // In the getter, to test a case 
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public ActingLevel getLevel() {
		return level;
	}

	public void setLevel(ActingLevel level) {
		this.level = level;
	}

}
