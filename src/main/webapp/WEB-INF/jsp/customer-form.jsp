<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div>
        <form:form action="process-form" modelAttribute="customer">
            <h4><i>Fill out the form. Asterisk (*) means required.</i></h4>
            <p>
                First Name: <form:input path="firstName" />
            </p>
            <p>
                Last Name (*): <form:input path="lastName" />
                <form:errors path="lastName" cssClass="error" /> <%-- it should give an error from the @NotNull  --%>
            </p>                                                <%--if lastName is not given in the form --%>
            <p>
                Free Passes: <form:input path="freePasses" />
                <form:errors path="freePasses" cssClass="error" />
            </p>
            <input type="submit" value="Submit" />


        </form:form>


    </div>

</body>
</html>