<%@taglib prefix="one" uri="/WEB-INF/tlds/SubstrDescriptor.tld"%>

<html>
<head>
<title>JSP Custom Taglib example: Substr function</title>
</head>

<body>
	SUBSTR(GOODMORNING, 1, 6) is
	
	<%="GOODMORNING".substring(1,6) %>
	
	<font color="blue">
	<one:substring input="GOODMORNING"	start="1" end="6" />
	</font>
</body>
</html>