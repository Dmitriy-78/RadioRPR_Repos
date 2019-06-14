<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>User Name</th>
            <th>Password</th>
        </tr>
    <#list usersFromServer as user>
        <tr>
            <td>${user.userName}</td>
            <td>${user.password}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>
