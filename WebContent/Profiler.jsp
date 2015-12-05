<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import=" java.io.File" %>
  <%@ page import= "java.io.FileReader" %>
<%@ page import= "java.io.BufferedReader" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Özgeçmiş</title>
</head>
<body>


<%
String read = application.getRealPath("/") + "profiler.txt";

File file = new File(read);

 FileReader fr = new FileReader(file);
 //Creates a BufferedReader Object
 BufferedReader br = new BufferedReader(fr);
 String[] lines=new String[50];
 int i=0;
 String line = "";
 while ((line = br.readLine()) != null) { 
 lines[i]=line;
 i++;
 }
 br.close();
	 %>
	 
	 
	 

<h4>Kimlik Bilgileri</h4>




İsim: <%=lines[0]%><br/>
Soyisim:<%=lines[1]%><br/>
Eposta: <%=lines[2]%><br/>
CepTelefonu: <%=lines[3]%><br/>
Adres :<%=lines[5]%><br/>




<h4>EĞİTİM</h4>
EgitimDurumu: <%=lines[6]%><br/>

<h5>  &nbsp;&nbsp;&nbsp;   Yıl &nbsp;&nbsp;&nbsp;  Okul  </h5>
<ul>

<%

String read4 = application.getRealPath("/") + "deneyim.txt";
File file4 = new File(read4);

 FileReader fr4 = new FileReader(file4);
 //Creates a BufferedReader Object
 BufferedReader br4 = new BufferedReader(fr4);


 while ((line = br4.readLine()) != null) { 
	
	%> 

	<li><%=line %></li>

	
 <%
 }
 br4.close();
 %>
</ul>


YabancıDil : <%=lines[7]%><br/>



<h4>DENEYİM</h4>


<%

String read2 = application.getRealPath("/") + "deneyim.txt";
File file2 = new File(read2);

 FileReader fr2 = new FileReader(file2);
 //Creates a BufferedReader Object
 BufferedReader br2 = new BufferedReader(fr2);


 while ((line = br2.readLine()) != null) { 
	
	%> 

	<ul><li><%=line %></li></ul>

	
 <%
 }
 br2.close();
 %>
 
 <br/>
 
 
 Beceriler: <%=lines[8]%><br/>
 Sertifikalar :<%=lines[9]%><br/>
 Hobiler :  <%=lines[10]%><br/>
 

 <h4>PROJELER</h4>
 
 <table>
 <tr>
 <td>Proje Adı</td>
 <td>Proje Tanımı</td>
 <td>Proje Detayı</td>
 </tr>
 <tr>
 
 
 <%

String read3 = application.getRealPath("/") + "projeler.txt";
File file3 = new File(read3);

 FileReader fr3 = new FileReader(file3);
 //Creates a BufferedReader Object
 BufferedReader br3 = new BufferedReader(fr3);


 while ((line = br3.readLine()) != null) { 
	 	
	%> 
	
<td><%=line %></td>


  <%
 }
 br3.close();
 %>
 </tr>
 </table>
 
</body>
</html>