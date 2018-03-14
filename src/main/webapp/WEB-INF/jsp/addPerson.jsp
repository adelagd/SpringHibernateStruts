<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title>New User</title>
    <link href="/styles/crudapp.css" rel="stylesheet" type="text/css"/>
    <s:head theme="simple"/>
</head>
<body>
<div class="content">
    <s:if test="%{person.idPerson != null}">
        <h1>Update User</h1>
    </s:if>
    <s:else>
        <h1>Add New User</h1>
    </s:else>
    <s:form action="savePerson" theme="css_xhtml">
        <s:if test="%{person.id != null}">
            <s:hidden name="person.idPerson"/>
        </s:if>
        First Name:<s:textfield name="person.firstName" maxlength="20" id="person.nombre"/>
        <br/>
        Last Name:<s:textfield name="person.lastName" maxlength="20" id="person.apellidos"/>
        <br/>
        <input type="submit" title="Guardar" value="Guardar"/>
    </s:form>
    <br/>
</div>
</body>
</html>