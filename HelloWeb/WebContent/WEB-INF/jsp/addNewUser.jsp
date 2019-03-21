<%@ page contentType = "text/html; charset = UTF-8" %>
<html>
   <head>
      <title>Hello World</title>
   </head>
   <body>
      <h2>${message}</h2>
      <form action="saveUser" method="POST" modelAttribute="user">
			<table style="with: 50%">
				<tr>
					<td>UserID</td>
					<td><input type="text" name="ID" /></td>
				</tr>
					<tr>
					<td>Name</td>
					<td><input type="text" name="NAME" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="ADDRESS" /></td>
				</tr>
			<input type="submit" value="Submit" /></form>
   </body>
</html>