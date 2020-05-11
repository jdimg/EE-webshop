<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="resources/css/styles.css">
		<link rel="shortcut icon" href="resources/img/favicon.ico" type="image/x-icon">
		<title>Onlineshop</title>
	</head>
	<body>
		<header>
			<hgroup>
			<h1 class="title">Onlineshop</h1>
			</hgroup>
			<nav>
				<a href="index.jsp">Home</a>
				<a href="register.jsp">Registrieren</a>
				<a href="singin.jsp">Einloggen</a>
				<a href="sell.jsp">Verkaufen</a>
				<a href="search.jsp">Suchen</a>
			</nav>
		</header>
		
		<form action="singin" method="post">
		<fieldset>
		<legend>Einloggen</legend>
		<table>
			<tbody>
				<tr>
					<th>
						<label for="email">E-Mail:</label>
					</th>
					<td>
						<input
							type="email"
							name="email"
							size="40"
							maxlength="40"
							title="muster@beispiel.de"
							placeholder="E-Mail eingeben"
							pattern=".{6,40}"
							required="required">
					</td>
				</tr>
				<tr>
					<th>
						<label for="password">Password:</label>
					</th>
					<td>
						<input 
							type="password"
							name="password"
							size="10"
							maxlength="10"
							title="6-10 Zeichen"
							placeholder="Passwort eingeben"
							pattern=".{6,10}"
							required="required">
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit">
						<input type="reset">
					</td>
				</tr>
			</tbody>
		</table>
		</fieldset>
		</form>

	<footer>
		Copyright
	</footer>
	</body>
</html>