<%--
  Created by IntelliJ IDEA.
  User: Georgiy
  Date: 19.06.2016
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Карта</title>
    <link rel="stylesheet" type="text/css" href="css/map.css">
    <script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>
    <script type="text/javascript">
        ymaps.ready(init);
        var myMap,
                myPlacemark;

        function init(){
            myMap = new ymaps.Map("map", {
                center: [59.57, 30.19],
                zoom: 10
            });

            myPlacemark = new ymaps.Placemark([59.57, 30.19], {
                hintContent: 'Санкт-Петербург',
                balloonContent: 'Культурная столица России'
            });

            myMap.geoObjects.add(myPlacemark);
        }
    </script>
</head>
<body>
    <div id="description">
        <p>${desc}</p>
    </div>
        <div id="map"></div>
</body>
<footer>
    <a href="/">Go to Index</a>
</footer>
</html>
