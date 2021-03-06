/**
 * Column.java
 * © MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.feature;

/**
 * @author juacas
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
/**
 * @author juacas Descripción de una columna del modelo de base de datos
 */
public class Column {
	/**
	 *  
	 */
	private String Name;
    private int idColumn;
	private String Description;
	private Domain domain;
	private Table table;
    private int level;
    private int longitud;
  private Attribute attribute;

  public Column ()
  {
     super();    
  }
	
	public Column(String name, String description, Domain domain) {
		super();
		this.Name=name;
		this.Description=description;
		this.domain=domain;
		
	}
	public Column(String name, String description,Table table, Domain domain) {
		super();
		this.Name=name;
		this.Description=description;
		this.domain=domain;
		this.table=table;
		table.addColumn(name,this);
	}
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @return Returns the domain.
	 */
	public Domain getDomain() {
		return domain;
	}
	/**
	 * @param domain The domain to set.
	 */
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return Returns the table.
	 */
	public Table getTable() {
		return table;
	}

  public void setTable(Table table) {
   
		this.table = table;
    this.table.addColumn(this.Name,this);
	}

  public Attribute getAttribute()
  {
    return attribute;
  }

  public void setAttribute(Attribute att)
  {
    attribute = att;
  }

    public int getIdColumn()
    {
        return idColumn;
    }
    
    public void setIdColumn(int idColumn)
    {
        this.idColumn = idColumn;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
  public String toString()
  {
  return getName();
  }

public void setlongitud(int length) {
	  this.longitud = length;	
}
  
public int getlongitud()
{
    return longitud;
}
}
