
<html>

<%@ include file="/configuracion.jsp" %> 

<head> 
	<title>LocalGIS III</title> 
	<link href="<%=rutaEstilos%>/stylesheet.css" rel="stylesheet" type="text/css"> 
	<link rel="shortcut icon" href="<%=rutaImagenes%>/favicon.png">
</head> 

<body>

<div id="all">
	<div id="banner">
		<table border="0">
			<tr>
				<td height="67">
					<img src="<%=rutaImagenes%>/AL_LocalGIS.jpg" height="65" width="295">&nbsp;
				</td>
				<!--
				<td height="67">
					<img src="images/BANNERLOCALGIS.png" height="65" width="195">
				</td>
				-->
				<td>
					<iframe width="300" height="80" marginheight="0" marginwidth="0" frameborder="0" scrolling="no" src="http://sedeaplicaciones2.minetur.gob.es:80/SREPALSLogger/logoServlet?dns=<%=request.getServerName()%>&version=3.0&application=LOCALGIS&width=300&height=80"></iframe>
				</td>
			</tr>
		</table>
	</div>

	<div id="lside"> 
      		<div class="contenido1"> 
        		<table width="800" border="0" align="center" cellpadding="2" cellspacing="0"> 
				<tr>
					<td width="420" height="85" valign="top">
						<p><strong>LocalGIS III.</strong></p>
              				<ul>
                				<li><a href="<%=rutaBase%>/views/manuales.jsp" title="Manuales y documentaci�n LocalGIS">Manuales y documentaci&oacute;n</li>
								<li><a href="<%=rutaBase%>/views/enconstruccion.jsp" title="Tutoriales en video de LocalGIS">Videotutoriales</a></li>
							</ul>
					</td>
					<td width="380" height="85" valign="top">
						<p><strong>Incidencias</strong></p>
						<ul> 
							<li><a href="https://avanzalocal.inteco.es/incidencias/" title="Ir al Gestor de Incidencias Mantis" target="_blank">Gestor de Incidencias</a></li>
						</ul>

					</td>
				</tr>
			<td id="content" valign="top">
                		<ul> 
                			<li><a href="<%=urlLocalgis%>/localgis-apps-configuracion.jnlp" title="Herramienta de Ayuda de Configuraci�n LocalGIS">Herramienta de Ayuda de Configuraci&oacute;n LocalGIS III</a></li>
	               			<li><a href="<%=urlLocalgis%>/localgis-apps-centralizadorsso.jnlp" title="LocalGISIII Centralizador.">LocalGISIII Centralizador.</a></li>					
	               			<li><a href="<%=urlLocalgis%>/localgis-apps-editor.jnlp" title="LocalGIS III Editor">LocalGIS Editor.</a></li>					
							<li><a href="/localgis-guiaurbana/" title="Pulse para ir a la Gu�aUrbana (Ventana de LocalGIS al exterior)">Gu&iacute;a Urbana (P&uacute;blica)</a></li>
							<li><a href="/a21l-web/" title="Pulse para ir a la Agenda Local 21">Agenda Local 21</a></li>
                		</ul>
						<ul>
							<p><strong>Aplicaciones Individuales Disponibles</strong></p>
	               			<li><a href="<%=urlLocalgis%>/localgis-apps-eiel.jnlp" title="LocalGIS III EIEL">LocalGIS III EIEL.</a></li>					
						</ul>
						<ul>
                			<li><a href="<%=rutaBase%>/config/LCGIII.reg" title="Configurador LOCALGIS">Configurador Autom�tico de LocalGIS III</a></li>
						</ul>
			<br />
			  <p><strong>Utilidades</strong></p>
			<br />
                		<ul>
							<li><a href="http://java.com/es/download/installed.jsp?detect=jre&try=1" title="Verificar e Instalar, si es necesario, Java" target="_blank">Verificar/Instalar Java</a></li> 
							<li><a href="http://www.idee.es/web/guest/directorio-de-servicios" title="Lista de Servicios Web de Mapas (WMS)" target="_blank">Cat&aacute;logo de WMS del IDEE</a></li>
							<li><a href="<%=urlLocalgisLib%>/localgis-apps-movilidad-cab.zip" title="Aplicaci�n Movilidad LocalGIS III.">Aplicaci&oacute;n Movilidad LocalGIS III</a></li>
							<li><a href="<%=urlLocalgisLib%>/localgis-apps-movilidad-tablet.zip" title="Aplicaci�e Movilidad LocalGIS III">Aplicaci&oacute;n Movilidad LocalGIS III para Tablet</a></li>	
							<li><a href="<%=urlLocalgisLib%>/localgis-apps-movilidad-configuradorPDA.zip" title="Configurador Aplicaci�e Movilidad LocalGIS III">Configurador Aplicaci&oacute;n Movilidad LocalGIS III.</a></li>
							<li><a href="<%=rutaDescargas%>/LOCALGIS_MicroStation.zip">MicroStation LocalGIS III</a></li>
							<li><a href="<%=rutaDescargas%>/LOCALGIS_AutoCAD.zip">AutoCAD LocalGIS III.</a></li>
							
							<li><a href="./localgis3.zip">Base de datos Instalador LocalGIS 3 formato ZIP</a></li>
                            <li><a href="./localgis3.sql.gz">Base de datos Instalador LocalGIS 3 formato.gz</a></li>
							<li><a href="./postgresql-8.0-318.jdbc3.jar">Driver base de datos postgresql</a></li>
							<li><a href="./mapserver_x64.tgz">Mapserver para Linux</a></li>
							<li><a href="./mapserver_w32.zip">Mapserver para windows</a></li>
							<li><a href="./localgis-apps-import-inicial-3.0.zip">Importador de capas de la EIEL</a></li>
						</ul>
			<br />
			  <p><strong>Integraciones</strong></p>
			<br />
				<ul>
					<p><strong>Ejemplo de integraci�n con AL SIGM</strong></p>
					<li>
						<a href="/localgis-geowfst/features/showFeatureMap.do?idFeature=EXP2013/000002&procedureName=VADO&idEntidad=000" title="Enlace SiGM">Enlace de ejemplo del M�dulo de Integraci�n con SiGM</a>
					</li>
                </ul>  
			<br />
			  <p><strong>Contacto</strong></p>
			<br />
				<ul>
					<table width="320" border="0" align="left">
							<tr>
							<td width="50">
								<li>Tfno.:</li> 
							</td>
							<td width="220">
								91.709.90.00
							</td>
						</tr>
						<tr>
							<td>
								<li>E-mail:</li> 
							</td>
							<td>
								<a href="mailto:modelo@asturias.org" title="E-mail del proyecto">localgis@satec.es</a>
							</td>
						</tr>
						<tr>
							<td>
								&nbsp;
							</td>
							<td>
								<a href="mailto:eiel@asturias.org" title="E-mail del proyecto">localgis@satec.es</a>
							</td>
						</tr>
					</table>

                		</ul>  
			</td>

			<td width="400" valign="top" id="content">

                	  <p><strong>De inter&eacute;s</strong></p> 
                		<ul>				
					<!--li><a href="http://www.facebook.com/pages/Proyecto-de-MOdernizaci%C3%B3n-y-DEsarrollo-LOcal-MODELO/186885301321994?sk=wall" title="Facebook del Proyecto MO.DE.LO." target="_blank">Facebook del Proyecto MO.DE.LO.</a></li> 
					<li><a href="http://itgobiernolocal.es/modelo/index.php" title="Foro del Proyecto MO.DE.LO." target="_blank">Foro del Proyecto MO.DE.LO.</a></li> 
					<li><a href="http://www.linkedin.com/groups/Proyecto-MOdernizaci%C3%B3n-DEsarrollo-LOcal-MODELO-4039129?trk=myg_ugrp_ovr" title="Linkedin del Proyecto MO.DE.LO." target="_blank">Linkedin del Proyecto MO.DE.LO.</a></li> 
                		</ul-->	<br /><br /><br /><br />
					
					<!--
					<object width="320" height="240" id="Object1" type="application/x-shockwave-flash" data="video/player_flv_maxi.swf">
					<param name="movie" value="video/player_flv_maxi.swf" />
					<param name="allowFullScreen" value="true" />
					<param name="wmode" value="opaque" />
					<param name="allowScriptAccess" value="sameDomain" />
					<param name="quality" value="high" />
					<param name="menu" value="true" />
					<param name="autoplay" value="false" />
					<param name="autoload" value="true" />
					<param name="FlashVars" value="configxml=video/modelo.xml" />
					</object>
					-->
					
<!--					  <p><strong>Entorno de INTEGRACI�</strong></p>
                		<ul> 
                			<li><a href="download/MODELOIntegracion.zip" title="Descomprimir y ejecutar">Configuraci�a></li>					
							<li><a href="http://integmodelo.asturias.es:8080/localgis-guiaurbana/" title="Pulse para ir a la Gu�aUrbana (Ventana de LocalGIS al exterior)">Gu�aUrbana (P�a)</a></li>
                		</ul>-->

            		</td> 
         	</tr> 
        </table> 

	<div id="end"> 

        	<div id="valid"> 
			&copy;2007 <a href="http://www.geopista.com">LocalGIS</a>
		</div> 
	</div> 
     </div>  
   </div> 
</div> 
</body> 
</html>
