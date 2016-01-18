/**
 * V_nucleo_poblacion_bean.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.server.database.validacion.beans;


public class V_nucleo_poblacion_bean {

	   String provincia="-";
	   String municipio="-";
	   String entidad="-";
	   String poblamient="-";
	   String denominaci="-";
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getPoblamient() {
		return poblamient;
	}
	public void setPoblamient(String poblamient) {
		this.poblamient = poblamient;
	}
	public String getDenominaci() {
		return denominaci;
	}
	public void setDenominaci(String denominaci) {
		this.denominaci = denominaci;
	}
	 
	
}
