<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Lista Jugadores</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Realacion de los jugadores</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Agregar Jugador"
				   onclick="window.location.href='mostrarFormulario'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Nombre</th>
					<th>Apellido Paterno</th>
					<th>Correo</th>
					<th>Edad</th>
					<th>Profesional</th>
					<th>Accion</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="infoJugador" items="${jugadores}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/jugador/actualizarJugador">
						<c:param name="jugadorId" value="${infoJugador.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/jugador/eliminar">
						<c:param name="jugadorId" value="${infoJugador.id}" />
					</c:url>					
					
					<tr>
						<td> ${infoJugador.nombreDeportista} </td>
						<td> ${infoJugador.apellidoPaterno} </td>
						<td> ${infoJugador.correo} </td>
						<td> ${infoJugador.edad} </td>
						<td> ${infoJugador.profesional} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Actualizar</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Esta seguro que desea eliminar el jugador?'))) return false">Borrar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









