<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 " />
<meta http-equiv="Content-Language" content="TR"/>	
<title>Add Advertisement</title>
</head>
<body>

	<%=request.getRemoteUser()%> 
		<form method="POST" action="addadvert">
			
			Duyuru Basligi :  <input type="text" name ="title" style="width: 100px;" ><br>
			Firma Adı :  <input type="text" name ="companyname" style="width: 100px;" ><br>
			Ulke/Sehir :<input type="text" name ="country" style="width: 100px;" ><br>
			Posting Date :<input type="date" name ="postingdate" style="width: 100px;" ><br>
			Updated Date : <input type="date" name ="updateddate" style="width: 100px;" ><br>
			Ä°lan KapanÄ±Å Tarihi :<input type="date" name ="lastapplydate" style="width: 100px;" ><br>
			Personel Sayisi:  <input type="text" name ="numberofpersonnel" style="width: 100px;" ><br>
			Sektör:  <input type="text" name ="sector" style="width: 100px;" ><br>
			Pozisyon Tanımı:  <input type="text" name ="positiontype" style="width: 100px;" ><br>
			İş Tanımı:  <input type="text" name ="description" style="width: 100px;" ><br>
			Genel Nitelikler  <input type="text" name ="qualifications" style="width: 100px;" ><br>
			Departman:  <input type="text" name ="jobfield" style="width: 100px;" ><br>
			Pozisyon Seviyesi:  <input type="text" name ="positionlevel" style="width: 100px;" ><br>
			Tecrübe :  <input type="text" name ="experience" style="width: 100px;" ><br>
			Eğitim Seviyesi:  <input type="text" name ="educationallevel" style="width: 100px;" ><br>
			Askerlik durumu :  <input type="text" name ="militaryservice" style="width: 100px;" ><br>
				<input type="submit" style="width: 100px;" value="Add"/>	
		</form>
	
</body>
</html>