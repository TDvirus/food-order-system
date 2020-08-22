# food-order-system
一个简单的Spring Cloud点餐管理系统。
用户观看餐品信息下订单，商户则可以管理餐品和查看订单信息。项目基于Spring Cloud微服务，使用了Eureka服务治理、Config分布式配置中心、Feign声明式服务调用。项目分为center、configcenter、order和product四个微服务模块。
---------
项目功能模块：
![功能模块](https://github.com/TDvirus/food-order-system/blob/master/pic/1.png)

需求分析：
主要分成两个部分的需求，首先站在用户的角度上来谈需求。   
其一，商品端。店家可以有自己的后台，可以查看自己所有的商品；可以查看自己某件商品的信息，例如库存；可以在进货之后，修改商品信息；可以在缺货时，删除一些商品信息。   
其二，订单端。用户可以对商品下单，可以查看自己订单的详情，以及取消订单。   
然后，站在应用的角度，对上面的需求，进行分析。   
其一，商品端。应用的主要功能是店家自己对商品的管理，即对商品的增删改查操作，所以，需要写五个接口。当然，在下订单的时候，就会操作某个商品的数量，这里使用一个对特定商品查询的接口即可。所以，在商品端，需要提供五个对商品操作的接口。   
其二，订单端。这个应用的主要功能有三个：下订单、查看订单以及删除订单。   

数据库表设计：   
只设计了product表和orderTable表。表结构如下所示。

product表：

|字段|类型|长度|描述|
|:----:|:----:|:----:|:----:|
|product_id|Int|32|商品ID|
|product_ename|Varchar|32|商品英文名称|
|product_cname|Varchar|32|商品中文名称|
|product_quantity|Int|16|商品的数量|
主键:product_id

orderTable表：

|字段|类型|长度|描述|
|:----:|:----:|:----:|:----:|
|order_id|Int|32|订单ID|
|order_number|Int|32|订单数量|
|product_id|Int|32|商品订单|
主键:order_id   

对外接口设计：   
（1）商品端
- /product/queryAllProduct
- /product/queryProductByProductid
- /product/insertProduct
- /product/updateProduct
- /product/deleteProduct

（2）订单端
- /order/insertOrder
- /order/queryOrderByOrderid