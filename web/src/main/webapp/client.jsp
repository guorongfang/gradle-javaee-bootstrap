<%@ page import="com.mentor.demo.ejb.* , javax.naming.* , java.text.*, java.util.Properties" %>

<%!
  private Hello hel=null;
  public void jspInit()
  {
    try
    {
      Properties p=new Properties();
      p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
      p.put(Context.PROVIDER_URL,"t3://192.168.1.12:7001");
      InitialContext ctx=new InitialContext(p);
      hel=(Hello)ctx.lookup("Hello3#com.mentor.demo.ejb.Hello");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
%>
<%
  String result=null;
  String name=null;
  try 
  {
    name=request.getParameter("name");
    if(name!=null)
      result=hel.hello(name);
  }
  catch(Exception e)
  {
    result="Not Valid";
  }
%>

<html>
<head>
<title>Example of Stateless Session Bean</title>
</head>
<body>
<h1>
Using Stateless Session Bean</h1>
<br><br>
<form action="client.jsp" method="POST">
Enter Your Name : <input type="text" name="name">
<br><br><input type="submit" value="Submit"><br><br>
</form>
<%
if(result!=null)
out.println("<b>"+result+"</b>");
%>
</body>
</html> 