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
		<article>
		<section>
			<form action="search" method="post">
			<fieldset>
				<legend>Suchen</legend>
				<table>
					<tbody>
					<tr>
						<th>
							<label for="title">Suche:</label>
						</th>
						<td>
							<input
							type="text"
							name="search"
							size="40"
							maxlength="40"
							title="Suchtext"
							placeholder="Suchtext eingeben">
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
		</section>
		</article>
			
			<footer>
				Copyright
			</footer>
	</body>
</html>