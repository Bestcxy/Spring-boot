<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>id</td>
            <td>姓名</td>
        </tr>
         <#if users ??&&(users?size>0)>
             <#list users as item>
            <tr>
                <td>${item.id}</td>
                <td>${item.userName}</td>
            </tr>
             </#list>
         </#if>

    </table>

</body>
</html>