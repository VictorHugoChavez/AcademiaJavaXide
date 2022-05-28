<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Actualizacion de Jugador</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Relacion de los jugadores</h2>
		</div>
	</div>

	<div id="container">
		<h3>Guardar Jugador</h3>
	
		<form:form action="guardarJugador" modelAttribute="jugador" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Nombre</label></td>
						<td><form:input path="nombreDeportista" /></td>
					</tr>
				
					<tr>
						<td><label>Apellido</label></td>
						<td><form:input path="apellidoPaterno" /></td>
					</tr>

					<tr>
						<td><label>Correo:</label></td>
						<td><form:input path="correo" /></td>
					</tr>
					
					<tr>
						<td><label>Edad:</label></td>
						<td><form:input path="edad" /></td>
					</tr>

					<tr>
						<td><label>Profesional:</label></td>
						<td><form:input path="profesional" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/jugador/listas">Regresar a la lista</a>
		</p>
	
	</div>

</body>

</html>










