# petclinic

#### 克隆
git clone https://github.com/PkyShare/petclinic.git

* petclinic-dependencies：是统一的依赖管理，方便修改依赖的版本号。
* petclinic-commons：是通用的工具类库，比如放入一些通用的工具类，如日期工具类等。
* petclinic-commons-domain：为通用的领域模型，比如TbUser类。
* petclinic-commons-mapper：为通用的数据访问。
* petclinic-commons-service：为通用的业务逻辑。
* petclinic-database：为通用的代码生成，使用tk-Mybatis和maven插件映射到数据库中自动生成与表相应的代码，然后将生成的代码相应地拷贝到domain和mapper模块中，这样是为了避免当修改数据库表后重新生成代码而导致已经改好的代码被重新覆盖。
* petclinic-web-admin：为控制层，也可以说是api层，进行请求的接收和响应

#### 模块之间的依赖关系

![项目结构](https://i.ibb.co/MNmbJCS/petclinic.png)
