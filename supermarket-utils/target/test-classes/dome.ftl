<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8">
	<title>dome</title>
</head>
<body>
	Hello,${name}<br/>
	<h1>Student</h1>
	Name:${Student.name}<br/>
	age:${Student.age}<br/>
	height:${Student.height}<br/>
	<#if Student.age &gt;= 30>
		太大了
	<#else>
		太小了
	</#if>
	<h1>List</h1>
	<ul>
		<#list list as l>
			<li>
				${l}
			</li>
			<#else>
				meiyou!
		</#list>
	</ul>
	<h1>List2</h1>
		<#list list as l>
			
				${l}<#if l_has_next>,</#if>
			<#else>
				meiyou!
		</#list>
</body>
</html>
