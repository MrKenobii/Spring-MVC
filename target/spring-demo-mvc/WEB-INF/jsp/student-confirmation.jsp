<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Confirmation</title>
</head>
<body>
    <div>
        <p>Student Full Name: ${student.firstName}, ${student.lastName}</p>
        <p>Student Country: ${student.selectedCountryValue}</p>
        <p>Student's Favorite Language: ${student.selectedFavouriteLanguageValue}</p>
        <p>Student's Operating Systems:
            <ul>
                <c:forEach var="temp" items="${student.operatingSystems}">
                    <li>
                        ${temp}
                    </li>
                </c:forEach>
            </ul>
        </p>
    </div>
</body>
</html>