<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddClub" method="POST">
Enter Club ID :<input type="text" name="Id"><br/>
Enter Club Name :<input type="text" name="name" placeholder="like Andhra Pradesh"><br/>
Enter email :<input type="text" name="email"><br/>
Enter password :<input type="text" name="pwd"><br/>
Enter short name :<input type="text" name="cname" placeholder="like AP"><br/>
Enter Description about Club:<textarea rows="5" cols="30" name="desc"></textarea><br/>
<input type="submit" value="Add">
</form>
</body>
</html>--%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add club</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="fonts3/linearicons/style.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="css3/style.css">
	</head>

	<body>

		<div class="wrapper">
			<div class="inner">
				<img src="images3/image-1.png" alt="" class="image-1">
				<form action="AddClub" method="POST">
					<h3>Add club</h3>
					<div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" name="Id" placeholder="club id">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" name="name" placeholder="club number">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-envelope"></span>
						<input type="text" class="form-control" name="email" placeholder="Mail">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" name="pwd" placeholder="Password">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="text" class="form-control" name="cname" placeholder="cname">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<textarea class="form-control" rows="5" cols="30" name="desc" placeholder="description">
						</textarea>
					</div>
					<button type="submit" >
						Add
					</button>
				</form>
				<img src="images3/image-2.png" alt="" class="image-2">
			</div>
			
		</div>
		
		<script src="js3/jquery-3.3.1.min.js"></script>
		<script src="js3/main.js"></script>
	</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>