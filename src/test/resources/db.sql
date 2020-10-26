# 首先创建一个数据库(Tab补全)
drop database if exists java6ssm;
create database if not exists java6ssm;

use java6ssm;

# 创建管理用户数据表
drop table if exists adminuser;
create table if not exists adminuser
(
    uid      integer auto_increment comment '用户id',
    username varchar(20) not null comment '用户登录名',
    password varchar(32) not null comment '登录密码',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`uid`)
) comment '管理用户登录表';

commit;
# 插入管理用户测试数据
insert into adminuser (username, password)
values ('wzf', 'fe8fb64eb34764f9e0a58a32a819dcb2');
insert into adminuser (uid, username, password)
values (null, 'admin', 'fe8fb64eb34764f9e0a58a32a819dcb2');

# 批量插入测试数据
DROP PROCEDURE
    IF
        EXISTS adminuser_insert;

DELIMITER $$
CREATE PROCEDURE adminuser_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into adminuser (username,password) value (concat('user',i),'fe8fb64eb34764f9e0a58a32a819dcb2') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL adminuser_insert ();



commit;

# 创建客户数据表
drop table if exists customer;
create table if not exists customer
(
    cid integer auto_increment comment '客户id',
    cname varchar(20) not null comment '客户姓名',
    cphone varchar(20) default null comment '联系电话',
    cemail varchar(64) default null comment '邮箱地址',
    cpass varchar(32) not null comment '密码',
    cbirth date default null comment '生日',
    cavatar varchar(50) default null comment '头像',
    cgender boolean default false comment '性别',
    cstatus boolean default false comment '是否禁用',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`cid`),
    UNIQUE KEY `cid` (`cid`),
    UNIQUE KEY `cname` (`cname`),
    UNIQUE KEY `cphone` (`cphone`),
    UNIQUE KEY `cemail` (`cemail`)
) auto_increment=1 charset=utf8 comment '客户基本信息表';
commit ;

# 通过批处理插入测试数据
DROP PROCEDURE
    IF
        EXISTS customer_insert;

DELIMITER $$
CREATE PROCEDURE customer_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into customer (cname,cpass) value (concat('cus',i),'696aa7bb5ee7ac9135f7ed4ef526fe4d') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL customer_insert ();
commit;

# 新建活动表
DROP table IF EXISTS activities;
create table if not exists activities
(
    act_id integer auto_increment comment '活动id主键自增',
    act_name varchar(50) not null comment '活动名称',
    act_des varchar(200) not null comment '活动描述',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`act_id`)
) default character set 'utf8' auto_increment=1 comment '活动表基本信息表';
commit ;
# # 插入数据
# insert into activities(act_name, act_des) VALUES ('新用户减免','饿了么新用户收单立减9元'),
#                                                  ('特价商品','特价商品5元起'),
#                                                  ('满减送','订单满30减29');
# 批量插入测试数据
DELIMITER $$
CREATE PROCEDURE activities_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 10 DO
            insert into activities (act_name, act_des) value
                (concat('减免活动',i),'活动介绍') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL activities_insert ();

commit;


# 新建商家信息表
drop table if exists business;
create table if not exists business
(
    bus_id integer auto_increment primary key comment '商家id主键自增',
    bus_name varchar(20) not null comment '商家名称',
    bus_pass varchar(32) not null comment '密码',
    bus_avatar varchar(50) comment '图片',
    bus_score INTEGER comment '评分',
    bus_send varchar(20) not null comment '配送信息',
    bus_phone varchar(20) not null comment '商家联系方式',
    bus_addr varchar(128) not null comment '商家地址',
    bus_reco integer default 1 comment '推荐指数recommend',
    bus_status boolean default false comment '是否禁用',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    bus_act integer not null comment '活动id外键',
    constraint `fk_business_to_activities_1` foreign key business(`bus_act`) references activities(`act_id`)
) default character set 'utf8' auto_increment=1 comment '商家基本信息表';
commit ;

# 插入数据;
insert into business (bus_name, bus_pass, bus_avatar, bus_score, bus_send, bus_phone, bus_addr, bus_act)
values ('万家饺子馆','111','',5,'蜂鸟配送','18340862928','辽宁省大连市高新区',1),
       ('满记甜品','222','',3,'美团','13340862928','辽宁省大连市金州区',2);

# 批量插入测试数据
DROP PROCEDURE IF EXISTS business_insert;

