<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>"/>
    <meta charset="utf-8"/>
    <title>登录</title>
	<meta http-equiv="keywords" content=""/>
	<meta http-equiv="description" content=""/>
  </head>
  <body>
  	<div class="login-box">
  		<form action="account/add" method="post">
  			<p>
  				<label for="username">用户名：</label>
  				<input type="text" id="username" name="username"/>
  			</p>
  			<p>
  				<label for="password">&emsp;密码：</label>
  				<input type="password" id="password" name="password"/>
  			</p>
  			<p>
  			<button type="submit">登录</button>
  			</p>
  		</form>
  	</div>
  	<p><a href="account/pager">用户列表</a></p>
  </body>
</html>
