<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Event</title>
</head>
<body>
<%
int x=(int)session.getAttribute("clubId");
		 %>
<form action="AddEvent" method="POST">
Enter Event ID :<input type="text" name="Id"><br/>
Enter Event Name :<input type="text" name="name" placeholder="like Andhra Pradesh"><br/>
Enter short name :<input type="text" name="ename" placeholder="like AP"><br/>
Enter Description about Club:<textarea rows="5" cols="30" name="desc" placeholder="give date and place of event."></textarea><br/>
Club Id:<input type="text" name="clubId" value="<%=x%>" readonly="readonly">
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
	<%
int x=(int)session.getAttribute("clubId");
		 %>

		<div class="wrapper">
			<div class="inner">
				<img src="images3/image-1.png" alt="" class="image-1">
				<form action="AddEvent" method="POST">
					<h3>Add Event</h3>
					<div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" name="Id" placeholder="event id">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" name="name" placeholder="event name">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="text" class="form-control" name="ename" placeholder="event short name">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<textarea class="form-control" rows="5" cols="30" name="desc" placeholder="description">
						</textarea>
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="text" name="clubId" value="<%=x%>" readonly="readonly" class="form-control" placeholder="club id">
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