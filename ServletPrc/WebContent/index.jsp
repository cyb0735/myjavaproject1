<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="Login.Person"></jsp:useBean>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page import="java.util.*" %>
<html>
<head>
	<title>login</title>
	<script type="text/javascript">
		function toMyServletContextAttributeListenerPage(){
			location.href='/ServletPrc/MyServletContextAttributeListener.jsp';
		}
	</script>
</head>
<body>
	on-line user account: ${applicationScope.userNumber}<br>
	<!--  -->
	
	<input type="button" value="toMyServletContextAttributeListenerPage" onclick="toMyServletContextAttributeListenerPage()"/>
	
	<form action="/ServletPrc/Login00">
	user name:<input type="text" name="user" /><br/><br/>
	password :<input type="password" name="pass"/><br/><br/>
	<input type="submit" value="LOGIN">
	</form>
	<!-- use out tag to print out static value -->
	<c:out value="this is our first JSTL/servlet demo"></c:out><br>
	<%session.setAttribute("name1","li4"); %>
	<c:out value="${name1}"></c:out><br>
	<c:out value = "${user.name}" default="defultvalue"></c:out><br>
	<c:out value = "${1+2}"></c:out><br>
	<%String username = ""; request.setAttribute("username",username); %>
	<c:out value = "${empty username}"></c:out><br>
	<c:out value="&lt标签666&gt" escapeXml="false"></c:out><br><br>
	
	
	<!-- 存值到scope中 -->
	<c:set value="taday" var="day" scope="session"></c:set>
	<c:out value="${day}"></c:out>
	
	<c:set var="age" scope="application">eleven</c:set><br>
	<c:out value="${age}"></c:out><br>
	
	<!-- 通过set标签向person中赋值 -->
	<c:set target="${person}" property="name2" value="zsan"></c:set>
	<c:out value="${person.name2}"></c:out>&nbsp;&nbsp;
	<c:set target="${person}" property="age2" value="26"></c:set>
	<c:out value="${person.age2}"></c:out>&nbsp;&nbsp;
	<c:set target="${person}" property="address" value="beijin"></c:set>
	<c:out value="${person.address}"></c:out><br>
	
	<!-- remove 标签的用法 -->
	<c:set var="lastName" value="Lily"></c:set>
	<c:out value="${lastName}"></c:out>
	<c:set var="firstName" value="Wang"></c:set>
	<c:remove var="firstName"/>
	<c:out value="${firstName}"></c:out><br>
	
	<!--  catch tags -->
	<c:catch var="error">
		<c:set target="aa" property="bb"></c:set>
	</c:catch>
	<c:out value="${error}"></c:out><br>
	
	<!--  if tags流程控制 -->
	<form action="index.jsp" method="post">
		<input type="text" name="score" value="${param.score}"/>
		<input type="submit" value="提交查询内容"/>
	</form>
	<!--  
	
	<c:if test="${param.score>=90}" var="result" scope="application">
		<c:out value="优秀"></c:out>
	</c:if>
	<c:out value="${applicationScope.result}"></c:out><br>
	-->
	
	
	<!-- choose ,when , otherwise -->
	<c:choose>
		<c:when test="${param.score>=90 && param.score<=100}">
			<c:out value="优秀"></c:out>
		</c:when>
		
		<c:when test="${param.score>=80 && param.score<90}">
			<c:out value="良好"></c:out>
		</c:when>
		
		<c:when test="${param.score>=70 && param.score<80}">
			<c:out value="中等"></c:out>
		</c:when>
		
		<c:when test="${param.score>=60 && param.score<70}">
			<c:out value="及格"></c:out>
		</c:when>
		
		<c:when test="${param.score<60 && param.score>0}">
			<c:out value="不及格"></c:out>
		</c:when>
		
		<c:otherwise>
			<c:out value="输入错误"></c:out>
		</c:otherwise>
	</c:choose><br>
	
	
	<%
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pear");
		fruits.add("watermelon");
		fruits.add("banana");
		fruits.add("grape");
		request.setAttribute("fruits",fruits);
	%>
	<!-- forEach tags -->
	<!-- 全部遍历 -->
	<c:forEach var="fruit" items="${fruits}">
		<c:out value="${fruit}"></c:out><br>
		
	</c:forEach>
	<c:out value="========================="></c:out><br>
	<!-- 部分遍历 -->
	<c:forEach var="fruit" items="${fruits}" begin="1" end="4">
		<c:out value="${fruit}"></c:out><br>
	</c:forEach>
	<c:out value="========================="></c:out><br>
	<!-- 部分遍历 指定步长 -->
	<c:forEach var="fruit" items="${fruits}" begin="1" end="4" step="2">
		<c:out value="${fruit}"></c:out><br>
	</c:forEach>
	<c:out value="========================="></c:out><br>
	<!-- 部分遍历 输出元素状态 -->
	<c:forEach var="fruit" items="${fruits}" begin="1" end="4" varStatus="fru">
		<c:out value="${fruit}的四个属性值"></c:out><br>
		<c:out value="index属性:${fru.index}"></c:out><br>
		<c:out value="count属性:${fru.count}"></c:out><br>
		<c:out value="first属性:${fru.first}"></c:out><br>
		<c:out value="last属性:${fru.last}"></c:out><br>
		<c:out value="-----------------------"></c:out><br>
	</c:forEach>
	<c:out value="========================="></c:out><br>
	
	<!-- forTokens tags -->
	<c:forTokens items="010-88096789-123" delims="-" var="num">
		<c:out value="${num}"></c:out><br>
	</c:forTokens>
	
	<!-- imoirt tags -->
	<!-- 导入网络上的绝对路径 -->
	<c:catch var="error09"> 
		<c:import url="http://www.baidu.com"></c:import>
	</c:catch>
	<c:out value="${error09}"></c:out><br>
	
	<!-- 导入相对路径的文件 -->
	<c:catch var="error08"> 
		<c:import url="tt.txt" charEncoding="gbk"></c:import>
	</c:catch>
	<c:out value="${error08}"></c:out><br>
	
	<!--  context tags 
	
		第一步：改eclipse中tomcat的部署路径，如果是灰掉的，停掉tomcat，然后clean
		就可以改为第二项了（如果想在webapps生成，记得在Deploy path选择webapps）。
		第二步：改conf/context.xml中加上crossContext="true"。
		如：<Context crossContext="true"></Context>
	-->
	<c:catch var="error06"> 
		<c:import url="/importFile.jsp" context="/AnotherWebProject"></c:import>
	</c:catch>
	<c:out value="${error06}"></c:out><br>
	
	
	<!-- redirect tags -->
	<c:catch var="error05"> 
	<c:redirect url="second.jsp">
		<c:param name="a">Lily</c:param>
		<c:param name="b">aaaa</c:param>
	</c:redirect>
	</c:catch>
	<c:out value="${error05}"></c:out><br>
	
	<!-- url tags -->
	<c:if test="${1<3}">
		<c:set var="partUrl">aa</c:set>
	</c:if>
	<c:url value="http://localhost:8080/${partUrl}" var="newUrl" scope="session"></c:url>
	<a href="${sessionScope.newUrl}">newUPL</a>
</body>
</html>