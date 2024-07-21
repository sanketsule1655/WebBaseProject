package org.techhub.model;

public class CategoryModel {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
	public int hashCode()
	{
		return id*10000;
	}
	public boolean equals(Object obj)
	{
		CategoryModel model=(CategoryModel)obj;
		if(this.name.equals(model.getName()) && this.id==model.getId())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
