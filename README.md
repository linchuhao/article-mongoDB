**MongoDB**

# **1.启动方式**：

- 命令行参数方式启动服务：

  + 首先将bin目录进行系统环境变量Path的配置

  + 在bin同级目录下手动建立一个目录用于存放数据文件，如data/db

  + 在bin目录中打开命令行提示符，输入如下命令即完成启动：

    ```
    mongod --dbpath=..\data\db
    ```

+ 配置文件方式启动服务：

  - 在同级目录下建立conf文件夹，文件夹内新建 mongod.conf

  - ```
    storage:
      dbPath: E:\mongodb-win32-x86_64-2008plus-ssl-4.0.12\data\db
    ```

  - 启动方式：

  - ```
    mongod -f ..\conf\mongod.conf
    或
    mongod --config ..\config\mongod.conf
    ```

    

# **2.连接方式**

+ Shell连接（mongo命令）

  - ```
    mongo --host=localhost --port=27017
    ```

+ Compass 图形化客户端连接
  
  - 在打开的界面中，输入主机地址、端口等相关信息，点击连接即可

生成插入语句：

```
db.comment.insert({"articleid":"100000","content":"Today is nice day!","userid":"1001","nickname":"Rose","createdatetime":new Date(),"likenum":NumberInt(10),"state":null})

```

