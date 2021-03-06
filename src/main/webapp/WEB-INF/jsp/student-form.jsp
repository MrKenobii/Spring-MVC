<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Form</title>
</head>
<body>
    <form:form action="process-form" modelAttribute="student">
        First Name: <form:input path="firstName" />
        <br><br>
        Last Name: <form:input path="lastName" />
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br><br>
        Favorite Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
        <br><br>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
        MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
