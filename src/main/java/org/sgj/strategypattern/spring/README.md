# 策略模式(Strategy Pattern)

## 概述
策略模式是对算法的封装。定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换  
例如：你女朋友生病了，你听说包治百病所以决定买个包包给她。然后你在京东、淘宝、拼夕夕三个平台各找到一款不错的，对比发现拼夕夕的便宜一些，所以决定去拼夕夕买。  

策略模式更重视过程，你在买包的过程中，对比三家平台（比如价格、质量等），选择你觉得合适的。  

优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。  
缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露（客户端必须知道所有的策略，并且自行决定使用哪一个策略类。）。


## 结构图

## 角色

## 使用场景
Spring中Aop代理策略createAopProxy
Spring的对象实例化策略InstantiationStrategy
[Resource接口](https://blog.csdn.net/inthat/article/details/80500750)
[Handler命名映射策略](https://blog.csdn.net/boonya/article/details/115230052)
## 源码解析