DELIMITER $$
CREATE PROCEDURE business_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into business (bus_name, bus_pass, bus_avatar, bus_score, bus_send, bus_phone, bus_addr, bus_act) value
                (concat('李家小厨',i),'fe8fb64eb34764f9e0a58a32a819dcb2','/upload/bussiness.png',FlOOR(RAND() * 5 + 1),'15起送','138********','高新区火炬路',FlOOR(RAND() * 8 + 1)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL business_insert ();

commit;
# 新建活动表和商家表中间表
drop table if exists act_bus;
create table if not exists act_bus
(
    ab_id integer primary key auto_increment comment '主键自动递增',
    f_busid integer not null comment '外键关联商家表主键',
    f_actid integer not null comment '外键关联活动表主键',
    constraint `fk_act_bus_to_business_1` foreign key act_bus(`f_busid`) references business(`bus_id`),
    constraint `fk_act_bus_to_activities_1` foreign key act_bus(`f_actid`) references activities(`act_id`)
)default character set 'utf8' auto_increment=1 comment '活动商家中间表';
commit ;

# 插入数据
# insert into act_bus(f_busid, f_actid) VALUES (1,1),
#                                              (2,2);
# 批量插入测试数据
DROP PROCEDURE IF EXISTS act_bus_insert;

DELIMITER $$
CREATE PROCEDURE act_bus_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into act_bus (f_busid, f_actid) value
                (FlOOR(RAND() * 99 + 1),FlOOR(RAND() * 9 + 1)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL act_bus_insert ();

commit;
# 商品类别表;
drop table if exists goods_type;
create table if not exists goods_type
(
    gtyp_id integer primary key auto_increment comment '商品类别id主键自增',
    gtyp_name varchar(20) not null comment '分类名称',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间'

) default character set 'utf8' auto_increment=1 comment '商品类别表';
commit ;

# # 插入数据;
# insert into goods_type(gtyp_name)values ('米饭'),
#                                         ('饺子'),
#                                         ('炒菜');
# 批量插入测试数据
DROP PROCEDURE IF EXISTS goods_type_insert;

DELIMITER $$
CREATE PROCEDURE goods_type_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 10 DO
            insert into goods_type (gtyp_name) value (CONCAT('美食',i)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL goods_type_insert ();

commit;

# 商品信息表
drop table if exists goods_info;
create table if not exists goods_info
(
    ginfo_id integer primary key auto_increment comment '商品id主键自增',
    ginfo_name varchar(20) not null comment '商品名',
    ginfo_photo varchar(50) default null comment '商品图片',
    ginfo_des varchar(128) comment '商品描述',
    ginfo_price double(7,2) comment '商品价格',
    f_busid integer not null comment '商家id关联外键',
    f_gtype integer not null comment '类别id关联外键',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    constraint `fk_goods_info_to_business_1` foreign key goods_info(`f_busid`) references business(`bus_id`),
    constraint `fk_goods_info_to_goods_type_2` foreign key goods_info(`f_gtype`) references goods_type(`gtyp_id`)
) default character set 'utf8' auto_increment=1 comment '商品信息表';
commit ;
# 插入数据;
insert into goods_info(ginfo_name, ginfo_photo, ginfo_des, ginfo_price, f_busid, f_gtype) values ('牛肉汤','','西藏牦牛新鲜先杀',55.4,1,1),
                                                                                                 ('韩国炸鸡','','鲜嫩多汁,黄金酥脆',22.6,2,2);
# 批量插入测试数据
DROP PROCEDURE IF EXISTS goods_info_insert;

DELIMITER $$
CREATE PROCEDURE goods_info_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 200 DO
            insert into goods_info (ginfo_name, ginfo_des, ginfo_price, f_busid, f_gtype) value
                (CONCAT('商品',i),CONCAT('商品介绍',i),RAND() * 15 + 5,FlOOR(RAND() * 99 + 1),FlOOR(RAND() * 9 + 1)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL goods_info_insert ();

commit;
# 订单表
drop table if exists orders;
create table if not exists orders
(
    order_id integer auto_increment primary key comment '订单id',
    order_name varchar(20) not null comment '订购商品',
    order_cnt integer not null comment '数量',
    order_paystatus varchar(20) not null comment '结算状态',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    f_cid integer not null comment '所属用户id',
    f_busid integer not null comment'所属商户id',
    constraint `fk_orders_to_customer_1` foreign key orders(`f_cid`) references customer(`cid`),
    constraint `fk_orders_to_business_2` foreign key orders(`f_busid`) references business(`bus_id`)

)default character set 'utf8' auto_increment=1 comment '订单表';

commit;

# 插入数据
insert into orders(order_name, order_cnt, order_paystatus, f_cid, f_busid) values ('韩国炸鸡',3,'已支付',1,1),
                                                                                  ('牛肉汤',2,'待支付',2,2);
# 批量插入测试数据
DROP PROCEDURE IF EXISTS orders_insert;

DELIMITER $$
CREATE PROCEDURE orders_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 200 DO
            insert into orders (order_name, order_cnt, order_paystatus, f_cid, f_busid) value
                (concat('美食',i),FlOOR(RAND() * 9 + 1),FlOOR(RAND() * 3 + 1),FlOOR(RAND() * 99 + 1),FlOOR(RAND() * 99 + 1)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL orders_insert ();

commit;
# 订单和商家的中间表
drop table if exists ordbus;
create table if not exists ordbus
(
    ob_id integer primary key auto_increment comment '主键自增',
    fk_oid integer not null comment '外键关联订单表的主键',
    fk_bus integer not null comment '外键关联商家表的主键',
    constraint `fk_ordbus_to_business_1` foreign key ordbus(`fk_bus`) references business(`bus_id`),
    constraint `fk_ordbus_to_orders_2` foreign key ordbus(`fk_oid`) references orders(`order_id`)
)default character set 'utf8' auto_increment=1 comment '订单商家中间表';

commit;

# 插入数据
insert into ordbus(fk_oid, fk_bus) values (1,1),
                                          (2,2);
# 批量插入测试数据
DROP PROCEDURE IF EXISTS ordbus_insert;

DELIMITER $$
CREATE PROCEDURE ordbus_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into ordbus (fk_oid, fk_bus) value
                (FlOOR(RAND() * 200 + 1),FlOOR(RAND() * 99 + 1)) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL ordbus_insert ();

commit;