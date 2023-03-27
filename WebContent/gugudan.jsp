<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

for(int i = 2; i < 10; i++) {
	
	out.println("<hr>"+ i + "단"+ "<hr><br/>");
	for (int j = 1; j < 10; j++){
		
		out.println (i + "x" + j + "=" + i * j +"<br/>");
		
	}
}
	
	%>



	<%! // %!는 선언문 
	int i = 10;
	String str = "abc";
	
	private int sum (int a, int b) {
		return a + b; 
	}
	%>

	<%out.println ("<hr>");%>

<!-- // = 는 표현식  -->
	<%= i %>  
	<br />
	<%= str %>
	<br />
	<%= sum (1,5) %>


<!-- // 내장객체 : 우리가 new 안해도 써먹을 수 있는 객체 -->

</body>
</html>