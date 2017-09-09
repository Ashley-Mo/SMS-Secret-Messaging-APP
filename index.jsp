<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SECRET MESSAGING SERVICES (SMS)</title>

<script type="text/javascript">

</script>
</head>


<body bgcolor="yellow" >

	<h1> <b>SECRET MESSAGES</b></h1>
	<h2> Start sending your secret messages now!!!  </h2><br>
	<h3>Enter the message to be coded and choose for a number key. You can find the new message loaded in the box below. Forward this web address to your friend and they can decode your message by using the Secret Key!</h3>
	<h4> Enter your text message and enter the key to find the coded message</h4>


<form id="myform" name="form" Action="MyServlet" method="GET">

	<b>Message:</b><br> <input  name="message" id="myText"    value= <%=request.getAttribute("message")%> ><br>

	<b>Key:</b><br> <input  type="int" name ="key" value= <%=request.getAttribute("key")%> ><br>

 <b>Please enter a number key between-26 and 26</b><br>
 
<INPUT TYPE="Submit" Value="Submit" ><br>


Encoded message:<br> 
<input type ="text" name="encode" id="demo1"  value= <%=request.getAttribute("encode")%> /><br>

</form>


<div>OMG </div>


 
</body>
</html>