create database mybatis_example DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT ALL privileges ON mybatis_example.* TO mybatis@locahost IDENTIFIED BY 'mybatis';
GRANT ALL privileges ON mybatis_example.* TO mybatis@'%' IDENTIFIED BY 'mybatis';
flush privileges;
