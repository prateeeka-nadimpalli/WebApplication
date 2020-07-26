<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList,com.ts.dto.Club"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>clubs</title>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

   <title>SVECW Clubs</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="data:image/png;base64,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" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/line-awesome/css/line-awesome.min.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
<main id="main">
    <section id="services" class="services">
      <div class="container">

        <div class="section-title" data-aos="zoom-out">
          <h2></h2>
          <p>Clubs</p>
        </div>
		<c:forEach var="club" items="${clubsData}">
			
			<div class = "card-horizontal"></div>
            <div class="icon-box" data-aos="zoom-in-left" data-aos-delay="100">
              <h4 class="title"><a href='DisplayAllEvent?clubId=${club.clubid}'>${club.clubname}</a></h4>
              <p>${club.description}</p>
             <a href='DeleteClub?clubid=${club.clubid}' <button type="button" class="btn btn-outline-danger" style="float:right">Delete</button>></a>
           
          </div><br>
		</c:forEach>
		</div>
    </section><!-- End Services Section -->
		  <a href="#" class="back-to-top"><i class="ri-arrow-up-line"></i></a>
  <!-- Vendor JS Files -->
  <script src="assets/vendor/jquery/jquery.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/venobox/venobox.min.js"></script>
  <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>
</body>
</html>