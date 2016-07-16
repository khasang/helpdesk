<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Карта</title>
  <link rel="stylesheet" type="text/css" href="css/map.css">
  <script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>
  <script name="position" type="text/javascript">
    ymaps.ready(init);
    var myMap,
            myPlacemark;
    function init(){
      myMap = new ymaps.Map("map", {
        center: [56.296504, 43.936059],
        zoom: 10
      });
      myPlacemark = new ymaps.Placemark([56.296504, 43.936059], {
        hintContent: 'Нижний Новгород',
        balloonContent: 'Торговая столица России'
      });
      myMap.geoObjects.add(myPlacemark);
    }
  </script>
</head>
<body>
<div id="map">
</div>
</body>
<footer>
  <form action="/">
    <input type="submit" id="Button3" description="" value="Home page">
  </form>
</footer>
</html>
