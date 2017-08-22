# FirstWeather

FirstWeather是一款基于Android端开源的天气预报软件，具备查看全国的省市县、查询任意城市天气、自由切换城市、手动更新天气、后台自动更新天气等功能。天气数据使用和风天气作为天气预报的数据来源，全国省市县数据访问链接（http://guolin.tech/api/china）。

整体项目采用MVC架构，侧滑菜单用的是DrawerLayout实现，项目包含了四个包db（存放数据库模型相关代码）、gson（存放GSON模型相关代码）、service（存放服务相关代码）、util（存放工具相关代码）

## 一、创建数据库和表，在这里用LitePal对数据库进行操作，建立三张表分别存放Province、City、County

## 二、遍历全国省市县（从服务器端获取）

![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/province.png)
![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/city.png)
![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/county.png)

## 三、查询天气，并将天气信息显示出来

![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/weather.png)
![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/weather1.png)

## 四、手动更新天气以及切换城市

![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/swipeRefresh.png)
![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/changeCity.png)
![](https://github.com/wang911205/FirstWeather/blob/cabcbb406c6c871ba0e9d244335a3cf1ce805081/picture/changeCity1.png)
