## aurora-cesium

这是一个基于 [czml-writer](https://github.com/AnalyticalGraphicsInc/czml-writer) 的 Java 库，用于生成 CZML，它可以让 CZML 的生成变得更加简单。

## 许可证

[Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). aurora-cesium 可免费用于商业和非商业用途。

## 快速开始

1. aurora-cesium 中的所有内容都是 `property` 或 `graphics`。
2. 每个 `property` 或 `graphics` 都有一个 `interface`。
3. 每个 `interface` 都有一个名为 `newBuilder()` 的方法，用于构建属性或图形。
4. 许多接口都有 `from()/fromXXX()/default()/defaultXXX()` 之类的方法，这些方法是 `newBuilder()` 的快捷方式。
5. 最后，您可以使用 `CzmlGenerator` 生成 czml。
6. 例子  
   6.1 创建一个位置，位置是一个属性，接口名为 `PositionProperty`，我们可以使用 cartesian(`CartesianProperty`)/cartographicDegrees(`CartographicDegreesProperty`)/cartographicRadians(`CartographicRadiansProperty`) 构建位置

```java
// 首先创建一个 cartesian
CartesianProperty cartesianProperty;
// 使用构建器
cartesianProperty = CartesianProperty.newBuilder().withValue(new Cartesian(0, 0, 0)).build();
// 或使用快捷方式
cartesianProperty = CartesianProperty.from(new Cartesian(0, 0, 0));

// 或者创建一个 cartographicDegrees/cartographicRadians
CartographicDegreesProperty cartographicDegreesProperty;
// 使用构建器
cartographicDegreesProperty = CartographicDegreesProperty.newBuilder().withValue(new Cartographic(114, 30, 0)).build();
// 或使用快捷方式
cartographicDegreesProperty = CartographicDegreesProperty.from(new Cartographic(114, 30, 0));

// 让我们创建位置
PositionProperty positionProperty;
positionProperty = PositionProperty.newBuilder().withCartesian(CartesianProperty.from(new Cartesian(0, 0, 0))).build();
// 或使用快捷方式
positionProperty = PositionProperty.from(cartesianProperty);
// 或使用快捷方式
positionProperty = PositionProperty.fromCartesian(new Cartesian(0, 0, 0));

```
6.2 创建一个点(`PointGraphics`)
```java
PointGraphics pointGraphics = PointGraphics.newBuilder()
    .withColor(ColorProperty.fromRgba(new Color(255, 255, 255, 255)))
    .withPixelSize(DoubleProperty.from(20D))
    .withShow(BooleanProperty.from(true))
    .build();
```
6.3 创建一个实体(`Entity`)
```java
Entity entity = Entity.newBuilder()
    .withId("Entity")
    .withName("Entity")
    .withPosition(positionProperty)
    .withPoint(pointGraphics)
    .build();

```
6.4 创建一个 czml(`Czml`)
```java
Czml czml = Czml.create();
czml.setDocument(Document.defaultDocument("CZML"));
czml.push(entity);
```
6.5 生成它
```java
String result = CzmlGenerator.on(true).generate(czml, new StringWriter()).toString();
```
6.6 打印它
```java
System.out.println(result);
```
```json
[
  {
    "id":"document",
    "name":"CZML",
    "version":"1.0"
  },
  {
    "id":"Entity",
    "name":"Entity",
    "position":{
      "cartesian":[
        0,0,0
      ]
    },
    "point":{
      "color":{
        "rgba":[
          255,255,255,255
        ]
      },
      "pixelSize":20,
      "show":true
    }
  }
]

```
