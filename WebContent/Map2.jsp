<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ page import= " com.isedin.service.db.ConnectionHelper" %>
		<%@ page import= "  java.sql.PreparedStatement" %>
		<%@ page import= " java.sql.Connection" %>
		<%@ page import= " 	java.sql.ResultSet" %>
		<%@ page import= " java.sql.SQLException" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>www.isedin.com</title>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<meta charset="utf-8">
<style>
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}


#map {
	height: 100%;
	width: 500px;
	height: 400px;
}
</style>
<style type="text/css">
div{
    display:inline-block;
    position:relative;
}

button{
 position:absolute;
 top:5px;
 right:10px;
}
 .topcorner{
   position:absolute;
   top:0;
   right:0;
  }
</style>
</head>
<body>
	<div id="map"></div>
	<script>
	 function myFunction() {
   		  document.getElementById('text').style.display = "block";
   	 	document.getElementById('text').readOnly=true;
   	 document.getElementById('button').style.display = "block";
   	  document.getElementById('text').innerHTML = "Hello World";
     }
	 
	 function closeWindow() {
		 document.getElementById('text').style.display = "none";
	   
	   	 document.getElementById('button').style.display = "none";
       }
   
		function initMap() {
			var map = new google.maps.Map(document.getElementById('map'), {
				center : {
					lat : 41.0055005,
					lng : 28.731986
				},
				zoom : 10
			});

			// Try HTML5 geolocation.
			if (navigator.geolocation) {
				navigator.geolocation.getCurrentPosition(function(position) {
					var pos = {
						lat : position.coords.latitude,
						lng : position.coords.longitude
					};

					map.setCenter(pos);
					map.setZoom(18);
					<%-- <%
					
					ConnectionHelper conn= new ConnectionHelper();
					Connection con=conn.getConnection();
					PreparedStatement stmt = null;
					String query = "SELECT * FROM tbladvert WHERE AdId=?";
					ResultSet rs=null;
					try {
						stmt = conn.getStatement(con, query);
						stmt.setInt(1, 2);
						
						rs = conn.getResultSet(stmt);

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					while(rs.next())
					{
						String title=rs.getString("Title");
					
					%> 
					<%-- var contentString = '<div id="content">'+
				      '<div id="siteNotice">'+
				      '</div>'+
				      '<h3 id="firstHeading" class="firstHeading">'+'"<%=title%>"'+'</h3>'+
				      '<div id="bodyContent">'+
				      '<p><b>Uluru</b>, also referred to as <b>Ayers Rock</b>, is a large ' +
				      'sandstone rock formation in the southern part of the '+
				      'Northern Territory, central Australia. It lies 335&#160;km (208&#160;mi) '+
				      'south west of the nearest large town, Alice Springs; 450&#160;km '+
				      '(280&#160;mi) by road. Kata Tjuta and Uluru are the two major '+
				      'features of the Uluru - Kata Tjuta National Park. Uluru is '+
				      'sacred to the Pitjantjatjara and Yankunytjatjara, the '+
				      'Aboriginal people of the area. It has many springs, waterholes, '+
				      'rock caves and ancient paintings. Uluru is listed as a World '+
				      'Heritage Site.</p>'+
				      '<p>Attribution: Uluru, <a href="https://en.wikipedia.org/w/index.php?title=Uluru&oldid=297882194">'+
				      'https://en.wikipedia.org/w/index.php?title=Uluru</a> '+
				      '(last visited June 22, 2009).</p>'+
				      '</div>'+
				      '</div>'; --%>
				
				var contentString = '<div id="content">'+
				
				      '<p id="firstHeading" class="firstHeading" onclick="myFunction()"><u>'+'Nisa'+'</u></p>'+
				      '</div>';
				      	     
				<%-- 	<% }
					%> --%>
				  var infowindow = new google.maps.InfoWindow({
				    content: contentString
				  });


					var marker = new google.maps.Marker({
						position : pos,
						map : map,
						label: 'H',
						title : 'My Location'
					});
					
					marker.addListener('click', function() {
					    infowindow.open(map, marker);
					  });
				}, handleLocationError);
			} else {
				// Browser doesn't support Geolocation
				handleLocationError(error);
			}
		}

		function handleLocationError(error) {
			switch (error.code) {
			case error.PERMISSION_DENIED:
				alert('User denied the request for Geolocation.');
				break;
			case error.POSITION_UNAVAILABLE:
				alert('Location information is unavailable.');
				break;
			case error.TIMEOUT:
				alert('The request to get user location timed out.');
				break;
			case error.UNKNOWN_ERROR:
				alert('An unknown error occurred.');
				break;
			}
		}
	</script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAGhDi7ORrjolFUGwq9-SksQl5D1MZuohI&signed_in=true&callback=initMap"
		async defer>	
	</script>
	<div class="topcorner">
	<button id="button" style=" display:none;" onclick="closeWindow()" >X</button>
	<textarea  style="display:none; overflow: auto;" rows="25" cols="50" id="text"> 
	  </textarea>
				  	
			 
	 </div>
</body>
</html>