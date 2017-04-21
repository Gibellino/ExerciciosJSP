<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Race</title>
</head>
<body>

	<div class="container">
		<h1>Tempos de Corrida</h1>
		
		<form action="PolePosition" method="post" class="form">
			<input type="number" placeholder="Corredor 1" name="c1"/>
			<input type="number" placeholder="Corredor 2" name="c2"/>
			<input type="number" placeholder="Corredor 3" name="c3"/>
			
			<input type="submit" value="Enviar" class="btn-primary">
			
		</form>
		
	</div>

</body>
</html>