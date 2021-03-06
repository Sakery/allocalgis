/**
 * PrintSectionPlugin.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.ui.reports.scale;

import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;

public class PrintSectionPlugin extends AbstractPlugIn {
	
	public boolean execute(PlugInContext context) throws Exception {
		//reportNothingToUndoYet(context);
		//PrintSectionRenderer.setEnabled(true, context.getLayerViewPanel());
		context.getLayerViewPanel().getRenderingManager().render(PrintSectionRenderer.CONTENT_ID);

		return true;
	}
	
}
