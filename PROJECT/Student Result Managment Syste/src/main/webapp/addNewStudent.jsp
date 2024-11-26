<%@page import="Project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String course=request.getParameter("course");
String semister=request.getParameter("semister");
String rollNo=request.getParameter("rollNo");
String name=request.getParameter("name");
String fatherName=request.getParameter("fatherName");
String gender=request.getParameter("gender");

try 
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	st.executeUpdate("insert into student values('"+course+"','"+semister+"','"+rollNo+"','"+name+"','"+fatherName+"','"+gender+"')");
	response.sendRedirect("adminHome.jsp");
}
catch(Exception e)
{
	System.out.println(e);
}
%>