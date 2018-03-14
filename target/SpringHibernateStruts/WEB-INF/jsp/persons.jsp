<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- TODO - Give relevant name -->
    <title>Struts-Hibernate CRUD App - Reeves</title>
    <link type="text/css" rel="stylesheet" href="./styles/crudapp.css"/>
</head>
<body>
<div class="content">
    <h1>Agenda</h1>

    <div class="data">
        <s:a action="newPerson" cssClass="add">Nuevo Contacto</s:a>
        <br/><br/>
        <table border="0" cellpadding="4" cellspacing="0">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Editar</th>
                <th>Borrar</th>
            </tr>
            <s:iterator value="persons" id="person">
                <tr>
                    <td><s:property value="%{#person.id}"/></td>
                    <td><s:property value="%{#person.firstName}"/></td>
                    <td><s:property value="%{#person.lastName}"/></td>
                    <td><s:a action="newPerson?person.id=%{#person.id}" cssClass="edit"></s:a></td>
                    <td><s:a action="deletePerson?person.id=%{#person.id}" cssClass="delete"></s:a></td>
                    <td><s:a action="loadPerson?person.id=%{#person.id}" cssClass="load"></s:a></td>
                </tr>
            </s:iterator>
        </table>
        <br/>
    </div>
    </div>
</body>
</html>